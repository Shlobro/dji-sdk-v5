/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileType
extends Enum<FileType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileType MEDIA = new FileType(0);
    public static final /* enum */ FileType COMMON = new FileType(1);
    public static final /* enum */ FileType SPEAKER_AUDIO = new FileType(2);
    public static final /* enum */ FileType PAYLOAD_WIDGET_JSON = new FileType(3);
    public static final /* enum */ FileType MEDIA_FOLDER = new FileType(4);
    public static final /* enum */ FileType LUT_FILE = new FileType(5);
    public static final /* enum */ FileType LENS_CALI_FILE = new FileType(6);
    public static final /* enum */ FileType PSDK_CONFIG = new FileType(7);
    public static final /* enum */ FileType UNKNOWN = new FileType(65535);
    private int value;
    private static final FileType[] allValues;
    private static final /* synthetic */ FileType[] $VALUES;

    public static FileType[] values() {
        return null;
    }

    public static FileType valueOf(String string) {
        return null;
    }

    private FileType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileType find(int n) {
        return null;
    }

    private static /* synthetic */ FileType[] $values() {
        return null;
    }

    static {
        $VALUES = FileType.$values();
        allValues = FileType.values();
    }
}

