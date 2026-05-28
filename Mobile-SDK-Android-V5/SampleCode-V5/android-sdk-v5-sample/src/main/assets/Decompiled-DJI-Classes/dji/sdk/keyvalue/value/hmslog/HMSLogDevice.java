/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSLogDevice
extends Enum<HMSLogDevice>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSLogDevice PRODUCT = new HMSLogDevice(0);
    public static final /* enum */ HMSLogDevice RC = new HMSLogDevice(1);
    public static final /* enum */ HMSLogDevice GLASSES = new HMSLogDevice(2);
    public static final /* enum */ HMSLogDevice RELAY = new HMSLogDevice(3);
    public static final /* enum */ HMSLogDevice Payload_MIAN_LEFT = new HMSLogDevice(4);
    public static final /* enum */ HMSLogDevice AIBox = new HMSLogDevice(5);
    public static final /* enum */ HMSLogDevice PAYLOAD_CAMERA = new HMSLogDevice(6);
    public static final /* enum */ HMSLogDevice UNKNOWN = new HMSLogDevice(65535);
    private int value;
    private static final HMSLogDevice[] allValues;
    private static final /* synthetic */ HMSLogDevice[] $VALUES;

    public static HMSLogDevice[] values() {
        return null;
    }

    public static HMSLogDevice valueOf(String string) {
        return null;
    }

    private HMSLogDevice(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSLogDevice find(int n) {
        return null;
    }

    private static /* synthetic */ HMSLogDevice[] $values() {
        return null;
    }

    static {
        $VALUES = HMSLogDevice.$values();
        allValues = HMSLogDevice.values();
    }
}

