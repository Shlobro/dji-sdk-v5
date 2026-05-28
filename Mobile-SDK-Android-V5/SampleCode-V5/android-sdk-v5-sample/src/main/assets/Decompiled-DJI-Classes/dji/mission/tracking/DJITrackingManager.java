/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.tracking;

import dji.mission.callback.MissionActionCallback;
import dji.mission.tracking.TrackingMissionManagerInfrastructure;
import dji.sdk.common.CallBack;
import dji.sdk.keyvalue.value.gimbal.GimbalSpeedRotation;
import dji.sdk.keyvalue.value.mission.AppAssistedTrackingMissionState;
import dji.sdk.keyvalue.value.mission.AppAssistedTrackingMissionVisionBox;
import dji.sdk.keyvalue.value.mission.TrackingMission;
import dji.sdk.keyvalue.value.mission.TrackingMissionSetting;
import dji.sdk.keyvalue.value.mission.TrackingMissionState;
import java.util.Map;

public class DJITrackingManager
implements TrackingMissionManagerInfrastructure {
    private int mProductId;
    private int mDeviceId;
    private int mTrackingStateListenId;
    private int mTrackingStateChangedNotifyListenId;
    private boolean mOriginConnectState;
    private TrackingMissionSetting mSetting;
    private boolean mIsTrackingAppAssisted;
    private TrackingMissionState mTrackingMissionState;
    private Map<Long, CallBack<TrackingMissionState>> mTrackingStateCallbacks;
    private CallBack<AppAssistedTrackingMissionState> mAppAssistedStateCallback;

    public DJITrackingManager(int n, int n2) {
    }

    public void updateProductConnect(boolean bl) {
    }

    @Override
    public void setTrackingSetting(TrackingMissionSetting trackingMissionSetting, CallBack<Boolean> callBack) {
    }

    @Override
    public TrackingMissionSetting getTrackingSetting() {
        return null;
    }

    @Override
    public void startTracking(TrackingMission trackingMission, MissionActionCallback missionActionCallback) {
    }

    @Override
    public void stopTracking(MissionActionCallback missionActionCallback) {
    }

    @Override
    public long addTrackingStateListener(CallBack<TrackingMissionState> callBack) {
        return 0L;
    }

    @Override
    public void removeTrackingStateListener(long l2) {
    }

    @Override
    public void addAppAssistedTrackingMissionRunningStateListener(CallBack<AppAssistedTrackingMissionState> callBack) {
    }

    @Override
    public void removeAppAssistedTrackingMissionRunningStateListener() {
    }

    @Override
    public void startListenAppAssistedTrackingMissionState() {
    }

    @Override
    public void stopListenAppAssistedTrackingMissionState() {
    }

    @Override
    public TrackingMissionState getTrackingState() {
        return null;
    }

    @Override
    public void getAppAssistedTrackingMissionState(CallBack<AppAssistedTrackingMissionState> callBack) {
    }

    @Override
    public void pushAppAssistedTrackingMissionVisionBox(AppAssistedTrackingMissionVisionBox appAssistedTrackingMissionVisionBox) {
    }

    @Override
    public void setAppAssistedTrackingMissionVirtualStickControl(GimbalSpeedRotation gimbalSpeedRotation) {
    }

    @Override
    public boolean valid() {
        return false;
    }

    @Override
    public int getProductId() {
        return 0;
    }

    private void init() {
    }

    private void uninit() {
    }

    private static /* synthetic */ void lambda$startTracking$1(MissionActionCallback missionActionCallback) {
    }

    private static /* synthetic */ void lambda$startTracking$0(MissionActionCallback missionActionCallback) {
    }

    static /* synthetic */ TrackingMissionSetting access$002(DJITrackingManager dJITrackingManager, TrackingMissionSetting trackingMissionSetting) {
        return null;
    }

    static /* synthetic */ CallBack access$100(DJITrackingManager dJITrackingManager) {
        return null;
    }

    static /* synthetic */ TrackingMissionState access$202(DJITrackingManager dJITrackingManager, TrackingMissionState trackingMissionState) {
        return null;
    }

    static /* synthetic */ Map access$300(DJITrackingManager dJITrackingManager) {
        return null;
    }
}

