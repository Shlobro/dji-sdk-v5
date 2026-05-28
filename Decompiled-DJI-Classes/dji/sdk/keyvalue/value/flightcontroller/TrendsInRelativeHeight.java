/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class TrendsInRelativeHeight
extends Enum<TrendsInRelativeHeight>
implements JNIProguardKeepTag {
    public static final /* enum */ TrendsInRelativeHeight NO_CHANGE = new TrendsInRelativeHeight(0);
    public static final /* enum */ TrendsInRelativeHeight MOVE_UPWARD = new TrendsInRelativeHeight(1);
    public static final /* enum */ TrendsInRelativeHeight MOVE_DOWNWARD = new TrendsInRelativeHeight(2);
    public static final /* enum */ TrendsInRelativeHeight UNKNOWN = new TrendsInRelativeHeight(65535);
    private int value;
    private static final TrendsInRelativeHeight[] allValues;
    private static final /* synthetic */ TrendsInRelativeHeight[] $VALUES;

    public static TrendsInRelativeHeight[] values() {
        return null;
    }

    public static TrendsInRelativeHeight valueOf(String string) {
        return null;
    }

    private TrendsInRelativeHeight(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TrendsInRelativeHeight find(int n) {
        return null;
    }

    private static /* synthetic */ TrendsInRelativeHeight[] $values() {
        return null;
    }

    static {
        $VALUES = TrendsInRelativeHeight.$values();
        allValues = TrendsInRelativeHeight.values();
    }
}

