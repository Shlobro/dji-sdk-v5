/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class NavigationTrackingMode
extends Enum<NavigationTrackingMode>
implements JNIProguardKeepTag {
    public static final /* enum */ NavigationTrackingMode HEADLESS_FOLLOW = new NavigationTrackingMode(0);
    public static final /* enum */ NavigationTrackingMode PARALLEL_FOLLOW = new NavigationTrackingMode(1);
    public static final /* enum */ NavigationTrackingMode FIXED_ANGLE = new NavigationTrackingMode(2);
    public static final /* enum */ NavigationTrackingMode WATCH_TARGET = new NavigationTrackingMode(3);
    public static final /* enum */ NavigationTrackingMode HEAD_LOCK = new NavigationTrackingMode(4);
    public static final /* enum */ NavigationTrackingMode WAYPOINT = new NavigationTrackingMode(5);
    public static final /* enum */ NavigationTrackingMode QUICK_MOVIE = new NavigationTrackingMode(6);
    public static final /* enum */ NavigationTrackingMode SPOTLIGHT = new NavigationTrackingMode(10);
    public static final /* enum */ NavigationTrackingMode SMART_EYE_CIRCLE = new NavigationTrackingMode(11);
    public static final /* enum */ NavigationTrackingMode SPOTLIGHT_ZOOM_MODE_FREE = new NavigationTrackingMode(12);
    public static final /* enum */ NavigationTrackingMode SPOTLIGHT_ZOOM_MODE_CIRCLE = new NavigationTrackingMode(13);
    public static final /* enum */ NavigationTrackingMode SPOTLIGHT_ZOOM_MODE_FREE_LOCK_YAW = new NavigationTrackingMode(14);
    public static final /* enum */ NavigationTrackingMode UNKNOWN = new NavigationTrackingMode(255);
    private int value;
    private static final NavigationTrackingMode[] allValues;
    private static final /* synthetic */ NavigationTrackingMode[] $VALUES;

    public static NavigationTrackingMode[] values() {
        return null;
    }

    public static NavigationTrackingMode valueOf(String string) {
        return null;
    }

    private NavigationTrackingMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NavigationTrackingMode find(int n) {
        return null;
    }

    private static /* synthetic */ NavigationTrackingMode[] $values() {
        return null;
    }

    static {
        $VALUES = NavigationTrackingMode.$values();
        allValues = NavigationTrackingMode.values();
    }
}

