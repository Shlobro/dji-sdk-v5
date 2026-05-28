/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil {
    private static final String TAG = EncryptUtil.class.getSimpleName();
    private static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    private static final String AES_CBC_PKCS5_PADDING = "AES/CBC/PKCS5Padding";
    private static final String RSA_ECB_PKCS1_PADDING = "RSA/ECB/PKCS1Padding";
    private static final String HMAC_SHA1_NAME = "HmacSHA1";
    private static final String HMAC_SHA256_NAME = "HmacSHA256";
    private static final String HMAC_MD5_NAME = "HmacMD5";
    private static final String ENCODING = "UTF-8";
    public static final String ALGO_MD5 = "MD5";
    public static final String ALGO_SHA1 = "SHA-1";
    public static final String ALGO_RSA = "RSA";
    public static final String ALGO_AES = "AES";

    public static String stringToMD5(String string) {
        byte[] hash;
        try {
            hash = MessageDigest.getInstance(ALGO_MD5).digest(string.getBytes(StandardCharsets.UTF_8));
        }
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
        StringBuilder hex = new StringBuilder(hash.length * 2);
        for (byte b : hash) {
            if ((b & 0xFF) < 16) {
                hex.append("0");
            }
            hex.append(Integer.toHexString(b & 0xFF));
        }
        return hex.toString();
    }
}

