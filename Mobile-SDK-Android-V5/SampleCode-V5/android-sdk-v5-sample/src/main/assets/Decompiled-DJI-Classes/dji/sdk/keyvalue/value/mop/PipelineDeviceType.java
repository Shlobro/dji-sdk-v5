/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mop;

import dji.jni.JNIProguardKeepTag;

public final class PipelineDeviceType
extends Enum<PipelineDeviceType>
implements JNIProguardKeepTag {
    public static final /* enum */ PipelineDeviceType ONBOARD = new PipelineDeviceType(0);
    public static final /* enum */ PipelineDeviceType PAYLOAD = new PipelineDeviceType(1);
    public static final /* enum */ PipelineDeviceType UNKNOWN = new PipelineDeviceType(65535);
    private int value;
    private static final PipelineDeviceType[] allValues;
    private static final /* synthetic */ PipelineDeviceType[] $VALUES;

    public static PipelineDeviceType[] values() {
        return null;
    }

    public static PipelineDeviceType valueOf(String string) {
        return null;
    }

    private PipelineDeviceType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PipelineDeviceType find(int n) {
        return null;
    }

    private static /* synthetic */ PipelineDeviceType[] $values() {
        return null;
    }

    static {
        $VALUES = PipelineDeviceType.$values();
        allValues = PipelineDeviceType.values();
    }
}

