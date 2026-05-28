/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CountDownActionCMDType
extends Enum<CountDownActionCMDType>
implements JNIProguardKeepTag {
    public static final /* enum */ CountDownActionCMDType FC_TO_APP = new CountDownActionCMDType(0);
    public static final /* enum */ CountDownActionCMDType APP_TO_FC = new CountDownActionCMDType(1);
    public static final /* enum */ CountDownActionCMDType UNKNOWN = new CountDownActionCMDType(65535);
    private int value;
    private static final CountDownActionCMDType[] allValues;
    private static final /* synthetic */ CountDownActionCMDType[] $VALUES;

    public static CountDownActionCMDType[] values() {
        return null;
    }

    public static CountDownActionCMDType valueOf(String string) {
        return null;
    }

    private CountDownActionCMDType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CountDownActionCMDType find(int n) {
        return null;
    }

    private static /* synthetic */ CountDownActionCMDType[] $values() {
        return null;
    }

    static {
        $VALUES = CountDownActionCMDType.$values();
        allValues = CountDownActionCMDType.values();
    }
}

