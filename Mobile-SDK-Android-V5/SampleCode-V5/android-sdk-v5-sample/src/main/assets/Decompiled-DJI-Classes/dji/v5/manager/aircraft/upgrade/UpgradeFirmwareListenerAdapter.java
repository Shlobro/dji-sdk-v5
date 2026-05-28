/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.jetbrains.annotations.NotNull
 */
package dji.v5.manager.aircraft.upgrade;

import androidx.annotation.NonNull;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.UpgradeFirmwareListener;
import dji.upgrade.component.firmware.model.FirmwareDownloadProgress;
import dji.upgrade.component.firmware.model.FirmwareSubModuleUpgradeInformation;
import dji.upgrade.component.firmware.model.FirmwareUpgradeProgress;
import dji.upgrade.component.firmware.model.FirmwareUpgradeStateCheckInfo;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

public class UpgradeFirmwareListenerAdapter
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
    public void onUpgradeConsistentUpdated(@NonNull @NotNull UpgradeComponent upgradeComponent, boolean bl) {
    }

    @Override
    public void onFirmwareSubModuleUpgradeProgressUpdated(@NonNull UpgradeComponent upgradeComponent, @NonNull ArrayList<FirmwareSubModuleUpgradeInformation> arrayList) {
    }
}

