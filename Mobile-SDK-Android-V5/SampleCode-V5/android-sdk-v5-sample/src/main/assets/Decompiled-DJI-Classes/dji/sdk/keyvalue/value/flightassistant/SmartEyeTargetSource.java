/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartEyeTargetSource
extends Enum<SmartEyeTargetSource>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartEyeTargetSource VISION_BASED = new SmartEyeTargetSource(0);
    public static final /* enum */ SmartEyeTargetSource GPS_BASED = new SmartEyeTargetSource(1);
    public static final /* enum */ SmartEyeTargetSource UNKNOWN = new SmartEyeTargetSource(255);
    private int value;
    private static final SmartEyeTargetSource[] allValues;
    private static final /* synthetic */ SmartEyeTargetSource[] $VALUES;

    public static SmartEyeTargetSource[] values() {
        return null;
    }

    public static SmartEyeTargetSource valueOf(String string) {
        return null;
    }

    private SmartEyeTargetSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartEyeTargetSource find(int n) {
        return null;
    }

    private static /* synthetic */ SmartEyeTargetSource[] $values() {
        return null;
    }

    static {
        $VALUES = SmartEyeTargetSource.$values();
        allValues = SmartEyeTargetSource.values();
    }
}

