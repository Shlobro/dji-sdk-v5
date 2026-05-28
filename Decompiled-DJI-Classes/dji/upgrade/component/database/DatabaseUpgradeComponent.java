/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.database;

import dji.upgrade.CommonCallbacks;
import dji.upgrade.component.database.UpgradeDatabaseListener;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public interface DatabaseUpgradeComponent {
    public void addDatabaseUpgradeListener(UpgradeDatabaseListener var1);

    public void removeDatabaseUpgradeListener(UpgradeDatabaseListener var1);

    public void removeAllDatabaseUpgradeListener();

    public void startUpgradeDatabase(String var1, NativeObjects.UpgradeComponentProductType var2, CommonCallbacks.CompletionCallback var3);
}

