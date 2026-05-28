/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class LastPointTypeCode
extends Enum<LastPointTypeCode>
implements JNIProguardKeepTag {
    public static final /* enum */ LastPointTypeCode OVER_HOME_POINT_WILL_LANDING = new LastPointTypeCode(0);
    public static final /* enum */ LastPointTypeCode NOT_LAND_POINT = new LastPointTypeCode(1);
    public static final /* enum */ LastPointTypeCode OVER_HOME_POINT_WILL_NOT_LANDING = new LastPointTypeCode(2);
    public static final /* enum */ LastPointTypeCode UNKNOWN = new LastPointTypeCode(65535);
    private int value;
    private static final LastPointTypeCode[] allValues;
    private static final /* synthetic */ LastPointTypeCode[] $VALUES;

    public static LastPointTypeCode[] values() {
        return null;
    }

    public static LastPointTypeCode valueOf(String string) {
        return null;
    }

    private LastPointTypeCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LastPointTypeCode find(int n) {
        return null;
    }

    private static /* synthetic */ LastPointTypeCode[] $values() {
        return null;
    }

    static {
        $VALUES = LastPointTypeCode.$values();
        allValues = LastPointTypeCode.values();
    }
}

