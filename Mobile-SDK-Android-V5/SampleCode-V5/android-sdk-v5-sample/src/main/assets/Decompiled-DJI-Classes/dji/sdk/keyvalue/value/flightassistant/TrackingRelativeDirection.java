/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TrackingRelativeDirection
extends Enum<TrackingRelativeDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ TrackingRelativeDirection BEHIND = new TrackingRelativeDirection(0);
    public static final /* enum */ TrackingRelativeDirection BEHIND_RIGHT = new TrackingRelativeDirection(1);
    public static final /* enum */ TrackingRelativeDirection RIGHT = new TrackingRelativeDirection(2);
    public static final /* enum */ TrackingRelativeDirection LEAD_RIGHT = new TrackingRelativeDirection(3);
    public static final /* enum */ TrackingRelativeDirection LEAD = new TrackingRelativeDirection(4);
    public static final /* enum */ TrackingRelativeDirection LEAD_LEFT = new TrackingRelativeDirection(5);
    public static final /* enum */ TrackingRelativeDirection LEFT = new TrackingRelativeDirection(6);
    public static final /* enum */ TrackingRelativeDirection BEHIND_LEFT = new TrackingRelativeDirection(7);
    public static final /* enum */ TrackingRelativeDirection UNKNOWN = new TrackingRelativeDirection(255);
    private int value;
    private static final TrackingRelativeDirection[] allValues;
    private static final /* synthetic */ TrackingRelativeDirection[] $VALUES;

    public static TrackingRelativeDirection[] values() {
        return null;
    }

    public static TrackingRelativeDirection valueOf(String string) {
        return null;
    }

    private TrackingRelativeDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TrackingRelativeDirection find(int n) {
        return null;
    }

    private static /* synthetic */ TrackingRelativeDirection[] $values() {
        return null;
    }

    static {
        $VALUES = TrackingRelativeDirection.$values();
        allValues = TrackingRelativeDirection.values();
    }
}

