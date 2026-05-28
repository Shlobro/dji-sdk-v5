/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 */
package com.dji.wpmzsdk.manager;

import android.content.Context;
import android.util.Log;
import com.dji.industry.pilot.missionflight.library.MissionImportParams;
import com.dji.wpmzsdk.common.data.HeightMode;
import com.dji.wpmzsdk.common.data.KMZInfo;
import com.dji.wpmzsdk.common.data.Template;
import com.dji.wpmzsdk.common.utils.FileUtils;
import com.dji.wpmzsdk.common.utils.PPalGenerator;
import com.dji.wpmzsdk.common.utils.TemplateTransform;
import com.dji.wpmzsdk.common.utils.kml.GeoidManager;
import com.dji.wpmzsdk.common.utils.kml.KMLCreateMissionUtil;
import com.dji.wpmzsdk.common.utils.kml.KMLFileParseInfo;
import com.dji.wpmzsdk.common.utils.kml.KMLUtil;
import com.dji.wpmzsdk.common.utils.kml.data.MissionImportHeightMode;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.interfaces.IWPMZManager;
import dji.sdk.wpmz.jni.JNIWPMZManager;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineCheckErrorMsg;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.util.ArrayList;
import java.util.List;

public class WPMZManager
implements IWPMZManager {
    private final String TAG = "WPMZManager";
    private Context context;

    private WPMZManager() {
    }

    public void init(Context context) {
        this.context = context;
        KMLUtil.setContext(context);
        String dirPath = FileUtils.getDJIDirPath(context);
        FileUtils.createFile(dirPath + "/CACHE");
        FileUtils.copyAssetsDirToSDCard(context, "geoid_data/WW15MGH.DAC", dirPath);
        GeoidManager.getInstance().openGeoid96M150(dirPath + "/WW15MGH.DAC");
    }

    public static WPMZManager getInstance() {
        return WPMZManagerHolder.INSTANCE;
    }

    @Override
    public KMZInfo getKMZInfo(String kmzPath) {
        KMZInfo kmzInfo = new KMZInfo();
        kmzInfo.setWaylineMissionConfigParseInfo(JNIWPMZManager.getWaylineMissionConfig("1.0.4", kmzPath));
        kmzInfo.setWaylineMissionParseInfo(JNIWPMZManager.getWaylineMission("1.0.4", kmzPath));
        kmzInfo.setWaylineTemplatesParseInfo(TemplateTransform.INSTANCE.transTemplateParseInfo(JNIWPMZManager.getWaylineTemplates("1.0.4", kmzPath)));
        kmzInfo.setWaylineWaylinesParseInfo(JNIWPMZManager.getWaylines("1.0.4", kmzPath));
        return kmzInfo;
    }

    @Override
    public void generateKMZFile(String kmzPath, WaylineMission waylineMission, WaylineMissionConfig config, Template waylineTemplate) {
        ArrayList<WaylineTemplate> templateList = new ArrayList<WaylineTemplate>();
        WaylineTemplate template = TemplateTransform.INSTANCE.transToWaylineTemplate(waylineTemplate);
        templateList.add(template);
        WaylineExecuteMissionConfig executeMissionConfig = this.createExecuteConfig(config);
        PPalGenerator generator = new PPalGenerator();
        PPalGenerator.PPALParam param = new PPalGenerator.PPALParam(waylineMission, config, this.createExecuteConfig(config), templateList);
        List<Wayline> waylines = generator.getWaylines(param);
        JNIWPMZManager.generateKMZFile("1.0.4", waylineMission, config, templateList, waylines, executeMissionConfig, new ArrayList<String>(), new ArrayList<String>(), kmzPath);
    }

    @Override
    public void generateKMZFile(String kmzPath, WaylineMission waylineMission, WaylineMissionConfig config, Wayline wayline) {
        ArrayList<WaylineTemplate> templateList = new ArrayList<WaylineTemplate>();
        WaylineTemplate waylineTemplate = new WaylineTemplate();
        templateList.add(waylineTemplate);
        ArrayList<Wayline> waylines = new ArrayList<Wayline>();
        waylines.add(wayline);
        WaylineExecuteMissionConfig executeMissionConfig = this.createExecuteConfig(config);
        JNIWPMZManager.generateKMZFile("1.0.4", waylineMission, config, templateList, waylines, executeMissionConfig, new ArrayList<String>(), new ArrayList<String>(), kmzPath);
    }

    @Override
    public WaylineCheckErrorMsg checkValidation(String kmzPath) {
        return JNIWPMZManager.checkWPMZValid("1.0.4", kmzPath);
    }

    @Override
    public boolean transKMLtoKMZ(String kmlImportPath, String kmzOutPath) {
        KMLFileParseInfo parseInfo = KMLUtil.getKMLType(kmlImportPath);
        if (parseInfo.getFileType() != KMLFileParseInfo.KMLFileType.MISSION || parseInfo.getMissionType() != MissionType.Waypoint) {
            Log.e((String)"WPMZManager", (String)"transKMLtoKMZ failed ,kml is not dji file  or mission type !");
            return false;
        }
        MissionImportParams params = new MissionImportParams();
        params.setFileType(KMLFileParseInfo.KMLFileType.MISSION);
        params.setMissionType(MissionType.Waypoint);
        try {
            Object object = KMLUtil.importMission(params, kmlImportPath);
            KMLUtil.saveKMLImportMission(object, kmlImportPath);
        }
        catch (Exception e) {
            e.printStackTrace();
            Log.e((String)"WPMZManager", (String)("trans failed" + e.getMessage()));
            return false;
        }
        Log.d((String)"WPMZManager", (String)"trans finished");
        return true;
    }

    @Override
    public boolean transKMLtoKMZ(String kmlImportPath, String kmzOutPath, HeightMode heightMode) {
        KMLFileParseInfo parseInfo = KMLUtil.getKMLType(kmlImportPath);
        if (parseInfo.getFileType() == KMLFileParseInfo.KMLFileType.MISSION) {
            return this.transKMLtoKMZ(kmlImportPath, kmzOutPath);
        }
        MissionImportParams missionImportParams = new MissionImportParams();
        missionImportParams.setHeightMode(this.transHeightMode(heightMode));
        missionImportParams.setFileType(KMLFileParseInfo.KMLFileType.ORIGINAL);
        missionImportParams.setMissionType(MissionType.Waypoint);
        try {
            Object object = new KMLCreateMissionUtil().createMission(missionImportParams, kmlImportPath);
            KMLUtil.saveLocalMission(object, kmzOutPath);
        }
        catch (Exception e) {
            e.printStackTrace();
            Log.e((String)"WPMZManager", (String)("trans failed" + e.getMessage()));
            return false;
        }
        Log.d((String)"WPMZManager", (String)"trans finished");
        return true;
    }

    private MissionImportHeightMode transHeightMode(HeightMode heightMode) {
        MissionImportHeightMode missionImportHeightMode = MissionImportHeightMode.WGS84;
        switch (heightMode) {
            case RELATIVE: {
                missionImportHeightMode = MissionImportHeightMode.RELATIVE;
                break;
            }
            case WGS84: {
                missionImportHeightMode = MissionImportHeightMode.WGS84;
                break;
            }
            case EGM96: {
                missionImportHeightMode = MissionImportHeightMode.EGM96;
                break;
            }
        }
        return missionImportHeightMode;
    }

    private WaylineExecuteMissionConfig createExecuteConfig(WaylineMissionConfig config) {
        WaylineExecuteMissionConfig executeMissionConfig = new WaylineExecuteMissionConfig();
        executeMissionConfig.setDroneInfo(config.getDroneInfo());
        executeMissionConfig.setExitOnRCLostBehavior(config.getExitOnRCLostBehavior());
        executeMissionConfig.setFinishAction(config.getFinishAction());
        executeMissionConfig.setExitOnRCLostType(config.getExitOnRCLostType());
        executeMissionConfig.setFlyToWaylineMode(config.getFlyToWaylineMode());
        executeMissionConfig.setGlobalRTHHeight(config.getGlobalRTHHeight());
        executeMissionConfig.setIsGlobalRTHHeightSet(config.getIsGlobalRTHHeightSet());
        executeMissionConfig.setGlobalTransitionalSpeed(config.getGlobalTransitionalSpeed());
        executeMissionConfig.setIsGlobalRTHHeightSet(config.getIsGlobalRTHHeightSet());
        executeMissionConfig.setPayloadInfo(config.getPayloadInfo());
        executeMissionConfig.setSecurityTakeOffHeight(config.getSecurityTakeOffHeight());
        executeMissionConfig.setIsSecurityTakeOffHeightSet(config.getIsSecurityTakeOffHeightSet());
        return executeMissionConfig;
    }

    private static class WPMZManagerHolder {
        private static final WPMZManager INSTANCE = new WPMZManager();

        private WPMZManagerHolder() {
        }
    }
}

