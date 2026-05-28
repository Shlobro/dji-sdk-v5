/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dji.v5.core.R$string
 */
package dji.v5.common.error;

import dji.v5.common.error.ErrorType;
import dji.v5.common.error.IErrorFactory;
import dji.v5.core.R;

public class DJISDKError
extends IErrorFactory.DefaultErrorFactory {
    public static final String REGISTER_WITHOUT_INIT = "REGISTER_WITHOUT_INIT";
    public static final String INVALID_APP_KEY = "INVALID_APP_KEY";
    public static final String BUNDLE_NOT_MATCH = "BUNDLE_NOT_MATCH";
    public static final String APP_KEY_PROHIBITED = "APP_KEY_PROHIBITED";
    public static final String MAX_ACTIVATION_COUNT_REACHED = "MAX_ACTIVATION_COUNT_REACHED";
    public static final String APP_KEY_INVALID_PLATFORM = "APP_KEY_INVALID_PLATFORM";
    public static final String APP_KEY_NOT_EXIST = "APP_KEY_NOT_EXIST";
    public static final String APP_KEY_LEVEL_NOT_PERMITTED = "APP_KEY_LEVEL_NOT_PERMITTED";
    public static final String OVER_MAX_ACTIVATIONS_COUNT = "OVER_MAX_ACTIVATIONS_COUNT";
    public static final String SERVER_PARSE_FAILURE = "SERVER_PARSE_FAILURE";
    public static final String SERVER_WRITE_FAILURE = "SERVER_WRITE_FAILURE";
    public static final String SERVER_DATA_ABNORMAL = "SERVER_DATA_ABNORMAL";
    public static final String INVALID_METADATA = "INVALID_METADATA";
    public static final String EMPTY_APP_KEY = "EMPTY_APP_KEY";
    public static final String REGISTRATION_AES_ENCRYPT_ERROR = "REGISTRATION_AES_ENCRYPT_ERROR";
    public static final String REGISTRATION_INVALID_UUID = "REGISTRATION_INVALID_UUID";
    public static final String APP_KEY_NOT_ENROLLED_BY_BETA_SDK = "APP_KEY_NOT_ENROLLED_BY_BETA_SDK";
    public static final String INVALID_APP_KEY_FOR_BETA_VERSION = "INVALID_APP_KEY_FOR_BETA_VERSION";
    public static final String SDK_VERSION_BLOCKED = "SDK_VERSION_BLOCKED";
    public static final String ACTIVATE_FAILED = "ACTIVATE_FAILED";
    public static final String APP_KEY_BLOCKED = "APP_KEY_BLOCKED";
    public static final String COULD_NOT_CONNECT_TO_INTERNET = "COULD_NOT_CONNECT_TO_INTERNET";
    public static final String INVALID_PRODUCT_CATEGORY = "INVALID_PRODUCT_CATEGORY";
    public static final String MSDK_VERSION_MISMATCH = "MSDK_VERSION_MISMATCH";
    public static final DJISDKError FACTORY = new DJISDKError();

    @Override
    public IErrorFactory.InnerError findInnerError(String string2) {
        return null;
    }

    @Override
    public ErrorType errorType() {
        return null;
    }

    private static final class Error
    extends Enum<Error>
    implements IErrorFactory.InnerError {
        public static final /* enum */ Error REGISTER_WITHOUT_INIT = new Error("REGISTER_WITHOUT_INIT", "Please init first", R.string.dji_msdk_error_register_without_init);
        public static final /* enum */ Error EMPTY_APP_KEY = new Error("EMPTY_APP_KEY", "The app key was not provided.", R.string.dji_msdk_error_empty_app_key);
        public static final /* enum */ Error INVALID_APP_KEY = new Error("INVALID_APP_KEY", "The app key submitted is invalid. Please check the app key you provided.", R.string.dji_msdk_error_invalid_app_key);
        public static final /* enum */ Error REGISTRATION_INVALID_UUID = new Error("REGISTRATION_INVALID_UUID", "Server error, uuid error.", R.string.dji_msdk_error_registration_invalid_uuid);
        public static final /* enum */ Error BUNDLE_NOT_MATCH = new Error("BUNDLE_NOT_MATCH", "The bundle identifier of your app should be identical to the one you registered on the website.", R.string.dji_msdk_error_bundle_not_match);
        public static final /* enum */ Error APP_KEY_PROHIBITED = new Error("APP_KEY_PROHIBITED", "The app key is prohibited, please contact <dev@dji.com> for help.", R.string.dji_msdk_error_app_key_prohibited);
        public static final /* enum */ Error MAX_ACTIVATION_COUNT_REACHED = new Error("MAX_ACTIVATION_COUNT_REACHED", "The app key reached maximum number of activations, please contact <dev@dji.com> for help.", R.string.dji_msdk_error_max_activation_count_reached);
        public static final /* enum */ Error APP_KEY_INVALID_PLATFORM = new Error("APP_KEY_INVALID_PLATFORM", "The app key is not valid for this platform.", R.string.dji_msdk_error_app_key_invalid_platform);
        public static final /* enum */ Error APP_KEY_NOT_EXIST = new Error("APP_KEY_NOT_EXIST", "The app key does not exist. Please check the app key you provided.", R.string.dji_msdk_error_app_key_not_exist);
        public static final /* enum */ Error APP_KEY_LEVEL_NOT_PERMITTED = new Error("APP_KEY_LEVEL_NOT_PERMITTED", "The app key does not have the required permission.", R.string.dji_msdk_error_app_key_level_not_permitted);
        public static final /* enum */ Error OVER_MAX_ACTIVATIONS_COUNT = new Error("OVER_MAX_ACTIVATIONS_COUNT", "SDK user who do not have the professional membership only could have the maximum of 20 unique activations.", R.string.dji_msdk_error_over_max_activations_count);
        public static final /* enum */ Error SERVER_PARSE_FAILURE = new Error("SERVER_PARSE_FAILURE", "Server error, parse failure.", R.string.dji_msdk_error_server_parse_failure);
        public static final /* enum */ Error SERVER_WRITE_FAILURE = new Error("SERVER_WRITE_FAILURE", "Server error, write failure.", R.string.dji_msdk_error_server_write_failure);
        public static final /* enum */ Error SERVER_DATA_ABNORMAL = new Error("SERVER_DATA_ABNORMAL", "Server error, data abnormal.", R.string.dji_msdk_error_server_data_abnormal);
        public static final /* enum */ Error INVALID_METADATA = new Error("INVALID_METADATA", "The metadata received from server is invalid, please reconnect to the server and try.", R.string.dji_msdk_error_invalid_metadata);
        public static final /* enum */ Error REGISTRATION_AES_ENCRYPT_ERROR = new Error("REGISTRATION_AES_ENCRYPT_ERROR", "Server error, aes error.", R.string.dji_msdk_error_registration_aes_encrypt_error);
        public static final /* enum */ Error APP_KEY_NOT_ENROLLED_BY_BETA_SDK = new Error("APP_KEY_NOT_ENROLLED_BY_BETA_SDK", "The application is not enrolled in the Beta Program. Use an app key under the Beta Program instead.", R.string.dji_msdk_error_app_key_not_enrolled_by_beta_sdk);
        public static final /* enum */ Error INVALID_APP_KEY_FOR_BETA_VERSION = new Error("INVALID_APP_KEY_FOR_BETA_VERSION", "The app key is invalid for this beta version.", R.string.dji_msdk_error_invalid_app_key_for_beta_version);
        public static final /* enum */ Error SDK_VERSION_BLOCKED = new Error("SDK_VERSION_BLOCKED", "The sdk version is blocked", R.string.dji_msdk_error_sdk_version_blocked);
        public static final /* enum */ Error ACTIVATE_FAILED = new Error("ACTIVATE_FAILED", "The app activation failed", R.string.dji_msdk_error_activate_failed);
        public static final /* enum */ Error APP_KEY_BLOCKED = new Error("APP_KEY_BLOCKED", "The app key is blocked", R.string.dji_msdk_error_app_key_blocked);
        public static final /* enum */ Error COULD_NOT_CONNECT_TO_INTERNET = new Error("COULD_NOT_CONNECT_TO_INTERNET", "For first time registration, app should be connected to Internet.", R.string.dji_msdk_error_could_not_connect_to_internet);
        public static final /* enum */ Error INVALID_PRODUCT_CATEGORY = new Error("INVALID_PRODUCT_CATEGORY", "Invalid product category key, pls check.", R.string.dji_msdk_error_invalid_product_category);
        public static final /* enum */ Error MSDK_VERSION_MISMATCH = new Error("MSDK_VERSION_MISMATCH", "This MSDK version cannot run on this type of remote controller.", R.string.dji_msdk_error_msdk_mismatch);
        private final String errorCode;
        private final String hint;
        private final int resID;
        private static Error[] mValues;
        private static final /* synthetic */ Error[] $VALUES;

        public static Error[] values() {
            return null;
        }

        public static Error valueOf(String string2) {
            return null;
        }

        private Error(String string3, String string4, int n2) {
        }

        @Override
        public String errorCode() {
            return null;
        }

        @Override
        public String hint() {
            return null;
        }

        @Override
        public int resID() {
            return 0;
        }

        private static Error[] getValues() {
            return null;
        }

        private static Error find(String string2) {
            return null;
        }

        static /* synthetic */ Error access$000(String string2) {
            return null;
        }

        private static /* synthetic */ Error[] $values() {
            return null;
        }

        static {
            $VALUES = Error.$values();
        }
    }
}

