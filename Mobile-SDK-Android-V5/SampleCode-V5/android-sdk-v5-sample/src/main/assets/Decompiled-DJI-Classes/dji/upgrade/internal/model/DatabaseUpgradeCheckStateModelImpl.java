/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.component.database.model.DatabaseUpgradeCheckState;
import dji.upgrade.component.database.model.DatabaseUpgradeCheckStateModel;

public class DatabaseUpgradeCheckStateModelImpl
implements DatabaseUpgradeCheckStateModel {
    public DatabaseUpgradeCheckState appState;
    public DatabaseUpgradeCheckState aircraftState;
    public String appDbVersion;
    public String aircraftDbVersion;

    @Override
    public DatabaseUpgradeCheckState getAppState() {
        return null;
    }

    @Override
    public DatabaseUpgradeCheckState getAircraftState() {
        return null;
    }

    @Override
    public String getAppDbVersion() {
        return null;
    }

    @Override
    public String getAircraftDbVersion() {
        return null;
    }
}

