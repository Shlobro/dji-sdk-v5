/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class UploadMcsType
extends Enum<UploadMcsType>
implements JNIProguardKeepTag {
    public static final /* enum */ UploadMcsType RESUME = new UploadMcsType(0);
    public static final /* enum */ UploadMcsType INCREASE = new UploadMcsType(1);
    public static final /* enum */ UploadMcsType UNKNOWN = new UploadMcsType(65535);
    private int value;
    private static final UploadMcsType[] allValues;
    private static final /* synthetic */ UploadMcsType[] $VALUES;

    public static UploadMcsType[] values() {
        return null;
    }

    public static UploadMcsType valueOf(String string) {
        return null;
    }

    private UploadMcsType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UploadMcsType find(int n) {
        return null;
    }

    private static /* synthetic */ UploadMcsType[] $values() {
        return null;
    }

    static {
        $VALUES = UploadMcsType.$values();
        allValues = UploadMcsType.values();
    }
}

