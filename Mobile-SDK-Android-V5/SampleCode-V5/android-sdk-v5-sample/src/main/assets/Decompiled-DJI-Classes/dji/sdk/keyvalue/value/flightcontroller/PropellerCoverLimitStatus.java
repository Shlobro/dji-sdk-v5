/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PropellerCoverLimitStatus
extends Enum<PropellerCoverLimitStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ PropellerCoverLimitStatus ON_GND = new PropellerCoverLimitStatus(0);
    public static final /* enum */ PropellerCoverLimitStatus APP_ENABLE_NO_LIMIT = new PropellerCoverLimitStatus(1);
    public static final /* enum */ PropellerCoverLimitStatus APP_ENABLE_LIMIT = new PropellerCoverLimitStatus(2);
    public static final /* enum */ PropellerCoverLimitStatus FC_ENABLE_NO_LIMIT = new PropellerCoverLimitStatus(3);
    public static final /* enum */ PropellerCoverLimitStatus FC_ENABLE_LIMIT = new PropellerCoverLimitStatus(4);
    public static final /* enum */ PropellerCoverLimitStatus DISABLE_IN_AIR = new PropellerCoverLimitStatus(5);
    public static final /* enum */ PropellerCoverLimitStatus UNKNOWN = new PropellerCoverLimitStatus(65535);
    private int value;
    private static final PropellerCoverLimitStatus[] allValues;
    private static final /* synthetic */ PropellerCoverLimitStatus[] $VALUES;

    public static PropellerCoverLimitStatus[] values() {
        return null;
    }

    public static PropellerCoverLimitStatus valueOf(String string) {
        return null;
    }

    private PropellerCoverLimitStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PropellerCoverLimitStatus find(int n) {
        return null;
    }

    private static /* synthetic */ PropellerCoverLimitStatus[] $values() {
        return null;
    }

    static {
        $VALUES = PropellerCoverLimitStatus.$values();
        allValues = PropellerCoverLimitStatus.values();
    }
}

