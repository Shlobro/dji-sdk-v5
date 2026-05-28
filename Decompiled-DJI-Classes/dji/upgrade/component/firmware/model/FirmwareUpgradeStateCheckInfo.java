/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.upgrade.component.firmware.model;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;

public interface FirmwareUpgradeStateCheckInfo {
    @NonNull
    public UpgradeFirmwareState getState();

    @Nullable
    public UpgradeError getError();
}

