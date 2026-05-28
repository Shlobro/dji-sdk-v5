/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.waypoint;

import dji.sdk.common.CallBack;
import dji.sdk.keyvalue.value.mission.WaypointMission;
import dji.sdk.keyvalue.value.mission.WaypointMissionDownloadState;
import dji.sdk.keyvalue.value.mission.WaypointMissionExecutionState;
import dji.sdk.keyvalue.value.mission.WaypointMissionFinishStateMsg;
import dji.sdk.keyvalue.value.mission.WaypointMissionState;
import dji.sdk.keyvalue.value.mission.WaypointMissionStateTransition;
import dji.sdk.keyvalue.value.mission.WaypointMissionUploadState;

public class DJIWaypointV1Manager {
    private int mProductId;
    private int mDeviceId;
    private boolean mConnected;
    public static final int ERROR_DISCONNECT = -2147483643;

    public DJIWaypointV1Manager(int n, int n2) {
    }

    public DJIWaypointV1Manager(int n) {
    }

    public DJIWaypointV1Manager() {
    }

    public void updateProductConnection(boolean bl) {
    }

    public void resetMissionState(CallBack<Integer> callBack) {
    }

    public void loadMission(WaypointMission waypointMission, CallBack<Integer> callBack) {
    }

    public void uploadMission(CallBack<Integer> callBack) {
    }

    public void retryUploadMission(CallBack<Integer> callBack) {
    }

    public void cancelUploadMission(CallBack<Integer> callBack) {
    }

    public void downloadMission(CallBack<Integer> callBack) {
    }

    public void retryDownloadMission(CallBack<Integer> callBack) {
    }

    public void cancelDownloadMission(CallBack<Integer> callBack) {
    }

    public void startMission(CallBack<Integer> callBack) {
    }

    public void stopMission(CallBack<Integer> callBack) {
    }

    public void pauseMission(CallBack<Integer> callBack) {
    }

    public void resumeMission(CallBack<Integer> callBack) {
    }

    public int addUploadEventListener(CallBack<WaypointMissionUploadState> callBack) {
        return 0;
    }

    public int addDownloadEventListener(CallBack<WaypointMissionDownloadState> callBack) {
        return 0;
    }

    public int addExecutionEventListener(CallBack<WaypointMissionExecutionState> callBack) {
        return 0;
    }

    public int addGlobalStateListener(CallBack<WaypointMissionStateTransition> callBack) {
        return 0;
    }

    public int addFinishStateListener(CallBack<WaypointMissionFinishStateMsg> callBack) {
        return 0;
    }

    public void removeUploadEventListener(int n) {
    }

    public void removeDownloadEventListener(int n) {
    }

    public void removeExecutionEventListener(int n) {
    }

    public void removeGlobalStateListener(int n) {
    }

    public void removeFinishStateListener(int n) {
    }

    public WaypointMissionState getGlobalState() {
        return null;
    }

    public WaypointMission getMission() {
        return null;
    }

    public WaypointMissionExecutionState getExecutionEvent() {
        return null;
    }

    private static /* synthetic */ void lambda$resumeMission$23(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$resumeMission$22(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$pauseMission$21(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$pauseMission$20(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopMission$19(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopMission$18(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startMission$17(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$startMission$16(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelDownloadMission$15(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelDownloadMission$14(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$retryDownloadMission$13(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$retryDownloadMission$12(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$downloadMission$11(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$downloadMission$10(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelUploadMission$9(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$cancelUploadMission$8(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$retryUploadMission$7(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$retryUploadMission$6(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$uploadMission$5(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$uploadMission$4(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$loadMission$3(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$loadMission$2(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$resetMissionState$1(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$resetMissionState$0(CallBack callBack, int n) {
    }
}

