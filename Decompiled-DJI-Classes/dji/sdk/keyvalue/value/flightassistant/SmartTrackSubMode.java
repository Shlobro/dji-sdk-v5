/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartTrackSubMode
extends Enum<SmartTrackSubMode>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartTrackSubMode HEADLESS_FOLLOW = new SmartTrackSubMode(0);
    public static final /* enum */ SmartTrackSubMode PARALLEL_FOLLOW = new SmartTrackSubMode(1);
    public static final /* enum */ SmartTrackSubMode FIXED_ANGLE = new SmartTrackSubMode(2);
    public static final /* enum */ SmartTrackSubMode WATCH_TARGET = new SmartTrackSubMode(3);
    public static final /* enum */ SmartTrackSubMode HEAD_LOCK = new SmartTrackSubMode(4);
    public static final /* enum */ SmartTrackSubMode WAYPOINT = new SmartTrackSubMode(5);
    public static final /* enum */ SmartTrackSubMode QUICK_MOVIE = new SmartTrackSubMode(6);
    public static final /* enum */ SmartTrackSubMode SPOTLIGHT = new SmartTrackSubMode(10);
    public static final /* enum */ SmartTrackSubMode CIRCLE = new SmartTrackSubMode(11);
    public static final /* enum */ SmartTrackSubMode ZOOM_MODE_FREE = new SmartTrackSubMode(12);
    public static final /* enum */ SmartTrackSubMode ZOOM_MODE_CIRCLE = new SmartTrackSubMode(13);
    public static final /* enum */ SmartTrackSubMode ZOOM_MODE_FREE_LOCK_YAW = new SmartTrackSubMode(14);
    public static final /* enum */ SmartTrackSubMode ZOOM_MODE_LOOK_AT = new SmartTrackSubMode(15);
    public static final /* enum */ SmartTrackSubMode ZOOM_MODE_LOOK_AT_LOCK_YAW = new SmartTrackSubMode(16);
    public static final /* enum */ SmartTrackSubMode HYPERLAPSE = new SmartTrackSubMode(17);
    public static final /* enum */ SmartTrackSubMode TRACKING_MODE_MASTERSHOT = new SmartTrackSubMode(18);
    public static final /* enum */ SmartTrackSubMode TRACKING_MODE_TARGET_SELECTED = new SmartTrackSubMode(19);
    public static final /* enum */ SmartTrackSubMode TRACKING_MODE_SPOTLIGHT_FREE = new SmartTrackSubMode(20);
    public static final /* enum */ SmartTrackSubMode UNKNOWN = new SmartTrackSubMode(65535);
    private int value;
    private static final SmartTrackSubMode[] allValues;
    private static final /* synthetic */ SmartTrackSubMode[] $VALUES;

    public static SmartTrackSubMode[] values() {
        return null;
    }

    public static SmartTrackSubMode valueOf(String string) {
        return null;
    }

    private SmartTrackSubMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartTrackSubMode find(int n) {
        return null;
    }

    private static /* synthetic */ SmartTrackSubMode[] $values() {
        return null;
    }

    static {
        $VALUES = SmartTrackSubMode.$values();
        allValues = SmartTrackSubMode.values();
    }
}

