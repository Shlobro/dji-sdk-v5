/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class SmartTrackingSpeed
extends Enum<SmartTrackingSpeed>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartTrackingSpeed DEFAULT = new SmartTrackingSpeed(0);
    public static final /* enum */ SmartTrackingSpeed LOW = new SmartTrackingSpeed(1);
    public static final /* enum */ SmartTrackingSpeed MEDIUM = new SmartTrackingSpeed(2);
    public static final /* enum */ SmartTrackingSpeed HIGH = new SmartTrackingSpeed(3);
    public static final /* enum */ SmartTrackingSpeed UNKNOWN = new SmartTrackingSpeed(65535);
    private int value;
    private static final SmartTrackingSpeed[] allValues;
    private static final /* synthetic */ SmartTrackingSpeed[] $VALUES;

    public static SmartTrackingSpeed[] values() {
        return null;
    }

    public static SmartTrackingSpeed valueOf(String string) {
        return null;
    }

    private SmartTrackingSpeed(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartTrackingSpeed find(int n) {
        return null;
    }

    private static /* synthetic */ SmartTrackingSpeed[] $values() {
        return null;
    }

    static {
        $VALUES = SmartTrackingSpeed.$values();
        allValues = SmartTrackingSpeed.values();
    }
}

