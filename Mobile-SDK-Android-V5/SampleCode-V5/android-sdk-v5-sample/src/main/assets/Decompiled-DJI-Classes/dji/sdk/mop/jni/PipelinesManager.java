/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.mop.jni;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.mop.PipelineIdentifier;
import dji.sdk.keyvalue.value.mop.PointCloudDataDecodeResult;
import dji.sdk.keyvalue.value.mop.TransmissionControlType;
import dji.sdk.mop.PipelineConnectionObserver;
import java.util.List;

public class PipelinesManager
implements JNIProguardKeepTag {
    public static int connectPipeline(PipelineIdentifier pipelineIdentifier, TransmissionControlType transmissionControlType) {
        return 0;
    }

    public static int disconnectPipeline(PipelineIdentifier pipelineIdentifier) {
        return 0;
    }

    public static int writeData(PipelineIdentifier pipelineIdentifier, byte[] byArray) {
        return 0;
    }

    public static int readData(PipelineIdentifier pipelineIdentifier, byte[] byArray) {
        return 0;
    }

    public static int getPipelineState(PipelineIdentifier pipelineIdentifier) {
        return 0;
    }

    public static List<PipelineIdentifier> pipelines(int n, int n2) {
        return null;
    }

    public static long addPipelinesConnectionObserver(PipelineConnectionObserver pipelineConnectionObserver) {
        return 0L;
    }

    public static void removePipelinesConnectionObserver(long l2) {
    }

    public static PointCloudDataDecodeResult cloudDataDecode(byte[] byArray) {
        return null;
    }

    private static native int native_ConnectPipeline(byte[] var0, int var1);

    private static native int native_DisconnectPipeline(byte[] var0);

    private static native int native_WriteData(byte[] var0, byte[] var1);

    private static native int native_ReadData(byte[] var0, byte[] var1);

    private static native int native_GetPipelineState(byte[] var0);

    private static native List<byte[]> native_Pipelines(int var0, int var1);

    private static native long native_AddPipelinesConnectionObserver(PipelineConnectionObserver var0);

    private static native void native_RemovePipelinesConnectionObserver(long var0);

    private static native byte[] native_CloudDataDecode(byte[] var0);
}

