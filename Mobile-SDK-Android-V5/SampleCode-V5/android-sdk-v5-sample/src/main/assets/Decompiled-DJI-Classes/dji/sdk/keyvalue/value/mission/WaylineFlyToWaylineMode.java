/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;

public final class WaylineFlyToWaylineMode
extends Enum<WaylineFlyToWaylineMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WaylineFlyToWaylineMode SAFELY = new WaylineFlyToWaylineMode(0);
    public static final /* enum */ WaylineFlyToWaylineMode POINT_TO_POINT = new WaylineFlyToWaylineMode(1);
    public static final /* enum */ WaylineFlyToWaylineMode UNKNOWN = new WaylineFlyToWaylineMode(65535);
    private int value;
    private static final WaylineFlyToWaylineMode[] allValues;
    private static final /* synthetic */ WaylineFlyToWaylineMode[] $VALUES;

    public static WaylineFlyToWaylineMode[] values() {
        return null;
    }

    public static WaylineFlyToWaylineMode valueOf(String string) {
        return null;
    }

    private WaylineFlyToWaylineMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WaylineFlyToWaylineMode find(int n) {
        return null;
    }

    private static /* synthetic */ WaylineFlyToWaylineMode[] $values() {
        return null;
    }

    static {
        $VALUES = WaylineFlyToWaylineMode.$values();
        allValues = WaylineFlyToWaylineMode.values();
    }
}

