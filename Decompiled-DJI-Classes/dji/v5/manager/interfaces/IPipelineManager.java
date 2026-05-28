/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.mop.PipelineDeviceType;
import dji.sdk.keyvalue.value.mop.TransmissionControlType;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.mop.Pipeline;
import dji.v5.manager.mop.PipelineConnectionListener;
import java.util.Map;

public interface IPipelineManager {
    public void init();

    public void destroy();

    public void addPipelineConnectionListener(PipelineConnectionListener var1);

    public void removePipelineConnectionListener(PipelineConnectionListener var1);

    public void clearAllPipelineConnectionListener();

    public IDJIError connectPipeline(int var1, PipelineDeviceType var2, TransmissionControlType var3);

    public IDJIError connectPipeline(ComponentIndexType var1, int var2, PipelineDeviceType var3, TransmissionControlType var4);

    public IDJIError disconnectPipeline(int var1, PipelineDeviceType var2, TransmissionControlType var3);

    public IDJIError disconnectPipeline(ComponentIndexType var1, int var2, PipelineDeviceType var3, TransmissionControlType var4);

    public Map<Integer, Pipeline> getPipelines();
}

