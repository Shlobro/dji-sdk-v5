/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent;

import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.IMissionCapabilityListener;
import dji.v5.manager.intelligent.IMissionInfoListener;

public interface IMissionManager<Target, Param, Info, Capability> {
    public void init();

    public void notifyInfo();

    public void destroy();

    public void addMissionCapabilityListener(IMissionCapabilityListener<Capability> var1);

    public void addMissionInfoListener(IMissionInfoListener<Info, Target> var1);

    public void removeMissionCapabilityListener(IMissionCapabilityListener<Capability> var1);

    public void removeMissionInfoListener(IMissionInfoListener<Info, Target> var1);

    public void startMission(Target var1, Param var2, CommonCallbacks.CompletionCallback var3);

    public void stopMission(CommonCallbacks.CompletionCallback var1);

    public void updateMissionTarget(Target var1, CommonCallbacks.CompletionCallback var2);

    public void updateMissionParam(Param var1, CommonCallbacks.CompletionCallback var2);
}

