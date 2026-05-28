/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.Component;
import dji.upgrade.generate.ComponentInformation;
import dji.upgrade.generate.ComponentTypeComposite;
import dji.upgrade.generate.ConfigFileInformation;
import dji.upgrade.generate.DownloadProgressCallback;
import dji.upgrade.generate.DownloadProgressMultiCallback;
import dji.upgrade.generate.ErrorsCallback;
import dji.upgrade.generate.FirmwareInformationCallback;
import dji.upgrade.generate.FirmwareStateCallback;
import dji.upgrade.generate.ImageFetchInformationCallback;
import dji.upgrade.generate.ImageSwitchRequestCallback;
import dji.upgrade.generate.IsDownloadedCallback;
import dji.upgrade.generate.ResultCallback;
import dji.upgrade.generate.ServerListCallback;
import dji.upgrade.generate.UpgradeStateCallback;
import dji.upgrade.generate.UpgradeVersionCommonParam;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public interface FirmwareManager
extends JNIProguardKeepTag {
    public static int StartDownload(ComponentTypeComposite componentTypeComposite, String string2, ResultCallback resultCallback) {
        return 0;
    }

    public static void StopDownload(int n, ResultCallback resultCallback) {
    }

    public static void StartDownloadMulti(ArrayList<ComponentInformation> arrayList, ResultCallback resultCallback) {
    }

    public static void StopDownloadMulti(ResultCallback resultCallback) {
    }

    public static int AddDownloadMultiObserver(DownloadProgressMultiCallback downloadProgressMultiCallback) {
        return 0;
    }

    public static boolean RemoveDownloadMultiObserver(int n) {
        return false;
    }

    public static void SetFirmwareUpgradeStateCallback(UpgradeStateCallback upgradeStateCallback) {
    }

    public static void FetchAppVersionList(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, ServerListCallback serverListCallback) {
    }

    public static void FetchFirmwareInformation(ComponentTypeComposite componentTypeComposite, String string2, boolean bl, UpgradeVersionCommonParam upgradeVersionCommonParam, FirmwareInformationCallback firmwareInformationCallback) {
    }

    public static void FetchServerList(ComponentTypeComposite componentTypeComposite, boolean bl, UpgradeVersionCommonParam upgradeVersionCommonParam, ServerListCallback serverListCallback) {
    }

    public static void IsFirmwareDownload(ComponentTypeComposite componentTypeComposite, String string2, IsDownloadedCallback isDownloadedCallback) {
    }

    public static int AddDownloadObserver(DownloadProgressCallback downloadProgressCallback) {
        return 0;
    }

    public static boolean RemoveDownloadObserver(int n) {
        return false;
    }

    public static void FetchLastFirmwareInformation(ComponentTypeComposite componentTypeComposite, boolean bl, UpgradeVersionCommonParam upgradeVersionCommonParam, FirmwareInformationCallback firmwareInformationCallback) {
    }

    public static HashMap<NativeObjects.UpgradeComponentProductType, Integer> GetBatteryThresholdInPercentage(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
        return null;
    }

    public static void CheckFirmwareUpgradeStateWithServer(ComponentTypeComposite componentTypeComposite, ConfigFileInformation configFileInformation, UpgradeVersionCommonParam upgradeVersionCommonParam, FirmwareStateCallback firmwareStateCallback) {
    }

    public static void CheckUpgradableStatus(Component component, ErrorsCallback errorsCallback) {
    }

    public static void CheckFirmwareUpgradeState(Component component, FirmwareStateCallback firmwareStateCallback) {
    }

    public static void SetImageSwitchRequestObserver(ImageSwitchRequestCallback imageSwitchRequestCallback) {
    }

    public static void FetchInstalledImageInformations(Component component, ImageFetchInformationCallback imageFetchInformationCallback) {
    }

    public static void CancelImageSwitchRequest(Component component, ResultCallback resultCallback) {
    }

    public static final class CppProxy
    implements FirmwareManager {
        private final long nativeRef;
        private final AtomicBoolean destroyed;

        private CppProxy(long l2) {
        }

        private native void nativeDestroy(long var1);

        public void _djinni_private_destroy() {
        }

        protected void finalize() throws Throwable {
        }

        public static native int StartDownload(ComponentTypeComposite var0, String var1, ResultCallback var2);

        public static native void StopDownload(int var0, ResultCallback var1);

        public static native void StartDownloadMulti(ArrayList<ComponentInformation> var0, ResultCallback var1);

        public static native void StopDownloadMulti(ResultCallback var0);

        public static native int AddDownloadMultiObserver(DownloadProgressMultiCallback var0);

        public static native boolean RemoveDownloadMultiObserver(int var0);

        public static native void SetFirmwareUpgradeStateCallback(UpgradeStateCallback var0);

        public static native void FetchAppVersionList(NativeObjects.UpgradeComponentProductType var0, ServerListCallback var1);

        public static native void FetchFirmwareInformation(ComponentTypeComposite var0, String var1, boolean var2, UpgradeVersionCommonParam var3, FirmwareInformationCallback var4);

        public static native void FetchServerList(ComponentTypeComposite var0, boolean var1, UpgradeVersionCommonParam var2, ServerListCallback var3);

        public static native void IsFirmwareDownload(ComponentTypeComposite var0, String var1, IsDownloadedCallback var2);

        public static native int AddDownloadObserver(DownloadProgressCallback var0);

        public static native boolean RemoveDownloadObserver(int var0);

        public static native void FetchLastFirmwareInformation(ComponentTypeComposite var0, boolean var1, UpgradeVersionCommonParam var2, FirmwareInformationCallback var3);

        public static native HashMap<NativeObjects.UpgradeComponentProductType, Integer> GetBatteryThresholdInPercentage(NativeObjects.UpgradeComponentProductType var0);

        public static native void CheckFirmwareUpgradeStateWithServer(ComponentTypeComposite var0, ConfigFileInformation var1, UpgradeVersionCommonParam var2, FirmwareStateCallback var3);

        public static native void CheckUpgradableStatus(Component var0, ErrorsCallback var1);

        public static native void CheckFirmwareUpgradeState(Component var0, FirmwareStateCallback var1);

        public static native void SetImageSwitchRequestObserver(ImageSwitchRequestCallback var0);

        public static native void FetchInstalledImageInformations(Component var0, ImageFetchInformationCallback var1);

        public static native void CancelImageSwitchRequest(Component var0, ResultCallback var1);
    }
}

