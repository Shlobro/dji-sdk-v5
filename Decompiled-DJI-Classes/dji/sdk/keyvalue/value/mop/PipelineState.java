/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mop;

import dji.jni.JNIProguardKeepTag;

public final class PipelineState
extends Enum<PipelineState>
implements JNIProguardKeepTag {
    public static final /* enum */ PipelineState CONNECTED = new PipelineState(0);
    public static final /* enum */ PipelineState DISCONNECTED = new PipelineState(1);
    public static final /* enum */ PipelineState UNKNOWN = new PipelineState(65535);
    private int value;
    private static final PipelineState[] allValues;
    private static final /* synthetic */ PipelineState[] $VALUES;

    public static PipelineState[] values() {
        return null;
    }

    public static PipelineState valueOf(String string) {
        return null;
    }

    private PipelineState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PipelineState find(int n) {
        return null;
    }

    private static /* synthetic */ PipelineState[] $values() {
        return null;
    }

    static {
        $VALUES = PipelineState.$values();
        allValues = PipelineState.values();
    }
}

