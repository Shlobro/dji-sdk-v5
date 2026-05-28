/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSCodeModuleMapLoadErrorCode
extends Enum<HMSCodeModuleMapLoadErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSCodeModuleMapLoadErrorCode NONE = new HMSCodeModuleMapLoadErrorCode(0);
    public static final /* enum */ HMSCodeModuleMapLoadErrorCode NO_FILE = new HMSCodeModuleMapLoadErrorCode(1);
    public static final /* enum */ HMSCodeModuleMapLoadErrorCode INVALID_FILE = new HMSCodeModuleMapLoadErrorCode(2);
    public static final /* enum */ HMSCodeModuleMapLoadErrorCode IO_ERROR = new HMSCodeModuleMapLoadErrorCode(3);
    public static final /* enum */ HMSCodeModuleMapLoadErrorCode INVALID_KEY = new HMSCodeModuleMapLoadErrorCode(5);
    public static final /* enum */ HMSCodeModuleMapLoadErrorCode UNKNOWN = new HMSCodeModuleMapLoadErrorCode(65535);
    private int value;
    private static final HMSCodeModuleMapLoadErrorCode[] allValues;
    private static final /* synthetic */ HMSCodeModuleMapLoadErrorCode[] $VALUES;

    public static HMSCodeModuleMapLoadErrorCode[] values() {
        return null;
    }

    public static HMSCodeModuleMapLoadErrorCode valueOf(String string) {
        return null;
    }

    private HMSCodeModuleMapLoadErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSCodeModuleMapLoadErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ HMSCodeModuleMapLoadErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = HMSCodeModuleMapLoadErrorCode.$values();
        allValues = HMSCodeModuleMapLoadErrorCode.values();
    }
}

