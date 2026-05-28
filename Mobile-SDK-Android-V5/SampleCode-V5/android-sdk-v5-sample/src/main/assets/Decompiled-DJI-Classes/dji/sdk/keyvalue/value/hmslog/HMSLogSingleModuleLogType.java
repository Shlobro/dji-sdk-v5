/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSLogSingleModuleLogType
extends Enum<HMSLogSingleModuleLogType>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSLogSingleModuleLogType NONE = new HMSLogSingleModuleLogType(0);
    public static final /* enum */ HMSLogSingleModuleLogType SINGLE_FILE = new HMSLogSingleModuleLogType(1);
    public static final /* enum */ HMSLogSingleModuleLogType DIRECTORY = new HMSLogSingleModuleLogType(2);
    public static final /* enum */ HMSLogSingleModuleLogType UNKNOWN = new HMSLogSingleModuleLogType(65535);
    private int value;
    private static final HMSLogSingleModuleLogType[] allValues;
    private static final /* synthetic */ HMSLogSingleModuleLogType[] $VALUES;

    public static HMSLogSingleModuleLogType[] values() {
        return null;
    }

    public static HMSLogSingleModuleLogType valueOf(String string) {
        return null;
    }

    private HMSLogSingleModuleLogType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSLogSingleModuleLogType find(int n) {
        return null;
    }

    private static /* synthetic */ HMSLogSingleModuleLogType[] $values() {
        return null;
    }

    static {
        $VALUES = HMSLogSingleModuleLogType.$values();
        allValues = HMSLogSingleModuleLogType.values();
    }
}

