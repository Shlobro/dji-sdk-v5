/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionWithDroneInfo;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionCloudMetaData;
import com.dji.wpmzsdk.common.utils.kml.transfrom.WaylineRtkTypeTransform;
import dji.sdk.wpmz.jni.JNIWPMZManager;
import dji.sdk.wpmz.value.mission.WPMLParseError;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplateType;
import dji.sdk.wpmz.value.mission.WpmzVersion;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class MissionTransformData {
    public static final String PM430_NAME = "M300 RTK";
    public static final String PM320_NAME = "M30";
    public static final String WM265_NAME = "M3";
    public static final String P4R_NAME = "P4R";
    public static final String P4A_NAME = "P4A";
    public static final String P4P_NAME = "P4P";
    public static final String P4_NAME = "P4";
    public static final String M2E_NAME = "M2E";
    public static final String PM431_NAME = "M350 RTK";
    public static final String PM430_AND_PM431_NAME = "M300 / M350 RTK";
    private String name;
    private WaylineMission mission;
    private WaylineMissionConfig missionConfig;
    private WaylineExecuteMissionConfig executeMissionConfig;
    private List<Wayline> wayline;
    private List<WaylineTemplate> templates;
    private WPMLParseError parseError;
    private WpmzVersion wpmzVersion = JNIWPMZManager.getWpmzVersion();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WaylineMission getMission() {
        return this.mission;
    }

    public void setMission(WaylineMission mission) {
        this.mission = mission;
    }

    public WaylineMissionConfig getMissionConfig() {
        return this.missionConfig;
    }

    public void setMissionConfig(WaylineMissionConfig missionConfig) {
        this.missionConfig = missionConfig;
    }

    public List<Wayline> getWayline() {
        return this.wayline;
    }

    public void setWayline(List<Wayline> wayline) {
        this.wayline = wayline;
    }

    public List<WaylineTemplate> getTemplates() {
        return this.templates;
    }

    public void setTemplate(WaylineTemplate template) {
        ArrayList<WaylineTemplate> templateList = new ArrayList<WaylineTemplate>();
        templateList.add(template);
        this.setTemplates(templateList);
    }

    public void setTemplates(List<WaylineTemplate> templates) {
        this.templates = templates;
    }

    public WPMLParseError getParseError() {
        return this.parseError;
    }

    public void setParseError(WPMLParseError parseError) {
        this.parseError = parseError;
    }

    public WaylineExecuteMissionConfig getExecuteMissionConfig() {
        return this.executeMissionConfig;
    }

    public void setExecuteMissionConfig(WaylineExecuteMissionConfig executeMissionConfig) {
        this.executeMissionConfig = executeMissionConfig;
    }

    public boolean hasMissionTemplate() {
        return this.templates != null && this.templates.size() > 0;
    }

    public WpmzVersion getWpmzVersion() {
        return this.wpmzVersion;
    }

    public void setWpmzVersion(WpmzVersion wpmzVersion) {
        this.wpmzVersion = wpmzVersion;
    }

    public MissionWithDroneInfo getModel() {
        WaylineRtkTypeTransform waylineRtkTypeTransform = new WaylineRtkTypeTransform();
        MissionInfoModel infoModel = new MissionInfoModel();
        infoModel.setName(this.name);
        infoModel.setCreateTime(this.mission.getCreateTime().longValue());
        infoModel.setUpdateTime(this.mission.getUpdateTime().longValue());
        infoModel.setRtkStation(waylineRtkTypeTransform.transTo(this.templates.get(0).getCoordinateParam().getPositioningType()));
        infoModel.setUuid(UUID.randomUUID().toString().replace("-", "_"));
        infoModel.setId(0L);
        WaylineTemplateType templateType = this.templates.get(0).getTemplateType();
        if (templateType == WaylineTemplateType.WAYPOINT) {
            infoModel.setType(MissionType.Waypoint);
        } else if (templateType == WaylineTemplateType.MAPPING2D) {
            infoModel.setType(MissionType.Mapping2D);
        } else if (templateType == WaylineTemplateType.MAPPING3D) {
            infoModel.setType(MissionType.Mapping3D);
        } else if (templateType == WaylineTemplateType.MAPPINGSTRIP) {
            infoModel.setType(MissionType.Strip);
        }
        infoModel.setCollected(false);
        infoModel.setExtInfo(new MissionInfoExtModel());
        MissionWithDroneInfo missionWithDroneInfo = new MissionWithDroneInfo();
        missionWithDroneInfo.setMissionInfo(infoModel);
        MissionCloudMetaData cloudMetaData = this.getCloudMetaData();
        if (cloudMetaData != null) {
            missionWithDroneInfo.setDroneCameras(cloudMetaData.getCameraKeys());
            missionWithDroneInfo.setDroneName(cloudMetaData.getDroneKey());
        }
        return missionWithDroneInfo;
    }

    public MissionCloudMetaData getCloudMetaData() {
        if (this.missionConfig == null || this.templates == null) {
            return null;
        }
        MissionCloudMetaData metaData = new MissionCloudMetaData();
        metaData.setDroneKey(String.format("0-%d-%d", this.missionConfig.getDroneInfo().getDroneType().value(), 0));
        List<WaylinePayloadInfo> payloadInfos = this.missionConfig.getPayloadInfo();
        ArrayList<String> cameraKeys = new ArrayList<String>();
        for (WaylinePayloadInfo payloadInfo : payloadInfos) {
            cameraKeys.add(String.format("1-%d-%d", payloadInfo.getPayloadType().value(), payloadInfo.getPayloadSubType()));
        }
        metaData.setCameraKeys(cameraKeys);
        ArrayList<Integer> templateKeys = new ArrayList<Integer>();
        for (WaylineTemplate template : this.templates) {
            templateKeys.add(template.getTemplateType().value());
        }
        metaData.setTemplateKeys(templateKeys);
        return metaData;
    }
}

