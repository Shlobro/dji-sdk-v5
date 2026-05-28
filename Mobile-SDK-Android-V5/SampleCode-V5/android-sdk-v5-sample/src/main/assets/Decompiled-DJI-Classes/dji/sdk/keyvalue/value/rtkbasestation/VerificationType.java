/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class VerificationType
extends Enum<VerificationType>
implements JNIProguardKeepTag {
    public static final /* enum */ VerificationType COMMON_SIGNATURE = new VerificationType(0);
    public static final /* enum */ VerificationType COMMON_SEC = new VerificationType(1);
    public static final /* enum */ VerificationType PPK_SEC = new VerificationType(2);
    public static final /* enum */ VerificationType NETWORK_RTK_SEC = new VerificationType(3);
    public static final /* enum */ VerificationType UNKNOWN = new VerificationType(65535);
    private int value;
    private static final VerificationType[] allValues;
    private static final /* synthetic */ VerificationType[] $VALUES;

    public static VerificationType[] values() {
        return null;
    }

    public static VerificationType valueOf(String string) {
        return null;
    }

    private VerificationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VerificationType find(int n) {
        return null;
    }

    private static /* synthetic */ VerificationType[] $values() {
        return null;
    }

    static {
        $VALUES = VerificationType.$values();
        allValues = VerificationType.values();
    }
}

