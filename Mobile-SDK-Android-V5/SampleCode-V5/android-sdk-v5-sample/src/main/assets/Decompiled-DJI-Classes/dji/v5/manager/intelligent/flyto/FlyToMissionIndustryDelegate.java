/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent.flyto;

import dji.sdk.keyvalue.value.flightcontroller.FlyToMissionInfo;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKTakeoffAltitudeInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;
import dji.v5.manager.intelligent.flyto.FlyToCapability;
import dji.v5.manager.intelligent.flyto.FlyToInfo;
import dji.v5.manager.intelligent.flyto.FlyToParam;
import dji.v5.manager.intelligent.flyto.FlyToTarget;
import dji.v5.manager.intelligent.flyto.IFlyToMissionManager;
import java.util.List;

public class FlyToMissionIndustryDelegate
implements IFlyToMissionManager {
    private IMissionCapabilityListener<FlyToCapability> capabilityListener;
    private IMissionInfoListener<FlyToInfo, FlyToTarget> missionInfoListener;
    private final FlyToCapability capability;
    private final FlyToInfo info;
    private FlyToTarget flyToTarget;
    private double takeoffAltitude;

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

    private void notifyCapabilityListener() {
    }

    private void notifyMissionInfoListener() {
    }

    private void notifyMissionTargetListener() {
    }

    private void setRcLostActionMode() {
    }

    private /* synthetic */ void lambda$init$5(RTKTakeoffAltitudeInfo rTKTakeoffAltitudeInfo, RTKTakeoffAltitudeInfo rTKTakeoffAltitudeInfo2) {
    }

    private /* synthetic */ void lambda$init$4(List list, List list2) {
    }

    private /* synthetic */ void lambda$init$3(FlyToMissionInfo flyToMissionInfo, FlyToMissionInfo flyToMissionInfo2) {
    }

    private /* synthetic */ void lambda$init$2(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$init$1(FlyToMissionInfo flyToMissionInfo, FlyToMissionInfo flyToMissionInfo2) {
    }

    private /* synthetic */ void lambda$init$0(Integer n, Integer n2) {
    }

    static /* synthetic */ void access$000(FlyToMissionIndustryDelegate flyToMissionIndustryDelegate) {
    }

    static /* synthetic */ FlyToTarget access$102(FlyToMissionIndustryDelegate flyToMissionIndustryDelegate, FlyToTarget flyToTarget) {
        return null;
    }

    static /* synthetic */ void access$200(FlyToMissionIndustryDelegate flyToMissionIndustryDelegate) {
    }
}

