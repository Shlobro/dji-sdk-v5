/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCProductType
extends Enum<RCProductType>
implements JNIProguardKeepTag {
    public static final /* enum */ RCProductType SMART_CONTROLLER = new RCProductType(56);
    public static final /* enum */ RCProductType DJI_RC_PRO = new RCProductType(144);
    public static final /* enum */ RCProductType DJI_FPV_JS = new RCProductType(81);
    public static final /* enum */ RCProductType DJI_FPV_SS = new RCProductType(82);
    public static final /* enum */ RCProductType MAVIC_AIR_2_STANDARD = new RCProductType(94);
    public static final /* enum */ RCProductType MAVIC_MINI = new RCProductType(99);
    public static final /* enum */ RCProductType MAVIC_AIR_2_MUXD = new RCProductType(100);
    public static final /* enum */ RCProductType UNKNOWN = new RCProductType(65535);
    private int value;
    private static final RCProductType[] allValues;
    private static final /* synthetic */ RCProductType[] $VALUES;

    public static RCProductType[] values() {
        return null;
    }

    public static RCProductType valueOf(String string) {
        return null;
    }

    private RCProductType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCProductType find(int n) {
        return null;
    }

    private static /* synthetic */ RCProductType[] $values() {
        return null;
    }

    static {
        $VALUES = RCProductType.$values();
        allValues = RCProductType.values();
    }
}

