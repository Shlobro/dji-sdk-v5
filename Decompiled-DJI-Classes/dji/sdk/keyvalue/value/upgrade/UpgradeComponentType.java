/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.upgrade;

import dji.jni.JNIProguardKeepTag;

public final class UpgradeComponentType
extends Enum<UpgradeComponentType>
implements JNIProguardKeepTag {
    public static final /* enum */ UpgradeComponentType REMOTE_CONTROLLER_DEFAULT = new UpgradeComponentType(1);
    public static final /* enum */ UpgradeComponentType REMOTE_CONTROLLER_MG_1S = new UpgradeComponentType(2);
    public static final /* enum */ UpgradeComponentType NOT_SUPPORTED_0 = new UpgradeComponentType(3);
    public static final /* enum */ UpgradeComponentType AIRCRAFT_DEFAULT_DEFAULT = new UpgradeComponentType(17);
    public static final /* enum */ UpgradeComponentType AIRCRAFT_MG_1S_WIRED = new UpgradeComponentType(18);
    public static final /* enum */ UpgradeComponentType AIRCRAFT_MG_1S_WIRELESS = new UpgradeComponentType(19);
    public static final /* enum */ UpgradeComponentType BASE_STATION_DEFAULT = new UpgradeComponentType(33);
    public static final /* enum */ UpgradeComponentType RTK_MG_1S_WIRED = new UpgradeComponentType(34);
    public static final /* enum */ UpgradeComponentType RTK_MG_1S_WIRELESS = new UpgradeComponentType(35);
    public static final /* enum */ UpgradeComponentType CAMERA_DEFAULT = new UpgradeComponentType(65);
    public static final /* enum */ UpgradeComponentType CAMERA_LOADER = new UpgradeComponentType(66);
    public static final /* enum */ UpgradeComponentType GIMBAL_DEFAULT = new UpgradeComponentType(81);
    public static final /* enum */ UpgradeComponentType UNKNOWN = new UpgradeComponentType(65535);
    private int value;
    private static final UpgradeComponentType[] allValues;
    private static final /* synthetic */ UpgradeComponentType[] $VALUES;

    public static UpgradeComponentType[] values() {
        return null;
    }

    public static UpgradeComponentType valueOf(String string) {
        return null;
    }

    private UpgradeComponentType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UpgradeComponentType find(int n) {
        return null;
    }

    private static /* synthetic */ UpgradeComponentType[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeComponentType.$values();
        allValues = UpgradeComponentType.values();
    }
}

