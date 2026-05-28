/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class HyperLapseState
extends Enum<HyperLapseState>
implements JNIProguardKeepTag {
    public static final /* enum */ HyperLapseState CAP_WAITTING = new HyperLapseState(0);
    public static final /* enum */ HyperLapseState CAP_IP = new HyperLapseState(1);
    public static final /* enum */ HyperLapseState CAP_DONE = new HyperLapseState(2);
    public static final /* enum */ HyperLapseState FUSION_IP = new HyperLapseState(3);
    public static final /* enum */ HyperLapseState DONE = new HyperLapseState(4);
    public static final /* enum */ HyperLapseState INIT = new HyperLapseState(5);
    public static final /* enum */ HyperLapseState IDLE = new HyperLapseState(6);
    public static final /* enum */ HyperLapseState UNKNOWN = new HyperLapseState(255);
    private int value;
    private static final HyperLapseState[] allValues;
    private static final /* synthetic */ HyperLapseState[] $VALUES;

    public static HyperLapseState[] values() {
        return null;
    }

    public static HyperLapseState valueOf(String string) {
        return null;
    }

    private HyperLapseState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HyperLapseState find(int n) {
        return null;
    }

    private static /* synthetic */ HyperLapseState[] $values() {
        return null;
    }

    static {
        $VALUES = HyperLapseState.$values();
        allValues = HyperLapseState.values();
    }
}

