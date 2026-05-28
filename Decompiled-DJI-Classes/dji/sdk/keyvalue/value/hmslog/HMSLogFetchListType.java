/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HMSLogFetchListType
extends Enum<HMSLogFetchListType>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSLogFetchListType BY_BOOT_INDEX = new HMSLogFetchListType(0);
    public static final /* enum */ HMSLogFetchListType BY_FLIGHT_INDEX = new HMSLogFetchListType(1);
    public static final /* enum */ HMSLogFetchListType UNKNOWN = new HMSLogFetchListType(65535);
    private int value;
    private static final HMSLogFetchListType[] allValues;
    private static final /* synthetic */ HMSLogFetchListType[] $VALUES;

    public static HMSLogFetchListType[] values() {
        return null;
    }

    public static HMSLogFetchListType valueOf(String string) {
        return null;
    }

    private HMSLogFetchListType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSLogFetchListType find(int n) {
        return null;
    }

    private static /* synthetic */ HMSLogFetchListType[] $values() {
        return null;
    }

    static {
        $VALUES = HMSLogFetchListType.$values();
        allValues = HMSLogFetchListType.values();
    }
}

