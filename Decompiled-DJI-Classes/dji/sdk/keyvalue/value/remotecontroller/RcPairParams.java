/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcPairParams
extends Enum<RcPairParams>
implements JNIProguardKeepTag {
    public static final /* enum */ RcPairParams CLEAR_ALL_PAIR_INFO = new RcPairParams(0);
    public static final /* enum */ RcPairParams DELETE_SPECIFIED_PAIR_INFO = new RcPairParams(1);
    public static final /* enum */ RcPairParams PAIR_WITH_SPECIFIED_INDEX = new RcPairParams(2);
    public static final /* enum */ RcPairParams UNKNOWN = new RcPairParams(65535);
    private int value;
    private static final RcPairParams[] allValues;
    private static final /* synthetic */ RcPairParams[] $VALUES;

    public static RcPairParams[] values() {
        return null;
    }

    public static RcPairParams valueOf(String string) {
        return null;
    }

    private RcPairParams(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcPairParams find(int n) {
        return null;
    }

    private static /* synthetic */ RcPairParams[] $values() {
        return null;
    }

    static {
        $VALUES = RcPairParams.$values();
        allValues = RcPairParams.values();
    }
}

