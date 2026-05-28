/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  io.reactivex.Observable
 *  io.reactivex.disposables.CompositeDisposable
 */
package dji.upgrade.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.callback.IListenCallback;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.product.AppType;
import dji.upgrade.UpgradeManager;
import dji.upgrade.UpgradeManagerDynamicComponentListener;
import dji.upgrade.component.database.DatabaseUpgradeComponent;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.component.firmware.UpgradeExternalComponents;
import dji.upgrade.component.firmware.model.ComponentType;
import dji.upgrade.component.firmware.model.UpgradeDynamicComponentChangeState;
import dji.upgrade.component.firmware.model.UpgradeFirmwareState;
import dji.upgrade.generate.ImageSwitchRequestInformation;
import dji.upgrade.internal.component.DatabaseUpgradeComponentImpl;
import dji.upgrade.internal.component.UpgradeComponentImpl;
import dji.upgrade.internal.component.UpgradeExternalComponentsImpl;
import dji.upgrade.internal.csdk.upgradeadapter.model.ConsistentUpgradeRequestInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.DecompressProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.DownloadProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.InternalFirmwareInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.LastestFirmwareInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import dji.upgrade.internal.csdk.upgradeadapter.model.ServerVersionInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeComponentChangeInfomation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeProcessInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradePushInformation;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeStateCheckInformation;
import dji.upgrade.internal.model.FirmwareSubModuleUpgradeInformationImpl;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class UpgradeManagerImpl
implements UpgradeManager,
IListenCallback {
    private DatabaseUpgradeComponentImpl databaseUpgradeComponent;
    private CompositeDisposable compositeDisposable;
    private Observable<UpgradeProcessInformation> upgradeProcessInformationObservable;
    private Observable<DownloadProcessInformation> downloadProcessInformationObservable;
    private Observable<DecompressProcessInformation> decompressProcessInformationObservable;
    private Observable<ServerVersionInformation> serverVersionInformationObservable;
    private Observable<LastestFirmwareInformation> lastestFirmwareInformationObservable;
    private Observable<UpgradePushInformation> upgradePushInformationObservable;
    private Observable<ConsistentUpgradeRequestInformation> consistentUpgradeRequestInformationObservable;
    private Observable<UpgradeStateCheckInformation> upgradeComponentStateObservable;
    private Observable<InternalFirmwareInformation> upgradeDeviceInformationObserveable;
    private UpgradeExternalComponentsImpl externalComponents;
    private Observable<ArrayList<FirmwareSubModuleUpgradeInformationImpl>> upgradeSubModuleProcessInformationObservable;
    private Observable<UpgradeComponentChangeInfomation> upgradeComponentChangeInfomationObservable;
    private Context mContext;
    private boolean isInitialized;
    private static final String TAG = "UpgradeManager";
    private CopyOnWriteArrayList<UpgradeManagerDynamicComponentListener> listeners;
    private CopyOnWriteArrayList<UpgradeComponentImpl> dynamciUpgradeComponents;

    public static UpgradeManagerImpl getInstance() {
        return null;
    }

    private UpgradeManagerImpl() {
    }

    public synchronized boolean init(@NonNull Context context) {
        return false;
    }

    public synchronized boolean init(@NonNull Context context, AppType appType) {
        return false;
    }

    public synchronized boolean destroy() {
        return false;
    }

    @Override
    @NonNull
    public DatabaseUpgradeComponent getDatabaseUpgradeComponent() {
        return null;
    }

    @Override
    @NonNull
    public ArrayList<UpgradeComponent> getDynamicUpgradeComponents() {
        return null;
    }

    @Override
    @NonNull
    public UpgradeExternalComponents getExternalComponents() {
        return null;
    }

    @Override
    public void removeAllCacheFilesForFirmware() {
    }

    @Override
    public long getAllCacheFileSizeForFirmware() {
        return 0L;
    }

    @Override
    public void addUpgradeComponentListener(@NonNull UpgradeManagerDynamicComponentListener upgradeManagerDynamicComponentListener) {
    }

    @Override
    public void removeUpgradeComponentListener(@NonNull UpgradeManagerDynamicComponentListener upgradeManagerDynamicComponentListener) {
    }

    @Override
    public void removeAllUpgradeComponentListener() {
    }

    private void bindData() {
    }

    private void unBindData() {
    }

    private void dispatchUpgradeCheckState(@NonNull UpgradeStateCheckInformation upgradeStateCheckInformation) {
    }

    private void dispatchUpgradeProgress(@NonNull UpgradeProcessInformation upgradeProcessInformation) {
    }

    private void dispatchFirmwareDownloadProgress(@NonNull DownloadProcessInformation downloadProcessInformation) {
    }

    private void dispatchFirmwareDecompressProgress(@NonNull DecompressProcessInformation decompressProcessInformation) {
    }

    private void dispatchServerVersions(@NonNull ServerVersionInformation serverVersionInformation) {
    }

    private void dispatchUpgradeSubModulesProgress(@NonNull ArrayList<FirmwareSubModuleUpgradeInformationImpl> arrayList) {
    }

    private void dispatchLastestFirmwareInformation(@NonNull LastestFirmwareInformation lastestFirmwareInformation) {
    }

    private void dispatchUpgradePushState(@NonNull UpgradePushInformation upgradePushInformation) {
    }

    private void dispatchConsistentUpgradeRequestInfo(@NonNull ConsistentUpgradeRequestInformation consistentUpgradeRequestInformation) {
    }

    private void dispatchImageSwitchRequest(@NonNull ImageSwitchRequestInformation imageSwitchRequestInformation) {
    }

    private void dispatchUpgradeComponent(@NonNull UpgradeComponentChangeInfomation upgradeComponentChangeInfomation) {
    }

    private void dispatchDeviceFirmwareInformation(@NonNull InternalFirmwareInformation internalFirmwareInformation) {
    }

    private void checkRemoveUpgradeComponent(NativeObjects.FirmwareDownloadProcessState firmwareDownloadProcessState, NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
    }

    private void checkRemoveUpgradeComponent(NativeObjects.UpgradeProcessState upgradeProcessState, NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
    }

    private void checkRemoveUpgradeComponent(UpgradeFirmwareState upgradeFirmwareState, NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
    }

    public void onPush(DJIKey dJIKey, Object object, Object object2) {
    }

    private void bindBatteryState() {
    }

    private void handleUpgradeDynamicComponent(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, UpgradeDynamicComponentChangeState upgradeDynamicComponentChangeState, int n, long l2, String string2) {
    }

    private void handleRemoveUpgradeComponent(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
    }

    private void notifyDynamciComponentListeners(UpgradeComponent upgradeComponent, UpgradeDynamicComponentChangeState upgradeDynamicComponentChangeState) {
    }

    private int getUpgradeComponentType(@Nullable NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
        return 0;
    }

    private ComponentType getUpgradeComponentType(NativeObjects.UpgradeStatePushComponentType upgradeStatePushComponentType) {
        return null;
    }

    private /* synthetic */ void lambda$bindData$5(UpgradePushInformation upgradePushInformation) throws Exception {
    }

    private /* synthetic */ void lambda$bindData$4(DecompressProcessInformation decompressProcessInformation) throws Exception {
    }

    private /* synthetic */ void lambda$bindData$3(DownloadProcessInformation downloadProcessInformation) throws Exception {
    }

    private /* synthetic */ void lambda$bindData$2(ArrayList arrayList) throws Exception {
    }

    private /* synthetic */ void lambda$bindData$1(UpgradeProcessInformation upgradeProcessInformation) throws Exception {
    }

    private /* synthetic */ void lambda$bindData$0(UpgradeStateCheckInformation upgradeStateCheckInformation) throws Exception {
    }

    /* synthetic */ UpgradeManagerImpl(1 var1_1) {
    }

    static /* synthetic */ void access$200(UpgradeManagerImpl upgradeManagerImpl, ImageSwitchRequestInformation imageSwitchRequestInformation) {
    }

    private static class SingletonHolder {
        private static final UpgradeManagerImpl instance = new UpgradeManagerImpl(null);

        private SingletonHolder() {
        }

        static /* synthetic */ UpgradeManagerImpl access$000() {
            return null;
        }
    }
}

