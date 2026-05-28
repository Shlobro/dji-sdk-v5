/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SmartCaptureStatus
extends Enum<SmartCaptureStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartCaptureStatus IDLE = new SmartCaptureStatus(0);
    public static final /* enum */ SmartCaptureStatus IN_SHOOTING = new SmartCaptureStatus(1);
    public static final /* enum */ SmartCaptureStatus STOPPED_IN_STORING = new SmartCaptureStatus(2);
    public static final /* enum */ SmartCaptureStatus STOPPED_STORAGE_ERROR = new SmartCaptureStatus(3);
    public static final /* enum */ SmartCaptureStatus STOPPED_SHOOT_FAIL = new SmartCaptureStatus(4);
    public static final /* enum */ SmartCaptureStatus UNKNOWN = new SmartCaptureStatus(65535);
    private int value;
    private static final SmartCaptureStatus[] allValues;
    private static final /* synthetic */ SmartCaptureStatus[] $VALUES;

    public static SmartCaptureStatus[] values() {
        return null;
    }

    public static SmartCaptureStatus valueOf(String string) {
        return null;
    }

    private SmartCaptureStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartCaptureStatus find(int n) {
        return null;
    }

    private static /* synthetic */ SmartCaptureStatus[] $values() {
        return null;
    }

    static {
        $VALUES = SmartCaptureStatus.$values();
        allValues = SmartCaptureStatus.values();
    }
}

