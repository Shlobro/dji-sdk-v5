/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class NavigationMode
extends Enum<NavigationMode>
implements JNIProguardKeepTag {
    public static final /* enum */ NavigationMode NONE = new NavigationMode(0);
    public static final /* enum */ NavigationMode SMART_EYE = new NavigationMode(1);
    public static final /* enum */ NavigationMode TAP_FLY = new NavigationMode(2);
    public static final /* enum */ NavigationMode GO_HOME = new NavigationMode(3);
    public static final /* enum */ NavigationMode PRECISE_LANDING = new NavigationMode(4);
    public static final /* enum */ NavigationMode POI = new NavigationMode(5);
    public static final /* enum */ NavigationMode HYPER_LAPSE = new NavigationMode(6);
    public static final /* enum */ NavigationMode PANORAMA = new NavigationMode(7);
    public static final /* enum */ NavigationMode QUICK_SHOT = new NavigationMode(8);
    public static final /* enum */ NavigationMode APAS = new NavigationMode(9);
    public static final /* enum */ NavigationMode SMART_TRACK = new NavigationMode(10);
    public static final /* enum */ NavigationMode MASTER_SHOT = new NavigationMode(14);
    public static final /* enum */ NavigationMode UNKNOWN = new NavigationMode(255);
    private int value;
    private static final NavigationMode[] allValues;
    private static final /* synthetic */ NavigationMode[] $VALUES;

    public static NavigationMode[] values() {
        return null;
    }

    public static NavigationMode valueOf(String string) {
        return null;
    }

    private NavigationMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static NavigationMode find(int n) {
        return null;
    }

    private static /* synthetic */ NavigationMode[] $values() {
        return null;
    }

    static {
        $VALUES = NavigationMode.$values();
        allValues = NavigationMode.values();
    }
}

