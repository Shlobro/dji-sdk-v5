/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileCacheRequestType
extends Enum<FileCacheRequestType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileCacheRequestType CACHE_RELOAD = new FileCacheRequestType(0);
    public static final /* enum */ FileCacheRequestType DEVICE_RELOAD = new FileCacheRequestType(1);
    public static final /* enum */ FileCacheRequestType TAG_STAR = new FileCacheRequestType(2);
    public static final /* enum */ FileCacheRequestType CANCEL_STAR = new FileCacheRequestType(3);
    public static final /* enum */ FileCacheRequestType DELETE_SINGLE = new FileCacheRequestType(4);
    public static final /* enum */ FileCacheRequestType DELETE_ALL = new FileCacheRequestType(5);
    public static final /* enum */ FileCacheRequestType UNKNOWN = new FileCacheRequestType(65535);
    private int value;
    private static final FileCacheRequestType[] allValues;
    private static final /* synthetic */ FileCacheRequestType[] $VALUES;

    public static FileCacheRequestType[] values() {
        return null;
    }

    public static FileCacheRequestType valueOf(String string) {
        return null;
    }

    private FileCacheRequestType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileCacheRequestType find(int n) {
        return null;
    }

    private static /* synthetic */ FileCacheRequestType[] $values() {
        return null;
    }

    static {
        $VALUES = FileCacheRequestType.$values();
        allValues = FileCacheRequestType.values();
    }
}

