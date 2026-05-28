/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileCacheResponseType
extends Enum<FileCacheResponseType>
implements JNIProguardKeepTag {
    public static final /* enum */ FileCacheResponseType RELOAD = new FileCacheResponseType(0);
    public static final /* enum */ FileCacheResponseType INSERT = new FileCacheResponseType(1);
    public static final /* enum */ FileCacheResponseType REMOVE = new FileCacheResponseType(2);
    public static final /* enum */ FileCacheResponseType UPDATE = new FileCacheResponseType(3);
    public static final /* enum */ FileCacheResponseType UNKNOWN = new FileCacheResponseType(65535);
    private int value;
    private static final FileCacheResponseType[] allValues;
    private static final /* synthetic */ FileCacheResponseType[] $VALUES;

    public static FileCacheResponseType[] values() {
        return null;
    }

    public static FileCacheResponseType valueOf(String string) {
        return null;
    }

    private FileCacheResponseType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileCacheResponseType find(int n) {
        return null;
    }

    private static /* synthetic */ FileCacheResponseType[] $values() {
        return null;
    }

    static {
        $VALUES = FileCacheResponseType.$values();
        allValues = FileCacheResponseType.values();
    }
}

