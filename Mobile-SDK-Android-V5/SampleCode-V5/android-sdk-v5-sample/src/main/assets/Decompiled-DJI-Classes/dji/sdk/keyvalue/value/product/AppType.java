/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class AppType
extends Enum<AppType>
implements JNIProguardKeepTag {
    public static final /* enum */ AppType NONE = new AppType(0);
    public static final /* enum */ AppType GENERIC = new AppType(1);
    public static final /* enum */ AppType MG = new AppType(2);
    public static final /* enum */ AppType VIRTUAL = new AppType(5);
    public static final /* enum */ AppType BRIDGE = new AppType(6);
    public static final /* enum */ AppType MIMO = new AppType(7);
    public static final /* enum */ AppType TEST_APP = new AppType(8);
    public static final /* enum */ AppType IOS_PT_BRIDGE = new AppType(9);
    public static final /* enum */ AppType GROUND_STATION = new AppType(10);
    public static final /* enum */ AppType DJI_FLY = new AppType(11);
    public static final /* enum */ AppType PILOT = new AppType(12);
    public static final /* enum */ AppType DJI_FLY_SMART_CONTROLLER = new AppType(13);
    public static final /* enum */ AppType T30 = new AppType(14);
    public static final /* enum */ AppType DJI_PILOT_SMART_CONTROLLER = new AppType(15);
    public static final /* enum */ AppType DJI_FLY_DJI_RC_PRO = new AppType(16);
    public static final /* enum */ AppType NOT_SUPPORTED_0 = new AppType(17);
    public static final /* enum */ AppType MSDK = new AppType(18);
    public static final /* enum */ AppType NOT_SUPPORTED_1 = new AppType(19);
    public static final /* enum */ AppType PILOT_RM511 = new AppType(20);
    public static final /* enum */ AppType HYAPP = new AppType(21);
    public static final /* enum */ AppType UNKNOWN = new AppType(255);
    private int value;
    private static final AppType[] allValues;
    private static final /* synthetic */ AppType[] $VALUES;

    public static AppType[] values() {
        return null;
    }

    public static AppType valueOf(String string) {
        return null;
    }

    private AppType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AppType find(int n) {
        return null;
    }

    private static /* synthetic */ AppType[] $values() {
        return null;
    }

    static {
        $VALUES = AppType.$values();
        allValues = AppType.values();
    }
}

