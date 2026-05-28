/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.flyto;

import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.flyto.FlyToCapability;
import dji.v5.manager.intelligent.flyto.FlyToInfo;
import dji.v5.manager.intelligent.flyto.FlyToParam;
import dji.v5.manager.intelligent.flyto.FlyToTarget;
import dji.v5.manager.intelligent.flyto.IFlyToMissionManager;

public class FlyToMissionConsumeDelegate
implements IFlyToMissionManager {
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
    public void addMissionCapabilityListener(IMissionCapabilityListener<FlyToCapability> iMissionCapabilityListener) {
    }

    @Override
    public void addMissionInfoListener(IMissionInfoListener<FlyToInfo, FlyToTarget> iMissionInfoListener) {
    }

    @Override
    public void removeMissionCapabilityListener(IMissionCapabilityListener<FlyToCapability> iMissionCapabilityListener) {
    }

    @Override
    public void removeMissionInfoListener(IMissionInfoListener<FlyToInfo, FlyToTarget> iMissionInfoListener) {
    }

    @Override
    public void startMission(FlyToTarget flyToTarget, FlyToParam flyToParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionTarget(FlyToTarget flyToTarget, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void updateMissionParam(FlyToParam flyToParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateAutoSensingTarget(AutoSensingTarget autoSensingTarget) {
    }
}

