/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.inner;

import java.util.List;
import java.util.Map;

public class ConstantsUtils {
    public static String getConstant(CONSTANT cONSTANT) {
        return null;
    }

    public static String getUrl(URL uRL) {
        return null;
    }

    public static Map<String, String> getRootCACerts() {
        return null;
    }

    public static Map<String, String> getRevokedCerts() {
        return null;
    }

    public static List<String> getCertificatesEncHash() {
        return null;
    }

    public static List<String> getCertificatesHash() {
        return null;
    }

    private static native String getConstant(int var0);

    private static native String getUrl(int var0, boolean var1);

    private static native Map<String, String> nativeGetRootCACerts();

    private static native Map<String, String> nativeGetRevokedCerts();

    private static native List<String> nativeGetCertificatesEncHash();

    private static native List<String> nativeGetCertificatesHash();

    static {
        try {
            System.loadLibrary("constants");
        }
        catch (Throwable e2) {
            System.loadLibrary("constants");
        }
    }

    public static final class CONSTANT
    extends Enum<CONSTANT> {
        public static final /* enum */ CONSTANT LDM_SERVER_AES = new CONSTANT(0);
        public static final /* enum */ CONSTANT LDM_SIGNATURE = new CONSTANT(1);
        public static final /* enum */ CONSTANT REGISTER_DEVICE_ID = new CONSTANT(2);
        public static final /* enum */ CONSTANT ANALYTICS_HEADER_NAME = new CONSTANT(3);
        public static final /* enum */ CONSTANT ANALYTICS_APP_ID = new CONSTANT(4);
        public static final /* enum */ CONSTANT REGISTER_REQUEST_URL_KEY = new CONSTANT(5);
        public static final /* enum */ CONSTANT SDK_REGISTER_PUBLIC_RSA_KEY = new CONSTANT(6);
        public static final /* enum */ CONSTANT INNER_NETWORK_CHECK_PUBLIC_RSA_KEY = new CONSTANT(7);
        public static final /* enum */ CONSTANT GUID_AES_KEY = new CONSTANT(8);
        public static final /* enum */ CONSTANT LOGIN_CALLBACK_URL = new CONSTANT(9);
        public static final /* enum */ CONSTANT VERIFY_CALLBACK_URL = new CONSTANT(10);
        public static final /* enum */ CONSTANT LOGIN_AES_KEY = new CONSTANT(11);
        public static final /* enum */ CONSTANT KEY_USER_INFO = new CONSTANT(12);
        public static final /* enum */ CONSTANT DATABASE_PASSWORD = new CONSTANT(13);
        public static final /* enum */ CONSTANT CLOUD_APP_ID = new CONSTANT(14);
        public static final /* enum */ CONSTANT CLOUD_SECRET_ID = new CONSTANT(15);
        public static final /* enum */ CONSTANT CLOUD_SECRET_KEY = new CONSTANT(16);
        public static final /* enum */ CONSTANT UNKNOWN = new CONSTANT(65535);
        private int data;
        private static final /* synthetic */ CONSTANT[] $VALUES;

        public static CONSTANT[] values() {
            return null;
        }

        public static CONSTANT valueOf(String string2) {
            return null;
        }

        private CONSTANT(int n2) {
        }

        static /* synthetic */ int access$000(CONSTANT cONSTANT) {
            return 0;
        }

        private static /* synthetic */ CONSTANT[] $values() {
            return null;
        }

        static {
            $VALUES = CONSTANT.$values();
        }
    }

    public static final class URL
    extends Enum<URL> {
        public static final /* enum */ URL LOGIN = new URL(0);
        public static final /* enum */ URL ANALYTICS = new URL(2);
        public static final /* enum */ URL REGISTER_SERVER = new URL(3);
        public static final /* enum */ URL RTK_SERVER = new URL(4);
        public static final /* enum */ URL RTK_SERVER_SEC = new URL(5);
        public static final /* enum */ URL LDM_LICENSE = new URL(6);
        public static final /* enum */ URL LOGIN_SEC = new URL(7);
        public static final /* enum */ URL LOGOUT = new URL(8);
        public static final /* enum */ URL LOGIN_RESULT = new URL(9);
        public static final /* enum */ URL VALIDATE_TOKEN = new URL(10);
        public static final /* enum */ URL LTE_REAL_NAME = new URL(11);
        public static final /* enum */ URL LTE_REAL_NAME_APP_KEY = new URL(12);
        public static final /* enum */ URL LOGIN_WITH_PHONE = new URL(13);
        public static final /* enum */ URL LOGIN_WITH_EMAIL = new URL(14);
        public static final /* enum */ URL CAPTCHA_IMAGE_URL = new URL(15);
        public static final /* enum */ URL UNKNOWN = new URL(65535);
        private final int data;
        private static final /* synthetic */ URL[] $VALUES;

        public static URL[] values() {
            return null;
        }

        public static URL valueOf(String string2) {
            return null;
        }

        private URL(int n2) {
        }

        static /* synthetic */ int access$100(URL uRL) {
            return 0;
        }

        private static /* synthetic */ URL[] $values() {
            return null;
        }

        static {
            $VALUES = URL.$values();
        }
    }
}

