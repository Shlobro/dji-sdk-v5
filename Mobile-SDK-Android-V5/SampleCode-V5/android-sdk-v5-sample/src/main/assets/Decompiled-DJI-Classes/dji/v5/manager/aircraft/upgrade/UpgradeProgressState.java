/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.upgrade;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class UpgradeProgressState
extends Enum<UpgradeProgressState> {
    public static final /* enum */ UpgradeProgressState INITIALIZING = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState TRANSFERRING = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState TRANSFER_FAILED = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState TRANSFER_SUCCESS = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState UPGRADING = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState UPGRADE_FAILED = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState UPGRADE_SUCCESS = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState TRANSFER_END = new UpgradeProgressState();
    public static final /* enum */ UpgradeProgressState UNKNOWN = new UpgradeProgressState();
    private static final /* synthetic */ UpgradeProgressState[] $VALUES;

    public static UpgradeProgressState[] values() {
        return null;
    }

    public static UpgradeProgressState valueOf(String string2) {
        return null;
    }

    public static UpgradeProgressState getUpgradeFirmwareState(NativeObjects.UpgradeProcessState upgradeProcessState) {
        return null;
    }

    private static /* synthetic */ UpgradeProgressState[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeProgressState.$values();
    }
}

