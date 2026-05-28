/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.model;

import dji.component.flysafe.dbupgrade.listener.DJIDataUpgradeListener;
import dji.component.flysafe.dbupgrade.model.DatabaseUpgradeCheckState;
import dji.component.flysafe.listener.JNIUpgradeDatabaseCallbacks;

public class FlysafeDataUpgradeModelWrapper {

    public static final class DbCacheState
    extends Enum<DbCacheState> {
        public static final /* enum */ DbCacheState EXIST = new DbCacheState();
        public static final /* enum */ DbCacheState NOT_EXIST = new DbCacheState();
        public static final /* enum */ DbCacheState UNKNOWN_SERVER_VERSION = new DbCacheState();
        private static final /* synthetic */ DbCacheState[] $VALUES;

        public static DbCacheState[] values() {
            return null;
        }

        public static DbCacheState valueOf(String string) {
            return null;
        }

        private static /* synthetic */ DbCacheState[] $values() {
            return null;
        }

        static {
            $VALUES = DbCacheState.$values();
        }
    }

    public static final class CheckException
    extends Enum<CheckException> {
        public static final /* enum */ CheckException SERVER_EXCEPTION = new CheckException();
        public static final /* enum */ CheckException CHECK_TIMEOUT = new CheckException();
        public static final /* enum */ CheckException NONE = new CheckException();
        private static final /* synthetic */ CheckException[] $VALUES;

        public static CheckException[] values() {
            return null;
        }

        public static CheckException valueOf(String string) {
            return null;
        }

        private static /* synthetic */ CheckException[] $values() {
            return null;
        }

        static {
            $VALUES = CheckException.$values();
        }
    }

    public static final class CEDatabaseType
    extends Enum<CEDatabaseType> {
        public static final /* enum */ CEDatabaseType APP = new CEDatabaseType();
        public static final /* enum */ CEDatabaseType AIRCRAFT = new CEDatabaseType();
        public static final /* enum */ CEDatabaseType UNKNOWN = new CEDatabaseType();
        private static final /* synthetic */ CEDatabaseType[] $VALUES;

        public static CEDatabaseType[] values() {
            return null;
        }

        public static CEDatabaseType valueOf(String string) {
            return null;
        }

        public static CEDatabaseType fromInt(int n) {
            return null;
        }

        private static /* synthetic */ CEDatabaseType[] $values() {
            return null;
        }

        static {
            $VALUES = CEDatabaseType.$values();
        }
    }

    public static final class DbUpgradingState
    extends Enum<DbUpgradingState> {
        public static final /* enum */ DbUpgradingState INITIALIZING = new DbUpgradingState();
        public static final /* enum */ DbUpgradingState TRANSFERRING = new DbUpgradingState();
        public static final /* enum */ DbUpgradingState UPGRADE_FAILED = new DbUpgradingState();
        public static final /* enum */ DbUpgradingState UPGRADE_SUCCESS = new DbUpgradingState();
        public static final /* enum */ DbUpgradingState UNKNOWN = new DbUpgradingState();
        private static final /* synthetic */ DbUpgradingState[] $VALUES;

        public static DbUpgradingState[] values() {
            return null;
        }

        public static DbUpgradingState valueOf(String string) {
            return null;
        }

        public static DbUpgradingState fromInt(int n) {
            return null;
        }

        private static /* synthetic */ DbUpgradingState[] $values() {
            return null;
        }

        static {
            $VALUES = DbUpgradingState.$values();
        }
    }

    public static final class CEDbDownloadingProcessState
    extends Enum<CEDbDownloadingProcessState> {
        public static final /* enum */ CEDbDownloadingProcessState INITIALIZATING = new CEDbDownloadingProcessState();
        public static final /* enum */ CEDbDownloadingProcessState DOWNLOADING = new CEDbDownloadingProcessState();
        public static final /* enum */ CEDbDownloadingProcessState DOWNLOAD_FAILED = new CEDbDownloadingProcessState();
        public static final /* enum */ CEDbDownloadingProcessState DOWNLOAD_SUCCESS = new CEDbDownloadingProcessState();
        public static final /* enum */ CEDbDownloadingProcessState UNKNOWN = new CEDbDownloadingProcessState();
        private static final /* synthetic */ CEDbDownloadingProcessState[] $VALUES;

        public static CEDbDownloadingProcessState[] values() {
            return null;
        }

        public static CEDbDownloadingProcessState valueOf(String string) {
            return null;
        }

        public static CEDbDownloadingProcessState fromInt(int n) {
            return null;
        }

        private static /* synthetic */ CEDbDownloadingProcessState[] $values() {
            return null;
        }

        static {
            $VALUES = CEDbDownloadingProcessState.$values();
        }
    }

    public static final class CEDbCheckState
    extends Enum<CEDbCheckState> {
        public static final /* enum */ CEDbCheckState UNKNOWN = new CEDbCheckState();
        public static final /* enum */ CEDbCheckState NEED_UPDATE = new CEDbCheckState();
        public static final /* enum */ CEDbCheckState UP_TO_DATE = new CEDbCheckState();
        public static final /* enum */ CEDbCheckState FC_NEED_SYNC = new CEDbCheckState();
        public static final /* enum */ CEDbCheckState DB_NOT_COVER = new CEDbCheckState();
        private static final /* synthetic */ CEDbCheckState[] $VALUES;

        public static CEDbCheckState[] values() {
            return null;
        }

        public static CEDbCheckState valueOf(String string) {
            return null;
        }

        public static CEDbCheckState fromInt(int n) {
            return null;
        }

        private static /* synthetic */ CEDbCheckState[] $values() {
            return null;
        }

        static {
            $VALUES = CEDbCheckState.$values();
        }
    }

    public static class CEDatabaseUpgradeProgressWrapper {
        private float progress;
        private DbUpgradingState upgradingState;
        private CEDatabaseType type;
        JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni error;

        public CEDatabaseUpgradeProgressWrapper(float f2, DbUpgradingState dbUpgradingState, CEDatabaseType cEDatabaseType, JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni databaseUpgradeErrorJni) {
        }

        public float getProgress() {
            return 0.0f;
        }

        public void setProgress(float f2) {
        }

        public DbUpgradingState getUpgradingState() {
            return null;
        }

        public void setUpgradingState(DbUpgradingState dbUpgradingState) {
        }

        public CEDatabaseType getType() {
            return null;
        }

        public void setType(CEDatabaseType cEDatabaseType) {
        }

        public JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni getError() {
            return null;
        }

        public void setError(JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni databaseUpgradeErrorJni) {
        }
    }

    public static class CEDatabaseDownloadProgressWrapper {
        private float progress;
        private CEDbDownloadingProcessState downloadState;
        JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni error;

        public CEDatabaseDownloadProgressWrapper(float f2, CEDbDownloadingProcessState cEDbDownloadingProcessState, JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni databaseUpgradeErrorJni) {
        }

        public float getProgress() {
            return 0.0f;
        }

        public void setProgress(float f2) {
        }

        public CEDbDownloadingProcessState getDownloadState() {
            return null;
        }

        public void setDownloadState(CEDbDownloadingProcessState cEDbDownloadingProcessState) {
        }

        public JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni getError() {
            return null;
        }

        public void setError(JNIUpgradeDatabaseCallbacks.DatabaseUpgradeErrorJni databaseUpgradeErrorJni) {
        }
    }

    public static class CEDbUpgradeStateWrapper {
        private CEDbCheckState appState;
        private CEDbCheckState fcState;
        private String appMD5;
        private String fcMD5;
        private String serverMD5;

        public CEDbUpgradeStateWrapper(CEDbCheckState cEDbCheckState, CEDbCheckState cEDbCheckState2, String string, String string2, String string3) {
        }

        public CEDbCheckState getAppState() {
            return null;
        }

        public CEDbCheckState getFcState() {
            return null;
        }

        public String getAppMD5() {
            return null;
        }

        public String getFcMD5() {
            return null;
        }

        public String getServerMD5() {
            return null;
        }

        public void setAppState(CEDbCheckState cEDbCheckState) {
        }

        public void setFcState(CEDbCheckState cEDbCheckState) {
        }

        public void setAppMD5(String string) {
        }

        public void setFcMD5(String string) {
        }

        public void setServerMD5(String string) {
        }

        public String toString() {
            return null;
        }
    }

    public static class DbUpgradeCheckStateWrapper {
        private DatabaseUpgradeCheckState mCheckState;
        private String mLatestVersion;
        private CheckException mCheckException;
        public static final DbUpgradeCheckStateWrapper DEFAULT_DB_UPGRADE_CHECK_STATE = new DbUpgradeCheckStateWrapper(DatabaseUpgradeCheckState.UNKNOWN, "");

        public DbUpgradeCheckStateWrapper(DatabaseUpgradeCheckState databaseUpgradeCheckState, String string) {
        }

        public DbUpgradeCheckStateWrapper(DatabaseUpgradeCheckState databaseUpgradeCheckState) {
        }

        public DbUpgradeCheckStateWrapper(DatabaseUpgradeCheckState databaseUpgradeCheckState, CheckException checkException) {
        }

        public DatabaseUpgradeCheckState getCheckState() {
            return null;
        }

        public String getLatestVersion() {
            return null;
        }

        public CheckException getCheckException() {
            return null;
        }

        public String toString() {
            return null;
        }
    }

    public static class DbUpgradeStateWrapper {
        private DbUpgradeState mDbUpgradeState;
        private DJIDataUpgradeListener.DataFailReason mFailReason;
        public static final DbUpgradeStateWrapper DEFAULT_DB_UPGRADE_STATE = new DbUpgradeStateWrapper(DbUpgradeState.IDLE, DJIDataUpgradeListener.DataFailReason.NONE);

        public DbUpgradeStateWrapper(DbUpgradeState dbUpgradeState, DJIDataUpgradeListener.DataFailReason dataFailReason) {
        }

        public DbUpgradeStateWrapper(DbUpgradeState dbUpgradeState) {
        }

        public DbUpgradeState getDbUpgradeState() {
            return null;
        }

        public DJIDataUpgradeListener.DataFailReason getFailReason() {
            return null;
        }

        public void setDbUpgradeState(DbUpgradeState dbUpgradeState) {
        }

        public void setFailReason(DJIDataUpgradeListener.DataFailReason dataFailReason) {
        }
    }

    public static final class DbUpgradeState
    extends Enum<DbUpgradeState> {
        public static final /* enum */ DbUpgradeState IDLE = new DbUpgradeState();
        public static final /* enum */ DbUpgradeState DOWNLOADING = new DbUpgradeState();
        public static final /* enum */ DbUpgradeState DOWNLOAD_SUCCESS = new DbUpgradeState();
        public static final /* enum */ DbUpgradeState UPGRADING = new DbUpgradeState();
        public static final /* enum */ DbUpgradeState DOWNLOAD_FAIL = new DbUpgradeState();
        public static final /* enum */ DbUpgradeState UPGRADE_FAIL = new DbUpgradeState();
        public static final /* enum */ DbUpgradeState UPGRADE_SUCCESS = new DbUpgradeState();
        private static final /* synthetic */ DbUpgradeState[] $VALUES;

        public static DbUpgradeState[] values() {
            return null;
        }

        public static DbUpgradeState valueOf(String string) {
            return null;
        }

        private static /* synthetic */ DbUpgradeState[] $values() {
            return null;
        }

        static {
            $VALUES = DbUpgradeState.$values();
        }
    }

    public static final class DataUpgradeCheckAllFinish
    extends Enum<DataUpgradeCheckAllFinish> {
        public static final /* enum */ DataUpgradeCheckAllFinish TRUE = new DataUpgradeCheckAllFinish();
        private static final /* synthetic */ DataUpgradeCheckAllFinish[] $VALUES;

        public static DataUpgradeCheckAllFinish[] values() {
            return null;
        }

        public static DataUpgradeCheckAllFinish valueOf(String string) {
            return null;
        }

        private static /* synthetic */ DataUpgradeCheckAllFinish[] $values() {
            return null;
        }

        static {
            $VALUES = DataUpgradeCheckAllFinish.$values();
        }
    }

    public static final class TypeDataUpgrade
    extends Enum<TypeDataUpgrade> {
        public static final /* enum */ TypeDataUpgrade APP_POLYGON_LOCAL = new TypeDataUpgrade();
        public static final /* enum */ TypeDataUpgrade REMOTE = new TypeDataUpgrade();
        public static final /* enum */ TypeDataUpgrade APP_CIRCLE_OLD = new TypeDataUpgrade();
        private static final /* synthetic */ TypeDataUpgrade[] $VALUES;

        public static TypeDataUpgrade[] values() {
            return null;
        }

        public static TypeDataUpgrade valueOf(String string) {
            return null;
        }

        private static /* synthetic */ TypeDataUpgrade[] $values() {
            return null;
        }

        static {
            $VALUES = TypeDataUpgrade.$values();
        }
    }
}

