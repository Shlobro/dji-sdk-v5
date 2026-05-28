/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.listener.UpgradeDatabaseListener;
import dji.csdk.flysafe.BaseDatabaseUpgradeData;

public interface DatabaseUpgradeComponent {
    public void addDatabaseUpgradeListener(BaseDatabaseUpgradeData var1);

    public void removeDatabaseUpgradeListener(UpgradeDatabaseListener var1);
}

