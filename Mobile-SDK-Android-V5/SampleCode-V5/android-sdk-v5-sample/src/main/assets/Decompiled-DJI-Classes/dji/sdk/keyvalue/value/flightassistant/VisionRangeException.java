/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionRangeException
extends Enum<VisionRangeException>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionRangeException STATUS_OK = new VisionRangeException(0);
    public static final /* enum */ VisionRangeException NO_DISTANCE_FOUND = new VisionRangeException(1);
    public static final /* enum */ VisionRangeException NOT_IN_AIR = new VisionRangeException(2);
    public static final /* enum */ VisionRangeException MODE_NOT_ALLOWED = new VisionRangeException(3);
    public static final /* enum */ VisionRangeException ABNORMAL_GLOBAL_MAP_STATUS = new VisionRangeException(4);
    public static final /* enum */ VisionRangeException UNKNOWN = new VisionRangeException(255);
    private int value;
    private static final VisionRangeException[] allValues;
    private static final /* synthetic */ VisionRangeException[] $VALUES;

    public static VisionRangeException[] values() {
        return null;
    }

    public static VisionRangeException valueOf(String string) {
        return null;
    }

    private VisionRangeException(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionRangeException find(int n) {
        return null;
    }

    private static /* synthetic */ VisionRangeException[] $values() {
        return null;
    }

    static {
        $VALUES = VisionRangeException.$values();
        allValues = VisionRangeException.values();
    }
}

