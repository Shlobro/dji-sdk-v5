/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.model;

public final class DatabaseUpgradeCheckState
extends Enum<DatabaseUpgradeCheckState> {
    public static final /* enum */ DatabaseUpgradeCheckState INITIALIZING = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState CHECKING = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState APP_GREATER_THAN_AIRCRAFT = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState APP_EQUAL_TO_AIRCRAFT = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState APP_LESS_THAN_AIRCRAFT = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState NEED_UPDATE = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState NEED_FORCE_UPDATE = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState UP_TO_DATE = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState CHECK_EXCEPTION = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState UPGRADE_SUCCESS = new DatabaseUpgradeCheckState();
    public static final /* enum */ DatabaseUpgradeCheckState UNKNOWN = new DatabaseUpgradeCheckState();
    private static final /* synthetic */ DatabaseUpgradeCheckState[] $VALUES;

    public static DatabaseUpgradeCheckState[] values() {
        return null;
    }

    public static DatabaseUpgradeCheckState valueOf(String string) {
        return null;
    }

    private static /* synthetic */ DatabaseUpgradeCheckState[] $values() {
        return null;
    }

    static {
        $VALUES = DatabaseUpgradeCheckState.$values();
    }
}

