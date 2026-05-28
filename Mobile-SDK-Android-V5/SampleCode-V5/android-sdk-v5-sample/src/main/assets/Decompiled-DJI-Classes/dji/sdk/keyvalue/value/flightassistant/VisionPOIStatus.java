/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionPOIStatus
extends Enum<VisionPOIStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionPOIStatus NONE = new VisionPOIStatus(0);
    public static final /* enum */ VisionPOIStatus IDLE = new VisionPOIStatus(1);
    public static final /* enum */ VisionPOIStatus WATCHING = new VisionPOIStatus(2);
    public static final /* enum */ VisionPOIStatus WAIT_TO_ESTIMATE = new VisionPOIStatus(3);
    public static final /* enum */ VisionPOIStatus ESTIMATING = new VisionPOIStatus(4);
    public static final /* enum */ VisionPOIStatus SURROUNDING = new VisionPOIStatus(5);
    public static final /* enum */ VisionPOIStatus PAUSE = new VisionPOIStatus(6);
    public static final /* enum */ VisionPOIStatus UNKNOWN = new VisionPOIStatus(255);
    private int value;
    private static final VisionPOIStatus[] allValues;
    private static final /* synthetic */ VisionPOIStatus[] $VALUES;

    public static VisionPOIStatus[] values() {
        return null;
    }

    public static VisionPOIStatus valueOf(String string) {
        return null;
    }

    private VisionPOIStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionPOIStatus find(int n) {
        return null;
    }

    private static /* synthetic */ VisionPOIStatus[] $values() {
        return null;
    }

    static {
        $VALUES = VisionPOIStatus.$values();
        allValues = VisionPOIStatus.values();
    }
}

