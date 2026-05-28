/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcRole
extends Enum<RcRole>
implements JNIProguardKeepTag {
    public static final /* enum */ RcRole DEFAULT = new RcRole(0);
    public static final /* enum */ RcRole PILOT = new RcRole(1);
    public static final /* enum */ RcRole MG = new RcRole(2);
    public static final /* enum */ RcRole PILOT_PRO = new RcRole(3);
    public static final /* enum */ RcRole FLY = new RcRole(4);
    public static final /* enum */ RcRole SWARM = new RcRole(5);
    public static final /* enum */ RcRole AGRAGS_PRO = new RcRole(6);
    public static final /* enum */ RcRole LOGISTICS = new RcRole(7);
    public static final /* enum */ RcRole US_PILOT = new RcRole(51);
    public static final /* enum */ RcRole US_MG = new RcRole(52);
    public static final /* enum */ RcRole US_PRO = new RcRole(53);
    public static final /* enum */ RcRole US_FLY = new RcRole(54);
    public static final /* enum */ RcRole US_SWARM = new RcRole(55);
    public static final /* enum */ RcRole US_AGRAGS_PRO = new RcRole(56);
    public static final /* enum */ RcRole US_LOGISTICS = new RcRole(57);
    public static final /* enum */ RcRole UNKNOWN = new RcRole(65535);
    private int value;
    private static final RcRole[] allValues;
    private static final /* synthetic */ RcRole[] $VALUES;

    public static RcRole[] values() {
        return null;
    }

    public static RcRole valueOf(String string) {
        return null;
    }

    private RcRole(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcRole find(int n) {
        return null;
    }

    private static /* synthetic */ RcRole[] $values() {
        return null;
    }

    static {
        $VALUES = RcRole.$values();
        allValues = RcRole.values();
    }
}

