/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class HyperlapseRatio
extends Enum<HyperlapseRatio>
implements JNIProguardKeepTag {
    public static final /* enum */ HyperlapseRatio RATIO_AUTO = new HyperlapseRatio(0);
    public static final /* enum */ HyperlapseRatio RATIO_1X = new HyperlapseRatio(1);
    public static final /* enum */ HyperlapseRatio RATIO_2X = new HyperlapseRatio(2);
    public static final /* enum */ HyperlapseRatio RATIO_5X = new HyperlapseRatio(5);
    public static final /* enum */ HyperlapseRatio RATIO_10X = new HyperlapseRatio(10);
    public static final /* enum */ HyperlapseRatio RATIO_15X = new HyperlapseRatio(15);
    public static final /* enum */ HyperlapseRatio RATIO_30X = new HyperlapseRatio(30);
    public static final /* enum */ HyperlapseRatio UNKNOWN = new HyperlapseRatio(65535);
    private int value;
    private static final HyperlapseRatio[] allValues;
    private static final /* synthetic */ HyperlapseRatio[] $VALUES;

    public static HyperlapseRatio[] values() {
        return null;
    }

    public static HyperlapseRatio valueOf(String string) {
        return null;
    }

    private HyperlapseRatio(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HyperlapseRatio find(int n) {
        return null;
    }

    private static /* synthetic */ HyperlapseRatio[] $values() {
        return null;
    }

    static {
        $VALUES = HyperlapseRatio.$values();
        allValues = HyperlapseRatio.values();
    }
}

