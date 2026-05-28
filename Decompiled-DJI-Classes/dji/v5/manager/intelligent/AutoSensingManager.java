/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.intelligent;

import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.intelligent.AutoSensingInfo;
import dji.v5.manager.intelligent.AutoSensingInfoListener;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IntelligentModel;
import java.util.List;

abstract class AutoSensingManager {
    protected int runningModelIndex;
    protected final AutoSensingInfo info;
    protected AutoSensingTarget trackingTarget;
    protected List<IntelligentModel> models;
    protected final AutoSensingInfoListener listener;

    public AutoSensingManager(AutoSensingInfoListener autoSensingInfoListener) {
    }

    abstract void init();

    abstract void destroy();

    abstract void startAutoSensing(CommonCallbacks.CompletionCallback var1);

    abstract void stopAutoSensing(CommonCallbacks.CompletionCallback var1);

    abstract void selectIntelligentModel(int var1, CommonCallbacks.CompletionCallback var2);

    protected void notifyAutoSensingInfoListener() {
    }

    protected void notifyTrackingTargetListener() {
    }

    protected void notifyIntelligentModelListener() {
    }

    protected void notifyRunningIntelligentModelIdListener() {
    }
}

