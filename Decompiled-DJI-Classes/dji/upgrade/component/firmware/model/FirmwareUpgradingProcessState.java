/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class FirmwareUpgradingProcessState
extends Enum<FirmwareUpgradingProcessState> {
    public static final /* enum */ FirmwareUpgradingProcessState INITIALIZING = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState TRANSFERRING = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState TRANSFER_FAILED = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState TRANSFER_SUCCESS = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState UPGRADING = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState UPGRADE_FAILED = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState UPGRADE_SUCCESS = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState TRANSFER_END = new FirmwareUpgradingProcessState();
    public static final /* enum */ FirmwareUpgradingProcessState UNKNOWN = new FirmwareUpgradingProcessState();
    private static final /* synthetic */ FirmwareUpgradingProcessState[] $VALUES;

    public static FirmwareUpgradingProcessState[] values() {
        return null;
    }

    public static FirmwareUpgradingProcessState valueOf(String string2) {
        return null;
    }

    public static FirmwareUpgradingProcessState getUpgradeFirmwareState(NativeObjects.UpgradeProcessState upgradeProcessState) {
        return null;
    }

    private static /* synthetic */ FirmwareUpgradingProcessState[] $values() {
        return null;
    }

    static {
        $VALUES = FirmwareUpgradingProcessState.$values();
    }
}

