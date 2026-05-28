/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent.spotlight;

import androidx.annotation.Keep;

@Keep
public final class SportLightSubMode
extends Enum<SportLightSubMode> {
    public static final /* enum */ SportLightSubMode HEADLESS_FOLLOW = new SportLightSubMode(0);
    public static final /* enum */ SportLightSubMode PARALLEL_FOLLOW = new SportLightSubMode(1);
    public static final /* enum */ SportLightSubMode FIXED_ANGLE = new SportLightSubMode(2);
    public static final /* enum */ SportLightSubMode WATCH_TARGET = new SportLightSubMode(3);
    public static final /* enum */ SportLightSubMode HEAD_LOCK = new SportLightSubMode(4);
    public static final /* enum */ SportLightSubMode WAYPOINT = new SportLightSubMode(5);
    public static final /* enum */ SportLightSubMode QUICK_MOVIE = new SportLightSubMode(6);
    public static final /* enum */ SportLightSubMode SPOTLIGHT = new SportLightSubMode(10);
    public static final /* enum */ SportLightSubMode CIRCLE = new SportLightSubMode(11);
    public static final /* enum */ SportLightSubMode ZOOM_MODE_FREE = new SportLightSubMode(12);
    public static final /* enum */ SportLightSubMode ZOOM_MODE_CIRCLE = new SportLightSubMode(13);
    public static final /* enum */ SportLightSubMode ZOOM_MODE_FREE_LOCK_YAW = new SportLightSubMode(14);
    public static final /* enum */ SportLightSubMode ZOOM_MODE_LOOK_AT = new SportLightSubMode(15);
    public static final /* enum */ SportLightSubMode ZOOM_MODE_LOOK_AT_LOCK_YAW = new SportLightSubMode(16);
    public static final /* enum */ SportLightSubMode HYPERLAPSE = new SportLightSubMode(17);
    public static final /* enum */ SportLightSubMode TRACKING_MODE_MASTERSHOT = new SportLightSubMode(18);
    public static final /* enum */ SportLightSubMode TRACKING_MODE_TARGET_SELECTED = new SportLightSubMode(19);
    public static final /* enum */ SportLightSubMode TRACKING_MODE_SPOTLIGHT_FREE = new SportLightSubMode(20);
    public static final /* enum */ SportLightSubMode UNKNOWN = new SportLightSubMode(65535);
    private int value;
    private static final SportLightSubMode[] allValues;
    private static final /* synthetic */ SportLightSubMode[] $VALUES;

    public static SportLightSubMode[] values() {
        return null;
    }

    public static SportLightSubMode valueOf(String string2) {
        return null;
    }

    private SportLightSubMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SportLightSubMode find(int n) {
        return null;
    }

    private static /* synthetic */ SportLightSubMode[] $values() {
        return null;
    }

    static {
        $VALUES = SportLightSubMode.$values();
        allValues = SportLightSubMode.values();
    }
}

