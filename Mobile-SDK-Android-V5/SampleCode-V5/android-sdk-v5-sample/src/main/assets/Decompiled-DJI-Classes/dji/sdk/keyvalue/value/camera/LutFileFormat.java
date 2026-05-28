/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LutFileFormat
extends Enum<LutFileFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ LutFileFormat NATIVE = new LutFileFormat(0);
    public static final /* enum */ LutFileFormat PRIVATE = new LutFileFormat(1);
    public static final /* enum */ LutFileFormat PUBLIC = new LutFileFormat(2);
    public static final /* enum */ LutFileFormat UNKNOWN = new LutFileFormat(65535);
    private int value;
    private static final LutFileFormat[] allValues;
    private static final /* synthetic */ LutFileFormat[] $VALUES;

    public static LutFileFormat[] values() {
        return null;
    }

    public static LutFileFormat valueOf(String string) {
        return null;
    }

    private LutFileFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LutFileFormat find(int n) {
        return null;
    }

    private static /* synthetic */ LutFileFormat[] $values() {
        return null;
    }

    static {
        $VALUES = LutFileFormat.$values();
        allValues = LutFileFormat.values();
    }
}

