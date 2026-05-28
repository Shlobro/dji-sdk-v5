/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class FcFlag
extends Enum<FcFlag>
implements JNIProguardKeepTag {
    public static final /* enum */ FcFlag NONE = new FcFlag(0);
    public static final /* enum */ FcFlag SINGLE = new FcFlag(1);
    public static final /* enum */ FcFlag PSR_POS = new FcFlag(2);
    public static final /* enum */ FcFlag FIX_POS = new FcFlag(4);
    public static final /* enum */ FcFlag FLOAT_POS = new FcFlag(5);
    public static final /* enum */ FcFlag INS_POS = new FcFlag(6);
    public static final /* enum */ FcFlag UNKNOWN = new FcFlag(65535);
    private int value;
    private static final FcFlag[] allValues;
    private static final /* synthetic */ FcFlag[] $VALUES;

    public static FcFlag[] values() {
        return null;
    }

    public static FcFlag valueOf(String string) {
        return null;
    }

    private FcFlag(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FcFlag find(int n) {
        return null;
    }

    private static /* synthetic */ FcFlag[] $values() {
        return null;
    }

    static {
        $VALUES = FcFlag.$values();
        allValues = FcFlag.values();
    }
}

