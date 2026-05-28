/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  io.reactivex.Observable
 *  io.reactivex.subjects.PublishSubject
 */
package dji.upgrade.internal.csdk.upgradeadapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.callback.IListenCallback;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.upgrade.CommonCallbacks;
import dji.upgrade.component.firmware.model.ComponentType;
import dji.upgrade.internal.csdk.upgradeadapter.model.ConsistentUpgradeRequestInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.DecompressProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.DownloadProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.InternalFirmwareInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.LastestFirmwareInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import dji.upgrade.internal.csdk.upgradeadapter.model.ServerVersionInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeCheckInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeComponentChangeInfomation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradePushInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeStateCheckInformation;
import dji.upgrade.internal.model.FirmwareSubModuleUpgradeInformationImpl;
import dji.upgrade.internal.model.UpgradeConfigFileInformationImpl;
import dji.upgrade.internal.model.UpgradeFirmwareInformationImpl;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class UpgradeLogicAdapter
implements IListenCallback {
    private static final int SUCCESS = 0;
    private PublishSubject<UpgradeProcessInformation> upgradeProcessInformationSubject;
    private PublishSubject<DownloadProcessInformation> downloadProcessInformationPublishSubject;
    private PublishSubject<DecompressProcessInformation> decompressProgressInformationPublishSubject;
    private PublishSubject<ServerVersionInformation> serverVersionInformationPublishSubject;
    private PublishSubject<LastestFirmwareInformation> lastestFirmwareInformationPublishSubject;
    private PublishSubject<UpgradePushInformation> upgradePushInformationPublishSubject;
    private PublishSubject<ConsistentUpgradeRequestInformation> consistentUpgradeRequestInformationPublishSubject;
    private PublishSubject<UpgradeStateCheckInformation> upgradeCheckInformationPublishSubject;
    private PublishSubject<InternalFirmwareInformation> upgradeDeviceInfomationPublishSubject;
    private Map<NativeObjects.UpgradeComponentProductType, String> upgradeComponentStateMap;
    private PublishSubject<ArrayList<FirmwareSubModuleUpgradeInformationImpl>> upgradeSubModuleInformationSubject;
    private PublishSubject<UpgradeComponentChangeInfomation> upgradeComponentChangeInfomationPublishSubject;
    private PublishSubject<UpgradeCheckInformation> upgradeComponentStatePublishSubject;
    private Map<String, UpgradeCheckInformation> upgradeComponentStateMap_New;
    private boolean isRCConnected;
    private boolean isDroneConnected;
    private boolean isCameraConnected;
    private ProductType productModel;
    private Context mContext;
    private static final String TAG = "[\u5347\u7ea7\u65e5\u5fd7]UpgradeLogicAdapter";
    private static final int CONNECTION_UPDATE_DELAY_TIME = 20;
    private final Set<NativeObjects.UpgradeComponentProductType> industryComponentTypes;

    public void init(@NonNull Context context) {
    }

    public void destroy() {
    }

    public void onPush(DJIKey dJIKey, Object object, Object object2) {
    }

    private void bindData() {
    }

    private void unBindData() {
    }

    @NonNull
    public Observable<UpgradeProcessInformation> getUpgradeProcessInformationObservable() {
        return null;
    }

    @NonNull
    public Observable<DownloadProcessInformation> getDownloadProcessInformationObservable() {
        return null;
    }

    @NonNull
    public Observable<DecompressProcessInformation> getDecompressProcessInformationObservable() {
        return null;
    }

    @NonNull
    public Observable<ServerVersionInformation> getServerVersionInformationObservable() {
        return null;
    }

    @NonNull
    public Observable<LastestFirmwareInformation> getLastestFirmwareInformationObservable() {
        return null;
    }

    public Observable<ArrayList<FirmwareSubModuleUpgradeInformationImpl>> getUpgradeSubModulesProcessInformationObservable() {
        return null;
    }

    @NonNull
    public Observable<UpgradePushInformation> getUpgradePushInformationPublishObservable() {
        return null;
    }

    @NonNull
    public Observable<ConsistentUpgradeRequestInformation> getConsistentUpgradeRequestInformationPublishObservable() {
        return null;
    }

    @NonNull
    public Observable<UpgradeStateCheckInformation> getUpgradeComponentStateObservable() {
        return null;
    }

    @NonNull
    public Map<NativeObjects.UpgradeComponentProductType, String> getUpgradeComponentStateMap() {
        return null;
    }

    public Observable<UpgradeComponentChangeInfomation> getUpgradeComponentChangeInfomationPublishObservable() {
        return null;
    }

    @NonNull
    public Observable<UpgradeCheckInformation> getUpgradeComponentCheckObservable() {
        return null;
    }

    @NonNull
    public Map<String, UpgradeCheckInformation> getUpgradeComponentStateMap_New() {
        return null;
    }

    @NonNull
    public Observable<InternalFirmwareInformation> getUpgradeDeviceInformationPublishSubject() {
        return null;
    }

    public void checkAllState(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, CommonCallbacks.CompletionCallbackWith<UpgradeStateCheckInformation> completionCallbackWith) {
    }

    public void fetchUpgradeLog(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, CommonCallbacks.CompletionCallbackWith<byte[]> completionCallbackWith) {
    }

    public void checkFirmwareDownloadedState(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, String string2, CommonCallbacks.CompletionCallbackWith<Boolean> completionCallbackWith) {
    }

    public void fetchServerVersions(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, CommonCallbacks.CompletionCallbackWith<String[]> completionCallbackWith) {
    }

    public void getDownloadedProgress(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, String string2, CommonCallbacks.CompletionCallbackWith<Float> completionCallbackWith) {
    }

    public void startDownloadFirmware(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void startDownloadFirmware(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void stopDownloadFirmware(CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void startUpgrade(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void startUpgradeMultiComponents(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void startUpgrade(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, String string2, boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void startUpgradeMultiComponents(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, String string2, boolean bl, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void startConsistentUpgrade(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, NativeObjects.ConsistentUpgradeResponseType consistentUpgradeResponseType, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void startUpgradeDatabase(long l2, String string2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void fetchFirmwareReleaseNoteAndSize(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, String string2, CommonCallbacks.CompletionCallbackWith<UpgradeFirmwareInformationImpl> completionCallbackWith) {
    }

    public void fetchDeviceConfigFileInformation(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, CommonCallbacks.CompletionCallbackWith<UpgradeConfigFileInformationImpl> completionCallbackWith) {
    }

    public void startUpgrade(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, String[] stringArray, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateDeviceVersionInfoReceivers(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, int[] nArray, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void getCachedComponentType(ComponentType componentType, CommonCallbacks.CompletionCallbackWith<NativeObjects.UpgradeComponentProductType> completionCallbackWith) {
    }

    public void getConnectedComponentType(ComponentType componentType, CommonCallbacks.CompletionCallbackWith<NativeObjects.UpgradeComponentProductType> completionCallbackWith) {
    }

    public void fetchSubModuleFirmwareInformation(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, String string2, CommonCallbacks.CompletionCallbackWith<ArrayList<FirmwareSubModuleUpgradeInformationImpl>> completionCallbackWith) {
    }

    @Nullable
    public ProductType getProductModel() {
        return null;
    }

    void setProductModel(ProductType productType) {
    }

    void handleUpgradeStateCheckCallback(long l2, int n, int n2, int n3, int n4) {
    }

    void handleProductConnectCheckUpgradeStateCallback(long l2, int n, int n2, int n3, int n4) {
    }

    void handleUpgradeProcessCallback(long l2, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, float f2, float f3, int n9, String string2) {
    }

    void handleDecompressProcessCallback(long l2, int n, int n2, int n3, float f2, int n4) {
    }

    void handleUpgradeSubModulesProcessCallback(long l2, int n, int n2, String[] stringArray) {
    }

    void handleDownloadProcessCallback(int n, int n2, float f2, int n3, String string2) {
    }

    void handleServerVersionsCallback(int n, String[] stringArray) {
    }

    void handleLastestFirmwareInformationCallback(int n, String string2, String string3, String string4, String string5, long l2, boolean bl) {
    }

    void handleDeviceVersionCallback(long l2, int n, int n2, String string2) {
    }

    void handleUpgradePushStateCallback(long l2, int n, int n2, int n3, int n4, int n5, int n6, float f2, int n7, String string2) {
    }

    void handleConsistentUpgradeRequestCallback(long l2, int n, int n2, int n3) {
    }

    void handleUpgradeComponentCallback(long l2, int n, int n2, int n3, String string2) {
    }

    private <T> NativeObjects.NativeCommonCallbackWith<T> getCommonNativeCallbackWith(CommonCallbacks.CompletionCallbackWith<T> completionCallbackWith) {
        return null;
    }

    private NativeObjects.NativeCompletionCallback<Integer> getNativeCompletionCallback(CommonCallbacks.CompletionCallback completionCallback) {
        return null;
    }

    private void notifyConnectionChanged() {
    }

    private boolean isDroneUpgradeComponent(int n) {
        return false;
    }

    private boolean isRCUpgradeComponent(int n) {
        return false;
    }

    private boolean isCameraUpgradeComponent(int n) {
        return false;
    }

    private boolean isBatteryBoxComponent(int n) {
        return false;
    }

    private boolean isGimbalUpgradeComponent(int n) {
        return false;
    }

    private boolean isIndustryUpgradeComponent(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
        return false;
    }

    public void activeSendConsistentCheck(long l2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private native void checkVersionState(long var1, int var3, int var4, NativeObjects.ComponentVersionCheckHandle var5);

    private native void checkAllState(long var1, int var3, int var4, NativeObjects.ComponentUpgradeStateCheckHandle var5);

    private native void fetchDeviceUpgradeLog(long var1, int var3, int var4, NativeObjects.NativeCommonCallbackWith<byte[]> var5);

    private native void isFirmwareDownloaded(int var1, String var2, NativeObjects.NativeCompletionCallback<Boolean> var3);

    private native void fetchServerVersions(int var1, NativeObjects.NativeCommonCallbackWith<String[]> var2);

    private native void getDownloadedProgress(int var1, String var2, NativeObjects.NativeCommonCallbackWith<Float> var3);

    private native void startDownloadFirmware(int var1, NativeObjects.NativeCompletionCallback<Integer> var2);

    private native void startDownloadFirmwareWithVersion(int var1, String var2, NativeObjects.NativeCompletionCallback<Integer> var3);

    private native void stopDownloadFirmware(NativeObjects.NativeCompletionCallback<Integer> var1);

    private native void startUpgrade(long var1, int var3, int var4, NativeObjects.NativeCompletionCallback<Integer> var5);

    private native void startUpgradeWithVersion(long var1, int var3, int var4, String var5, NativeObjects.NativeCompletionCallback<Integer> var6);

    private native void startUpgradeMultiComponents(String[] var1, NativeObjects.NativeCompletionCallback<Integer> var2, boolean var3);

    private native void startUpgradeMultiComponentsWithVersion(String[] var1, NativeObjects.NativeCompletionCallback<Integer> var2, boolean var3);

    private native void startUpgradeDatabase(long var1, int var3, int var4, String var5, NativeObjects.NativeCompletionCallback<Integer> var6);

    private native void startConsistentUpgrade(long var1, int var3, int var4, int var5, NativeObjects.NativeCompletionCallback<Integer> var6);

    private native void startUpgradeWithFilePaths(long var1, int var3, int var4, String[] var5, NativeObjects.NativeCompletionCallback<Integer> var6);

    private native void fetchUpgradeReleaseNote(int var1, String var2, NativeObjects.FetchReleaseNoteCallback var3);

    private native void fetchDeviceConfigFileInformation(long var1, int var3, int var4, NativeObjects.NativeCommonCallbackWith<String> var5);

    private native void fetchDeviceFirmwareInfomation(long var1, int var3, int var4, NativeObjects.FetchReleaseNoteAndSizeCallback var5);

    private native void fetchUpgradeFirmwareSize(int var1, String var2, NativeObjects.NativeCommonCallbackWith<Long> var3);

    private native void fetchUpgradeReleaseNoteAndSize(int var1, String var2, NativeObjects.FetchReleaseNoteAndSizeCallback var3);

    private native void removeUpgradeComponent(long var1, int var3, int var4);

    private native void addUpgradeComponent(long var1, int var3, int var4);

    private native void checkUpgradeComponent(int var1, boolean var2, NativeObjects.UpgradeComponentCheckCallbackHandle var3);

    private native void notifyCachedComponent(int var1, int var2);

    private native void fetchSubModuleFirmwareInformation(int var1, String var2, NativeObjects.NativeCommonCallbackWith<String[]> var3);

    private native void fetchDeviceSubModuleFirmwareInformation(long var1, int var3, int var4, NativeObjects.NativeCommonCallbackWith<String[]> var5);

    private native void updateDeviceVersionInfoReceivers(long var1, int var3, int var4, int[] var5, NativeObjects.NativeCompletionCallback<Integer> var6);

    private native void activeSendConsistentCheck(long var1, int var3, int var4, NativeObjects.NativeCompletionCallback<Integer> var5);

    private static /* synthetic */ void lambda$getNativeCompletionCallback$8(CommonCallbacks.CompletionCallback completionCallback, Integer n) {
    }

    private static /* synthetic */ void lambda$getConnectedComponentType$7(CommonCallbacks.CompletionCallbackWith completionCallbackWith, int n, int n2) {
    }

    private /* synthetic */ void lambda$getCachedComponentType$6(CommonCallbacks.CompletionCallbackWith completionCallbackWith, ComponentType componentType, int n, int n2) {
    }

    private static /* synthetic */ void lambda$getCachedComponentType$5(CommonCallbacks.CompletionCallbackWith completionCallbackWith, int n, int n2) {
    }

    private static /* synthetic */ void lambda$fetchFirmwareReleaseNoteAndSize$4(CommonCallbacks.CompletionCallbackWith completionCallbackWith, String string2, String string3, String string4, String string5, long l2, int n) {
    }

    private static /* synthetic */ void lambda$startUpgradeMultiComponents$3(CommonCallbacks.CompletionCallback completionCallback, Integer n) {
    }

    private static /* synthetic */ void lambda$startUpgradeMultiComponents$2(CommonCallbacks.CompletionCallback completionCallback, Integer n) {
    }

    private static /* synthetic */ void lambda$checkFirmwareDownloadedState$1(CommonCallbacks.CompletionCallbackWith completionCallbackWith, Boolean bl) {
    }

    private static /* synthetic */ void lambda$checkAllState$0(CommonCallbacks.CompletionCallbackWith completionCallbackWith, long l2, int n, int n2, int n3, int n4) {
    }
}

