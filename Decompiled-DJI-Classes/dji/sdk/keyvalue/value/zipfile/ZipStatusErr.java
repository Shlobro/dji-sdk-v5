/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.zipfile;

import dji.jni.JNIProguardKeepTag;

public final class ZipStatusErr
extends Enum<ZipStatusErr>
implements JNIProguardKeepTag {
    public static final /* enum */ ZipStatusErr NONE = new ZipStatusErr(0);
    public static final /* enum */ ZipStatusErr FILE_NOT_EXIST = new ZipStatusErr(1);
    public static final /* enum */ ZipStatusErr CREATE_ZIP_FAILED = new ZipStatusErr(2);
    public static final /* enum */ ZipStatusErr READ_FILE_ERR = new ZipStatusErr(3);
    public static final /* enum */ ZipStatusErr WRITE_ZIP_ERR = new ZipStatusErr(4);
    public static final /* enum */ ZipStatusErr UNKNOWN = new ZipStatusErr(65535);
    private int value;
    private static final ZipStatusErr[] allValues;
    private static final /* synthetic */ ZipStatusErr[] $VALUES;

    public static ZipStatusErr[] values() {
        return null;
    }

    public static ZipStatusErr valueOf(String string) {
        return null;
    }

    private ZipStatusErr(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ZipStatusErr find(int n) {
        return null;
    }

    private static /* synthetic */ ZipStatusErr[] $values() {
        return null;
    }

    static {
        $VALUES = ZipStatusErr.$values();
        allValues = ZipStatusErr.values();
    }
}

