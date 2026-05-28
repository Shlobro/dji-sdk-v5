/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CodecProfileParam
extends Enum<CodecProfileParam>
implements JNIProguardKeepTag {
    public static final /* enum */ CodecProfileParam H264 = new CodecProfileParam(0);
    public static final /* enum */ CodecProfileParam PRORES_422 = new CodecProfileParam(1);
    public static final /* enum */ CodecProfileParam PRORES_422HQ = new CodecProfileParam(2);
    public static final /* enum */ CodecProfileParam PRORES_422LT = new CodecProfileParam(3);
    public static final /* enum */ CodecProfileParam PRORES_RAW_HQ = new CodecProfileParam(4);
    public static final /* enum */ CodecProfileParam PRORES_RAW_LT = new CodecProfileParam(5);
    public static final /* enum */ CodecProfileParam JPEG_LOSSLESS = new CodecProfileParam(6);
    public static final /* enum */ CodecProfileParam UNKNOWN = new CodecProfileParam(65535);
    private int value;
    private static final CodecProfileParam[] allValues;
    private static final /* synthetic */ CodecProfileParam[] $VALUES;

    public static CodecProfileParam[] values() {
        return null;
    }

    public static CodecProfileParam valueOf(String string) {
        return null;
    }

    private CodecProfileParam(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CodecProfileParam find(int n) {
        return null;
    }

    private static /* synthetic */ CodecProfileParam[] $values() {
        return null;
    }

    static {
        $VALUES = CodecProfileParam.$values();
        allValues = CodecProfileParam.values();
    }
}

