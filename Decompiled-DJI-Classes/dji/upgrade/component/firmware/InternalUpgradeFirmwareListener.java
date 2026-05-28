/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.upgrade.component.firmware;

import androidx.annotation.NonNull;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.UpgradeFirmwareListener;
import dji.upgrade.component.firmware.model.FirmwareDownloadProgress;
import dji.upgrade.component.firmware.model.FirmwareUpgradeProgress;
import dji.upgrade.component.firmware.model.FirmwareUpgradeStateCheckInfo;
import dji.upgrade.internal.model.FirmwareDownloadProgressImpl;
import dji.upgrade.internal.model.FirmwareUpgradeProgressImpl;
import dji.upgrade.internal.model.FirmwareUpgradeStateCheckInfoImpl;

public abstract class InternalUpgradeFirmwareListener
implements UpgradeFirmwareListener {
    @Override
    public void onUpgradeFirmwareStateUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull FirmwareUpgradeStateCheckInfo firmwareUpgradeStateCheckInfo) {
    }

    @Override
    public void onFirmwareUpgradeProgressUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull FirmwareUpgradeProgress firmwareUpgradeProgress) {
    }

    @Override
    public void onFirmwareDownloadProgressUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull FirmwareDownloadProgress firmwareDownloadProgress) {
    }

    @Override
    public void onUpgradeConsistentUpdated(@NonNull UpgradeComponent upgradeComponent, boolean bl) {
    }

    public abstract void onUpgradeFirmwareStateUpdated(@NonNull FirmwareUpgradeStateCheckInfoImpl var1);

    public abstract void onFirmwareUpgradeProgressUpdated(@NonNull FirmwareUpgradeProgressImpl var1);

    public abstract void onFirmwareDownloadProgressUpdated(@NonNull FirmwareDownloadProgressImpl var1);

    public abstract void onUpgradeConsistentUpdated(boolean var1);
}

