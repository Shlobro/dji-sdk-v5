/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.common;

import dji.v5.utils.common.LogUtils;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SignatureException;

public class SignatureUtil {
    public static final String TAG = LogUtils.getTag("SignatureUtil");
    private static final String HMAC_SHA1_ALGORITHM = "HmacSHA1";
    private static byte[] iv = new byte[16];

    private SignatureUtil() {
    }

    public static String calculateRFC2104HMAC(String string2, String string3) throws SignatureException {
        return null;
    }

    public static String encryptEAS(String string2, String string3) throws IOException, GeneralSecurityException {
        return null;
    }

    public static String encryptEAS(String string2, String string3, int n) throws IOException, GeneralSecurityException {
        return null;
    }

    public static String encryptHmacSha256(String string2, String string3) {
        return null;
    }
}

