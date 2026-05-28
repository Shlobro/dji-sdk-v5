/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class TakeoffDelayActionType
extends Enum<TakeoffDelayActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ TakeoffDelayActionType NONE = new TakeoffDelayActionType(0);
    public static final /* enum */ TakeoffDelayActionType ACTIVATE = new TakeoffDelayActionType(1);
    public static final /* enum */ TakeoffDelayActionType CANCEL = new TakeoffDelayActionType(2);
    public static final /* enum */ TakeoffDelayActionType START = new TakeoffDelayActionType(3);
    public static final /* enum */ TakeoffDelayActionType UNKNOWN = new TakeoffDelayActionType(65535);
    private int value;
    private static final TakeoffDelayActionType[] allValues;
    private static final /* synthetic */ TakeoffDelayActionType[] $VALUES;

    public static TakeoffDelayActionType[] values() {
        return null;
    }

    public static TakeoffDelayActionType valueOf(String string) {
        return null;
    }

    private TakeoffDelayActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TakeoffDelayActionType find(int n) {
        return null;
    }

    private static /* synthetic */ TakeoffDelayActionType[] $values() {
        return null;
    }

    static {
        $VALUES = TakeoffDelayActionType.$values();
        allValues = TakeoffDelayActionType.values();
    }
}

