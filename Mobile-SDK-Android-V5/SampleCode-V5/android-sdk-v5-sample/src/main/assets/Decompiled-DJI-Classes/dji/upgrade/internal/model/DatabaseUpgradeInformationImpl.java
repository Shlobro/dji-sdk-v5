/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.component.database.model.DatabaseUpgradeInformation;

public class DatabaseUpgradeInformationImpl
implements DatabaseUpgradeInformation {
    private String appDbVersion;
    private String aircraftDbVersion;

    private DatabaseUpgradeInformationImpl() {
    }

    @Override
    public String getAppDbVersion() {
        return null;
    }

    @Override
    public String getAircraftDbVersion() {
        return null;
    }

    /* synthetic */ DatabaseUpgradeInformationImpl(1 var1_1) {
    }

    static /* synthetic */ String access$102(DatabaseUpgradeInformationImpl databaseUpgradeInformationImpl, String string2) {
        return null;
    }

    static /* synthetic */ String access$202(DatabaseUpgradeInformationImpl databaseUpgradeInformationImpl, String string2) {
        return null;
    }

    public static final class Builder {
        public String appDbVersion;
        public String aircraftDbVersion;

        private Builder() {
        }

        public static Builder DatabaseUpgradeInformationImpl() {
            return null;
        }

        public Builder appDbVersion(String string2) {
            return null;
        }

        public Builder aircraftDbVersion(String string2) {
            return null;
        }

        public DatabaseUpgradeInformationImpl build() {
            return null;
        }
    }
}

