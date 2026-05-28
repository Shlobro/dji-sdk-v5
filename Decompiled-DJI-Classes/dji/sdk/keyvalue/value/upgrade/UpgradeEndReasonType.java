/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.upgrade;

import dji.jni.JNIProguardKeepTag;

public final class UpgradeEndReasonType
extends Enum<UpgradeEndReasonType>
implements JNIProguardKeepTag {
    public static final /* enum */ UpgradeEndReasonType UPGRADE_SUCCESS = new UpgradeEndReasonType(1);
    public static final /* enum */ UpgradeEndReasonType UPGRADE_FAILED = new UpgradeEndReasonType(2);
    public static final /* enum */ UpgradeEndReasonType FIRMWARE_ERROR = new UpgradeEndReasonType(3);
    public static final /* enum */ UpgradeEndReasonType VERSION_ERROR = new UpgradeEndReasonType(4);
    public static final /* enum */ UpgradeEndReasonType USER_CANCEL = new UpgradeEndReasonType(5);
    public static final /* enum */ UpgradeEndReasonType TIMEOUT_CANCEL = new UpgradeEndReasonType(6);
    public static final /* enum */ UpgradeEndReasonType MOTOR_IS_WORKING = new UpgradeEndReasonType(7);
    public static final /* enum */ UpgradeEndReasonType FIRMWARE_MISMATCH = new UpgradeEndReasonType(8);
    public static final /* enum */ UpgradeEndReasonType DOWNGRADE_ILLEGAL = new UpgradeEndReasonType(9);
    public static final /* enum */ UpgradeEndReasonType AIR_DATALINK_CONNECT_ERROR = new UpgradeEndReasonType(10);
    public static final /* enum */ UpgradeEndReasonType AIR_SDR_ERROR = new UpgradeEndReasonType(11);
    public static final /* enum */ UpgradeEndReasonType GROUND_SDR_ERROR = new UpgradeEndReasonType(12);
    public static final /* enum */ UpgradeEndReasonType GROUND_SEND_FIRMWARE_TO_AIR_FAIL = new UpgradeEndReasonType(13);
    public static final /* enum */ UpgradeEndReasonType AIR_CONTROLLINK_CONNECT_ERROR = new UpgradeEndReasonType(14);
    public static final /* enum */ UpgradeEndReasonType AIR_FIRMWARE_PACK_ERROR = new UpgradeEndReasonType(15);
    public static final /* enum */ UpgradeEndReasonType CFG_FILE_NOT_FOUND = new UpgradeEndReasonType(16);
    public static final /* enum */ UpgradeEndReasonType GLASSES_FIRMWARE_PACK_ERROR = new UpgradeEndReasonType(17);
    public static final /* enum */ UpgradeEndReasonType GROUND_GLASSES_LOSS_ASSOCIATION_AFTER_AIRGROUND_REVERSE = new UpgradeEndReasonType(18);
    public static final /* enum */ UpgradeEndReasonType GROUND_GLASSES_LOSS_ASSOCIATION_AFTER_AIRGROUND_REVERSE_TWICE = new UpgradeEndReasonType(19);
    public static final /* enum */ UpgradeEndReasonType GROUND_SEND_FIRMWARE_TO_GLASSES_FAIL = new UpgradeEndReasonType(20);
    public static final /* enum */ UpgradeEndReasonType TARFILE_UNPACK_FAIL = new UpgradeEndReasonType(21);
    public static final /* enum */ UpgradeEndReasonType UNKNOWN = new UpgradeEndReasonType(65535);
    private int value;
    private static final UpgradeEndReasonType[] allValues;
    private static final /* synthetic */ UpgradeEndReasonType[] $VALUES;

    public static UpgradeEndReasonType[] values() {
        return null;
    }

    public static UpgradeEndReasonType valueOf(String string) {
        return null;
    }

    private UpgradeEndReasonType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UpgradeEndReasonType find(int n) {
        return null;
    }

    private static /* synthetic */ UpgradeEndReasonType[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeEndReasonType.$values();
        allValues = UpgradeEndReasonType.values();
    }
}

