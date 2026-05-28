/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;

public final class ActivateState
extends Enum<ActivateState>
implements JNIProguardKeepTag {
    public static final /* enum */ ActivateState NOT_ACTIVATED = new ActivateState(0);
    public static final /* enum */ ActivateState ACTIVATED = new ActivateState(1);
    public static final /* enum */ ActivateState UNINITIALIZED = new ActivateState(2);
    public static final /* enum */ ActivateState FACTORY_ACTIVATED = new ActivateState(3);
    public static final /* enum */ ActivateState NOT_SUPPORT = new ActivateState(65534);
    public static final /* enum */ ActivateState UNKNOWN = new ActivateState(65535);
    private int value;
    private static final ActivateState[] allValues;
    private static final /* synthetic */ ActivateState[] $VALUES;

    public static ActivateState[] values() {
        return null;
    }

    public static ActivateState valueOf(String string) {
        return null;
    }

    private ActivateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ActivateState find(int n) {
        return null;
    }

    private static /* synthetic */ ActivateState[] $values() {
        return null;
    }

    static {
        $VALUES = ActivateState.$values();
        allValues = ActivateState.values();
    }
}

