/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;

public final class ProductLineType
extends Enum<ProductLineType>
implements JNIProguardKeepTag {
    public static final /* enum */ ProductLineType HANDHELD_PRODUCT = new ProductLineType(1);
    public static final /* enum */ ProductLineType CONSUMER_DRONE_PRODUCT = new ProductLineType(2);
    public static final /* enum */ ProductLineType UNKNOWN = new ProductLineType(65535);
    private int value;
    private static final ProductLineType[] allValues;
    private static final /* synthetic */ ProductLineType[] $VALUES;

    public static ProductLineType[] values() {
        return null;
    }

    public static ProductLineType valueOf(String string) {
        return null;
    }

    private ProductLineType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ProductLineType find(int n) {
        return null;
    }

    private static /* synthetic */ ProductLineType[] $values() {
        return null;
    }

    static {
        $VALUES = ProductLineType.$values();
        allValues = ProductLineType.values();
    }
}

