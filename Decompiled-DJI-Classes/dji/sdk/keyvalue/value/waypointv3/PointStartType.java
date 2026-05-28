/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;

public final class PointStartType
extends Enum<PointStartType>
implements JNIProguardKeepTag {
    public static final /* enum */ PointStartType FROM_STRAT_POINT = new PointStartType(0);
    public static final /* enum */ PointStartType FROM_BREAK_POINT = new PointStartType(1);
    public static final /* enum */ PointStartType UNKNOWN = new PointStartType(256);
    private int value;
    private static final PointStartType[] allValues;
    private static final /* synthetic */ PointStartType[] $VALUES;

    public static PointStartType[] values() {
        return null;
    }

    public static PointStartType valueOf(String string) {
        return null;
    }

    private PointStartType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PointStartType find(int n) {
        return null;
    }

    private static /* synthetic */ PointStartType[] $values() {
        return null;
    }

    static {
        $VALUES = PointStartType.$values();
        allValues = PointStartType.values();
    }
}

