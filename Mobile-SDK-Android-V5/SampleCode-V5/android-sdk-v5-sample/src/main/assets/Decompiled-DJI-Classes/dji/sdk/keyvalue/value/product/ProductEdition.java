/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class ProductEdition
extends Enum<ProductEdition>
implements JNIProguardKeepTag {
    public static final /* enum */ ProductEdition NORMAL = new ProductEdition(0);
    public static final /* enum */ ProductEdition PROFESSIONAL = new ProductEdition(1);
    public static final /* enum */ ProductEdition UNKNOWN = new ProductEdition(65535);
    private int value;
    private static final ProductEdition[] allValues;
    private static final /* synthetic */ ProductEdition[] $VALUES;

    public static ProductEdition[] values() {
        return null;
    }

    public static ProductEdition valueOf(String string) {
        return null;
    }

    private ProductEdition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ProductEdition find(int n) {
        return null;
    }

    private static /* synthetic */ ProductEdition[] $values() {
        return null;
    }

    static {
        $VALUES = ProductEdition.$values();
        allValues = ProductEdition.values();
    }
}

