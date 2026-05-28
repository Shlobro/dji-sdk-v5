/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mop;

import dji.sdk.keyvalue.value.mop.PipelineIdentifier;
import dji.sdk.keyvalue.value.mop.PipelineState;
import dji.sdk.keyvalue.value.mop.TransmissionControlType;

public class DJIPipeline {
    private PipelineIdentifier mIdentifier;
    private TransmissionControlType mTransmissionType;

    public DJIPipeline(PipelineIdentifier pipelineIdentifier, TransmissionControlType transmissionControlType) {
    }

    public int writeData(byte[] byArray) {
        return 0;
    }

    public int readData(byte[] byArray) {
        return 0;
    }

    public PipelineState getState() {
        return null;
    }

    public PipelineIdentifier identifier() {
        return null;
    }

    public TransmissionControlType transmissionControlType() {
        return null;
    }
}

