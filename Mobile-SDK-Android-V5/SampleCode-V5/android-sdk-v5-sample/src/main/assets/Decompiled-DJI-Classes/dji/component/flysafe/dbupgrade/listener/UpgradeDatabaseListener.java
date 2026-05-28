/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.listener.DatabaseDownloadProgress;
import dji.component.flysafe.dbupgrade.listener.DatabaseUpgradeCheckStateModel;
import dji.component.flysafe.dbupgrade.listener.DatabaseUpgradeProgress;

public interface UpgradeDatabaseListener {
    public void onUpgradeStateUpdated(DatabaseUpgradeCheckStateModel var1);

    public void onDownloadProgressUpdated(DatabaseDownloadProgress var1);

    public void onUpgradeProgressUpdated(DatabaseUpgradeProgress var1);
}

