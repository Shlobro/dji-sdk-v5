/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class TrackingMode
extends Enum<TrackingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TrackingMode TRACE = new TrackingMode(0);
    public static final /* enum */ TrackingMode PROFILE = new TrackingMode(1);
    public static final /* enum */ TrackingMode SPOTLIGHT = new TrackingMode(2);
    public static final /* enum */ TrackingMode SPOTLIGHT_PRO = new TrackingMode(3);
    public static final /* enum */ TrackingMode UNKNOWN = new TrackingMode(65535);
    private int value;
    private static final TrackingMode[] allValues;
    private static final /* synthetic */ TrackingMode[] $VALUES;

    public static TrackingMode[] values() {
        return null;
    }

    public static TrackingMode valueOf(String string) {
        return null;
    }

    private TrackingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TrackingMode find(int n) {
        return null;
    }

    private static /* synthetic */ TrackingMode[] $values() {
        return null;
    }

    static {
        $VALUES = TrackingMode.$values();
        allValues = TrackingMode.values();
    }
}

