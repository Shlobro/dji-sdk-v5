/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mobilenetwork;

import dji.jni.JNIProguardKeepTag;

public final class OtherCardNetworkMode
extends Enum<OtherCardNetworkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ OtherCardNetworkMode GSM = new OtherCardNetworkMode(0);
    public static final /* enum */ OtherCardNetworkMode GSM_COMPACT = new OtherCardNetworkMode(1);
    public static final /* enum */ OtherCardNetworkMode UTRAN = new OtherCardNetworkMode(2);
    public static final /* enum */ OtherCardNetworkMode GSMw_EGPRS = new OtherCardNetworkMode(3);
    public static final /* enum */ OtherCardNetworkMode UTRANw_HSDPA = new OtherCardNetworkMode(4);
    public static final /* enum */ OtherCardNetworkMode UTRANw_HSUPA = new OtherCardNetworkMode(5);
    public static final /* enum */ OtherCardNetworkMode UTRANw_HSDUPA = new OtherCardNetworkMode(6);
    public static final /* enum */ OtherCardNetworkMode E_UTRAN = new OtherCardNetworkMode(7);
    public static final /* enum */ OtherCardNetworkMode UTRAN_HSPA_PLUS = new OtherCardNetworkMode(8);
    public static final /* enum */ OtherCardNetworkMode UNKNOWN = new OtherCardNetworkMode(65535);
    private int value;
    private static final OtherCardNetworkMode[] allValues;
    private static final /* synthetic */ OtherCardNetworkMode[] $VALUES;

    public static OtherCardNetworkMode[] values() {
        return null;
    }

    public static OtherCardNetworkMode valueOf(String string) {
        return null;
    }

    private OtherCardNetworkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static OtherCardNetworkMode find(int n) {
        return null;
    }

    private static /* synthetic */ OtherCardNetworkMode[] $values() {
        return null;
    }

    static {
        $VALUES = OtherCardNetworkMode.$values();
        allValues = OtherCardNetworkMode.values();
    }
}

