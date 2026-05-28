/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.database.model.DatabaseUpgradeProgress;
import dji.upgrade.component.database.model.DatabaseUpgradingProcessState;

public class DatabaseUpgradeProgressImpl
implements DatabaseUpgradeProgress {
    private final float progress;
    private final String version;
    private final DatabaseUpgradingProcessState processState;
    private final UpgradeError error;

    private DatabaseUpgradeProgressImpl(Builder builder) {
    }

    @Override
    public float getProgress() {
        return 0.0f;
    }

    @Override
    public DatabaseUpgradingProcessState getState() {
        return null;
    }

    @Override
    public UpgradeError getError() {
        return null;
    }

    @Override
    public String getVersion() {
        return null;
    }

    /* synthetic */ DatabaseUpgradeProgressImpl(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private float progress;
        private String version;
        private DatabaseUpgradingProcessState processState;
        private UpgradeError error;

        public Builder progress(float f2) {
            return null;
        }

        public Builder version(String string2) {
            return null;
        }

        public Builder processState(DatabaseUpgradingProcessState databaseUpgradingProcessState) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public DatabaseUpgradeProgressImpl build() {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ DatabaseUpgradingProcessState access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ UpgradeError access$300(Builder builder) {
            return null;
        }
    }
}

