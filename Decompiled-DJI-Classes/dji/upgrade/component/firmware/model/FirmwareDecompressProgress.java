/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.FloatRange
 */
package dji.upgrade.component.firmware.model;

import androidx.annotation.FloatRange;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareDecompressingProcessState;

public interface FirmwareDecompressProgress {
    @FloatRange(from=0.0, to=1.0)
    public float getProgress();

    public FirmwareDecompressingProcessState getState();

    public UpgradeError getError();
}

