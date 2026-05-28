/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.upgrade.internal.component;

import androidx.annotation.NonNull;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.UpgradeExternalComponents;
import dji.upgrade.component.firmware.model.UpgradeDynamicComponentChangeState;
import dji.upgrade.internal.component.UpgradeComponentImpl;
import dji.upgrade.internal.csdk.upgradeadapter.model.DownloadProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.InternalFirmwareInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.LastestFirmwareInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import dji.upgrade.internal.csdk.upgradeadapter.model.ServerVersionInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeStateCheckInformation;
import java.util.ArrayList;
import java.util.HashMap;

public class UpgradeExternalComponentsImpl
implements UpgradeExternalComponents {
    private HashMap<NativeObjects.UpgradeComponentProductType, UpgradeComponentImpl> externalComponents;

    @Override
    @NonNull
    public ArrayList<UpgradeComponent> getUpgradeComponents() {
        return null;
    }

    public void updateExternalComponentsByMainComponent(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, UpgradeDynamicComponentChangeState upgradeDynamicComponentChangeState) {
    }

    public void setupCurrentComponentUpgradeState(@NonNull UpgradeStateCheckInformation upgradeStateCheckInformation) {
    }

    public void handleUpgradeProgress(@NonNull UpgradeProcessInformation upgradeProcessInformation) {
    }

    public void handleFirmwareDownloadProgress(@NonNull DownloadProcessInformation downloadProcessInformation) {
    }

    public void handleServerVersion(@NonNull ServerVersionInformation serverVersionInformation) {
    }

    public void handleLastestFirmwareInformation(@NonNull LastestFirmwareInformation lastestFirmwareInformation) {
    }

    public void handleDeviceFirmwareInfo(@NonNull InternalFirmwareInformation internalFirmwareInformation) {
    }

    private int getComponentUuid(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
        return 0;
    }
}

