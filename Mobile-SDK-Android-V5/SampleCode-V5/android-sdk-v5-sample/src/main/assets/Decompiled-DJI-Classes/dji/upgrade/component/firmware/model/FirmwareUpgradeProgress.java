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
import dji.upgrade.component.firmware.model.FirmwareUpgradeProcessStartType;
import dji.upgrade.component.firmware.model.FirmwareUpgradingProcessState;
import dji.upgrade.generate.ImageType;

public interface FirmwareUpgradeProgress {
    @FloatRange(from=0.0, to=1.0)
    public float getProgress();

    @Nullable
    public FirmwareUpgradingProcessState getState();

    @Nullable
    public UpgradeError getError();

    @Nullable
    public String getVersion();

    @Nullable
    public FirmwareUpgradeProcessStartType getStartType();

    @Nullable
    public ImageType getImageType();
}

