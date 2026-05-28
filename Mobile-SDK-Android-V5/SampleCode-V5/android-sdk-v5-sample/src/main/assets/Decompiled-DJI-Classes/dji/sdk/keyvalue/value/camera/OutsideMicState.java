/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class OutsideMicState
extends Enum<OutsideMicState>
implements JNIProguardKeepTag {
    public static final /* enum */ OutsideMicState ADAPTER_AND_MIC_NOT_INSERTED = new OutsideMicState(0);
    public static final /* enum */ OutsideMicState ADAPTER_INSERTED_AND_MIC_DETECTING = new OutsideMicState(1);
    public static final /* enum */ OutsideMicState ADAPTER_AND_MIC_INSERTED = new OutsideMicState(2);
    public static final /* enum */ OutsideMicState ADAPTER_INSERTED_ONLY = new OutsideMicState(3);
    public static final /* enum */ OutsideMicState UNKNOWN = new OutsideMicState(65535);
    private int value;
    private static final OutsideMicState[] allValues;
    private static final /* synthetic */ OutsideMicState[] $VALUES;

    public static OutsideMicState[] values() {
        return null;
    }

    public static OutsideMicState valueOf(String string) {
        return null;
    }

    private OutsideMicState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static OutsideMicState find(int n) {
        return null;
    }

    private static /* synthetic */ OutsideMicState[] $values() {
        return null;
    }

    static {
        $VALUES = OutsideMicState.$values();
        allValues = OutsideMicState.values();
    }
}

