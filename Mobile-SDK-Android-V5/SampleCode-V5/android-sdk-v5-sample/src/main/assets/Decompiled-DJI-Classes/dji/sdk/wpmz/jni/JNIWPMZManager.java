/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package dji.sdk.wpmz.jni;

import android.util.Log;
import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.DJIValueHelper;
import dji.sdk.wpmz.value.mission.ActionAccuratePhotoParam;
import dji.sdk.wpmz.value.mission.ActionOrientedPhotoParam;
import dji.sdk.wpmz.value.mission.KmzFileVersion;
import dji.sdk.wpmz.value.mission.WPMLAircraftConvertInfo;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineActionGroup;
import dji.sdk.wpmz.value.mission.WaylineCheckErrorMsg;
import dji.sdk.wpmz.value.mission.WaylineDroneInfo;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineMission;
import dji.sdk.wpmz.value.mission.WaylineMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineMissionConfigParseInfo;
import dji.sdk.wpmz.value.mission.WaylineMissionParseInfo;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import dji.sdk.wpmz.value.mission.WaylineTemplatesParseInfo;
import dji.sdk.wpmz.value.mission.WaylineTrajectory;
import dji.sdk.wpmz.value.mission.WaylineWaylinesParseInfo;
import dji.sdk.wpmz.value.mission.WpmzVersion;
import java.util.ArrayList;
import java.util.List;

public class JNIWPMZManager
implements JNIProguardKeepTag {
    public static WaylineMissionParseInfo getWaylineMission(String version, String kmz_path) {
        byte[] native_ret = JNIWPMZManager.native_GetWaylineMission(version, kmz_path);
        WaylineMissionParseInfo java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WaylineMissionParseInfo.class, native_ret);
        return java_ret;
    }

    public static WaylineMissionConfigParseInfo getWaylineMissionConfig(String version, String kmz_path) {
        byte[] native_ret = JNIWPMZManager.native_GetWaylineMissionConfig(version, kmz_path);
        WaylineMissionConfigParseInfo java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WaylineMissionConfigParseInfo.class, native_ret);
        return java_ret;
    }

    public static WaylineTemplatesParseInfo getWaylineTemplates(String version, String kmz_path) {
        byte[] native_ret = JNIWPMZManager.native_GetWaylineTemplates(version, kmz_path);
        WaylineTemplatesParseInfo java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WaylineTemplatesParseInfo.class, native_ret);
        return java_ret;
    }

    public static WaylineWaylinesParseInfo getWaylines(String version, String kmz_path) {
        byte[] native_ret = JNIWPMZManager.native_GetWaylines(version, kmz_path);
        WaylineWaylinesParseInfo java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WaylineWaylinesParseInfo.class, native_ret);
        return java_ret;
    }

    public static boolean generateKMZFile(String version, WaylineMission waylineMission, WaylineMissionConfig waylineMissionConfig, List<WaylineTemplate> waylineTemplates, List<Wayline> waylines, WaylineExecuteMissionConfig waylineExecuteMissionConfig, List<String> imagePaths, List<String> dsmFilePaths, String kmzFilePath) {
        Object jni_item;
        byte[] jni_waylineMission = waylineMission.toBytes();
        byte[] jni_waylineMissionConfig = waylineMissionConfig.toBytes();
        ArrayList<byte[]> jni_waylineTemplates = new ArrayList<byte[]>();
        for (WaylineTemplate waylineTemplate : waylineTemplates) {
            byte[] jni_item2 = waylineTemplate.toBytes();
            jni_waylineTemplates.add(jni_item2);
        }
        ArrayList<byte[]> jni_waylines = new ArrayList<byte[]>();
        for (Wayline item : waylines) {
            jni_item = item.toBytes();
            jni_waylines.add((byte[])jni_item);
        }
        byte[] byArray = waylineExecuteMissionConfig.toBytes();
        ArrayList<String> jni_accurateImagePaths = new ArrayList<String>();
        jni_item = imagePaths.iterator();
        while (jni_item.hasNext()) {
            String item = (String)jni_item.next();
            jni_accurateImagePaths.add(item);
        }
        ArrayList<String> jni_dsmFilePaths = new ArrayList<String>();
        for (String item : dsmFilePaths) {
            jni_dsmFilePaths.add(item);
        }
        return JNIWPMZManager.native_GenerateKMZFile(version, jni_waylineMission, jni_waylineMissionConfig, jni_waylineTemplates, jni_waylines, byArray, jni_accurateImagePaths, jni_dsmFilePaths, kmzFilePath);
    }

    public static byte[] ConvertV3MissionToV2(Wayline wayline, WaylineExecuteMissionConfig missionConfig) {
        byte[] jni_wayline = wayline.toBytes();
        byte[] jni_waylineMissionConfig = missionConfig.toBytes();
        return JNIWPMZManager.native_ConvertV3MissionToV2(jni_wayline, jni_waylineMissionConfig);
    }

    public static byte[] ConvertV3MissionToV2(Wayline wayline, WaylineExecuteMissionConfig missionConfig, WaylineLocationCoordinate3D homeLocation) {
        byte[] jni_wayline = wayline.toBytes();
        byte[] jni_waylineMissionConfig = missionConfig.toBytes();
        byte[] jni_homeLocation = homeLocation.toBytes();
        return JNIWPMZManager.native_ConvertV3MissionToV2(jni_wayline, jni_waylineMissionConfig, jni_homeLocation);
    }

    public static List<byte[]> ConvertV3ActionsToV2(List<WaylineActionGroup> groups) {
        ArrayList<byte[]> jni_action_groups = new ArrayList<byte[]>();
        for (WaylineActionGroup item : groups) {
            byte[] jni_item = item.toBytes();
            jni_action_groups.add(jni_item);
        }
        return JNIWPMZManager.native_ConvertV3ActionsToV2(jni_action_groups);
    }

    public static WaylineCheckErrorMsg checkWPMZValid(String version, String kmz_path) {
        byte[] native_ret = JNIWPMZManager.native_CheckWPMZValid(version, kmz_path);
        WaylineCheckErrorMsg java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WaylineCheckErrorMsg.class, native_ret);
        return java_ret;
    }

    public static WaylineTrajectory generateWaylineTrajectory(Wayline waylines_info) {
        byte[] jni_waylines_info = waylines_info.toBytes();
        byte[] native_ret = JNIWPMZManager.native_GenerateWaylineTrajectory(jni_waylines_info);
        WaylineTrajectory java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WaylineTrajectory.class, native_ret);
        return java_ret;
    }

    public static WPMLAircraftConvertInfo convertAircraftType(WaylineMissionConfig src_mission_config, List<WaylineTemplate> src_template, WaylineDroneInfo dest_info, List<WaylinePayloadInfo> dest_payloads) {
        Object jni_item;
        byte[] jni_src_mission_config = src_mission_config.toBytes();
        ArrayList<byte[]> jni_src_template = new ArrayList<byte[]>();
        for (WaylineTemplate item : src_template) {
            jni_item = item.toBytes();
            jni_src_template.add((byte[])jni_item);
        }
        byte[] jni_dest_info = dest_info.toBytes();
        ArrayList<byte[]> jni_dest_payloads = new ArrayList<byte[]>();
        jni_item = dest_payloads.iterator();
        while (jni_item.hasNext()) {
            WaylinePayloadInfo item = (WaylinePayloadInfo)jni_item.next();
            byte[] jni_item2 = item.toBytes();
            jni_dest_payloads.add(jni_item2);
        }
        byte[] native_ret = JNIWPMZManager.native_ConvertAircraftType(jni_src_mission_config, jni_src_template, jni_dest_info, jni_dest_payloads);
        WPMLAircraftConvertInfo java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WPMLAircraftConvertInfo.class, native_ret);
        return java_ret;
    }

    public static WpmzVersion getWpmzVersion() {
        byte[] native_ret = JNIWPMZManager.native_GetWpmzVersion();
        WpmzVersion java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(WpmzVersion.class, native_ret);
        return java_ret;
    }

    public static KmzFileVersion getKmzFileVersion(String kmz_path) {
        byte[] native_ret = JNIWPMZManager.native_GetKmzFileVersion(kmz_path);
        KmzFileVersion java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(KmzFileVersion.class, native_ret);
        return java_ret;
    }

    public static ActionAccuratePhotoParam convertOrientedPhotoToAccuratePhoto(ActionOrientedPhotoParam orientedPhotoParam) {
        byte[] jni_orientedPhotoParam = orientedPhotoParam.toBytes();
        byte[] native_ret = JNIWPMZManager.native_ConvertOrientedPhotoToAccuratePhoto(jni_orientedPhotoParam);
        ActionAccuratePhotoParam java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(ActionAccuratePhotoParam.class, native_ret);
        return java_ret;
    }

    public static ActionOrientedPhotoParam convertAccuratePhotoToOrientedPhoto(ActionAccuratePhotoParam accuratePhotoParam) {
        byte[] jni_accuratePhotoParam = accuratePhotoParam.toBytes();
        byte[] native_ret = JNIWPMZManager.native_ConvertAccuratePhotoToOrientedPhoto(jni_accuratePhotoParam);
        ActionOrientedPhotoParam java_ret = native_ret == null ? null : DJIValueHelper.fromBytes(ActionOrientedPhotoParam.class, native_ret);
        return java_ret;
    }

    private static native byte[] native_GetWaylineMission(String var0, String var1);

    private static native byte[] native_GetWaylineMissionConfig(String var0, String var1);

    private static native byte[] native_GetWaylineTemplates(String var0, String var1);

    private static native byte[] native_ConvertV3MissionToV2(byte[] var0, byte[] var1);

    private static native byte[] native_ConvertV3MissionToV2(byte[] var0, byte[] var1, byte[] var2);

    private static native List<byte[]> native_ConvertV3ActionsToV2(List<byte[]> var0);

    private static native byte[] native_GetWaylines(String var0, String var1);

    private static native boolean native_GenerateKMZFile(String var0, byte[] var1, byte[] var2, List<byte[]> var3, List<byte[]> var4, byte[] var5, List<String> var6, List<String> var7, String var8);

    private static native byte[] native_CheckWPMZValid(String var0, String var1);

    private static native byte[] native_GenerateWaylineTrajectory(byte[] var0);

    private static native byte[] native_ConvertAircraftType(byte[] var0, List<byte[]> var1, byte[] var2, List<byte[]> var3);

    private static native byte[] native_GetWpmzVersion();

    private static native byte[] native_GetKmzFileVersion(String var0);

    private static native byte[] native_ConvertOrientedPhotoToAccuratePhoto(byte[] var0);

    private static native byte[] native_ConvertAccuratePhotoToOrientedPhoto(byte[] var0);

    static {
        try {
            System.loadLibrary("wpmz_jni");
        }
        catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
            Log.e((String)"wpmz_jni", (String)("Load so error in Java" + e.getMessage()));
        }
    }
}

