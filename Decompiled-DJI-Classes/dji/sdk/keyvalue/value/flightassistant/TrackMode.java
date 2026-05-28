/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class TrackMode
extends Enum<TrackMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TrackMode LOST = new TrackMode(0);
    public static final /* enum */ TrackMode NORMAL = new TrackMode(1);
    public static final /* enum */ TrackMode WEAK = new TrackMode(2);
    public static final /* enum */ TrackMode DETECT_AFTER_LOST = new TrackMode(3);
    public static final /* enum */ TrackMode TRACKING = new TrackMode(4);
    public static final /* enum */ TrackMode CONFIRM = new TrackMode(5);
    public static final /* enum */ TrackMode PERSON = new TrackMode(6);
    public static final /* enum */ TrackMode UNKNOWN = new TrackMode(65535);
    private int value;
    private static final TrackMode[] allValues;
    private static final /* synthetic */ TrackMode[] $VALUES;

    public static TrackMode[] values() {
        return null;
    }

    public static TrackMode valueOf(String string) {
        return null;
    }

    private TrackMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TrackMode find(int n) {
        return null;
    }

    private static /* synthetic */ TrackMode[] $values() {
        return null;
    }

    static {
        $VALUES = TrackMode.$values();
        allValues = TrackMode.values();
    }
}

