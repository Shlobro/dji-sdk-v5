/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ParachuteStateEnumReqReason
extends Enum<ParachuteStateEnumReqReason>
implements JNIProguardKeepTag {
    public static final /* enum */ ParachuteStateEnumReqReason UNKOWN = new ParachuteStateEnumReqReason(0);
    public static final /* enum */ ParachuteStateEnumReqReason MAN = new ParachuteStateEnumReqReason(1);
    public static final /* enum */ ParachuteStateEnumReqReason FC = new ParachuteStateEnumReqReason(2);
    public static final /* enum */ ParachuteStateEnumReqReason SELF = new ParachuteStateEnumReqReason(3);
    public static final /* enum */ ParachuteStateEnumReqReason UNKNOWN = new ParachuteStateEnumReqReason(255);
    private int value;
    private static final ParachuteStateEnumReqReason[] allValues;
    private static final /* synthetic */ ParachuteStateEnumReqReason[] $VALUES;

    public static ParachuteStateEnumReqReason[] values() {
        return null;
    }

    public static ParachuteStateEnumReqReason valueOf(String string) {
        return null;
    }

    private ParachuteStateEnumReqReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ParachuteStateEnumReqReason find(int n) {
        return null;
    }

    private static /* synthetic */ ParachuteStateEnumReqReason[] $values() {
        return null;
    }

    static {
        $VALUES = ParachuteStateEnumReqReason.$values();
        allValues = ParachuteStateEnumReqReason.values();
    }
}

