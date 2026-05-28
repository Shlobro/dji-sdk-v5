/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.database;

import dji.upgrade.component.database.model.DatabaseDownloadProgress;
import dji.upgrade.component.database.model.DatabaseUpgradeCheckStateModel;
import dji.upgrade.component.database.model.DatabaseUpgradeProgress;

public interface UpgradeDatabaseListener {
    public void onUpgradeStateUpdated(DatabaseUpgradeCheckStateModel var1);

    public void onDownloadProgressUpdated(DatabaseDownloadProgress var1);

    public void onUpgradeProgressUpdated(DatabaseUpgradeProgress var1);
}

