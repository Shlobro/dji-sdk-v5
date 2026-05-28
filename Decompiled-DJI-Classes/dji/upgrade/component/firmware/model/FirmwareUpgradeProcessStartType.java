/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class FirmwareUpgradeProcessStartType
extends Enum<FirmwareUpgradeProcessStartType> {
    public static final /* enum */ FirmwareUpgradeProcessStartType NORMAL = new FirmwareUpgradeProcessStartType();
    public static final /* enum */ FirmwareUpgradeProcessStartType RECOVER = new FirmwareUpgradeProcessStartType();
    public static final /* enum */ FirmwareUpgradeProcessStartType CONSISTENT = new FirmwareUpgradeProcessStartType();
    public static final /* enum */ FirmwareUpgradeProcessStartType IMAGE_SWITCH = new FirmwareUpgradeProcessStartType();
    public static final /* enum */ FirmwareUpgradeProcessStartType UNKNOWN = new FirmwareUpgradeProcessStartType();
    private static final /* synthetic */ FirmwareUpgradeProcessStartType[] $VALUES;

    public static FirmwareUpgradeProcessStartType[] values() {
        return null;
    }

    public static FirmwareUpgradeProcessStartType valueOf(String string2) {
        return null;
    }

    public static FirmwareUpgradeProcessStartType getFirmwareUpgradingProcessStartType(NativeObjects.UpgradeProcessStartType upgradeProcessStartType) {
        return null;
    }

    private static /* synthetic */ FirmwareUpgradeProcessStartType[] $values() {
        return null;
    }

    static {
        $VALUES = FirmwareUpgradeProcessStartType.$values();
    }
}

