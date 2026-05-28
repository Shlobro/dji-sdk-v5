/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudMediaUploadType
extends Enum<CloudMediaUploadType>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudMediaUploadType PREVIEW = new CloudMediaUploadType(0);
    public static final /* enum */ CloudMediaUploadType ORIGINAL = new CloudMediaUploadType(1);
    public static final /* enum */ CloudMediaUploadType VIDEO = new CloudMediaUploadType(2);
    public static final /* enum */ CloudMediaUploadType UNKNOWN = new CloudMediaUploadType(256);
    private int value;
    private static final CloudMediaUploadType[] allValues;
    private static final /* synthetic */ CloudMediaUploadType[] $VALUES;

    public static CloudMediaUploadType[] values() {
        return null;
    }

    public static CloudMediaUploadType valueOf(String string) {
        return null;
    }

    private CloudMediaUploadType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudMediaUploadType find(int n) {
        return null;
    }

    private static /* synthetic */ CloudMediaUploadType[] $values() {
        return null;
    }

    static {
        $VALUES = CloudMediaUploadType.$values();
        allValues = CloudMediaUploadType.values();
    }
}

