/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MLTrackingMode
extends Enum<MLTrackingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ MLTrackingMode UNFUSED = new MLTrackingMode(-1);
    public static final /* enum */ MLTrackingMode LOST = new MLTrackingMode(0);
    public static final /* enum */ MLTrackingMode TRACKED = new MLTrackingMode(1);
    public static final /* enum */ MLTrackingMode NOT_CONFIDENT = new MLTrackingMode(2);
    public static final /* enum */ MLTrackingMode REDETECTED = new MLTrackingMode(3);
    public static final /* enum */ MLTrackingMode INVALID = new MLTrackingMode(255);
    public static final /* enum */ MLTrackingMode UNKNOWN = new MLTrackingMode(65535);
    private int value;
    private static final MLTrackingMode[] allValues;
    private static final /* synthetic */ MLTrackingMode[] $VALUES;

    public static MLTrackingMode[] values() {
        return null;
    }

    public static MLTrackingMode valueOf(String string) {
        return null;
    }

    private MLTrackingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MLTrackingMode find(int n) {
        return null;
    }

    private static /* synthetic */ MLTrackingMode[] $values() {
        return null;
    }

    static {
        $VALUES = MLTrackingMode.$values();
        allValues = MLTrackingMode.values();
    }
}

