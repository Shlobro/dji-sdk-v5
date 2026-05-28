/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.model.DatabaseDownloadingProcessState;
import dji.component.flysafe.dbupgrade.model.DatabaseType;

public interface DatabaseDownloadProgress {
    public float getProgress();

    public DatabaseDownloadingProcessState getState();

    public int getError();

    public String getVersion();

    public DatabaseType getType();
}

