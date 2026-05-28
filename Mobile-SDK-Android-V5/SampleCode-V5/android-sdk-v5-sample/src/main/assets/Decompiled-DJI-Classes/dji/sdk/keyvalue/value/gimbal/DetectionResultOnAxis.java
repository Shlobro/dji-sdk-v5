/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class DetectionResultOnAxis
extends Enum<DetectionResultOnAxis>
implements JNIProguardKeepTag {
    public static final /* enum */ DetectionResultOnAxis DEFAULT = new DetectionResultOnAxis(0);
    public static final /* enum */ DetectionResultOnAxis GREAT = new DetectionResultOnAxis(1);
    public static final /* enum */ DetectionResultOnAxis GOOD = new DetectionResultOnAxis(2);
    public static final /* enum */ DetectionResultOnAxis BAD = new DetectionResultOnAxis(3);
    public static final /* enum */ DetectionResultOnAxis UNKNOWN = new DetectionResultOnAxis(100);
    private int value;
    private static final DetectionResultOnAxis[] allValues;
    private static final /* synthetic */ DetectionResultOnAxis[] $VALUES;

    public static DetectionResultOnAxis[] values() {
        return null;
    }

    public static DetectionResultOnAxis valueOf(String string) {
        return null;
    }

    private DetectionResultOnAxis(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DetectionResultOnAxis find(int n) {
        return null;
    }

    private static /* synthetic */ DetectionResultOnAxis[] $values() {
        return null;
    }

    static {
        $VALUES = DetectionResultOnAxis.$values();
        allValues = DetectionResultOnAxis.values();
    }
}

