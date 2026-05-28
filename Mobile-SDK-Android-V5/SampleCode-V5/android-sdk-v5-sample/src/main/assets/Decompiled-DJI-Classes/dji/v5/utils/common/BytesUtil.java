/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.common;

import java.nio.ByteOrder;

public class BytesUtil {
    private static final char[] HEX_CHARS = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final int[] INTERVAL = new int[]{48, 57, 65, 90, 97, 122};

    private BytesUtil() {
    }

    public static int getBitsFromByte(int n, int n2, int n3) {
        return 0;
    }

    public static byte getUnsignedBytes(short s) {
        return 0;
    }

    public static byte[] getBytes(short s) {
        return null;
    }

    public static byte[] getBytes(char c2) {
        return null;
    }

    public static byte[] getBytes(int n) {
        return null;
    }

    public static byte[] getUnsignedBytes(int n) {
        return null;
    }

    public static byte getByte(int n) {
        return 0;
    }

    public static byte[] getBytes(long l2) {
        return null;
    }

    public static byte[] getUnsignedBytes(long l2) {
        return null;
    }

    public static byte[] getBytes(float f2) {
        return null;
    }

    public static byte[] getUnsignedBytes(float f2) {
        return null;
    }

    public static byte[] getBytes(double d2) {
        return null;
    }

    public static byte[] getUnsignedBytes(double d2) {
        return null;
    }

    private static byte[] getBytes(String string2, String string3) {
        return null;
    }

    public static byte[] getBytes(String string2) {
        return null;
    }

    public static byte[] getBytesUTF8(String string2) {
        return null;
    }

    public static short getInt(byte by) {
        return 0;
    }

    public static short getSignedInt(byte by) {
        return 0;
    }

    public static int getInt(short s) {
        return 0;
    }

    public static int getSignedInt(short s) {
        return 0;
    }

    public static byte getByte(byte[] byArray, int n) {
        return 0;
    }

    public static short getShort(byte[] byArray, int n, int n2) {
        return 0;
    }

    public static int getInt(byte[] byArray, int n, int n2) {
        return 0;
    }

    public static long getLong(byte[] byArray, int n, int n2) {
        return 0L;
    }

    public static float getFloat(byte[] byArray, int n, int n2) {
        return 0.0f;
    }

    public static double getDouble(byte[] byArray, int n, int n2) {
        return 0.0;
    }

    public static short getShort(byte[] byArray) {
        return 0;
    }

    public static int getInt(byte[] byArray) {
        return 0;
    }

    public static long getLong(byte[] byArray) {
        return 0L;
    }

    public static float getFloat(byte[] byArray) {
        return 0.0f;
    }

    public static double getDouble(byte[] byArray) {
        return 0.0;
    }

    public static short getShort(byte[] byArray, int n) {
        return 0;
    }

    public static int getInt(byte[] byArray, int n) {
        return 0;
    }

    public static long getLong(byte[] byArray, int n) {
        return 0L;
    }

    public static long getUnsignedLong(byte[] byArray, int n, ByteOrder byteOrder) {
        return 0L;
    }

    public static long getUnsignedLong(byte[] byArray, ByteOrder byteOrder) {
        return 0L;
    }

    public static float getFloat(byte[] byArray, int n) {
        return 0.0f;
    }

    public static double getDouble(byte[] byArray, int n) {
        return 0.0;
    }

    public static int getUShort(byte[] byArray, int n) {
        return 0;
    }

    public static long getUInt(byte[] byArray, int n) {
        return 0L;
    }

    private static byte[] fillBytes(byte[] byArray, int n) {
        return null;
    }

    private static String getString(byte[] byArray, String string2) {
        return null;
    }

    private static String getString(byte[] byArray, int n, int n2, String string2) {
        return null;
    }

    public static String getString(byte[] byArray, int n, int n2) {
        return null;
    }

    public static String getStringUTF8(byte[] byArray, int n, int n2) {
        return null;
    }

    public static String getStringUTF8Offset(byte[] byArray, int n, int n2) {
        return null;
    }

    public static String getString(byte[] byArray) {
        return null;
    }

    public static String getStringUTF8(byte[] byArray) {
        return null;
    }

    public static String byte2hex(byte[] byArray) {
        return null;
    }

    public static String toHexString(byte[] byArray) {
        return null;
    }

    public static String byte2hex(byte[] byArray, int n, int n2) {
        return null;
    }

    public static String byte2hex(byte[] byArray, String string2) {
        return null;
    }

    public static String byte2hex(byte by) {
        return null;
    }

    public static String toHexStringLowercase(byte[] byArray) {
        return null;
    }

    public static String byte2hex(int n) {
        return null;
    }

    public static String getBinaryStrFromByteArr(byte[] byArray) {
        return null;
    }

    public static String getBinaryStrFromByte(byte by) {
        return null;
    }

    public static byte[] hex2byte(String string2) {
        return null;
    }

    public static byte[] readBytes(byte[] byArray, int n, int n2) {
        return null;
    }

    public static byte[] arrayComb(byte[] byArray, byte[] byArray2) {
        return null;
    }

    public static byte[] arrayApend(byte[] byArray, byte by) {
        return null;
    }

    public static byte[] arrayRemove(byte[] byArray, int n) {
        return null;
    }

    public static byte[] arrayPop(byte[] byArray, int n) {
        return null;
    }

    public static byte[] arraycopy(byte[] byArray, byte[] byArray2) {
        return null;
    }

    public static byte[] arraycopy(byte[] byArray, byte[] byArray2, int n) {
        return null;
    }

    public static byte parseBcd(int n) {
        return 0;
    }

    public static boolean isNumberOrLetter(byte by) {
        return false;
    }

    public static long calcPerByteSum(byte[] byArray, int n, int n2) {
        return 0L;
    }

    public static long getLongFromBytes(byte ... byArray) {
        return 0L;
    }

    public static long getLongFromBytes(byte[] byArray, int ... nArray) {
        return 0L;
    }

    public static int getIntFromBytes(byte[] byArray, int ... nArray) {
        return 0;
    }

    public static long getUIntFromBytes(byte[] byArray, int ... nArray) {
        return 0L;
    }

    public static int convertTwoBytesToSignedInt(byte by, byte by2) {
        return 0;
    }

    public static int convertFourBytesToSignedInt(byte by, byte by2, byte by3, byte by4) {
        return 0;
    }

    public static String byte2hexNoSep(byte[] byArray) {
        return null;
    }

    public static short[] byteArray2ShortArray(byte[] byArray) {
        return null;
    }

    public static String bytesToStringLowercase(byte[] byArray) {
        return null;
    }

    public static byte[] subArray(byte[] byArray, int n, int n2) {
        return null;
    }

    public static byte[] hexStringToByteArray(String string2) {
        return null;
    }
}

