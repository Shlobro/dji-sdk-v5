/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.natives;

import com.dji.industry.mission.natives.pack.PackHelper;
import com.dji.industry.mission.natives.util.NativeCallbackUtils;
import dji.v5.utils.common.LogUtils;

public class WaypointV2Core {
    private WaypointV2Core() {
    }

    public static native void initWaypoint(boolean var0);

    public static native void setIsWaypointV1AdaptorSupported(boolean var0);

    public static native void setActionMediaFilePath(String var0);

    public static native void uploadV1MissionData(long var0, byte[] var2, byte[] var3, NativeCallbackUtils.CommonCallback var4);

    public static native void uploadV2MissionData(long var0, byte[] var2, NativeCallbackUtils.CommonCallback var3);

    public static native void uploadV2Mission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void loadV2MissionData(long var0, byte[] var2, NativeCallbackUtils.CommonCallback var3);

    public static native void uploadV2ActionData(long var0, byte[][] var2, NativeCallbackUtils.CommonCallback var3);

    public static native void cancelV2UploadAction(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void retryV1UploadData(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void retryV2UploadData(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void cancelUploadMission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void startMission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void stopMission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void pauseMission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void resumeMission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void interruptMission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void recoverMission(long var0, int var2, NativeCallbackUtils.CommonCallback var3);

    public static native void downloadV1Mission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void downloadV2Mission(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void downloadActionData(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void setCruiseSpeed(long var0, float var2, NativeCallbackUtils.CommonCallback var3);

    public static native void getCruiseSpeed(long var0, NativeCallbackUtils.CommonCallbackWith<Float> var2);

    public static native void setWaypointStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setWaypointUploadStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setWaypointDownloadStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setWaypointExecutionStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setWaypointSampleStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setActionStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setActionUploadStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setActionDownloadStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setActionExecutionStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void setV1WaypointStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native byte[] getCachedV1Mission(long var0);

    public static native byte[] getCachedV2Mission(long var0);

    public static native int getCurrentAbstractionState(long var0);

    public static native int getCurrentActionState(long var0);

    public static native byte[][] getCurrentLoadedActions(long var0);

    public static native void registerDevice(long var0);

    public static native void unregisterDevice(long var0);

    public static native void updateDeviceState(long var0, int var2);

    public static native void enterTrajectoryReplayTeachMode(long var0, long var2, NativeCallbackUtils.CommonCallback var4);

    public static native void cancelTrajectoryReplayTeachMode(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void exitTrajectoryReplayTeachMode(long var0, NativeCallbackUtils.CommonCallbackWithTwoParam<Integer, Integer> var2);

    public static native void addNewWaypointUnderTrajectoryReplayTeachMode(long var0, int var2, int var3, int var4, NativeCallbackUtils.CommonCallback var5);

    public static native void addNewActionUnderTrajectoryReplayTeachMode(long var0, int var2, int var3, int var4, NativeCallbackUtils.CommonCallback var5);

    public static native void getTrajectoryReplayTeachMissionAndActions(long var0, NativeCallbackUtils.CommonCallbackWithTwoParam<Byte[], Byte[][]> var2);

    public static native void setTrajectoryReplayStateChangeCallback(NativeCallbackUtils.CommonCallback var0);

    public static native void removeLastTrajectoryReplayTeachMissionAndActions(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void removeLastTrajectoryReplayTeachActions(long var0, NativeCallbackUtils.CommonCallback var2);

    public static native void getSuspendType(long var0, NativeCallbackUtils.CommonCallbackWith<Integer> var2);

    public static native void dataLinkReverseCallback(long var0, boolean var2);

    public static native void externalLockMotorCallback(long var0, boolean var2);

    public static native int getLoadedActionCount(long var0);

    public static native void updatePushPackInfo(long var0, int var2, PackHelper.PackCmdType var3, PackHelper.PackRoute var4, int var5, byte[] var6, int var7);

    public static native void notifyPackReceived(long var0, int var2, PackHelper.PackRoute var3, PackHelper.PackRoute var4, byte[] var5, int var6, int var7);

    static {
        try {
            System.loadLibrary("djiwpv2-CSDK");
        }
        catch (UnsatisfiedLinkError e2) {
            LogUtils.e("WP_JNI", "Load so error in Java" + e2.getMessage());
        }
    }
}

