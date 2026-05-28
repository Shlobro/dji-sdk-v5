/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudMediaType
extends Enum<CloudMediaType>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudMediaType AlIYUN = new CloudMediaType(0);
    public static final /* enum */ CloudMediaType S3 = new CloudMediaType(1);
    public static final /* enum */ CloudMediaType UNKNOWN = new CloudMediaType(255);
    private int value;
    private static final CloudMediaType[] allValues;
    private static final /* synthetic */ CloudMediaType[] $VALUES;

    public static CloudMediaType[] values() {
        return null;
    }

    public static CloudMediaType valueOf(String string) {
        return null;
    }

    private CloudMediaType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudMediaType find(int n) {
        return null;
    }

    private static /* synthetic */ CloudMediaType[] $values() {
        return null;
    }

    static {
        $VALUES = CloudMediaType.$values();
        allValues = CloudMediaType.values();
    }
}

