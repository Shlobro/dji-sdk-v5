/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalActionButtonExecutionType
extends Enum<GimbalActionButtonExecutionType>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalActionButtonExecutionType CLICK_SINGLE = new GimbalActionButtonExecutionType(0);
    public static final /* enum */ GimbalActionButtonExecutionType HOLD_DOWN = new GimbalActionButtonExecutionType(1);
    public static final /* enum */ GimbalActionButtonExecutionType RELEASE = new GimbalActionButtonExecutionType(2);
    public static final /* enum */ GimbalActionButtonExecutionType UNKNOWN = new GimbalActionButtonExecutionType(65535);
    private int value;
    private static final GimbalActionButtonExecutionType[] allValues;
    private static final /* synthetic */ GimbalActionButtonExecutionType[] $VALUES;

    public static GimbalActionButtonExecutionType[] values() {
        return null;
    }

    public static GimbalActionButtonExecutionType valueOf(String string) {
        return null;
    }

    private GimbalActionButtonExecutionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalActionButtonExecutionType find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalActionButtonExecutionType[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalActionButtonExecutionType.$values();
        allValues = GimbalActionButtonExecutionType.values();
    }
}

