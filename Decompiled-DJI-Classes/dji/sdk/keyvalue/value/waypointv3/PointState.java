/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;

public final class PointState
extends Enum<PointState>
implements JNIProguardKeepTag {
    public static final /* enum */ PointState ON_SEGMENT = new PointState(0);
    public static final /* enum */ PointState ON_WAYPOINT = new PointState(1);
    public static final /* enum */ PointState UNKNOWN = new PointState(256);
    private int value;
    private static final PointState[] allValues;
    private static final /* synthetic */ PointState[] $VALUES;

    public static PointState[] values() {
        return null;
    }

    public static PointState valueOf(String string) {
        return null;
    }

    private PointState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PointState find(int n) {
        return null;
    }

    private static /* synthetic */ PointState[] $values() {
        return null;
    }

    static {
        $VALUES = PointState.$values();
        allValues = PointState.values();
    }
}

