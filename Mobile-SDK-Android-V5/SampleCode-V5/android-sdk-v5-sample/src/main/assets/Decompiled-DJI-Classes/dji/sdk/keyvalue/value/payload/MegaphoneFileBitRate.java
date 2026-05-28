/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphoneFileBitRate
extends Enum<MegaphoneFileBitRate>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphoneFileBitRate BITRATE_8000 = new MegaphoneFileBitRate(1);
    public static final /* enum */ MegaphoneFileBitRate BITRATE_16000 = new MegaphoneFileBitRate(2);
    public static final /* enum */ MegaphoneFileBitRate BITRATE_24000 = new MegaphoneFileBitRate(3);
    public static final /* enum */ MegaphoneFileBitRate BITRATE_32000 = new MegaphoneFileBitRate(4);
    public static final /* enum */ MegaphoneFileBitRate BITRATE_48000 = new MegaphoneFileBitRate(5);
    public static final /* enum */ MegaphoneFileBitRate BITRATE_64000 = new MegaphoneFileBitRate(6);
    public static final /* enum */ MegaphoneFileBitRate BITRATE_INVALID = new MegaphoneFileBitRate(255);
    public static final /* enum */ MegaphoneFileBitRate UNKNOWN = new MegaphoneFileBitRate(65535);
    private int value;
    private static final MegaphoneFileBitRate[] allValues;
    private static final /* synthetic */ MegaphoneFileBitRate[] $VALUES;

    public static MegaphoneFileBitRate[] values() {
        return null;
    }

    public static MegaphoneFileBitRate valueOf(String string) {
        return null;
    }

    private MegaphoneFileBitRate(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphoneFileBitRate find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneFileBitRate[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneFileBitRate.$values();
        allValues = MegaphoneFileBitRate.values();
    }
}

