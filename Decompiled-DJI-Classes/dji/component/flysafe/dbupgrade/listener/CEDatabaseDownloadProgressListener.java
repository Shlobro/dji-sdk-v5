/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.model.FlysafeDataUpgradeModelWrapper;

public interface CEDatabaseDownloadProgressListener {
    public void onStateChange(FlysafeDataUpgradeModelWrapper.CEDatabaseDownloadProgressWrapper var1);
}

