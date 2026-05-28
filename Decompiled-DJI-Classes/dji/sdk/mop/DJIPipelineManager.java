/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mop;

import dji.sdk.keyvalue.value.mop.PipelineIdentifier;
import dji.sdk.keyvalue.value.mop.PointCloudDataDecodeResult;
import dji.sdk.keyvalue.value.mop.TransmissionControlType;
import dji.sdk.mop.DJIPipeline;
import dji.sdk.mop.PipelineConnectionObserver;
import java.util.List;
import java.util.Map;

public class DJIPipelineManager {
    private int mProductId;
    private int mDeviceId;
    private static DJIPipelineManager instance = null;
    private Map<PipelineIdentifier, DJIPipeline> mPipelines;

    private DJIPipelineManager(int n, int n2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIPipelineManager getInstance() {
        return null;
    }

    public Map<PipelineIdentifier, DJIPipeline> pipelines() {
        return null;
    }

    public DJIPipeline getPipeline(PipelineIdentifier pipelineIdentifier) {
        return null;
    }

    public long addPipelinesConnectionObserver(PipelineConnectionObserver pipelineConnectionObserver) {
        return 0L;
    }

    public void removePipelinesConnectionObserver(long l2) {
    }

    public DJIPipeline connectPipeline(PipelineIdentifier pipelineIdentifier, TransmissionControlType transmissionControlType) {
        return null;
    }

    public int disconnectPipeline(PipelineIdentifier pipelineIdentifier) {
        return 0;
    }

    public PointCloudDataDecodeResult cloudDataDecode(byte[] byArray) {
        return null;
    }

    private /* synthetic */ void lambda$addPipelinesConnectionObserver$1(PipelineConnectionObserver pipelineConnectionObserver, int n, int n2, List list) {
    }

    private /* synthetic */ void lambda$addPipelinesConnectionObserver$0(int n, int n2, List list, PipelineConnectionObserver pipelineConnectionObserver) {
    }
}

