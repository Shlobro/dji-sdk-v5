/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcMakePairOperate
extends Enum<RcMakePairOperate>
implements JNIProguardKeepTag {
    public static final /* enum */ RcMakePairOperate GET_PAIR_STATE = new RcMakePairOperate(0);
    public static final /* enum */ RcMakePairOperate MAKE_PAIR = new RcMakePairOperate(1);
    public static final /* enum */ RcMakePairOperate UN_PAIRT = new RcMakePairOperate(2);
    public static final /* enum */ RcMakePairOperate DELETE_PAIR_INFO = new RcMakePairOperate(3);
    public static final /* enum */ RcMakePairOperate UNKNOWN = new RcMakePairOperate(65535);
    private int value;
    private static final RcMakePairOperate[] allValues;
    private static final /* synthetic */ RcMakePairOperate[] $VALUES;

    public static RcMakePairOperate[] values() {
        return null;
    }

    public static RcMakePairOperate valueOf(String string) {
        return null;
    }

    private RcMakePairOperate(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcMakePairOperate find(int n) {
        return null;
    }

    private static /* synthetic */ RcMakePairOperate[] $values() {
        return null;
    }

    static {
        $VALUES = RcMakePairOperate.$values();
        allValues = RcMakePairOperate.values();
    }
}

