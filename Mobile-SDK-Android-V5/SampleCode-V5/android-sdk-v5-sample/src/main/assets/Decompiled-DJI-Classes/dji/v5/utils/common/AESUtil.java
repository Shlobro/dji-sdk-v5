/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.utils.common;

import android.content.Context;
import dji.v5.utils.common.LogUtils;
import dji.v5.utils.inner.ConstantsUtils;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.spec.SecretKeySpec;

public class AESUtil {
    public static final String TAG = LogUtils.getTag("AESUtil");
    private static final String KEY_ALGORITHM_AES = "AES";
    public static final String CHARSET_UTF_8 = "utf-8";
    public static final String CIPHER_PKCS5 = "AES/CBC/PKCS5Padding";
    public static final String CIPHER_PKCS7 = "AES/CBC/PKCS7Padding";
    private static final String HMAC_SHA1_NAME = "HmacSHA1";
    private static final String CIPHER_ALGORITHM = "AES/CBC/PKCS5Padding";
    private static byte[] ivBytes = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final String LOGIN_AES_KEY = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.LOGIN_AES_KEY);
    private static byte[] iv = new byte[16];

    private AESUtil() {
    }

    public static String decrypt(String string2, String string3) throws GeneralSecurityException, UnsupportedEncodingException {
        return null;
    }

    public static String decrypt(String string2, String string3, int n) throws GeneralSecurityException, UnsupportedEncodingException {
        return null;
    }

    public static String encrypt(String string2, String string3) throws GeneralSecurityException, UnsupportedEncodingException {
        return null;
    }

    public static byte[] decrypt1860Database(byte[] byArray, SecretKeySpec secretKeySpec) {
        return null;
    }

    public static byte[] decrypt(byte[] byArray, SecretKeySpec secretKeySpec, boolean bl) {
        return null;
    }

    public static void decryptToFile(Context context, byte[] byArray, SecretKeySpec secretKeySpec, String string2) {
    }

    public static void encrypt(Context context, byte[] byArray, SecretKeySpec secretKeySpec, String string2) {
    }

    public static String encryptHmacSha256(String string2, String string3) {
        return null;
    }

    public static byte[] encryptHmacSha256ToByteArray(String string2, String string3) {
        return null;
    }

    public static boolean isValid() {
        return false;
    }

    public static boolean verifySignWithRSA(String string2, String string3, String string4) {
        return false;
    }

    public static boolean verifyData(byte[] byArray, byte[] byArray2, PublicKey publicKey) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
        return false;
    }

    public static PublicKey loadPublicKey(String string2) throws NoSuchAlgorithmException, InvalidKeySpecException {
        return null;
    }

    public static byte[] encryptForRegister(String string2, String string3) throws GeneralSecurityException {
        return null;
    }

    public static String sign(String string2) throws GeneralSecurityException {
        return null;
    }

    public static String HmacSHA1EncryptBase64(String string2, String string3) {
        return null;
    }

    public static String encryptedString(String string2) {
        return null;
    }

    public static String decryptedString(String string2) {
        return null;
    }

    public static byte[] decrypt(byte[] byArray, String string2) throws GeneralSecurityException {
        return null;
    }

    public static byte[] encrypt(byte[] byArray, String string2) throws GeneralSecurityException {
        return null;
    }
}

