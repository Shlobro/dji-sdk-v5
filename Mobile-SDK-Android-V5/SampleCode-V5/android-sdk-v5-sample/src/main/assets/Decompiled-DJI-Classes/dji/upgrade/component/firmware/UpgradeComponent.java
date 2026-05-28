/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.upgrade.component.firmware;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.upgrade.CommonCallbacks;
import dji.upgrade.component.firmware.UpgradeFirmwareListener;
import dji.upgrade.component.firmware.model.ComponentType;
import dji.upgrade.component.firmware.model.FirmwareSubModuleUpgradeInformation;
import dji.upgrade.component.firmware.model.FirmwareUpgradeStateCheckInfo;
import dji.upgrade.component.firmware.model.UpgradeConfigFileInformation;
import dji.upgrade.component.firmware.model.UpgradeFirmwareInformation;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;
import dji.upgrade.generate.ImageSwitchRequestCallback;
import dji.upgrade.generate.ImageTotalInformation;
import dji.upgrade.generate.ImageType;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface UpgradeComponent {
    public void addUpgradeFirmwareListener(@NonNull UpgradeFirmwareListener var1);

    public void removeUpgradeFirmwareListener(@NonNull UpgradeFirmwareListener var1);

    public void removeAllUpgradeFirmwareListener();

    public void addImageSwitchRequestListener(@NonNull ImageSwitchRequestCallback var1);

    public void removeImageSwitchRequestListener(@NonNull ImageSwitchRequestCallback var1);

    public void startDownloadFirmware(CommonCallbacks.CompletionCallback var1);

    public void startDownloadFirmware(@NonNull String var1, CommonCallbacks.CompletionCallback var2);

    public void stopDownloadFirmware(CommonCallbacks.CompletionCallback var1);

    public void startUpgradeFirmware(CommonCallbacks.CompletionCallback var1);

    public void startUpgradeFirmware(@NonNull String var1, CommonCallbacks.CompletionCallback var2);

    public void startUpgradeFirmwareTransferTest(CommonCallbacks.CompletionCallback var1);

    public void startUpgradeFirmwareTransferTest(@NonNull String var1, CommonCallbacks.CompletionCallback var2);

    public void confirmUpgradeConsistent(boolean var1, CommonCallbacks.CompletionCallback var2);

    public void checkFirmwareUpgradeState(CommonCallbacks.CompletionCallback var1);

    public void checkFirmwareUpgradeState(CommonCallbacks.CompletionCallbackWithTwoParam<UpgradeFirmwareState, String> var1);

    public void fetchInstalledImageInformations(CommonCallbacks.CompletionCallbackWith<ImageTotalInformation> var1);

    public void cancelImageSwitchRequest(CommonCallbacks.CompletionCallback var1);

    public void triggerImageSwitch(ImageType var1, CommonCallbacks.CompletionCallback var2);

    public void fetchFirmwareInformation(@NonNull String var1, CommonCallbacks.CompletionCallbackWith<UpgradeFirmwareInformation> var2);

    public void fetchSubModuleFirmwareInformation(@NonNull String var1, CommonCallbacks.CompletionCallbackWith<ArrayList<FirmwareSubModuleUpgradeInformation>> var2);

    public void fetchDeviceUpgradeConfigFileInformation(CommonCallbacks.CompletionCallbackWith<UpgradeConfigFileInformation> var1);

    public void fetchUpgradeLog(CommonCallbacks.CompletionCallbackWith<byte[]> var1);

    public void checkFirmwareDownloadedState(String var1, CommonCallbacks.CompletionCallbackWith<Boolean> var2);

    public void fetchVersionList(CommonCallbacks.CompletionCallback var1);

    public FirmwareUpgradeStateCheckInfo getFirmwareUpgradeStateCheckInfo();

    public void checkUpgradableStatus(CommonCallbacks.CompletionCallbackWithErrors var1);

    public Map<NativeObjects.UpgradeComponentProductType, Integer> getBatteryThresholdInPercentage();

    @Nullable
    public String getUpgradeVersion();

    @Nullable
    public UpgradeFirmwareInformation getFirmwareInformation();

    @Nullable
    public String getDeviceMainVersion();

    @Nullable
    public List<String> getAllFirmwareVersions();

    @Nullable
    public String getCurrentDownloadingFirmwareVersion();

    @Nullable
    public String getCurrentUpgradingFirmwareVersion();

    public ComponentType getUpgradeComponentType();

    public UpgradeFirmwareState getUpgradeState();

    public NativeObjects.UpgradeComponentProductType getUpgradeComponentProductType();

    public int getUpgradeComponentUuid();

    public int getUpgradeDeviceId();

    public void activeSendConsistentCheck(CommonCallbacks.CompletionCallback var1);

    public String getDongleId();

    public void triggerDongleUpgrade();
}

