/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class VerifyDeviceResult
extends Enum<VerifyDeviceResult>
implements JNIProguardKeepTag {
    public static final /* enum */ VerifyDeviceResult VERIFY_RESULT_FAILED = new VerifyDeviceResult(-1);
    public static final /* enum */ VerifyDeviceResult VERIFY_RESULT_DENY = new VerifyDeviceResult(0);
    public static final /* enum */ VerifyDeviceResult VERIFY_RESULT_ALLOW = new VerifyDeviceResult(1);
    public static final /* enum */ VerifyDeviceResult VERIFY_RESULT_TIMEOUT = new VerifyDeviceResult(2);
    public static final /* enum */ VerifyDeviceResult VERIFY_RESULT_NEED_REQUEST = new VerifyDeviceResult(3);
    public static final /* enum */ VerifyDeviceResult VERIFY_RESULT_DEVICE_BUSY = new VerifyDeviceResult(4);
    public static final /* enum */ VerifyDeviceResult VERIFY_RESULT_DENY_WITH_HIGH_TEMPERATURE = new VerifyDeviceResult(5);
    public static final /* enum */ VerifyDeviceResult UNKNOWN = new VerifyDeviceResult(65535);
    private int value;
    private static final VerifyDeviceResult[] allValues;
    private static final /* synthetic */ VerifyDeviceResult[] $VALUES;

    public static VerifyDeviceResult[] values() {
        return null;
    }

    public static VerifyDeviceResult valueOf(String string) {
        return null;
    }

    private VerifyDeviceResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VerifyDeviceResult find(int n) {
        return null;
    }

    private static /* synthetic */ VerifyDeviceResult[] $values() {
        return null;
    }

    static {
        $VALUES = VerifyDeviceResult.$values();
        allValues = VerifyDeviceResult.values();
    }
}

