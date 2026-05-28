/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.csdk.fscore.jni.db;

import androidx.annotation.Keep;
import dji.component.flysafe.dbupgrade.listener.DatabaseUpgradeCheckStateModel;
import dji.component.flysafe.dbupgrade.listener.UpgradeDatabaseListener;
import dji.component.flysafe.dbupgrade.model.DatabaseUpgradeCheckState;
import dji.component.flysafe.dbupgrade.model.DatabaseUpgradeInformation;
import dji.component.flysafe.listener.JNICommonCallbacks;
import dji.component.flysafe.listener.JNIFSCommonCallbacks;
import dji.component.flysafe.listener.OnDatabaseChangedListener;
import dji.csdk.fscore.jni.IJNICommonEnum;
import java.util.List;

@Keep
public class JNIFSBasicDbUpgradeHelper {
    public static final String KEY_FORCE_UG_APP_CIRCLE_DATA_VERIFY_FAIL = "key_force_ug_app_circle_data_verify_fail";
    private String mDbVersion;
    private String mAircraftDbVersion;
    private List<OnDatabaseChangedListener> mOnBasicDbJniListeners;
    private List<OnDatabaseChangedListener> mOnAircraftDbJniListeners;
    private List<UpgradeDatabaseListener> mDatabaseUpgradeListeners;
    private DatabaseStateJni mDatabaseState;
    private DatabaseUpgradeCheckState appUpgradeState;
    private DatabaseUpgradeCheckState aircraftUpgradeState;
    String appDBVersion;
    String aircraftDBVersion;
    private DatabaseUpgradeCheckStateModel databaseUpgradeCheckStateModel;
    private DatabaseUpgradeInformation databaseUpgradeInformation;

    public static JNIFSBasicDbUpgradeHelper getInstance() {
        return null;
    }

    public String getDbVersion() {
        return null;
    }

    public DatabaseStateJni getDatabaseState() {
        return null;
    }

    public void addOnBasicDbListener(OnDatabaseChangedListener onDatabaseChangedListener) {
    }

    public void removeOnBasicDbListener(OnDatabaseChangedListener onDatabaseChangedListener) {
    }

    public void addOnAircraftDbListener(OnDatabaseChangedListener onDatabaseChangedListener) {
    }

    public void removeOnAircraftListener(OnDatabaseChangedListener onDatabaseChangedListener) {
    }

    public String aquireAircraftDbVersion() {
        return null;
    }

    public void addDatabaseUpgradeListener(UpgradeDatabaseListener upgradeDatabaseListener) {
    }

    public void removeDatabaseUpgradeListener(UpgradeDatabaseListener upgradeDatabaseListener) {
    }

    public void removeAllDatabaseUpgradeListener() {
    }

    public void startDownloadAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public void stopDownloadAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public void startDownloadAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public void stopDownloadAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public void startUpgradeAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public void startUpgradeAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallbackWithErrorEnum jNIFSCommonCallbackWithErrorEnum) {
    }

    public DatabaseUpgradeCheckStateModel getUpgradeState() {
        return null;
    }

    public DatabaseUpgradeInformation getCurrentDatabaseInformation() {
        return null;
    }

    public void refreshUpgradeInfo(JNIFSCommonCallbacks.JNIFSCommonCallbackWithInfo<String> jNIFSCommonCallbackWithInfo) {
    }

    public void setDefaultAppPolygonDatabaseVersion(String string) {
    }

    public void setDefaultDataBasePathSaveFolder(String string) {
    }

    public static void getBasicDbVersion(JNICommonCallbacks.JNICommonCallbackWith<String> jNICommonCallbackWith) {
    }

    private static void onBasicDbVersionChangeJni(String string) {
    }

    private static void onUpgradeStateChangeJni(int n, float f2) {
    }

    private static void onBasicDbStateChangeJni(int n) {
    }

    public static void replaceBasicDatabaseFile(String string, JNICommonCallbacks.JNIEnumCallback jNIEnumCallback) {
    }

    private static void onAircraftDbVersionChangeJni(String string) {
    }

    private static void onDatabaseUpgradeCheckStateChangeJni(int n, int n2, String string, String string2) {
    }

    private static void onDatabaseDownloadProgressChangeJni(float f2, int n, String string, int n2, int n3) {
    }

    private static void OnDatabaseUpgradingProcessStateChangeJni(float f2, int n, String string, int n2, int n3) {
    }

    private static native void native_getBaseDbVersion(JNICommonCallbacks.JNICommonCallbackWith<String> var0);

    private static native void native_setUnzipNewDatabaseFilePath(String var0);

    private static native void native_setDownloadZipNewDatabaseFilePath(String var0);

    private static native void native_checkBaseDatabaseUpgradeState();

    private static native void native_replaceOldDatabaseFile(JNICommonCallbacks.JNICommonCallback var0);

    private static native void natvie_setDefaultAppPolygonDatabaseVersion(String var0);

    private static native void natvie_SetDefaultDataBasePathSaveFolder(String var0);

    private static native void native_refreshUpgradeInfo(JNIFSCommonCallbacks.JNIFSCommonCallbackWith<String> var0);

    private static native void natvie_startDownloadAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    private static native void natvie_stopDownloadAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    private static native void natvie_startDownloadAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    private static native void natvie_stopDownloadAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    private static native void natvie_startUpgradeAircraftDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    private static native void natvie_startUpgradeAppDatabase(JNIFSCommonCallbacks.JNIFSCommonCallback var0);

    static /* synthetic */ DatabaseUpgradeCheckState access$100(JNIFSBasicDbUpgradeHelper jNIFSBasicDbUpgradeHelper) {
        return null;
    }

    static /* synthetic */ DatabaseUpgradeCheckState access$200(JNIFSBasicDbUpgradeHelper jNIFSBasicDbUpgradeHelper) {
        return null;
    }

    @Keep
    public static final class DatabaseStateJni
    extends Enum<DatabaseStateJni>
    implements IJNICommonEnum {
        public static final /* enum */ DatabaseStateJni Init = new DatabaseStateJni(0);
        public static final /* enum */ DatabaseStateJni Loading = new DatabaseStateJni(1);
        public static final /* enum */ DatabaseStateJni Updating = new DatabaseStateJni(2);
        public static final /* enum */ DatabaseStateJni Ready = new DatabaseStateJni(3);
        public static final /* enum */ DatabaseStateJni Fetching = new DatabaseStateJni(4);
        public static final /* enum */ DatabaseStateJni Error = new DatabaseStateJni(5);
        public static final /* enum */ DatabaseStateJni InValid = new DatabaseStateJni(6);
        public static final /* enum */ DatabaseStateJni Unknown = new DatabaseStateJni(255);
        int mValue;
        private static volatile DatabaseStateJni[] sValues;
        private static final /* synthetic */ DatabaseStateJni[] $VALUES;

        public static DatabaseStateJni[] values() {
            return null;
        }

        public static DatabaseStateJni valueOf(String string) {
            return null;
        }

        @Override
        public int getValue() {
            return 0;
        }

        private DatabaseStateJni(int n2) {
        }

        public static DatabaseStateJni ofValue(int n) {
            return null;
        }

        private static /* synthetic */ DatabaseStateJni[] $values() {
            return null;
        }

        static {
            $VALUES = DatabaseStateJni.$values();
            sValues = null;
        }
    }

    @Keep
    private static final class LazyHolder {
        private static final JNIFSBasicDbUpgradeHelper INSTANCE = new JNIFSBasicDbUpgradeHelper();

        private LazyHolder() {
        }

        static /* synthetic */ JNIFSBasicDbUpgradeHelper access$000() {
            return null;
        }
    }

    public static interface OnBasicDbJniListener {
        public void onDbVersionChanged(String var1);
    }
}

