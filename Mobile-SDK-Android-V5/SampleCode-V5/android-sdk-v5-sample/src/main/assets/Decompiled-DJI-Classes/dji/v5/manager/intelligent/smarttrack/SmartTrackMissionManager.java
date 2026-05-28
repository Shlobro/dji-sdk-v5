/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.smarttrack;

import dji.sdk.keyvalue.utils.ProductUtil;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.smarttrack.ISmartTrackMissionManager;
import dji.v5.manager.intelligent.smarttrack.SmartTrackCapability;
import dji.v5.manager.intelligent.smarttrack.SmartTrackInfo;
import dji.v5.manager.intelligent.smarttrack.SmartTrackParam;
import dji.v5.manager.intelligent.smarttrack.SmartTrackTarget;
import java.util.List;

public class SmartTrackMissionManager
implements ISmartTrackMissionManager {
    private ProductUtil.MachineType currentMachineType;
    private ISmartTrackMissionManager delegate;
    private final List<IMissionCapabilityListener<SmartTrackCapability>> capabilityListeners;
    private final List<IMissionInfoListener<SmartTrackInfo, SmartTrackTarget>> missionInfoListeners;
    private final IMissionCapabilityListener<SmartTrackCapability> capabilityListener;
    private final IMissionInfoListener<SmartTrackInfo, SmartTrackTarget> missionInfoListener;

    public void onMachineTypeUpdate(ProductUtil.MachineType machineType) {
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

    private /* synthetic */ void lambda$new$0(SmartTrackCapability smartTrackCapability) {
    }

    static /* synthetic */ List access$000(SmartTrackMissionManager smartTrackMissionManager) {
        return null;
    }
}

