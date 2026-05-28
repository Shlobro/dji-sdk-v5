/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.zipfile;

import dji.jni.JNIProguardKeepTag;

public final class ZipStatus
extends Enum<ZipStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ ZipStatus NONE = new ZipStatus(0);
    public static final /* enum */ ZipStatus INIT = new ZipStatus(1);
    public static final /* enum */ ZipStatus SEARCH = new ZipStatus(2);
    public static final /* enum */ ZipStatus ZIP = new ZipStatus(3);
    public static final /* enum */ ZipStatus FINISH = new ZipStatus(4);
    public static final /* enum */ ZipStatus ERROR = new ZipStatus(5);
    public static final /* enum */ ZipStatus CANCEL = new ZipStatus(6);
    public static final /* enum */ ZipStatus UNKNOWN = new ZipStatus(65535);
    private int value;
    private static final ZipStatus[] allValues;
    private static final /* synthetic */ ZipStatus[] $VALUES;

    public static ZipStatus[] values() {
        return null;
    }

    public static ZipStatus valueOf(String string) {
        return null;
    }

    private ZipStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ZipStatus find(int n) {
        return null;
    }

    private static /* synthetic */ ZipStatus[] $values() {
        return null;
    }

    static {
        $VALUES = ZipStatus.$values();
        allValues = ZipStatus.values();
    }
}

