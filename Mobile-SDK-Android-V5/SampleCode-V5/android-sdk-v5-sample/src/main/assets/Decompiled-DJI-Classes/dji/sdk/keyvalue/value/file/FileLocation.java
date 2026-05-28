/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileLocation
extends Enum<FileLocation>
implements JNIProguardKeepTag {
    public static final /* enum */ FileLocation SD_CARD = new FileLocation(0);
    public static final /* enum */ FileLocation INTERNAL_STORAGE = new FileLocation(1);
    public static final /* enum */ FileLocation EXTENDED_SD_CARD = new FileLocation(2);
    public static final /* enum */ FileLocation UNKNOWN = new FileLocation(65535);
    private int value;
    private static final FileLocation[] allValues;
    private static final /* synthetic */ FileLocation[] $VALUES;

    public static FileLocation[] values() {
        return null;
    }

    public static FileLocation valueOf(String string) {
        return null;
    }

    private FileLocation(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileLocation find(int n) {
        return null;
    }

    private static /* synthetic */ FileLocation[] $values() {
        return null;
    }

    static {
        $VALUES = FileLocation.$values();
        allValues = FileLocation.values();
    }
}

