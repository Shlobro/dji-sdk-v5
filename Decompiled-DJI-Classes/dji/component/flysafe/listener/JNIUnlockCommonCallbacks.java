/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.listener;

import androidx.annotation.Keep;
import dji.jni.JNIProguardKeepTag;

@Keep
public class JNIUnlockCommonCallbacks
implements JNIProguardKeepTag {
    private static int NETWORKING_ERROR_START = 100;
    private static int NETWORKING_UNKNOWN_ERROR = 200;
    private static int PACK_MANAGER_UNKNOWN_ERROR = 300;
    private static int DATABASE_FILE_UNKNOWN_ERROR = 400;

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

    @Keep
    public static final class JNIUnlockError
    extends Enum<JNIUnlockError> {
        public static final /* enum */ JNIUnlockError NoError = new JNIUnlockError(0);
        public static final /* enum */ JNIUnlockError LocalUserTokenIsInvalid = new JNIUnlockError(1);
        public static final /* enum */ JNIUnlockError NetworkingErrorStart = new JNIUnlockError(JNIUnlockCommonCallbacks.access$000());
        public static final /* enum */ JNIUnlockError NetworkingNoNetworking = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingServerDataError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingSignatureError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingCheckSignatureError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingInvalidRequeset = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingPageNotFound = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingUserIsNotLogin = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingOperationCancelByUser = new JNIUnlockError(JNIUnlockCommonCallbacks.access$004());
        public static final /* enum */ JNIUnlockError NetworkingUnknownError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$100());
        public static final /* enum */ JNIUnlockError PackManagerErrorStart = new JNIUnlockError(JNIUnlockCommonCallbacks.access$104());
        public static final /* enum */ JNIUnlockError PackManagerTimeout = new JNIUnlockError(JNIUnlockCommonCallbacks.access$104());
        public static final /* enum */ JNIUnlockError PackManagerWrongUnlockVersion = new JNIUnlockError(JNIUnlockCommonCallbacks.access$104());
        public static final /* enum */ JNIUnlockError PackManagerWrongDeviceId = new JNIUnlockError(JNIUnlockCommonCallbacks.access$104());
        public static final /* enum */ JNIUnlockError PackManagerWrongSerialNumber = new JNIUnlockError(JNIUnlockCommonCallbacks.access$104());
        public static final /* enum */ JNIUnlockError PackManagerUnknownError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$200());
        public static final /* enum */ JNIUnlockError DataBaseErrorStart = new JNIUnlockError(JNIUnlockCommonCallbacks.access$204());
        public static final /* enum */ JNIUnlockError DataBaseFileError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$204());
        public static final /* enum */ JNIUnlockError DataBaseInvalidParams = new JNIUnlockError(JNIUnlockCommonCallbacks.access$204());
        public static final /* enum */ JNIUnlockError DataBaseNotReady = new JNIUnlockError(JNIUnlockCommonCallbacks.access$204());
        public static final /* enum */ JNIUnlockError DataBaseFileUnknownError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$300());
        public static final /* enum */ JNIUnlockError LicenseUnlockErrorStart = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockInvalidAreaIds = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockFCOpQueryFailed = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockFCOpSetEnableFailed = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError SetLicenseEnableUserIdError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError SetLicenseEnableNoSuchLicense = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError SetLicenseEnableVersionNotMatch = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError SetLicenseEnableParamError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError SetLicenseEnableDroneInSky = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError UploadLicenseDataUserIdError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError UploadLicenseDataIndexError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError UploadLicenseDataError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError UploadLicenseDataCrcCheckFailed = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError UploadLicenseDataSNCheckFailed = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError UploadLicenseDataVersionCheckError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError UploadLicenseDataDroneInSky = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockNotSupported = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError RemoveLicensesFailedForAircraftInAir = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError RemoveLicensesNotSupported = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError FetchLicenseDataNoDataError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError FetchLicenseDataLowFirmwareVersionError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError FetchLicenseDataUnlockVersionError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError FetchLicenseDataOldDataError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError FetchLicenseDataInvalidKeyVersionError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError FetchLicenseIdNoLicenseError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockServerInvalidTokenError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockServerUnidentifiedPhoneError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockServerNotUnlockableAreaError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockServerUnlockTooManyAreasError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockServerTooMuchLicenseError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockServerJsonDataParseError = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockLocalExceedMaxQuantity = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockLocalLicenseDataInvalid = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        public static final /* enum */ JNIUnlockError LicenseUnlockLocalUserIdMismatch = new JNIUnlockError(JNIUnlockCommonCallbacks.access$304());
        int mValue;
        private static volatile JNIUnlockError[] sValues;
        private static final /* synthetic */ JNIUnlockError[] $VALUES;

        public static JNIUnlockError[] values() {
            return null;
        }

        public static JNIUnlockError valueOf(String string) {
            return null;
        }

        private JNIUnlockError(int n2) {
        }

        public int getValue() {
            return 0;
        }

        public static JNIUnlockError ofValue(int n) {
            return null;
        }

        private static /* synthetic */ JNIUnlockError[] $values() {
            return null;
        }

        static {
            $VALUES = JNIUnlockError.$values();
            sValues = null;
        }
    }

    @Keep
    public static interface JNICheckWillApplyTFRSCallback {
        public void onSuccess();

        public void onFailure();
    }

    @Keep
    public static interface UnlockCallbackWithErrorEnum {
        public void onSuccess();

        public void onFailure(JNIUnlockError var1);
    }

    @Keep
    public static interface UnlockCommonCallbackWithInfo<T> {
        public void onSuccess(T var1);

        public void onFailure(JNIUnlockError var1);
    }

    @Keep
    public static interface JNIUnlockCommonCallbackWith<T> {
        public void onSuccess(T var1);

        public void onFailure(int var1);
    }

    @Keep
    public static interface JNIUnlockCallback {
        public void onSuccess();

        public void onFailure(int var1);
    }
}

