/*
 * Decompiled with CFR 0.152.
 */
package dji.log.impl;

import dji.log.IEncryption;
import javax.crypto.SecretKey;

public class SimpleEncryption
implements IEncryption {
    static final String HEX_STR = "0123456789abcdef";
    static final String CHARSET_NAME = "UTF-8";
    static final String TRANSFORMATION = "AES/CBC/PKCS5Padding";
    static final String IV_PARAMETER = "9d6c5cab5b0281255a222d1c861ddfdf";
    static final String SALT = "c8570ac98cc615aa6a6b97b3f20f1b41";
    static final String ALGORITHM = "PBKDF2WithHmacSHA1";
    static final String KEY_ALGORITHM = "AES";
    static final int ITERATION_COUNT = 1000;
    static final int KEY_LENGTH = 128;
    private final String KEY_STR;
    private SecretKey KEY;

    @Override
    public String encrypt(String string) throws Exception {
        return null;
    }

    @Override
    public String decrypt(String string) throws Exception {
        return null;
    }

    private boolean check() {
        return false;
    }

    public static String binaryToHexString(byte[] byArray) {
        return null;
    }

    public static byte[] hexStringToBinary(String string) {
        return null;
    }
}

