/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcCalibrateState
extends Enum<RcCalibrateState>
implements JNIProguardKeepTag {
    public static final /* enum */ RcCalibrateState NORMAL = new RcCalibrateState(0);
    public static final /* enum */ RcCalibrateState RECORDCENTER = new RcCalibrateState(1);
    public static final /* enum */ RcCalibrateState LIMITVALUE = new RcCalibrateState(2);
    public static final /* enum */ RcCalibrateState EXIT = new RcCalibrateState(3);
    public static final /* enum */ RcCalibrateState TIMEOUT_EXIT = new RcCalibrateState(4);
    public static final /* enum */ RcCalibrateState OTHER = new RcCalibrateState(6);
    public static final /* enum */ RcCalibrateState UNKNOWN = new RcCalibrateState(65535);
    private int value;
    private static final RcCalibrateState[] allValues;
    private static final /* synthetic */ RcCalibrateState[] $VALUES;

    public static RcCalibrateState[] values() {
        return null;
    }

    public static RcCalibrateState valueOf(String string) {
        return null;
    }

    private RcCalibrateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcCalibrateState find(int n) {
        return null;
    }

    private static /* synthetic */ RcCalibrateState[] $values() {
        return null;
    }

    static {
        $VALUES = RcCalibrateState.$values();
        allValues = RcCalibrateState.values();
    }
}

