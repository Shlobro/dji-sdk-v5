/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.listener;

import dji.jni.JNIProguardKeepTag;

public class JNIFSCommonCallbacks
implements JNIProguardKeepTag {
    private static int NETWORKING_ERROR_START = 100;
    private static int NETWORKING_UNKNOWN_ERROR = 200;
    private static int PACK_MANAGER_UNKNOWN_ERROR = 300;
    private static int DATABASE_FILE_UNKNOWN_ERROR = 400;
    private static int LICENSE_UNLOCK_UNKNOWN_ERROR = 500;

    static /* synthetic */ int access$000() {
        return 0;
    }

    static /* synthetic */ int access$004() {
        return 0;
    }

    static /* synthetic */ int access$100() {
        return 0;
    }

    static /* synthetic */ int access$104() {
        return 0;
    }

    static /* synthetic */ int access$200() {
        return 0;
    }

    static /* synthetic */ int access$204() {
        return 0;
    }

    static /* synthetic */ int access$300() {
        return 0;
    }

    static /* synthetic */ int access$304() {
        return 0;
    }

    static /* synthetic */ int access$400() {
        return 0;
    }

    static /* synthetic */ int access$404() {
        return 0;
    }

    public static final class JNIFsError
    extends Enum<JNIFsError>
    implements JNIProguardKeepTag {
        public static final /* enum */ JNIFsError NoError = new JNIFsError(0);
        public static final /* enum */ JNIFsError LocalUserTokenIsInvalid = new JNIFsError(1);
        public static final /* enum */ JNIFsError LoadDbFailed = new JNIFsError(3);
        public static final /* enum */ JNIFsError NetworkingErrorStart = new JNIFsError(JNIFSCommonCallbacks.access$000());
        public static final /* enum */ JNIFsError NetworkingNoNetworking = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingServerDataError = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingSignatureError = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingCheckSignatureError = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingInvalidRequeset = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingPageNotFound = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingUserIsNotLogin = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingOperationCancelByUser = new JNIFsError(JNIFSCommonCallbacks.access$004());
        public static final /* enum */ JNIFsError NetworkingUnknownError = new JNIFsError(JNIFSCommonCallbacks.access$100());
        public static final /* enum */ JNIFsError PackManagerErrorStart = new JNIFsError(JNIFSCommonCallbacks.access$104());
        public static final /* enum */ JNIFsError PackManagerTimeout = new JNIFsError(JNIFSCommonCallbacks.access$104());
        public static final /* enum */ JNIFsError PackManagerWrongUnlockVersion = new JNIFsError(JNIFSCommonCallbacks.access$104());
        public static final /* enum */ JNIFsError PackManagerWrongDeviceId = new JNIFsError(JNIFSCommonCallbacks.access$104());
        public static final /* enum */ JNIFsError PackManagerWrongSerialNumber = new JNIFsError(JNIFSCommonCallbacks.access$104());
        public static final /* enum */ JNIFsError PackManagerUnknownError = new JNIFsError(JNIFSCommonCallbacks.access$200());
        public static final /* enum */ JNIFsError DataBaseErrorStart = new JNIFsError(JNIFSCommonCallbacks.access$204());
        public static final /* enum */ JNIFsError DataBaseFileError = new JNIFsError(JNIFSCommonCallbacks.access$204());
        public static final /* enum */ JNIFsError DataBaseInvalidParams = new JNIFsError(JNIFSCommonCallbacks.access$204());
        public static final /* enum */ JNIFsError DataBaseNotReady = new JNIFsError(JNIFSCommonCallbacks.access$204());
        public static final /* enum */ JNIFsError DataBaseFileUnknownError = new JNIFsError(JNIFSCommonCallbacks.access$300());
        public static final /* enum */ JNIFsError LicenseUnlockErrorStart = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockInvalidAreaIds = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockFCOpQueryFailed = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockFCOpSetEnableFailed = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError SetLicenseEnableUserIdError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError SetLicenseEnableNoSuchLicense = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError SetLicenseEnableVersionNotMatch = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError SetLicenseEnableParamError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError SetLicenseEnableDroneInSky = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError UploadLicenseDataUserIdError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError UploadLicenseDataIndexError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError UploadLicenseDataError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError UploadLicenseDataCrcCheckFailed = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError UploadLicenseDataSNCheckFailed = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError UploadLicenseDataVersionCheckError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError UploadLicenseDataDroneInSky = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockNotSupported = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError FetchLicenseDataNoDataError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError FetchLicenseDataLowFirmwareVersionError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError FetchLicenseDataUnlockVersionError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError FetchLicenseDataOldDataError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError FetchLicenseDataInvalidKeyVersionError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError FetchLicenseIdNoLicenseError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockServerInvalidTokenError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockServerUnidentifiedPhoneError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockServerNotUnlockableAreaError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockServerUnlockTooManyAreasError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockServerTooMuchLicenseError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockServerJsonDataParseError = new JNIFsError(JNIFSCommonCallbacks.access$304());
        public static final /* enum */ JNIFsError LicenseUnlockUnknownError = new JNIFsError(JNIFSCommonCallbacks.access$400());
        public static final /* enum */ JNIFsError UpgradeSystemBusy = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError UpgradeCommonDisconnected = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError UpgradeCommonExecutionFailed = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError UpgradeInDownloadingProcess = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError UpgrdaeCannotUpgradeInCurrentState = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError UpgradeDownloadDataBaseFirstBeforeUpgrade = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError UpgradeCannotWithMotorUp = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError UpgradeErrorInUpgradeLibrary = new JNIFsError(JNIFSCommonCallbacks.access$404());
        public static final /* enum */ JNIFsError CEDBNotExist = new JNIFsError(514);
        public static final /* enum */ JNIFsError CEInvalidDBType = new JNIFsError(515);
        public static final /* enum */ JNIFsError CESwitchDBFailed = new JNIFsError(516);
        public static final /* enum */ JNIFsError CEExportFCDBFailed = new JNIFsError(517);
        public static final /* enum */ JNIFsError CEImportInvalidJson = new JNIFsError(518);
        public static final /* enum */ JNIFsError CESyncDBSizeErr = new JNIFsError(519);
        public static final /* enum */ JNIFsError CEInvalidAircraftGPS = new JNIFsError(520);
        public static final /* enum */ JNIFsError CEInvalidGPS = new JNIFsError(521);
        int mValue;
        private static volatile JNIFsError[] sValues;
        private static final /* synthetic */ JNIFsError[] $VALUES;

        public static JNIFsError[] values() {
            return null;
        }

        public static JNIFsError valueOf(String string) {
            return null;
        }

        private JNIFsError(int n2) {
        }

        public int getValue() {
            return 0;
        }

        public static JNIFsError ofValue(int n) {
            return null;
        }

        private static /* synthetic */ JNIFsError[] $values() {
            return null;
        }

        static {
            $VALUES = JNIFsError.$values();
            sValues = null;
        }
    }

    public static interface JNIFSCommonCallbackWithInfo<T>
    extends JNIProguardKeepTag {
        public void onSuccess(T var1);

        public void onFailure(JNIFsError var1);
    }

    public static interface JNIFSCommonCallbackWithErrorEnum
    extends JNIProguardKeepTag {
        public void onSuccess();

        public void onFailure(JNIFsError var1);
    }

    public static interface JNIFSCommonCallbackWith<T>
    extends JNIProguardKeepTag {
        public void onSuccess(T var1);

        public void onFailure(int var1);
    }

    public static interface JNIFSCommonCallback
    extends JNIProguardKeepTag {
        public void onSuccess();

        public void onFailure(int var1);
    }
}

