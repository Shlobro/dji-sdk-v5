/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class H1FormatSSDType
extends Enum<H1FormatSSDType>
implements JNIProguardKeepTag {
    public static final /* enum */ H1FormatSSDType FAT32 = new H1FormatSSDType(0);
    public static final /* enum */ H1FormatSSDType EX_FAT = new H1FormatSSDType(1);
    public static final /* enum */ H1FormatSSDType UNKNOWN = new H1FormatSSDType(65535);
    private int value;
    private static final H1FormatSSDType[] allValues;
    private static final /* synthetic */ H1FormatSSDType[] $VALUES;

    public static H1FormatSSDType[] values() {
        return null;
    }

    public static H1FormatSSDType valueOf(String string) {
        return null;
    }

    private H1FormatSSDType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static H1FormatSSDType find(int n) {
        return null;
    }

    private static /* synthetic */ H1FormatSSDType[] $values() {
        return null;
    }

    static {
        $VALUES = H1FormatSSDType.$values();
        allValues = H1FormatSSDType.values();
    }
}

