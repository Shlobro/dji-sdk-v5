/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.spotlight;

import dji.sdk.keyvalue.utils.ProductUtil;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.spotlight.ISpotLightManager;
import dji.v5.manager.intelligent.spotlight.SpotLightCapability;
import dji.v5.manager.intelligent.spotlight.SpotLightInfo;
import dji.v5.manager.intelligent.spotlight.SpotLightParam;
import dji.v5.manager.intelligent.spotlight.SpotLightTarget;
import java.util.List;

public class SpotLightManager
implements ISpotLightManager {
    ISpotLightManager delegate;
    private ProductUtil.MachineType currentMachineType;
    private final List<IMissionCapabilityListener<SpotLightCapability>> capabilityListeners;
    private final List<IMissionInfoListener<SpotLightInfo, SpotLightTarget>> missionInfoListeners;
    private final IMissionCapabilityListener<SpotLightCapability> capabilityListener;
    private final IMissionInfoListener<SpotLightInfo, SpotLightTarget> missionInfoListener;

    public void onMachineTypeUpdate(ProductUtil.MachineType machineType) {
    }

    public void updateAutoSensingTarget(AutoSensingTarget autoSensingTarget) {
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

    private /* synthetic */ void lambda$new$0(SpotLightCapability spotLightCapability) {
    }

    static /* synthetic */ List access$000(SpotLightManager spotLightManager) {
        return null;
    }
}

