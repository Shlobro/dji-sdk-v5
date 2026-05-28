/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.spotlight;

import dji.sdk.keyvalue.value.common.DoubleRect;
import dji.sdk.keyvalue.value.flightassistant.SmartTrackInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.spotlight.ISpotLightManager;
import dji.v5.manager.intelligent.spotlight.SpotLightCapability;
import dji.v5.manager.intelligent.spotlight.SpotLightInfo;
import dji.v5.manager.intelligent.spotlight.SpotLightParam;
import dji.v5.manager.intelligent.spotlight.SpotLightTarget;

class SpotLightIndustryDelegate
implements ISpotLightManager {
    private IMissionCapabilityListener<SpotLightCapability> capabilityListener;
    private IMissionInfoListener<SpotLightInfo, SpotLightTarget> missionInfoListener;
    private SpotLightInfo spotlightInfo;
    private final SpotLightCapability capability;
    private SpotLightTarget spotLightTarget;

    SpotLightIndustryDelegate() {
    }

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
    public void addMissionCapabilityListener(IMissionCapabilityListener<SpotLightCapability> iMissionCapabilityListener) {
    }

    @Override
    public void addMissionInfoListener(IMissionInfoListener<SpotLightInfo, SpotLightTarget> iMissionInfoListener) {
    }

    @Override
    public void removeMissionCapabilityListener(IMissionCapabilityListener<SpotLightCapability> iMissionCapabilityListener) {
    }

    @Override
    public void removeMissionInfoListener(IMissionInfoListener<SpotLightInfo, SpotLightTarget> iMissionInfoListener) {
    }

    @Override
    public void enterSpotLightMode(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void exitSpotLightMode(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startMission(SpotLightTarget spotLightTarget, SpotLightParam spotLightParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionTarget(SpotLightTarget spotLightTarget, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionParam(SpotLightParam spotLightParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void confirmTarget(CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateAutoSensingTarget(AutoSensingTarget autoSensingTarget) {
    }

    private void notifyCapabilityListener() {
    }

    private void notifyMissionInfoListener() {
    }

    private void notifyMissionTargetListener() {
    }

    private void doForTargetIndex(Integer n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void doForTargetRect(DoubleRect doubleRect, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private /* synthetic */ void lambda$init$1(SmartTrackInfo smartTrackInfo, SmartTrackInfo smartTrackInfo2) {
    }

    private /* synthetic */ void lambda$init$0(Boolean bl, Boolean bl2) {
    }
}

