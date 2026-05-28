/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class UpgradingProgressState
extends Enum<UpgradingProgressState> {
    public static final /* enum */ UpgradingProgressState INITIALIZING = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState TRANSFERRING = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState TRANSFER_FAILED = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState TRANSFER_SUCCESS = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState UPGRADING = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState UPGRADE_FAILED = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState UPGRADE_SUCCESSFULLY = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState TRANSFER_END = new UpgradingProgressState();
    public static final /* enum */ UpgradingProgressState UNKNOWN = new UpgradingProgressState();
    private static final /* synthetic */ UpgradingProgressState[] $VALUES;

    public static UpgradingProgressState[] values() {
        return null;
    }

    public static UpgradingProgressState valueOf(String string2) {
        return null;
    }

    public static UpgradingProgressState getUpgradeFirmwareState(NativeObjects.UpgradeProcessState upgradeProcessState) {
        return null;
    }

    private static /* synthetic */ UpgradingProgressState[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradingProgressState.$values();
    }
}

