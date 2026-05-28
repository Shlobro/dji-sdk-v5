/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.component;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.remotecontroller.RemoteControllerType;
import dji.upgrade.CommonCallbacks;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.UpgradeFirmwareListener;
import dji.upgrade.component.firmware.model.ComponentType;
import dji.upgrade.component.firmware.model.FirmwareSubModuleUpgradeInformation;
import dji.upgrade.component.firmware.model.FirmwareUpgradeStateCheckInfo;
import dji.upgrade.component.firmware.model.UpgradeConfigFileInformation;
import dji.upgrade.component.firmware.model.UpgradeFirmwareInformation;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;
import dji.upgrade.generate.ImageSwitchRequestCallback;
import dji.upgrade.generate.ImageSwitchRequestInformation;
import dji.upgrade.generate.ImageTotalInformation;
import dji.upgrade.generate.ImageType;
import dji.upgrade.internal.csdk.upgradeadapter.UpgradeLogicAdapter;
import dji.upgrade.internal.csdk.upgradeadapter.model.ConsistentUpgradeRequestInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.DecompressProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.DownloadProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.LastestFirmwareInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import dji.upgrade.internal.csdk.upgradeadapter.model.ServerVersionInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeCheckInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradePushInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeStateCheckInformation;
import dji.upgrade.internal.model.CacheDeviceFirmwareCheckInfoImpl;
import dji.upgrade.internal.model.FirmwareDecompressProgressImpl;
import dji.upgrade.internal.model.FirmwareDownloadProgressImpl;
import dji.upgrade.internal.model.FirmwareSubModuleUpgradeInformationImpl;
import dji.upgrade.internal.model.FirmwareUpgradeProgressImpl;
import dji.upgrade.internal.model.FirmwareUpgradeStateCheckInfoImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class UpgradeComponentImpl
implements UpgradeComponent {
    private static final String TAG = "[\u5347\u7ea7\u65e5\u5fd7]UpgradeComponentImpl";
    private ComponentType componentType;
    protected UpgradeLogicAdapter upgradeLogicAdapter;
    private String currentDownloadingFirmwareVersion;
    private String currentUpgradingFirmwareVersion;
    private List<String> allFirmwareVersions;
    private CopyOnWriteArrayList<UpgradeFirmwareListener> listeners;
    private CopyOnWriteArrayList<ImageSwitchRequestCallback> imageSwitchRequestCallbackListeners;
    private FirmwareUpgradeStateCheckInfoImpl checkInfo;
    private UpgradeFirmwareInformation lastFirmwareInformation;
    private UpgradeFirmwareInformation deviceFirmwareInformation;
    private UpgradeFirmwareInformation firmwareInformation;
    private String upgradeVersion;
    private boolean canCancelConsistentUpgrading;
    public String dongleId;
    public boolean dongleUpgrading;
    public NativeObjects.UpgradeComponentProductType internalUpgradeProductType;
    public NativeObjects.UpgradeComponentDynamicState dynamicState;
    public int componentUuid;
    public long deviceId;
    public FirmwareDownloadProgressImpl downloadProgress;
    public FirmwareDecompressProgressImpl decompressProgress;
    public FirmwareUpgradeProgressImpl upgradeProgress;
    private CountDownLatch cl;
    private NativeObjects.UpgradeComponentProductType componentProductType;

    public UpgradeComponentImpl(@NonNull ComponentType componentType) {
    }

    public void init() {
    }

    public void destroy() {
    }

    public void init(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n) {
    }

    public void setupCurrentComponentUpgradeState(@NonNull UpgradeStateCheckInformation upgradeStateCheckInformation) {
    }

    public void handleUpgradeProgress(@NonNull UpgradeProcessInformation upgradeProcessInformation) {
    }

    public void handleUpgradeSubModulesProgress(@NonNull ArrayList<FirmwareSubModuleUpgradeInformationImpl> arrayList) {
    }

    public void handleFirmwareDownloadProgress(@NonNull DownloadProcessInformation downloadProcessInformation) {
    }

    public void handleFirmwareDecompressProgress(@NonNull DecompressProcessInformation decompressProcessInformation) {
    }

    public void handleServerVersion(@NonNull ServerVersionInformation serverVersionInformation) {
    }

    @Override
    public NativeObjects.UpgradeComponentProductType getUpgradeComponentProductType() {
        return null;
    }

    public void handleLastestFirmwareInformation(@NonNull LastestFirmwareInformation lastestFirmwareInformation) {
    }

    public void handleUpgradePushState(UpgradePushInformation upgradePushInformation) {
    }

    public void handleConsistentUpgradeRequestInfo(ConsistentUpgradeRequestInformation consistentUpgradeRequestInformation) {
    }

    public void handleImageSwitchRequestInfo(ImageSwitchRequestInformation imageSwitchRequestInformation) {
    }

    public void handleDeviceFirmwareInfo(UpgradeFirmwareInformation upgradeFirmwareInformation) {
    }

    @Override
    public void addUpgradeFirmwareListener(@NonNull UpgradeFirmwareListener upgradeFirmwareListener) {
    }

    @Override
    public void removeUpgradeFirmwareListener(@NonNull UpgradeFirmwareListener upgradeFirmwareListener) {
    }

    @Override
    public void removeAllUpgradeFirmwareListener() {
    }

    @Override
    public void addImageSwitchRequestListener(@NonNull ImageSwitchRequestCallback imageSwitchRequestCallback) {
    }

    @Override
    public void removeImageSwitchRequestListener(@NonNull ImageSwitchRequestCallback imageSwitchRequestCallback) {
    }

    public void getDownloadedProgress(String string2, @Nullable CommonCallbacks.CompletionCallbackWith<Float> completionCallbackWith) {
    }

    @Override
    public void startDownloadFirmware(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startDownloadFirmware(@NonNull String string2, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopDownloadFirmware(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startUpgradeFirmware(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startUpgradeFirmware(@NonNull String string2, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startUpgradeFirmwareTransferTest(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startUpgradeFirmwareTransferTest(@NonNull String string2, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void startUpgradeFirmware(@NonNull ArrayList<String> arrayList, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void confirmUpgradeConsistent(boolean bl, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void fetchInstalledImageInformations(CommonCallbacks.CompletionCallbackWith<ImageTotalInformation> completionCallbackWith) {
    }

    @Override
    public void cancelImageSwitchRequest(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void triggerImageSwitch(ImageType imageType, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void checkFirmwareUpgradeState(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void checkFirmwareUpgradeState(@Nullable CommonCallbacks.CompletionCallbackWithTwoParam<UpgradeFirmwareState, String> completionCallbackWithTwoParam) {
    }

    @Override
    public void fetchFirmwareInformation(@NonNull String string2, @NonNull CommonCallbacks.CompletionCallbackWith<UpgradeFirmwareInformation> completionCallbackWith) {
    }

    @Override
    public void fetchUpgradeLog(@NonNull CommonCallbacks.CompletionCallbackWith<byte[]> completionCallbackWith) {
    }

    @Override
    public void checkFirmwareDownloadedState(@NonNull String string2, @NonNull CommonCallbacks.CompletionCallbackWith<Boolean> completionCallbackWith) {
    }

    @Override
    public void fetchVersionList(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void fetchSubModuleFirmwareInformation(@NonNull String string2, CommonCallbacks.CompletionCallbackWith<ArrayList<FirmwareSubModuleUpgradeInformation>> completionCallbackWith) {
    }

    @Override
    public void fetchDeviceUpgradeConfigFileInformation(CommonCallbacks.CompletionCallbackWith<UpgradeConfigFileInformation> completionCallbackWith) {
    }

    @Override
    public FirmwareUpgradeStateCheckInfo getFirmwareUpgradeStateCheckInfo() {
        return null;
    }

    @Override
    public void checkUpgradableStatus(CommonCallbacks.CompletionCallbackWithErrors completionCallbackWithErrors) {
    }

    public HashMap<NativeObjects.UpgradeComponentProductType, Integer> getBatteryThresholdInPercentage() {
        return null;
    }

    @Override
    public String getUpgradeVersion() {
        return null;
    }

    @Override
    @Nullable
    public UpgradeFirmwareInformation getFirmwareInformation() {
        return null;
    }

    @Override
    public String getDeviceMainVersion() {
        return null;
    }

    @Override
    @Nullable
    public List<String> getAllFirmwareVersions() {
        return null;
    }

    @Override
    @Nullable
    public String getCurrentDownloadingFirmwareVersion() {
        return null;
    }

    @Override
    @Nullable
    public String getCurrentUpgradingFirmwareVersion() {
        return null;
    }

    @Override
    public ComponentType getUpgradeComponentType() {
        return null;
    }

    @Override
    public UpgradeFirmwareState getUpgradeState() {
        return null;
    }

    @Override
    public int getUpgradeComponentUuid() {
        return 0;
    }

    @Override
    public int getUpgradeDeviceId() {
        return 0;
    }

    @Override
    public String getDongleId() {
        return null;
    }

    @Override
    public void triggerDongleUpgrade() {
    }

    @Override
    public void activeSendConsistentCheck(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private boolean isCurrentConsistentUpgradeAvailable() {
        return false;
    }

    private boolean getCurrentUpgradeComponentProductType() {
        return false;
    }

    private void updateUpgradeVersionAndState(@NonNull UpgradeStateCheckInformation upgradeStateCheckInformation) {
    }

    private void updateUpgradeVersionAndState(@NonNull UpgradeCheckInformation upgradeCheckInformation) {
    }

    private void updateUpgradeState(@NonNull FirmwareUpgradeStateCheckInfoImpl firmwareUpgradeStateCheckInfoImpl) {
    }

    private CacheDeviceFirmwareCheckInfoImpl getCacheDeviceFirmwareCheckInfoImpl(@NonNull UpgradeCheckInformation upgradeCheckInformation) {
        return null;
    }

    private void updateCacheDeviceCheckInfo(@NonNull UpgradeCheckInformation upgradeCheckInformation) {
    }

    private void getCurrentCacheUpgradeProductType(CommonCallbacks.CompletionCallbackWith<NativeObjects.UpgradeComponentProductType> completionCallbackWith) {
    }

    private void getCurrentConnectUpgradeProductType(CommonCallbacks.CompletionCallbackWith<NativeObjects.UpgradeComponentProductType> completionCallbackWith) {
    }

    @Nullable
    private RemoteControllerType getRCDisplayName(@Nullable NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
        return null;
    }

    private NativeObjects.UpgradeStatePushComponentType getUpgradeStatePushComponentType() {
        return null;
    }

    private void notifyListeners(FirmwareUpgradeProgressImpl firmwareUpgradeProgressImpl) {
    }

    private void notifyListeners(FirmwareDownloadProgressImpl firmwareDownloadProgressImpl) {
    }

    private void notifyListeners(FirmwareDecompressProgressImpl firmwareDecompressProgressImpl) {
    }

    private void notifyListeners(FirmwareUpgradeStateCheckInfo firmwareUpgradeStateCheckInfo) {
    }

    private void notifyListenersUpgradeConsistentState(boolean bl) {
    }

    private void notifyListenersImageSwtichRequest(ImageSwitchRequestInformation imageSwitchRequestInformation) {
    }

    private void initData() {
    }

    static /* synthetic */ String access$002(UpgradeComponentImpl upgradeComponentImpl, String string2) {
        return null;
    }

    static /* synthetic */ UpgradeFirmwareInformation access$100(UpgradeComponentImpl upgradeComponentImpl) {
        return null;
    }

    static /* synthetic */ String access$202(UpgradeComponentImpl upgradeComponentImpl, String string2) {
        return null;
    }

    static /* synthetic */ void access$300(UpgradeComponentImpl upgradeComponentImpl, UpgradeStateCheckInformation upgradeStateCheckInformation) {
    }

    static /* synthetic */ void access$400(UpgradeComponentImpl upgradeComponentImpl, FirmwareUpgradeStateCheckInfoImpl firmwareUpgradeStateCheckInfoImpl) {
    }

    static /* synthetic */ List access$502(UpgradeComponentImpl upgradeComponentImpl, List list) {
        return null;
    }

    static /* synthetic */ NativeObjects.UpgradeComponentProductType access$602(UpgradeComponentImpl upgradeComponentImpl, NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
        return null;
    }

    static /* synthetic */ CountDownLatch access$700(UpgradeComponentImpl upgradeComponentImpl) {
        return null;
    }
}

