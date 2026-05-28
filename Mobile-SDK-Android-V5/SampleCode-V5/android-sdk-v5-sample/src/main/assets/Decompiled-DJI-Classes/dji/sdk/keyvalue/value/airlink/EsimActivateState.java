/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class EsimActivateState
extends Enum<EsimActivateState>
implements JNIProguardKeepTag {
    public static final /* enum */ EsimActivateState NONE = new EsimActivateState(0);
    public static final /* enum */ EsimActivateState NO_ACTIVATED = new EsimActivateState(1);
    public static final /* enum */ EsimActivateState ACTIVATED = new EsimActivateState(2);
    public static final /* enum */ EsimActivateState UNKNOWN = new EsimActivateState(65535);
    private int value;
    private static final EsimActivateState[] allValues;
    private static final /* synthetic */ EsimActivateState[] $VALUES;

    public static EsimActivateState[] values() {
        return null;
    }

    public static EsimActivateState valueOf(String string) {
        return null;
    }

    private EsimActivateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EsimActivateState find(int n) {
        return null;
    }

    private static /* synthetic */ EsimActivateState[] $values() {
        return null;
    }

    static {
        $VALUES = EsimActivateState.$values();
        allValues = EsimActivateState.values();
    }
}

