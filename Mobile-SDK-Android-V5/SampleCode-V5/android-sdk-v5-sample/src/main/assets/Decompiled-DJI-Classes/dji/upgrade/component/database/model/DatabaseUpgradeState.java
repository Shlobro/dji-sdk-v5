/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.database.model;

public final class DatabaseUpgradeState
extends Enum<DatabaseUpgradeState> {
    public static final /* enum */ DatabaseUpgradeState INITIALIZATING = new DatabaseUpgradeState();
    public static final /* enum */ DatabaseUpgradeState CHECKING = new DatabaseUpgradeState();
    public static final /* enum */ DatabaseUpgradeState LOCAL_GREATER_THAN_FC = new DatabaseUpgradeState();
    public static final /* enum */ DatabaseUpgradeState LOCAL_LESS_THAN_OR_EQUAL_FC = new DatabaseUpgradeState();
    public static final /* enum */ DatabaseUpgradeState NEED_UPDATE = new DatabaseUpgradeState();
    public static final /* enum */ DatabaseUpgradeState NEED_FORCE_UPDATE = new DatabaseUpgradeState();
    public static final /* enum */ DatabaseUpgradeState UP_TO_DATE = new DatabaseUpgradeState();
    public static final /* enum */ DatabaseUpgradeState UNKNOWN = new DatabaseUpgradeState();
    private static final /* synthetic */ DatabaseUpgradeState[] $VALUES;

    public static DatabaseUpgradeState[] values() {
        return null;
    }

    public static DatabaseUpgradeState valueOf(String string2) {
        return null;
    }

    private static /* synthetic */ DatabaseUpgradeState[] $values() {
        return null;
    }

    static {
        $VALUES = DatabaseUpgradeState.$values();
    }
}

