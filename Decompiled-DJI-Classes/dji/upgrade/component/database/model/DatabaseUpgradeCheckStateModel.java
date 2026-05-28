/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.database.model;

import dji.upgrade.component.database.model.DatabaseUpgradeCheckState;

public interface DatabaseUpgradeCheckStateModel {
    public DatabaseUpgradeCheckState getAppState();

    public DatabaseUpgradeCheckState getAircraftState();

    public String getAppDbVersion();

    public String getAircraftDbVersion();
}

