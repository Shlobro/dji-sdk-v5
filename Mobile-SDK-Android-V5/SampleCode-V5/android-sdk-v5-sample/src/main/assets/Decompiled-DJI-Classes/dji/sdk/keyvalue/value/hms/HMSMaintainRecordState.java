/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;

public final class HMSMaintainRecordState
extends Enum<HMSMaintainRecordState>
implements JNIProguardKeepTag {
    public static final /* enum */ HMSMaintainRecordState INVALID = new HMSMaintainRecordState(0);
    public static final /* enum */ HMSMaintainRecordState VALID = new HMSMaintainRecordState(1);
    public static final /* enum */ HMSMaintainRecordState FAILED = new HMSMaintainRecordState(2);
    public static final /* enum */ HMSMaintainRecordState UNKNOWN = new HMSMaintainRecordState(65535);
    private int value;
    private static final HMSMaintainRecordState[] allValues;
    private static final /* synthetic */ HMSMaintainRecordState[] $VALUES;

    public static HMSMaintainRecordState[] values() {
        return null;
    }

    public static HMSMaintainRecordState valueOf(String string) {
        return null;
    }

    private HMSMaintainRecordState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HMSMaintainRecordState find(int n) {
        return null;
    }

    private static /* synthetic */ HMSMaintainRecordState[] $values() {
        return null;
    }

    static {
        $VALUES = HMSMaintainRecordState.$values();
        allValues = HMSMaintainRecordState.values();
    }
}

