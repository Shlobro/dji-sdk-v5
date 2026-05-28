/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.mop;

import dji.sdk.keyvalue.value.mop.PipelineDeviceType;
import dji.sdk.keyvalue.value.mop.PipelineIdentifier;
import dji.sdk.keyvalue.value.mop.PipelineState;
import dji.sdk.keyvalue.value.mop.TransmissionControlType;
import dji.v5.manager.mop.DataResult;

public class Pipeline {
    private int id;
    private TransmissionControlType transmissionControlType;
    private PipelineDeviceType pipelineDeviceType;

    private Pipeline() {
    }

    protected Pipeline(int n, TransmissionControlType transmissionControlType, PipelineDeviceType pipelineDeviceType, PipelineIdentifier pipelineIdentifier) {
    }

    public int getId() {
        return 0;
    }

    public PipelineState getPipelineState() {
        return null;
    }

    public TransmissionControlType getTransmissionControlType() {
        return null;
    }

    public PipelineDeviceType getPipelineDeviceType() {
        return null;
    }

    public DataResult writeData(byte[] byArray) {
        return null;
    }

    public DataResult readData(byte[] byArray) {
        return null;
    }

    public String toString() {
        return null;
    }
}

