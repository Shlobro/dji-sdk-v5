/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class H1VideoFileCompressionStandard
extends Enum<H1VideoFileCompressionStandard>
implements JNIProguardKeepTag {
    public static final /* enum */ H1VideoFileCompressionStandard H264 = new H1VideoFileCompressionStandard(0);
    public static final /* enum */ H1VideoFileCompressionStandard H265 = new H1VideoFileCompressionStandard(1);
    public static final /* enum */ H1VideoFileCompressionStandard UNKNOWN = new H1VideoFileCompressionStandard(65535);
    private int value;
    private static final H1VideoFileCompressionStandard[] allValues;
    private static final /* synthetic */ H1VideoFileCompressionStandard[] $VALUES;

    public static H1VideoFileCompressionStandard[] values() {
        return null;
    }

    public static H1VideoFileCompressionStandard valueOf(String string) {
        return null;
    }

    private H1VideoFileCompressionStandard(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static H1VideoFileCompressionStandard find(int n) {
        return null;
    }

    private static /* synthetic */ H1VideoFileCompressionStandard[] $values() {
        return null;
    }

    static {
        $VALUES = H1VideoFileCompressionStandard.$values();
        allValues = H1VideoFileCompressionStandard.values();
    }
}

