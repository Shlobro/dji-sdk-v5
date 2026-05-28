/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.network.security;

public class WhiteBoxAES {
    private WhiteBoxAES() {
    }

    public static byte[] hex2byte(String string2) {
        return null;
    }

    public static String byte2hex(byte[] byArray) {
        return null;
    }

    public static native byte[] decryptFromWhiteBox(byte[] var0);

    static {
        System.loadLibrary("waes");
    }
}

