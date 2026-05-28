/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.upgrade.component.firmware.model;

import androidx.annotation.NonNull;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.model.FirmwareDecompressProgress;
import dji.upgrade.component.firmware.model.FirmwareDownloadProgress;
import dji.upgrade.component.firmware.model.FirmwareDownloadingProcessState;
import dji.upgrade.component.firmware.model.FirmwareUpgradeProgress;
import dji.upgrade.component.firmware.model.FirmwareUpgradeStateCheckInfo;
import dji.upgrade.component.firmware.model.FirmwareUpgradingProcessState;

public class UpgradeMultiComponentsCallbacks {

    public static interface UpgradeTotalDecompressProgressCallback {
        public void onUpgradeTotalDecompressProgressUpdated(@NonNull FirmwareDecompressProgress var1);
    }

    public static interface UpgradeTotalUpgradeProgressCallback {
        public void onUpgradeTotalUpgradeProgressUpdated(@NonNull UpgradeComponent var1, @NonNull FirmwareUpgradeProgress var2, FirmwareUpgradingProcessState var3);
    }

    public static interface UpgradeTotalDownloadProgressCallback {
        public void onUpgradeTotalDownloadProgressUpated(@NonNull UpgradeComponent var1, @NonNull FirmwareDownloadProgress var2, FirmwareDownloadingProcessState var3);
    }

    public static interface UpgradeTotalStateCallback {
        public void onUpgradeTotalStateUpdated(@NonNull FirmwareUpgradeStateCheckInfo var1);
    }
}

