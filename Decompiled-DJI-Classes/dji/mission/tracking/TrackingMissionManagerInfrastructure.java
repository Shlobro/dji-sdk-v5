/*
 * Decompiled with CFR 0.152.
 */
package dji.mission.tracking;

import dji.mission.callback.MissionActionCallback;
import dji.sdk.common.CallBack;
import dji.sdk.keyvalue.value.gimbal.GimbalSpeedRotation;
import dji.sdk.keyvalue.value.mission.AppAssistedTrackingMissionState;
import dji.sdk.keyvalue.value.mission.AppAssistedTrackingMissionVisionBox;
import dji.sdk.keyvalue.value.mission.TrackingMission;
import dji.sdk.keyvalue.value.mission.TrackingMissionSetting;
import dji.sdk.keyvalue.value.mission.TrackingMissionState;

public interface TrackingMissionManagerInfrastructure {
    public int getProductId();

    public void setTrackingSetting(TrackingMissionSetting var1, CallBack<Boolean> var2);

    public TrackingMissionSetting getTrackingSetting();

    public void startTracking(TrackingMission var1, MissionActionCallback var2);

    public void stopTracking(MissionActionCallback var1);

    public long addTrackingStateListener(CallBack<TrackingMissionState> var1);

    public void removeTrackingStateListener(long var1);

    public TrackingMissionState getTrackingState();

    public void pushAppAssistedTrackingMissionVisionBox(AppAssistedTrackingMissionVisionBox var1);

    public void setAppAssistedTrackingMissionVirtualStickControl(GimbalSpeedRotation var1);

    public void addAppAssistedTrackingMissionRunningStateListener(CallBack<AppAssistedTrackingMissionState> var1);

    public void removeAppAssistedTrackingMissionRunningStateListener();

    public void startListenAppAssistedTrackingMissionState();

    public void stopListenAppAssistedTrackingMissionState();

    public void getAppAssistedTrackingMissionState(CallBack<AppAssistedTrackingMissionState> var1);

    public boolean valid();
}

