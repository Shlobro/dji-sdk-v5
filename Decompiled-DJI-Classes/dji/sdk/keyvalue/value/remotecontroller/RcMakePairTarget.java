/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcMakePairTarget
extends Enum<RcMakePairTarget>
implements JNIProguardKeepTag {
    public static final /* enum */ RcMakePairTarget GS = new RcMakePairTarget(0);
    public static final /* enum */ RcMakePairTarget BS = new RcMakePairTarget(1);
    public static final /* enum */ RcMakePairTarget UNKNOWN = new RcMakePairTarget(65535);
    private int value;
    private static final RcMakePairTarget[] allValues;
    private static final /* synthetic */ RcMakePairTarget[] $VALUES;

    public static RcMakePairTarget[] values() {
        return null;
    }

    public static RcMakePairTarget valueOf(String string) {
        return null;
    }

    private RcMakePairTarget(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcMakePairTarget find(int n) {
        return null;
    }

    private static /* synthetic */ RcMakePairTarget[] $values() {
        return null;
    }

    static {
        $VALUES = RcMakePairTarget.$values();
        allValues = RcMakePairTarget.values();
    }
}

