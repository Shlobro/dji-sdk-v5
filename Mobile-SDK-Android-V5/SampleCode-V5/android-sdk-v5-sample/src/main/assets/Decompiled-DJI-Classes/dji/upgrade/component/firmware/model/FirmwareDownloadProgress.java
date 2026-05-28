/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.FloatRange
 */
package dji.upgrade.component.firmware.model;

import androidx.annotation.FloatRange;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareDownloadingProcessState;

public interface FirmwareDownloadProgress {
    @FloatRange(from=0.0, to=1.0)
    public float getProgress();

    public FirmwareDownloadingProcessState getState();

    public UpgradeError getError();

    public String getVersion();
}

