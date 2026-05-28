/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.model.DatabaseType;
import dji.component.flysafe.dbupgrade.model.DatabaseUpgradingProcessState;

public interface DatabaseUpgradeProgress {
    public float getProgress();

    public DatabaseUpgradingProcessState getState();

    public int getError();

    public String getVersion();

    public DatabaseType getType();
}

