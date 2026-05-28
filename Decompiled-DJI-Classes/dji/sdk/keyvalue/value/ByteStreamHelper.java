/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value;

import dji.sdk.keyvalue.value.ByteResult;
import dji.sdk.keyvalue.value.ByteStream;
import java.util.List;

public class ByteStreamHelper {
    static int kIntLength = 4;
    static int kVectorLength = 4;
    static int kBufferLength = 4;
    static int kStringLength = 4;
    static int kDoubleLength = 8;
    static int kLongLength = 8;

    public static <T extends ByteStream> int toBytes(byte[] byArray, T t, int n, Class<T> clazz) {
        return 0;
    }

    public static <T extends ByteStream> int arrayToBytes(byte[] byArray, List<T> list, int n) {
        return 0;
    }

    public static int integerArrayToBytes(byte[] byArray, List<Integer> list, int n) {
        return 0;
    }

    public static int doubleArrayToBytes(byte[] byArray, List<Double> list, int n) {
        return 0;
    }

    public static int byteArrayToBytes(byte[] byArray, List<Byte> list, int n) {
        return 0;
    }

    public static int longArrayToBytes(byte[] byArray, List<Long> list, int n) {
        return 0;
    }

    public static int booleanArrayToBytes(byte[] byArray, List<Boolean> list, int n) {
        return 0;
    }

    public static int stringArrayToBytes(byte[] byArray, List<String> list, int n) {
        return 0;
    }

    public static int integerToBytes(byte[] byArray, Integer n, int n2) {
        return 0;
    }

    public static int doubleToBytes(byte[] byArray, Double d2, int n) {
        return 0;
    }

    public static int byteToBytes(byte[] byArray, Byte by, int n) {
        return 0;
    }

    public static int longToBytes(byte[] byArray, Long l2, int n) {
        return 0;
    }

    public static int booleanToBytes(byte[] byArray, Boolean bl, int n) {
        return 0;
    }

    public static int bufferToBytes(byte[] byArray, byte[] byArray2, int n) {
        return 0;
    }

    public static int stringToBytes(byte[] byArray, String string, int n) {
        return 0;
    }

    public static <T extends ByteStream> ByteResult<T> fromBytes(byte[] byArray, int n, Class<T> clazz) {
        return null;
    }

    public static <T extends ByteStream> ByteResult<List<T>> arrayFromBytes(byte[] byArray, int n, Class<T> clazz) {
        return null;
    }

    public static ByteResult<List<Integer>> integerArrayFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<List<Double>> doubleArrayFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<List<Byte>> byteArrayFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<List<Long>> longArrayFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<List<Boolean>> booleanArrayFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<List<String>> stringArrayFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static int byteArrayToInt(byte[] byArray, int n) {
        return 0;
    }

    public static void intArrayTobyte(byte[] byArray, int n, int n2) {
    }

    public static ByteResult<String> stringFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<byte[]> bufferFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<Double> doubleFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<Byte> byteFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<Long> longFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<Boolean> booleanFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static ByteResult<Integer> integerFromBytes(byte[] byArray, int n) {
        return null;
    }

    public static <T extends ByteStream> int getLength(T t, Class<T> clazz) {
        return 0;
    }

    public static int integerGetLength(Integer n) {
        return 0;
    }

    public static int doubleGetLength(Double d2) {
        return 0;
    }

    public static int byteGetLength(Double d2) {
        return 0;
    }

    public static int longGetLength(Long l2) {
        return 0;
    }

    public static int booleanGetLength(Boolean bl) {
        return 0;
    }

    public static int bufferGetLength(byte[] byArray) {
        return 0;
    }

    public static int stringGetLength(String string) {
        return 0;
    }

    public static <T extends ByteStream> int arrayGetLength(List<T> list) {
        return 0;
    }

    public static int integerArrayGetLength(List<Integer> list) {
        return 0;
    }

    public static int longArrayGetLength(List<Long> list) {
        return 0;
    }

    public static int doubleArrayGetLength(List<Double> list) {
        return 0;
    }

    public static int boolArrayGetLength(List<Boolean> list) {
        return 0;
    }

    public static int stringArrayGetLength(List<String> list) {
        return 0;
    }

    public static int byteArrayGetLength(List<Byte> list) {
        return 0;
    }
}

