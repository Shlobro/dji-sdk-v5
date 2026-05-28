/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PrecisionFileType
extends Enum<PrecisionFileType>
implements JNIProguardKeepTag {
    public static final /* enum */ PrecisionFileType TIFF = new PrecisionFileType(0);
    public static final /* enum */ PrecisionFileType SHAPE_FILE = new PrecisionFileType(1);
    public static final /* enum */ PrecisionFileType FENCE_EDGE_FILE = new PrecisionFileType(2);
    public static final /* enum */ PrecisionFileType UNKNOWN = new PrecisionFileType(65535);
    private int value;
    private static final PrecisionFileType[] allValues;
    private static final /* synthetic */ PrecisionFileType[] $VALUES;

    public static PrecisionFileType[] values() {
        return null;
    }

    public static PrecisionFileType valueOf(String string) {
        return null;
    }

    private PrecisionFileType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PrecisionFileType find(int n) {
        return null;
    }

    private static /* synthetic */ PrecisionFileType[] $values() {
        return null;
    }

    static {
        $VALUES = PrecisionFileType.$values();
        allValues = PrecisionFileType.values();
    }
}

