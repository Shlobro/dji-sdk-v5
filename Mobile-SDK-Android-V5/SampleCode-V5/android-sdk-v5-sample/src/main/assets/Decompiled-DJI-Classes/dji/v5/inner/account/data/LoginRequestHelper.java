/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.inner.account.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.ErrorImp;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.account.data.LoginCommonResponse;
import dji.v5.manager.account.data.LoginResultResponse;
import dji.v5.utils.common.LogUtils;
import dji.v5.utils.inner.ConstantsUtils;
import java.util.Map;

public class LoginRequestHelper {
    public static final String TAG = LogUtils.getTag("LoginRequestHelper");
    private static final String LOGIN_SEC = ConstantsUtils.getUrl(ConstantsUtils.URL.LOGIN_SEC);
    private static final String URL_LOGOUT = ConstantsUtils.getUrl(ConstantsUtils.URL.LOGOUT);
    private static final String URL_CAPTCHA_IMAGE = ConstantsUtils.getUrl(ConstantsUtils.URL.CAPTCHA_IMAGE_URL);
    public static final String URL_QUERY_LOGIN_RESULT = ConstantsUtils.getUrl(ConstantsUtils.URL.LOGIN_RESULT);
    public static final String VALIDATE_TOKEN = ConstantsUtils.getUrl(ConstantsUtils.URL.VALIDATE_TOKEN);
    private static final String URL_LOGIN_WITH_PHONE = ConstantsUtils.getUrl(ConstantsUtils.URL.LOGIN_WITH_PHONE);
    private static final String URL_LOGIN_WITH_EMAIL = ConstantsUtils.getUrl(ConstantsUtils.URL.LOGIN_WITH_EMAIL);
    private static final int ERROR_CODE_ACCOUNT_OR_PASSWORD_ILLEGAL = 305;
    public static final int INVALID_TOKEN = 504;
    private static final String TICKET_KEY = "ticket";
    private static final String ACTION_TYPE_KEY = "actionType";
    private static final String APP_ID_KEY = "appid";
    private static final String SIGN_KEY = "sign";
    private static final String CLIENT_NAME_MC_KEY = "ClientName-Mc";
    private static final String DEVICE_ID_MC_KEY = "DeviceId-Mc";
    private static final String APP_ID_MC_KEY = "AppId-Mc";
    private static final String APP_TIMESTAMP_MC_KEY = "Timestamp-Mc";
    private static final String INVOKE_ID_MC_KEY = "InvokeId-Mc";
    private static final String SIGN_MC_KEY = "Sign-Mc";
    private static final String ACTION_TYPE = "login";
    private static final String APP_ID = "mobile_sdk";
    private static final String SRANDOM_RANGE = "abcdefghijklmnopqrstuvwxyz0123456789";
    private static String mSrandom = "";

    public static void queryLoginResult(String string2, CommonCallbacks.CompletionCallbackWithParam<LoginResultResponse.Result> completionCallbackWithParam) {
    }

    public static void updateUserAccountValidation(String string2, CommonCallbacks.CompletionCallbackWithParam<Boolean> completionCallbackWithParam) {
    }

    public static void logoutDJIAccount(String string2, String string3, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public static void loginWithPhone(String string2, String string3, String string4, String string5, CommonCallbacks.CompletionCallbackWithParam<LoginCommonResponse.Data> completionCallbackWithParam) {
    }

    public static void loginWithEmail(@NonNull String string2, @NonNull String string3, @Nullable String string4, CommonCallbacks.CompletionCallbackWithParam<LoginCommonResponse.Data> completionCallbackWithParam) {
    }

    public static String getCaptchaImageUrl() {
        return null;
    }

    private static String generateRandomString() {
        return null;
    }

    private static String getTicketValue(String string2) {
        return null;
    }

    private static Map<String, String> getHeader() {
        return null;
    }

    private LoginRequestHelper() {
    }

    private static ErrorImp getSystemError(String string2, int n, String string3) {
        return null;
    }

    private static void logErrorInfo(String string2, int n, String string3, IDJIError iDJIError) {
    }

    static /* synthetic */ ErrorImp access$000(String string2, int n, String string3) {
        return null;
    }

    static /* synthetic */ void access$100(String string2, int n, String string3, IDJIError iDJIError) {
    }
}

