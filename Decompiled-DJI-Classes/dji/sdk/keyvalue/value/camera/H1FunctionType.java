/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class H1FunctionType
extends Enum<H1FunctionType>
implements JNIProguardKeepTag {
    public static final /* enum */ H1FunctionType JPEG_LOSS_LESS_3840X2160 = new H1FunctionType(1);
    public static final /* enum */ H1FunctionType JPEG_LOSS_LESS_4096X2160 = new H1FunctionType(2);
    public static final /* enum */ H1FunctionType JPEG_LOSS_LESS_5280X2160 = new H1FunctionType(3);
    public static final /* enum */ H1FunctionType FULL_SIZE_RECORD = new H1FunctionType(8);
    public static final /* enum */ H1FunctionType PRORES_422HQ_3840X2160 = new H1FunctionType(16);
    public static final /* enum */ H1FunctionType PRORES_422HQ_5280X2160 = new H1FunctionType(32);
    public static final /* enum */ H1FunctionType PRORES_444XQ_3840X2160 = new H1FunctionType(64);
    public static final /* enum */ H1FunctionType FULL_SIZE_CAPTURE = new H1FunctionType(128);
    public static final /* enum */ H1FunctionType UNKNOWN = new H1FunctionType(65535);
    private int value;
    private static final H1FunctionType[] allValues;
    private static final /* synthetic */ H1FunctionType[] $VALUES;

    public static H1FunctionType[] values() {
        return null;
    }

    public static H1FunctionType valueOf(String string) {
        return null;
    }

    private H1FunctionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static H1FunctionType find(int n) {
        return null;
    }

    private static /* synthetic */ H1FunctionType[] $values() {
        return null;
    }

    static {
        $VALUES = H1FunctionType.$values();
        allValues = H1FunctionType.values();
    }
}

