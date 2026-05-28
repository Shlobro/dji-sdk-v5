/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.database.model.DatabaseDownloadProgress;
import dji.upgrade.component.database.model.DatabaseDownloadingProcessState;
import dji.upgrade.component.database.model.DatabaseType;

public class DatabaseDownloadProgressImpl
implements DatabaseDownloadProgress {
    private float progress;
    private DatabaseDownloadingProcessState state;
    private UpgradeError error;
    private String version;
    public DatabaseType type;

    private DatabaseDownloadProgressImpl() {
    }

    @Override
    public float getProgress() {
        return 0.0f;
    }

    @Override
    public DatabaseDownloadingProcessState getState() {
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

    @Override
    public DatabaseType getType() {
        return null;
    }

    /* synthetic */ DatabaseDownloadProgressImpl(1 var1_1) {
    }

    static /* synthetic */ String access$102(DatabaseDownloadProgressImpl databaseDownloadProgressImpl, String string2) {
        return null;
    }

    static /* synthetic */ float access$202(DatabaseDownloadProgressImpl databaseDownloadProgressImpl, float f2) {
        return 0.0f;
    }

    static /* synthetic */ UpgradeError access$302(DatabaseDownloadProgressImpl databaseDownloadProgressImpl, UpgradeError upgradeError) {
        return null;
    }

    static /* synthetic */ DatabaseDownloadingProcessState access$402(DatabaseDownloadProgressImpl databaseDownloadProgressImpl, DatabaseDownloadingProcessState databaseDownloadingProcessState) {
        return null;
    }

    public static final class Builder {
        private float progress;
        private DatabaseDownloadingProcessState state;
        private UpgradeError error;
        private String version;
        private DatabaseType type;

        private Builder() {
        }

        public static Builder DatabaseDownloadProgressImpl() {
            return null;
        }

        public Builder progress(float f2) {
            return null;
        }

        public Builder state(DatabaseDownloadingProcessState databaseDownloadingProcessState) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public Builder version(String string2) {
            return null;
        }

        public Builder type(DatabaseType databaseType) {
            return null;
        }

        public DatabaseDownloadProgressImpl build() {
            return null;
        }
    }
}

