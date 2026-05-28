/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.database.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.database.model.DatabaseUpgradingProcessState;

public interface DatabaseUpgradeProgress {
    public float getProgress();

    public DatabaseUpgradingProcessState getState();

    public UpgradeError getError();

    public String getVersion();
}

