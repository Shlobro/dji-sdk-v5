/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcChargeMobileMode
extends Enum<RcChargeMobileMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RcChargeMobileMode NEVER = new RcChargeMobileMode(0);
    public static final /* enum */ RcChargeMobileMode ALWAYS = new RcChargeMobileMode(1);
    public static final /* enum */ RcChargeMobileMode INTELLIGENT = new RcChargeMobileMode(2);
    public static final /* enum */ RcChargeMobileMode UNKNOWN = new RcChargeMobileMode(65535);
    private int value;
    private static final RcChargeMobileMode[] allValues;
    private static final /* synthetic */ RcChargeMobileMode[] $VALUES;

    public static RcChargeMobileMode[] values() {
        return null;
    }

    public static RcChargeMobileMode valueOf(String string) {
        return null;
    }

    private RcChargeMobileMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcChargeMobileMode find(int n) {
        return null;
    }

    private static /* synthetic */ RcChargeMobileMode[] $values() {
        return null;
    }

    static {
        $VALUES = RcChargeMobileMode.$values();
        allValues = RcChargeMobileMode.values();
    }
}

