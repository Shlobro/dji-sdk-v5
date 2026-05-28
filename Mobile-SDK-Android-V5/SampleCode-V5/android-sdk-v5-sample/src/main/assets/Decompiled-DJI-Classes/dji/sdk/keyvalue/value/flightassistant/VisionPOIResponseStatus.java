/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionPOIResponseStatus
extends Enum<VisionPOIResponseStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionPOIResponseStatus NONE = new VisionPOIResponseStatus(0);
    public static final /* enum */ VisionPOIResponseStatus CAN_NOT_EXECUTE = new VisionPOIResponseStatus(1);
    public static final /* enum */ VisionPOIResponseStatus IDLE = new VisionPOIResponseStatus(2);
    public static final /* enum */ VisionPOIResponseStatus WATCHING = new VisionPOIResponseStatus(3);
    public static final /* enum */ VisionPOIResponseStatus CAN_ESTIMATE = new VisionPOIResponseStatus(4);
    public static final /* enum */ VisionPOIResponseStatus ESTIMATING = new VisionPOIResponseStatus(5);
    public static final /* enum */ VisionPOIResponseStatus SURROUNDING = new VisionPOIResponseStatus(6);
    public static final /* enum */ VisionPOIResponseStatus PAUSED = new VisionPOIResponseStatus(7);
    public static final /* enum */ VisionPOIResponseStatus UNKNOWN = new VisionPOIResponseStatus(255);
    private int value;
    private static final VisionPOIResponseStatus[] allValues;
    private static final /* synthetic */ VisionPOIResponseStatus[] $VALUES;

    public static VisionPOIResponseStatus[] values() {
        return null;
    }

    public static VisionPOIResponseStatus valueOf(String string) {
        return null;
    }

    private VisionPOIResponseStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionPOIResponseStatus find(int n) {
        return null;
    }

    private static /* synthetic */ VisionPOIResponseStatus[] $values() {
        return null;
    }

    static {
        $VALUES = VisionPOIResponseStatus.$values();
        allValues = VisionPOIResponseStatus.values();
    }
}

