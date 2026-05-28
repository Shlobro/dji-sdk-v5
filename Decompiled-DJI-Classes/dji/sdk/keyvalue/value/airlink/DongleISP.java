/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DongleISP
extends Enum<DongleISP>
implements JNIProguardKeepTag {
    public static final /* enum */ DongleISP NOT_SUPPORT = new DongleISP(0);
    public static final /* enum */ DongleISP UNICOM = new DongleISP(1);
    public static final /* enum */ DongleISP TELECOM = new DongleISP(2);
    public static final /* enum */ DongleISP CMCC = new DongleISP(3);
    public static final /* enum */ DongleISP UNKNOWN = new DongleISP(65535);
    private int value;
    private static final DongleISP[] allValues;
    private static final /* synthetic */ DongleISP[] $VALUES;

    public static DongleISP[] values() {
        return null;
    }

    public static DongleISP valueOf(String string) {
        return null;
    }

    private DongleISP(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DongleISP find(int n) {
        return null;
    }

    private static /* synthetic */ DongleISP[] $values() {
        return null;
    }

    static {
        $VALUES = DongleISP.$values();
        allValues = DongleISP.values();
    }
}

