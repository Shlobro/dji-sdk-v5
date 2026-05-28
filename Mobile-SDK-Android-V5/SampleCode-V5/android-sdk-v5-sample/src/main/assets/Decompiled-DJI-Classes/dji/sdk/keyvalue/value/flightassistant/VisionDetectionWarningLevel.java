/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionDetectionWarningLevel
extends Enum<VisionDetectionWarningLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionDetectionWarningLevel LEVEL_0 = new VisionDetectionWarningLevel(0);
    public static final /* enum */ VisionDetectionWarningLevel LEVEL_1 = new VisionDetectionWarningLevel(1);
    public static final /* enum */ VisionDetectionWarningLevel LEVEL_2 = new VisionDetectionWarningLevel(2);
    public static final /* enum */ VisionDetectionWarningLevel LEVEL_3 = new VisionDetectionWarningLevel(3);
    public static final /* enum */ VisionDetectionWarningLevel UNKNOWN = new VisionDetectionWarningLevel(65535);
    private int value;
    private static final VisionDetectionWarningLevel[] allValues;
    private static final /* synthetic */ VisionDetectionWarningLevel[] $VALUES;

    public static VisionDetectionWarningLevel[] values() {
        return null;
    }

    public static VisionDetectionWarningLevel valueOf(String string) {
        return null;
    }

    private VisionDetectionWarningLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionDetectionWarningLevel find(int n) {
        return null;
    }

    private static /* synthetic */ VisionDetectionWarningLevel[] $values() {
        return null;
    }

    static {
        $VALUES = VisionDetectionWarningLevel.$values();
        allValues = VisionDetectionWarningLevel.values();
    }
}

