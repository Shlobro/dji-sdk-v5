/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.model.DatabaseUpgradeCheckState;

public interface DatabaseUpgradeCheckStateModel {
    public DatabaseUpgradeCheckState getAppState();

    public DatabaseUpgradeCheckState getAircraftState();

    public String getAppDbVersion();

    public String getAircraftDbVersion();
}

