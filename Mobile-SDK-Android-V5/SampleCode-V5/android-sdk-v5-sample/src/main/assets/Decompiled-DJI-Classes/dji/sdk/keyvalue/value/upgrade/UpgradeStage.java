/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.upgrade;

import dji.jni.JNIProguardKeepTag;

public final class UpgradeStage
extends Enum<UpgradeStage>
implements JNIProguardKeepTag {
    public static final /* enum */ UpgradeStage ENTER_UPGRADE_REQUEST_FROM_LOCAL = new UpgradeStage(1);
    public static final /* enum */ UpgradeStage RECEIVE_FIRMWARE_DATA_FROM_LOCAL = new UpgradeStage(2);
    public static final /* enum */ UpgradeStage SEND_UPGRADE_FILE_FROM_LOCAL = new UpgradeStage(3);
    public static final /* enum */ UpgradeStage FIRMWARE_VERIFY_FROM_LOCAL = new UpgradeStage(4);
    public static final /* enum */ UpgradeStage RECEIVE_FIRMWARE_DATA_FROM_LOCAL_FTP_MSG = new UpgradeStage(5);
    public static final /* enum */ UpgradeStage FIRMWARE_VERIFY_FROM_DEVICE = new UpgradeStage(17);
    public static final /* enum */ UpgradeStage USER_CONFIRM_FROM_DEVICE = new UpgradeStage(18);
    public static final /* enum */ UpgradeStage UPGRADE_GOING_FROM_DEVICE = new UpgradeStage(19);
    public static final /* enum */ UpgradeStage UPGRADE_END_FROM_DEVICE = new UpgradeStage(20);
    public static final /* enum */ UpgradeStage DATA_UPDATE_FROM_DEVICE = new UpgradeStage(21);
    public static final /* enum */ UpgradeStage UPGRADE_REBOOT_FROM_DEVICE = new UpgradeStage(22);
    public static final /* enum */ UpgradeStage UPGRADE_HOTPLUG_ONGOING_FROM_DEVICE = new UpgradeStage(23);
    public static final /* enum */ UpgradeStage UPGRADE_HOTPLUG_FINISH_FROM_DEVICE = new UpgradeStage(24);
    public static final /* enum */ UpgradeStage UPGRADE_HOTPLUG_FAIL_FROM_DEVICE = new UpgradeStage(25);
    public static final /* enum */ UpgradeStage UNKNOWN = new UpgradeStage(65535);
    private int value;
    private static final UpgradeStage[] allValues;
    private static final /* synthetic */ UpgradeStage[] $VALUES;

    public static UpgradeStage[] values() {
        return null;
    }

    public static UpgradeStage valueOf(String string) {
        return null;
    }

    private UpgradeStage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UpgradeStage find(int n) {
        return null;
    }

    private static /* synthetic */ UpgradeStage[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeStage.$values();
        allValues = UpgradeStage.values();
    }
}

