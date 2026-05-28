/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.poi;

import dji.sdk.keyvalue.utils.ProductUtil;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.poi.IPOIMissionManager;
import dji.v5.manager.intelligent.poi.POICapability;
import dji.v5.manager.intelligent.poi.POIInfo;
import dji.v5.manager.intelligent.poi.POIParam;
import dji.v5.manager.intelligent.poi.POITarget;
import java.util.List;

public class POIMissionManager
implements IPOIMissionManager {
    private ProductUtil.MachineType currentMachineType;
    private IPOIMissionManager delegate;
    private final List<IMissionCapabilityListener<POICapability>> capabilityListeners;
    private final List<IMissionInfoListener<POIInfo, POITarget>> missionInfoListeners;
    private final IMissionCapabilityListener<POICapability> capabilityListener;
    private final IMissionInfoListener<POIInfo, POITarget> missionInfoListener;

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
    public void lockGimbalPitch(boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void lockCircularVelocity(boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateAutoSensingTarget(AutoSensingTarget autoSensingTarget) {
    }

    private /* synthetic */ void lambda$new$0(POICapability pOICapability) {
    }

    static /* synthetic */ List access$000(POIMissionManager pOIMissionManager) {
        return null;
    }
}

