/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class CodecFormat
extends Enum<CodecFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ CodecFormat DEFAULT = new CodecFormat(0);
    public static final /* enum */ CodecFormat H264 = new CodecFormat(1);
    public static final /* enum */ CodecFormat H265 = new CodecFormat(2);
    public static final /* enum */ CodecFormat RAW = new CodecFormat(3);
    public static final /* enum */ CodecFormat UNKNOWN = new CodecFormat(65535);
    private int value;
    private static final CodecFormat[] allValues;
    private static final /* synthetic */ CodecFormat[] $VALUES;

    public static CodecFormat[] values() {
        return null;
    }

    public static CodecFormat valueOf(String string) {
        return null;
    }

    private CodecFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CodecFormat find(int n) {
        return null;
    }

    private static /* synthetic */ CodecFormat[] $values() {
        return null;
    }

    static {
        $VALUES = CodecFormat.$values();
        allValues = CodecFormat.values();
    }
}

