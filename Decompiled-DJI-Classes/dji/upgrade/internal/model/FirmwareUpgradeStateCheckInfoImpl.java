/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.upgrade.internal.model;

import androidx.annotation.NonNull;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.model.FirmwareUpgradeStateCheckInfo;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;

public class FirmwareUpgradeStateCheckInfoImpl
implements FirmwareUpgradeStateCheckInfo {
    private final UpgradeFirmwareState state;
    private final UpgradeError error;

    public FirmwareUpgradeStateCheckInfoImpl(UpgradeFirmwareState upgradeFirmwareState, UpgradeError upgradeError) {
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    @Override
    @NonNull
    public UpgradeFirmwareState getState() {
        return null;
    }

    @Override
    public UpgradeError getError() {
        return null;
    }
}

