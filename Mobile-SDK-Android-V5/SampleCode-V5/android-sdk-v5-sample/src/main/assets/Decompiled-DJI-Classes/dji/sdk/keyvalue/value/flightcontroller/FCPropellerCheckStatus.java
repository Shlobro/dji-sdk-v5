/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCPropellerCheckStatus
extends Enum<FCPropellerCheckStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ FCPropellerCheckStatus NORMAL = new FCPropellerCheckStatus(0);
    public static final /* enum */ FCPropellerCheckStatus PLAIN_PROPELLER_ON_PLATEAU = new FCPropellerCheckStatus(1);
    public static final /* enum */ FCPropellerCheckStatus PLATEAU_PROPELLER_ON_PLAIN = new FCPropellerCheckStatus(2);
    public static final /* enum */ FCPropellerCheckStatus UNKNOWN = new FCPropellerCheckStatus(65535);
    private int value;
    private static final FCPropellerCheckStatus[] allValues;
    private static final /* synthetic */ FCPropellerCheckStatus[] $VALUES;

    public static FCPropellerCheckStatus[] values() {
        return null;
    }

    public static FCPropellerCheckStatus valueOf(String string) {
        return null;
    }

    private FCPropellerCheckStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCPropellerCheckStatus find(int n) {
        return null;
    }

    private static /* synthetic */ FCPropellerCheckStatus[] $values() {
        return null;
    }

    static {
        $VALUES = FCPropellerCheckStatus.$values();
        allValues = FCPropellerCheckStatus.values();
    }
}

