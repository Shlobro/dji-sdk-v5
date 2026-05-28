/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.upgrade.component.firmware;

import androidx.annotation.NonNull;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.model.FirmwareDownloadProgress;
import dji.upgrade.component.firmware.model.FirmwareSubModuleUpgradeInformation;
import dji.upgrade.component.firmware.model.FirmwareUpgradeProgress;
import dji.upgrade.component.firmware.model.FirmwareUpgradeStateCheckInfo;
import java.util.ArrayList;

public interface UpgradeFirmwareListener {
    public void onUpgradeFirmwareStateUpdated(@NonNull UpgradeComponent var1, @NonNull FirmwareUpgradeStateCheckInfo var2);

    public void onFirmwareUpgradeProgressUpdated(@NonNull UpgradeComponent var1, @NonNull FirmwareUpgradeProgress var2);

    public void onFirmwareSubModuleUpgradeProgressUpdated(@NonNull UpgradeComponent var1, @NonNull ArrayList<FirmwareSubModuleUpgradeInformation> var2);

    @Deprecated
    public void onFirmwareDownloadProgressUpdated(@NonNull UpgradeComponent var1, @NonNull FirmwareDownloadProgress var2);

    public void onUpgradeConsistentUpdated(@NonNull UpgradeComponent var1, boolean var2);
}

