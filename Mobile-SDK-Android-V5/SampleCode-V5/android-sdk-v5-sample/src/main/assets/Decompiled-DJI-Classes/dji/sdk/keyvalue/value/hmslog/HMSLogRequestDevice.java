/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSLogRequestDevice
extends Enum<HMSLogRequestDevice>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSLogRequestDevice None = new HMSLogRequestDevice(0);
    public static final /* enum */ HMSLogRequestDevice PC = new HMSLogRequestDevice(1);
    public static final /* enum */ HMSLogRequestDevice APP = new HMSLogRequestDevice(2);
    public static final /* enum */ HMSLogRequestDevice UNKNOWN = new HMSLogRequestDevice(65535);
    private int value;
    private static final HMSLogRequestDevice[] allValues;
    private static final /* synthetic */ HMSLogRequestDevice[] $VALUES;

    public static HMSLogRequestDevice[] values() {
        return null;
    }

    public static HMSLogRequestDevice valueOf(String string) {
        return null;
    }

    private HMSLogRequestDevice(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSLogRequestDevice find(int n) {
        return null;
    }

    private static /* synthetic */ HMSLogRequestDevice[] $values() {
        return null;
    }

    static {
        $VALUES = HMSLogRequestDevice.$values();
        allValues = HMSLogRequestDevice.values();
    }
}

