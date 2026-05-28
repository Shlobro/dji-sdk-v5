/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineCoordinateMode
extends Enum<WaylineCoordinateMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineCoordinateMode WGS84 = new WaylineCoordinateMode(0);
    public static final /* enum */ WaylineCoordinateMode NAVI = new WaylineCoordinateMode(1);
    public static final /* enum */ WaylineCoordinateMode THIRD_PARTY = new WaylineCoordinateMode(2);
    public static final /* enum */ WaylineCoordinateMode CGCS2000 = new WaylineCoordinateMode(3);
    public static final /* enum */ WaylineCoordinateMode UNKNOWN = new WaylineCoordinateMode(65535);
    private int value;
    private static final WaylineCoordinateMode[] allValues;
    private static final /* synthetic */ WaylineCoordinateMode[] $VALUES;

    public static WaylineCoordinateMode[] values() {
        return null;
    }

    public static WaylineCoordinateMode valueOf(String string) {
        return null;
    }

    private WaylineCoordinateMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineCoordinateMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineCoordinateMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineCoordinateMode.$values();
        allValues = WaylineCoordinateMode.values();
    }
}

