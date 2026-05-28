/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.smarttrack;

import dji.sdk.keyvalue.value.flightassistant.SmartEyeState;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.smarttrack.ISmartTrackMissionManager;
import dji.v5.manager.intelligent.smarttrack.SmartTrackCapability;
import dji.v5.manager.intelligent.smarttrack.SmartTrackInfo;
import dji.v5.manager.intelligent.smarttrack.SmartTrackParam;
import dji.v5.manager.intelligent.smarttrack.SmartTrackTarget;

public class SmartTrackMissionConsumeDelegate
implements ISmartTrackMissionManager {
    private IMissionCapabilityListener<SmartTrackCapability> capabilityListener;
    private IMissionInfoListener<SmartTrackInfo, SmartTrackTarget> missionInfoListener;
    private final SmartTrackCapability capability;
    private final SmartTrackInfo info;
    private final SmartTrackTarget target;

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
    public void addMissionCapabilityListener(IMissionCapabilityListener<SmartTrackCapability> iMissionCapabilityListener) {
    }

    @Override
    public void addMissionInfoListener(IMissionInfoListener<SmartTrackInfo, SmartTrackTarget> iMissionInfoListener) {
    }

    @Override
    public void removeMissionCapabilityListener(IMissionCapabilityListener<SmartTrackCapability> iMissionCapabilityListener) {
    }

    @Override
    public void removeMissionInfoListener(IMissionInfoListener<SmartTrackInfo, SmartTrackTarget> iMissionInfoListener) {
    }

    @Override
    public void startMission(SmartTrackTarget smartTrackTarget, SmartTrackParam smartTrackParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionTarget(SmartTrackTarget smartTrackTarget, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionParam(SmartTrackParam smartTrackParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateAutoSensingTarget(AutoSensingTarget autoSensingTarget) {
    }

    private void notifyCapabilityListener() {
    }

    private void notifyMissionInfoListener() {
    }

    private void notifyTargetListener() {
    }

    private /* synthetic */ void lambda$init$0(SmartEyeState smartEyeState, SmartEyeState smartEyeState2) {
    }
}

