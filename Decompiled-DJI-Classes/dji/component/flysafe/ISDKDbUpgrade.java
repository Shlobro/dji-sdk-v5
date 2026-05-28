/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.component.flysafe;

import android.content.Context;
import dji.component.flysafe.dbupgrade.callback.CEDatabaseRefershServerCallback;
import dji.component.flysafe.dbupgrade.listener.CEDatabaseDownloadProgressListener;
import dji.component.flysafe.dbupgrade.listener.CEDatabaseInfoListener;
import dji.component.flysafe.dbupgrade.listener.CEDatabaseUpgradeProgressListener;
import dji.component.flysafe.dbupgrade.listener.CEDbUpgradeStateChangeListener;
import dji.component.flysafe.dbupgrade.listener.CommonProgressListener;
import dji.component.flysafe.dbupgrade.listener.DatabaseUpgradeCheckStateModel;
import dji.component.flysafe.dbupgrade.listener.UpgradeDatabaseListener;
import dji.component.flysafe.dbupgrade.model.DatabaseUpgradeInformation;
import dji.component.flysafe.listener.JNICommonCallbacks;
import dji.component.flysafe.listener.JNIFSCommonCallbacks;
import dji.component.flysafe.listener.OnDatabaseChangedListener;
import dji.component.flysafe.model.JNIFSCEDatabaseInfo;

public interface ISDKDbUpgrade {
    public void init(Context var1);

    public void configAfterAssetInstall();

    public String getAppPreciseDbVersion();

    public void addOnPreciseDbListener(OnDatabaseChangedListener var1);

    public void removeOnPreciseDbListener(OnDatabaseChangedListener var1);

    public void replacePreciseDatabaseFile(String var1, JNICommonCallbacks.JNIEnumCallback var2);

    public String getBasicDbVersion();

    public void addOnBasicDbListener(OnDatabaseChangedListener var1);

    public void removeOnBasicDbListener(OnDatabaseChangedListener var1);

    public void addAircraftDbListener(OnDatabaseChangedListener var1);

    public void removeAircraftDbListener(OnDatabaseChangedListener var1);

    public void replaceBasicDatabaseFile(String var1, JNICommonCallbacks.JNIEnumCallback var2);

    public void addDatabaseUpgradeListener(UpgradeDatabaseListener var1);

    public void removeDatabaseUpgradeListener(UpgradeDatabaseListener var1);

    public void removeAllDatabaseUpgradeListener();

    public void startDownloadAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void stopDownloadAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void startDownloadAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void stopDownloadAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void startUpgradeAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void startUpgradeAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public DatabaseUpgradeCheckStateModel getUpgradeState();

    public DatabaseUpgradeInformation getCurrentDatabaseInformation();

    public void refreshUpgradeInfo(JNIFSCommonCallbacks.JNIFSCommonCallbackWithInfo<String> var1);

    public void addCEDatabaseUpgradeCheckStateCallback(CEDbUpgradeStateChangeListener var1);

    public void removeCEDatabaseUpgradeCheckStateCallback(CEDbUpgradeStateChangeListener var1);

    public void addCEDatabaseDownloadProgressCallback(CEDatabaseDownloadProgressListener var1);

    public void removeCEDatabaseDownloadProgressCallback(CEDatabaseDownloadProgressListener var1);

    public void addCEDatabaseUpgradeProgressCallback(CEDatabaseUpgradeProgressListener var1);

    public void removeCEDatabaseUpgradeProgressCallback(CEDatabaseUpgradeProgressListener var1);

    public void refreshCEDBInfoFromServer(double var1, double var3, CEDatabaseRefershServerCallback var5);

    public void StartDownloadCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void StopDownloadCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void StartUpgradeCEAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void StartUpgradeCEAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public long AcquireAPPCEDatabaseUpdateTimestamp();

    public void QueryAircraftCEDatabaseUpdateTimestamp(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<String> var1);

    public void QueryAircraftCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<JNIFSCEDatabaseInfo> var1);

    public void QueryAppCEDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<JNIFSCEDatabaseInfo> var1);

    public void addCEDatabaseInfoCallback(CEDatabaseInfoListener var1);

    public void removeCEDatabaseInfoCallback(CEDatabaseInfoListener var1);

    public void ImportCEGeoData(String var1, JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var2);

    public void StartSyncAppCEDBToAircraft(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var1);

    public void SwitchAppCEDatabase(JNIFSCEDatabaseInfo.CEDatabaseType var1, JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum var2);

    public void addCEImportProgressCallback(CommonProgressListener var1);

    public void removeCEImportProgressCallback(CommonProgressListener var1);

    public void addCESyncDBProgressCallback(CommonProgressListener var1);

    public void removeCESyncDBtProgressCallback(CommonProgressListener var1);
}

