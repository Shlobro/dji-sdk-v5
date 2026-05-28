/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.listener;

public class JNIUpgradeDatabaseCallbacks {
    private static int LicenseUnlockUnknownError = 500;

    static /* synthetic */ int access$004() {
        return 0;
    }

    public static interface JNICommonCallbackWith<T> {
        public void onResult(T var1);
    }

    public static interface JNIEnumCallback {
        public void onSuccess();

        public void onFailure(DatabaseUpgradeErrorJni var1);
    }

    public static interface JNICommonCallback {
        public void onSuccess();

        public void onFailure(int var1);
    }

    public static final class DatabaseUpgradeErrorJni
    extends Enum<DatabaseUpgradeErrorJni> {
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeSystemBusy = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCommonDisconnected = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeInDownloadingProcess = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgrdaeCannotUpgradeInCurrentState = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeDownloadDataBaseFirstBeforeUpgrade = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCannotWithMotorUp = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeErrorInUpgradeLibrary = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCEDownloadFail = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCELockMotorFail = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCEDatalinkReverseFail = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCETransferFail = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCEDatalinkRecoveryFail = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni UpgradeCEMotorRecoveryFail = new DatabaseUpgradeErrorJni(JNIUpgradeDatabaseCallbacks.access$004());
        public static final /* enum */ DatabaseUpgradeErrorJni OTHER = new DatabaseUpgradeErrorJni(10000);
        int mValue;
        private static volatile DatabaseUpgradeErrorJni[] sValues;
        private static final /* synthetic */ DatabaseUpgradeErrorJni[] $VALUES;

        public static DatabaseUpgradeErrorJni[] values() {
            return null;
        }

        public static DatabaseUpgradeErrorJni valueOf(String string) {
            return null;
        }

        private DatabaseUpgradeErrorJni(int n2) {
        }

        public int getValue() {
            return 0;
        }

        public static DatabaseUpgradeErrorJni ofValue(int n) {
            return null;
        }

        private static /* synthetic */ DatabaseUpgradeErrorJni[] $values() {
            return null;
        }

        static {
            $VALUES = DatabaseUpgradeErrorJni.$values();
            sValues = null;
        }
    }
}

