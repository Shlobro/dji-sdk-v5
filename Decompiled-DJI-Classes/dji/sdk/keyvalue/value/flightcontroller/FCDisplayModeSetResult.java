/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCDisplayModeSetResult
extends Enum<FCDisplayModeSetResult>
implements JNIProguardKeepTag {
    public static final /* enum */ FCDisplayModeSetResult SUCCEED = new FCDisplayModeSetResult(0);
    public static final /* enum */ FCDisplayModeSetResult NOT_IN_DEISPLAY_MODE = new FCDisplayModeSetResult(1);
    public static final /* enum */ FCDisplayModeSetResult IN_DEISPLAY_MODE = new FCDisplayModeSetResult(2);
    public static final /* enum */ FCDisplayModeSetResult MOTOR_ON = new FCDisplayModeSetResult(3);
    public static final /* enum */ FCDisplayModeSetResult UNKNOWN = new FCDisplayModeSetResult(65535);
    private int value;
    private static final FCDisplayModeSetResult[] allValues;
    private static final /* synthetic */ FCDisplayModeSetResult[] $VALUES;

    public static FCDisplayModeSetResult[] values() {
        return null;
    }

    public static FCDisplayModeSetResult valueOf(String string) {
        return null;
    }

    private FCDisplayModeSetResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCDisplayModeSetResult find(int n) {
        return null;
    }

    private static /* synthetic */ FCDisplayModeSetResult[] $values() {
        return null;
    }

    static {
        $VALUES = FCDisplayModeSetResult.$values();
        allValues = FCDisplayModeSetResult.values();
    }
}

