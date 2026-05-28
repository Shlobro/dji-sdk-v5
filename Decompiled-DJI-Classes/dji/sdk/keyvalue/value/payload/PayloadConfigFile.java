/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class PayloadConfigFile
extends Enum<PayloadConfigFile>
implements JNIProguardKeepTag {
    public static final /* enum */ PayloadConfigFile LIMIT_MIN = new PayloadConfigFile(0);
    public static final /* enum */ PayloadConfigFile HMS_TEXT = new PayloadConfigFile(1);
    public static final /* enum */ PayloadConfigFile LIMIT_MAX = new PayloadConfigFile(3);
    public static final /* enum */ PayloadConfigFile UNKNOWN = new PayloadConfigFile(65535);
    private int value;
    private static final PayloadConfigFile[] allValues;
    private static final /* synthetic */ PayloadConfigFile[] $VALUES;

    public static PayloadConfigFile[] values() {
        return null;
    }

    public static PayloadConfigFile valueOf(String string) {
        return null;
    }

    private PayloadConfigFile(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PayloadConfigFile find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadConfigFile[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadConfigFile.$values();
        allValues = PayloadConfigFile.values();
    }
}

