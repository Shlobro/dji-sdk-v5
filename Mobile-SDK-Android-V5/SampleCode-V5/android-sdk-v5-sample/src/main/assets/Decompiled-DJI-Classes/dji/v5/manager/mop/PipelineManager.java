/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.mop;

import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.mop.PipelineDeviceType;
import dji.sdk.keyvalue.value.mop.TransmissionControlType;
import dji.v5.common.error.IDJIError;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.interfaces.IPipelineManager;
import dji.v5.manager.mop.Pipeline;
import dji.v5.manager.mop.PipelineConnectionListener;
import java.util.List;
import java.util.Map;

public class PipelineManager
implements IPipelineManager {
    private final Map<Integer, Pipeline> pipelineHashMap;
    private final List<PipelineConnectionListener> pipelineConnectionListenerList;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;

    public static IPipelineManager getInstance() {
        return null;
    }

    private PipelineManager() {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public void addPipelineConnectionListener(PipelineConnectionListener pipelineConnectionListener) {
    }

    @Override
    public void removePipelineConnectionListener(PipelineConnectionListener pipelineConnectionListener) {
    }

    @Override
    public void clearAllPipelineConnectionListener() {
    }

    @Override
    public IDJIError connectPipeline(int n, PipelineDeviceType pipelineDeviceType, TransmissionControlType transmissionControlType) {
        return null;
    }

    @Override
    public IDJIError connectPipeline(ComponentIndexType componentIndexType, int n, PipelineDeviceType pipelineDeviceType, TransmissionControlType transmissionControlType) {
        return null;
    }

    @Override
    public IDJIError disconnectPipeline(int n, PipelineDeviceType pipelineDeviceType, TransmissionControlType transmissionControlType) {
        return null;
    }

    @Override
    public IDJIError disconnectPipeline(ComponentIndexType componentIndexType, int n, PipelineDeviceType pipelineDeviceType, TransmissionControlType transmissionControlType) {
        return null;
    }

    @Override
    public Map<Integer, Pipeline> getPipelines() {
        return null;
    }

    private void updatePipeLineMap() {
    }

    private void notifyPipeLineMap() {
    }

    private /* synthetic */ void lambda$notifyPipeLineMap$12() {
    }

    private /* synthetic */ void lambda$updatePipeLineMap$11() {
    }

    private /* synthetic */ void lambda$init$10(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$9(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$8(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$7(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$6(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$5(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$4(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$3(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$2(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$1(Boolean bl) throws Throwable {
    }

    private /* synthetic */ void lambda$init$0(Boolean bl) throws Throwable {
    }

    /* synthetic */ PipelineManager(1 var1_1) {
    }

    private static class PipelineManagerHolder {
        private static final PipelineManager INSTANCE = new PipelineManager(null);

        private PipelineManagerHolder() {
        }

        static /* synthetic */ PipelineManager access$000() {
            return null;
        }
    }
}

