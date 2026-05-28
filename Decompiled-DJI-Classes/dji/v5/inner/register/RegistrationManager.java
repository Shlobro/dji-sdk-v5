/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.inner.register;

import androidx.annotation.Keep;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.inner.register.IRegistrationManager;

public class RegistrationManager
implements IRegistrationManager {
    private final String tag;
    private static final int APP_ID_LENGTH = 24;
    private static final int STRING_NUMBER_OF_START = 0;
    private static final int STRING_INSTALL_UUID = 1;
    private static final int STRING_PRODUCT_NAME = 2;
    private static final int STRING_PRODUCT_SN = 3;
    private static final String SDK_INFO_FILE_NAME = "test.json";
    private final String[] lastInfo;

    public static RegistrationManager getInstance() {
        return null;
    }

    private RegistrationManager() {
    }

    @Override
    public void registerApp(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public boolean canAccessToSDK() {
        return false;
    }

    private IDJIError preconditionForRegistration(String string, String string2) {
        return null;
    }

    private IDJIError getSdkConfigFileFromServer(String string, String string2) {
        return null;
    }

    private String getRegistrationUrl(String string, String string2) {
        return null;
    }

    private int checkLocalSdkConfigFile(String string, String string2) {
        return 0;
    }

    private void saveLatestInfoToFile() {
    }

    private String[] getLatestInfoFromFile() {
        return null;
    }

    private IDJIError getSDKErrorFromResult(int n) {
        return null;
    }

    private String getContentFromUrl(String string) {
        return null;
    }

    private boolean appIdCheck(String string) {
        return false;
    }

    private String stringToURLEncoder(String string) {
        return null;
    }

    private String getFileContentForServer(String string, String string2) {
        return null;
    }

    @Keep
    public static boolean verifySignWithRSA(String string, String string2) {
        return false;
    }

    /* synthetic */ RegistrationManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final RegistrationManager INSTANCE = new RegistrationManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ RegistrationManager access$100() {
            return null;
        }
    }
}

