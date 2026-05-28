/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.poi;

import dji.sdk.keyvalue.value.flightassistant.SmartEyeState;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.poi.IPOIMissionManager;
import dji.v5.manager.intelligent.poi.POICapability;
import dji.v5.manager.intelligent.poi.POIInfo;
import dji.v5.manager.intelligent.poi.POIParam;
import dji.v5.manager.intelligent.poi.POITarget;

public class POIMissionConsumeDelegate
implements IPOIMissionManager {
    private IMissionCapabilityListener<POICapability> capabilityListener;
    private IMissionInfoListener<POIInfo, POITarget> missionInfoListener;
    private final POICapability capability;
    private final POIInfo info;
    private final POITarget poiTarget;

    @Override
    public void init() {
    }

    @Override
    public void notifyInfo() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addMissionCapabilityListener(IMissionCapabilityListener<POICapability> iMissionCapabilityListener) {
    }

    @Override
    public void addMissionInfoListener(IMissionInfoListener<POIInfo, POITarget> iMissionInfoListener) {
    }

    @Override
    public void removeMissionCapabilityListener(IMissionCapabilityListener<POICapability> iMissionCapabilityListener) {
    }

    @Override
    public void removeMissionInfoListener(IMissionInfoListener<POIInfo, POITarget> iMissionInfoListener) {
    }

    @Override
    public void startMission(POITarget pOITarget, POIParam pOIParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionTarget(POITarget pOITarget, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionParam(POIParam pOIParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void lockCircularVelocity(boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void lockGimbalPitch(boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateAutoSensingTarget(AutoSensingTarget autoSensingTarget) {
    }

    private void notifyCapabilityListener() {
    }

    private void notifyMissionInfoListener() {
    }

    private void notifyTargetListener() {
    }

    private /* synthetic */ void lambda$init$1(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$init$0(SmartEyeState smartEyeState, SmartEyeState smartEyeState2) {
    }
}

