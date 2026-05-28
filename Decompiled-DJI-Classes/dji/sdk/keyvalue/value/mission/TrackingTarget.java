/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class TrackingTarget
extends Enum<TrackingTarget>
implements JNIProguardKeepTag {
    public static final /* enum */ TrackingTarget DEFAULT = new TrackingTarget(0);
    public static final /* enum */ TrackingTarget FACE = new TrackingTarget(1);
    public static final /* enum */ TrackingTarget UNKNOWN = new TrackingTarget(65535);
    private int value;
    private static final TrackingTarget[] allValues;
    private static final /* synthetic */ TrackingTarget[] $VALUES;

    public static TrackingTarget[] values() {
        return null;
    }

    public static TrackingTarget valueOf(String string) {
        return null;
    }

    private TrackingTarget(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TrackingTarget find(int n) {
        return null;
    }

    private static /* synthetic */ TrackingTarget[] $values() {
        return null;
    }

    static {
        $VALUES = TrackingTarget.$values();
        allValues = TrackingTarget.values();
    }
}

