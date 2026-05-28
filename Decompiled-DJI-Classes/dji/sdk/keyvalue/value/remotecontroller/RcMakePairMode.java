/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcMakePairMode
extends Enum<RcMakePairMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RcMakePairMode AGRICULTURAL_DRONE = new RcMakePairMode(0);
    public static final /* enum */ RcMakePairMode ONE_PIGEON_MULTI_DRONE = new RcMakePairMode(1);
    public static final /* enum */ RcMakePairMode OTHER = new RcMakePairMode(2);
    public static final /* enum */ RcMakePairMode UNKNOWN = new RcMakePairMode(65535);
    private int value;
    private static final RcMakePairMode[] allValues;
    private static final /* synthetic */ RcMakePairMode[] $VALUES;

    public static RcMakePairMode[] values() {
        return null;
    }

    public static RcMakePairMode valueOf(String string) {
        return null;
    }

    private RcMakePairMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcMakePairMode find(int n) {
        return null;
    }

    private static /* synthetic */ RcMakePairMode[] $values() {
        return null;
    }

    static {
        $VALUES = RcMakePairMode.$values();
        allValues = RcMakePairMode.values();
    }
}

