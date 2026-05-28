/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.model;

public final class DatabaseUpgradingProcessState
extends Enum<DatabaseUpgradingProcessState> {
    public static final /* enum */ DatabaseUpgradingProcessState INITIALIZING = new DatabaseUpgradingProcessState();
    public static final /* enum */ DatabaseUpgradingProcessState TRANSFERRING = new DatabaseUpgradingProcessState();
    public static final /* enum */ DatabaseUpgradingProcessState TRANSFER_FAILED = new DatabaseUpgradingProcessState();
    public static final /* enum */ DatabaseUpgradingProcessState UPGRADING = new DatabaseUpgradingProcessState();
    public static final /* enum */ DatabaseUpgradingProcessState UPGRADE_FAILED = new DatabaseUpgradingProcessState();
    public static final /* enum */ DatabaseUpgradingProcessState UPGRADE_SUCCESS = new DatabaseUpgradingProcessState();
    public static final /* enum */ DatabaseUpgradingProcessState UNKNOWN = new DatabaseUpgradingProcessState();
    private static final /* synthetic */ DatabaseUpgradingProcessState[] $VALUES;

    public static DatabaseUpgradingProcessState[] values() {
        return null;
    }

    public static DatabaseUpgradingProcessState valueOf(String string) {
        return null;
    }

    private static /* synthetic */ DatabaseUpgradingProcessState[] $values() {
        return null;
    }

    static {
        $VALUES = DatabaseUpgradingProcessState.$values();
    }
}

