/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  io.reactivex.Observable
 */
package dji.upgrade.internal.csdk.upgradeadapter;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.product.AppType;
import dji.upgrade.internal.csdk.upgradeadapter.UpgradeLogicAdapter;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import io.reactivex.Observable;
import java.io.File;

public class UpgradeAdapterManager {
    private static final String TAG = "[\u5347\u7ea7\u65e5\u5fd7]UpgradeAdapterManager";
    private static AppType appType;
    private static String upgradeFileDirectory;
    private Context mContext;
    private UpgradeLogicAdapter upgradeLogicAdapter;
    private static String upgradePath;
    private static boolean isSdcard;
    private static File[] files;
    private NativeObjects.ComponentUpgradeStateCheckHandle compUpgradeStateCheckHandle;
    private NativeObjects.DecompressProgressCallbackHandle decompressProgressCallbackHandle;
    private NativeObjects.UpgradeProcessCallbackHandle upgradeProcessCallbackHandle;
    private NativeObjects.DownloadProcessCallbackHandle downloadProcessCallbackHandle;
    private NativeObjects.UpgradeSubModulesProcessCallbackHandle upgradeSubModulesProcessCallbackHandle;
    private NativeObjects.ServerVersionsCallbackHandle serverVersionsCallbackHandle;
    private NativeObjects.LastestFirmwareInformationCallbackHandle lastestFirmwareInformationCallbackHandle;
    private NativeObjects.DeviceVersionCallbackHandle deviceVersionCallbackHandle;
    private NativeObjects.UpgradePushStateCallbackHandle upgradePushStateCallbackHandle;
    private NativeObjects.ConsistentUpgradeRequestCallbackHandle consistentUpgradeRequestCallbackHandle;
    private NativeObjects.UpgradeComponentCallbackHandle upgradeComponentCallbackHandle;

    public void init(@NonNull Context context, AppType appType) {
    }

    public void destroy() {
    }

    @NonNull
    public UpgradeLogicAdapter getUpgradeLogicAdapter() {
        return null;
    }

    public static void setIsStoreSdCard(boolean bl) {
    }

    public static String getFirmwareUpgradeFileDirectory(Context context) {
        return null;
    }

    public static String getFirmwareUpgradeFileDirectory() {
        return null;
    }

    private static Application getApplicationByReflect() {
        return null;
    }

    public Observable<Boolean> clearAllCacheFilesForFirmware() {
        return null;
    }

    public long getSizeOfAllCacheFiles() {
        return 0L;
    }

    private boolean deleteDirWithFile(File file) {
        return false;
    }

    private long getFileSize(File file) {
        return 0L;
    }

    private void bindData() {
    }

    private void unBindData() {
    }

    private static boolean checkUpgradeFolderValid(String string2) {
        return false;
    }

    private static native void setFirmwareStoreDirectory(String var0);

    private native void setComponentVersionCheckStateCallback(NativeObjects.ComponentVersionCheckHandle var1);

    private native void setComponentCheckUpgradeStateCallback(NativeObjects.ComponentUpgradeStateCheckHandle var1);

    private native void setUpgradeStateObserver(NativeObjects.UpgradeProcessCallbackHandle var1);

    private native void setDownloadStateObserver(NativeObjects.DownloadProcessCallbackHandle var1);

    private native void setDecompressStateObserver(NativeObjects.DecompressProgressCallbackHandle var1);

    private native void listenServerVersions(NativeObjects.ServerVersionsCallbackHandle var1);

    private native void listenLastestFirmwareInformation(NativeObjects.LastestFirmwareInformationCallbackHandle var1);

    private native void listenDeviceVersion(NativeObjects.DeviceVersionCallbackHandle var1);

    private native void setUpgradePushStateObserver(NativeObjects.UpgradePushStateCallbackHandle var1);

    private native void setSDRLinkReverseHandle(NativeObjects.DataLinkReverseCallbackHandle var1);

    private native void setConsistentUpgradeRequestObserver(NativeObjects.ConsistentUpgradeRequestCallbackHandle var1);

    private native void setUpgradeSubModulesStateObserver(NativeObjects.UpgradeSubModulesProcessCallbackHandle var1);

    private native void setUpgradeComponentObserver(NativeObjects.UpgradeComponentCallbackHandle var1);

    private native void dataLinkReverseCallback(long var1, boolean var3);

    private native void initialize();

    private native void unInitialize();

    public static native void setIsInternalUpgradeMode(boolean var0);

    public static native void addUpgradeDebugMode(int var0);

    static /* synthetic */ UpgradeLogicAdapter access$000(UpgradeAdapterManager upgradeAdapterManager) {
        return null;
    }

    static /* synthetic */ boolean access$100(UpgradeAdapterManager upgradeAdapterManager, File file) {
        return false;
    }

    static {
        isSdcard = false;
    }
}

