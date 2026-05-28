/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.ble;

import dji.jni.JNIProguardKeepTag;

public final class FilterResult
extends Enum<FilterResult>
implements JNIProguardKeepTag {
    public static final /* enum */ FilterResult SUPPORT = new FilterResult(0);
    public static final /* enum */ FilterResult UN_SUPPORT = new FilterResult(1);
    public static final /* enum */ FilterResult UNKNOWN = new FilterResult(65535);
    private int value;
    private static final FilterResult[] allValues;
    private static final /* synthetic */ FilterResult[] $VALUES;

    public static FilterResult[] values() {
        return null;
    }

    public static FilterResult valueOf(String string) {
        return null;
    }

    private FilterResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FilterResult find(int n) {
        return null;
    }

    private static /* synthetic */ FilterResult[] $values() {
        return null;
    }

    static {
        $VALUES = FilterResult.$values();
        allValues = FilterResult.values();
    }
}

