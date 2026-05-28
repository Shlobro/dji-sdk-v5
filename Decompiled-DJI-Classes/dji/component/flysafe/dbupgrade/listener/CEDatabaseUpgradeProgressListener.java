/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

import dji.component.flysafe.dbupgrade.model.FlysafeDataUpgradeModelWrapper;

public interface CEDatabaseUpgradeProgressListener {
    public void onStateChange(FlysafeDataUpgradeModelWrapper.CEDatabaseUpgradeProgressWrapper var1);
}

