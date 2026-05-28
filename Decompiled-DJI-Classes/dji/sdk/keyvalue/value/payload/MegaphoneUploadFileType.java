/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphoneUploadFileType
extends Enum<MegaphoneUploadFileType>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphoneUploadFileType TTS_FILE = new MegaphoneUploadFileType(0);
    public static final /* enum */ MegaphoneUploadFileType VOICE_FILE = new MegaphoneUploadFileType(1);
    public static final /* enum */ MegaphoneUploadFileType UNKNOWN = new MegaphoneUploadFileType(65535);
    private int value;
    private static final MegaphoneUploadFileType[] allValues;
    private static final /* synthetic */ MegaphoneUploadFileType[] $VALUES;

    public static MegaphoneUploadFileType[] values() {
        return null;
    }

    public static MegaphoneUploadFileType valueOf(String string) {
        return null;
    }

    private MegaphoneUploadFileType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphoneUploadFileType find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneUploadFileType[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneUploadFileType.$values();
        allValues = MegaphoneUploadFileType.values();
    }
}

