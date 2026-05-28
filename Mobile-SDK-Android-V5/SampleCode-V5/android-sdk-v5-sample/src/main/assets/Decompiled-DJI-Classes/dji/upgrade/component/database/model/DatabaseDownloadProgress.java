/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.database.model;

import dji.upgrade.UpgradeError;
import dji.upgrade.component.database.model.DatabaseDownloadingProcessState;
import dji.upgrade.component.database.model.DatabaseType;

public interface DatabaseDownloadProgress {
    public float getProgress();

    public DatabaseDownloadingProcessState getState();

    public UpgradeError getError();

    public String getVersion();

    public DatabaseType getType();
}

