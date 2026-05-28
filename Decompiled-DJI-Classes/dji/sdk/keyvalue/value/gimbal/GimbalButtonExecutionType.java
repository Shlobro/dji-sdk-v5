/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalButtonExecutionType
extends Enum<GimbalButtonExecutionType>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalButtonExecutionType NONE = new GimbalButtonExecutionType(0);
    public static final /* enum */ GimbalButtonExecutionType CLICK_SINGLE = new GimbalButtonExecutionType(1);
    public static final /* enum */ GimbalButtonExecutionType CLICK_DOUBLE = new GimbalButtonExecutionType(2);
    public static final /* enum */ GimbalButtonExecutionType CLICK_TRIPLE = new GimbalButtonExecutionType(3);
    public static final /* enum */ GimbalButtonExecutionType LONG_PRESS_START = new GimbalButtonExecutionType(6);
    public static final /* enum */ GimbalButtonExecutionType LONG_PRERSS_FINISH = new GimbalButtonExecutionType(7);
    public static final /* enum */ GimbalButtonExecutionType UNKNOWN = new GimbalButtonExecutionType(65535);
    private int value;
    private static final GimbalButtonExecutionType[] allValues;
    private static final /* synthetic */ GimbalButtonExecutionType[] $VALUES;

    public static GimbalButtonExecutionType[] values() {
        return null;
    }

    public static GimbalButtonExecutionType valueOf(String string) {
        return null;
    }

    private GimbalButtonExecutionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalButtonExecutionType find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalButtonExecutionType[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalButtonExecutionType.$values();
        allValues = GimbalButtonExecutionType.values();
    }
}

