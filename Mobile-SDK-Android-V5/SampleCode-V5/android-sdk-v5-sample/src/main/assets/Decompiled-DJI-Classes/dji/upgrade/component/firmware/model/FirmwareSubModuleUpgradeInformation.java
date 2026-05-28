/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.FloatRange
 *  androidx.annotation.Nullable
 */
package dji.upgrade.component.firmware.model;

import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareUpgradingProcessState;

public interface FirmwareSubModuleUpgradeInformation {
    @FloatRange(from=0.0, to=1.0)
    public float getProgress();

    public int getModuleId();

    public int getHostType();

    public int getHostIndex();

    public String getModuleType();

    @Nullable
    public FirmwareUpgradingProcessState getState();

    @Nullable
    public UpgradeError getError();

    @Nullable
    public String getVersion();
}

