/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CinemaLut
extends Enum<CinemaLut>
implements JNIProguardKeepTag {
    public static final /* enum */ CinemaLut REC_709 = new CinemaLut(0);
    public static final /* enum */ CinemaLut D_LOG = new CinemaLut(1);
    public static final /* enum */ CinemaLut REC_2100_HLG = new CinemaLut(2);
    public static final /* enum */ CinemaLut REC_2100_PQ = new CinemaLut(3);
    public static final /* enum */ CinemaLut DJI_709 = new CinemaLut(4);
    public static final /* enum */ CinemaLut CUSTOM_LOOK = new CinemaLut(5);
    public static final /* enum */ CinemaLut UNKNOWN = new CinemaLut(65535);
    private int value;
    private static final CinemaLut[] allValues;
    private static final /* synthetic */ CinemaLut[] $VALUES;

    public static CinemaLut[] values() {
        return null;
    }

    public static CinemaLut valueOf(String string) {
        return null;
    }

    private CinemaLut(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CinemaLut find(int n) {
        return null;
    }

    private static /* synthetic */ CinemaLut[] $values() {
        return null;
    }

    static {
        $VALUES = CinemaLut.$values();
        allValues = CinemaLut.values();
    }
}

