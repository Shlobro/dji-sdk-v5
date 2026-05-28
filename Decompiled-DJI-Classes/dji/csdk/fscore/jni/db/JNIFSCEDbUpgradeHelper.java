/*
 * Decompiled with CFR 0.152.
 */
package dji.csdk.fscore.jni.db;

import dji.component.flysafe.dbupgrade.callback.CEDatabaseRefershServerCallback;
import dji.component.flysafe.dbupgrade.listener.CEDatabaseDownloadProgressListener;
import dji.component.flysafe.dbupgrade.listener.CEDatabaseInfoListener;
import dji.component.flysafe.dbupgrade.listener.CEDatabaseUpgradeProgressListener;
import dji.component.flysafe.dbupgrade.listener.CEDbUpgradeStateChangeListener;
import dji.component.flysafe.dbupgrade.listener.CommonProgressListener;
import dji.component.flysafe.listener.JNIFSCommonCallbacks;
import dji.component.flysafe.model.JNIFSCEDatabaseInfo;
import java.util.List;

public class JNIFSCEDbUpgradeHelper {
    private final List<CEDbUpgradeStateChangeListener> upgradeStateChangeListenerList;
    private final List<CEDatabaseDownloadProgressListener> databaseDownloadProgressListenerList;
    private final List<CEDatabaseUpgradeProgressListener> databaseUpgradeProgressListenerList;
    private final List<CommonProgressListener> databaseImportProgressListenerList;
    private final List<CommonProgressListener> databaseSyncDBUpgradeProgressListenerList;
    private final List<CEDatabaseInfoListener> databaseInfoListenerList;

    public static JNIFSCEDbUpgradeHelper getInstance() {
        return null;
    }

    private static void onCEUpgradeCheckStateChangeJni(int n, int n2, String string, String string2, String string3) {
    }

    private static void onCEDatabaseDownloadProgressChangeJni(float f2, int n, int n2) {
    }

    private static void onCEDatabaseUpgradeProgressChangeJni(float f2, int n, int n2, int n3) {
    }

    private static void onCEImportProgressChangeJni(double d2) {
    }

    private static void onCEDSyncProgressChangeJni(double d2) {
    }

    private static void onCEDatabaseInfoJni(JNIFSCEDatabaseInfo jNIFSCEDatabaseInfo) {
    }

    public void addCEDatabaseUpgradeCheckStateCallback(CEDbUpgradeStateChangeListener cEDbUpgradeStateChangeListener) {
    }

    public void removeCEDatabaseUpgradeCheckStateCallback(CEDbUpgradeStateChangeListener cEDbUpgradeStateChangeListener) {
    }

    public void addCEDatabaseDownloadProgressCallback(CEDatabaseDownloadProgressListener cEDatabaseDownloadProgressListener) {
    }

    public void removeCEDatabaseDownloadProgressCallback(CEDatabaseDownloadProgressListener cEDatabaseDownloadProgressListener) {
    }

    public void addCEDatabaseUpgradeProgressCallback(CEDatabaseUpgradeProgressListener cEDatabaseUpgradeProgressListener) {
    }

    public void removeCEDatabaseUpgradeProgressCallback(CEDatabaseUpgradeProgressListener cEDatabaseUpgradeProgressListener) {
    }

    public static void RefreshCEDBInfoFromServer(double d2, double d3, CEDatabaseRefershServerCallback cEDatabaseRefershServerCallback) {
    }

    public static void StartDownloadCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public static void StopDownloadCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public static void StartUpgradeCEAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public static void StartUpgradeCEAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public static long AcquireAPPCEDatabaseUpdateTimestamp() {
        return 0L;
    }

    public static void QueryAircraftCEDatabaseUpdateTimestamp(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<String> jNIFSCommonCallbackWith) {
    }

    public static void QueryAircraftCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<JNIFSCEDatabaseInfo> jNIFSCommonCallbackWith) {
    }

    public static void QueryAppCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<JNIFSCEDatabaseInfo> jNIFSCommonCallbackWith) {
    }

    public void addCEDatabaseInfoCallback(CEDatabaseInfoListener cEDatabaseInfoListener) {
    }

    public void removeCEDatabaseInfoCallback(CEDatabaseInfoListener cEDatabaseInfoListener) {
    }

    public static void ImportCEGeoData(String string, JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public static void StartSyncAppCEDBToAircraft(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public static void SwitchAppCEDatabase(JNIFSCEDatabaseInfo.CEDatabaseType cEDatabaseType, JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public void addCEImportProgressCallback(CommonProgressListener commonProgressListener) {
    }

    public void removeCEImportProgressCallback(CommonProgressListener commonProgressListener) {
    }

    public void addCESyncDBProgressCallback(CommonProgressListener commonProgressListener) {
    }

    public void removeCESyncDBtProgressCallback(CommonProgressListener commonProgressListener) {
    }

    public static native void native_StartDownloadCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    public static native void native_StopDownloadCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    public static native void native_StartUpgradeCEAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    public static native void native_StartUpgradeCEAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    public static native void native_RefreshCEDBInfoFromServer(double var0, double var2, CEDatabaseRefershServerCallback var4);

    public static native long native_AcquireAPPCEDatabaseUpdateTimestamp();

    private static native void native_QueryAircraftCEDatabaseUpdateTimestamp(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<String> var0);

    private static native void native_QueryAircraftCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<JNIFSCEDatabaseInfo> var0);

    private static native void native_QueryAppCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<JNIFSCEDatabaseInfo> var0);

    private static native void native_ImportCEGeoData(String var0, JNIFSCommonCallbacks.JNIFSCommonCallback var1);

    private static native void native_SwitchAppCEDatabase(String var0, JNIFSCommonCallbacks.JNIFSCommonCallback var1);

    private static native void native_StartSyncAppCEDBToAircraft(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    private static final class LazyHolder {
        private static final JNIFSCEDbUpgradeHelper INSTANCE = new JNIFSCEDbUpgradeHelper();

        private LazyHolder() {
        }

        static /* synthetic */ JNIFSCEDbUpgradeHelper access$000() {
            return null;
        }
    }
}

