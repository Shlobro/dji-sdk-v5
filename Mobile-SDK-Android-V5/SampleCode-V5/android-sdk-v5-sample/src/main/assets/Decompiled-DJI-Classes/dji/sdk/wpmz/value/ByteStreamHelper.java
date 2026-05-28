/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value;

import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public class ByteStreamHelper {
    static int kIntLength = 4;
    static int kVectorLength = 4;
    static int kBufferLength = 4;
    static int kStringLength = 4;
    static int kDoubleLength = 8;
    static int kLongLength = 8;

    public static <T extends ByteStream> int toBytes(byte[] result, T data, int startIndex, Class<T> type) {
        if (data == null) {
            try {
                data = (ByteStream)type.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return ByteStreamHelper.toBytes(result, data, startIndex, type);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return data.toBytes(result, startIndex);
    }

    public static <T extends ByteStream> int arrayToBytes(byte[] result, List<T> data, int startIndex) {
        int length = data.size();
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kVectorLength;
        }
        startIndex += kVectorLength;
        for (int i = 0; i < length; ++i) {
            startIndex = ((ByteStream)data.get(i)).toBytes(result, startIndex);
        }
        return startIndex;
    }

    public static int integerArrayToBytes(byte[] result, List<Integer> data, int startIndex) {
        int length = data.size();
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kVectorLength;
        }
        startIndex += kVectorLength;
        for (int i = 0; i < length; ++i) {
            startIndex = ByteStreamHelper.integerToBytes(result, data.get(i), startIndex);
        }
        return startIndex;
    }

    public static int doubleArrayToBytes(byte[] result, List<Double> data, int startIndex) {
        int length = data.size();
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kVectorLength;
        }
        startIndex += kVectorLength;
        for (int i = 0; i < length; ++i) {
            startIndex = ByteStreamHelper.doubleToBytes(result, data.get(i), startIndex);
        }
        return startIndex;
    }

    public static int byteArrayToBytes(byte[] result, List<Byte> data, int startIndex) {
        int length = data.size();
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kVectorLength;
        }
        startIndex += kVectorLength;
        for (int i = 0; i < length; ++i) {
            result[startIndex++] = data.get(i);
        }
        return startIndex;
    }

    public static int longArrayToBytes(byte[] result, List<Long> data, int startIndex) {
        int length = data.size();
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kVectorLength;
        }
        startIndex += kVectorLength;
        for (int i = 0; i < length; ++i) {
            startIndex = ByteStreamHelper.longToBytes(result, data.get(i), startIndex);
        }
        return startIndex;
    }

    public static int booleanArrayToBytes(byte[] result, List<Boolean> data, int startIndex) {
        int length = data.size();
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kVectorLength;
        }
        startIndex += kVectorLength;
        for (int i = 0; i < length; ++i) {
            startIndex = ByteStreamHelper.booleanToBytes(result, data.get(i), startIndex);
        }
        return startIndex;
    }

    public static int stringArrayToBytes(byte[] result, List<String> data, int startIndex) {
        int length = data.size();
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kVectorLength;
        }
        startIndex += kVectorLength;
        for (int i = 0; i < length; ++i) {
            startIndex = ByteStreamHelper.stringToBytes(result, data.get(i), startIndex);
        }
        return startIndex;
    }

    public static int integerToBytes(byte[] result, Integer data, int startIndex) {
        if (data == null) {
            data = 0;
        }
        byte[] bytes = new byte[kIntLength];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).putInt(data);
        System.arraycopy(bytes, 0, result, startIndex, kIntLength);
        return startIndex + kIntLength;
    }

    public static int doubleToBytes(byte[] result, Double data, int startIndex) {
        if (data == null) {
            data = 0.0;
        }
        byte[] bytes = new byte[kDoubleLength];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).putDouble(data);
        System.arraycopy(bytes, 0, result, startIndex, kDoubleLength);
        return startIndex + kDoubleLength;
    }

    public static int byteToBytes(byte[] result, Byte data, int startIndex) {
        if (data == null) {
            data = 0;
        }
        result[startIndex] = data;
        return startIndex + 1;
    }

    public static int longToBytes(byte[] result, Long data, int startIndex) {
        if (data == null) {
            data = 0L;
        }
        byte[] bytes = new byte[kLongLength];
        ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).putLong(data);
        System.arraycopy(bytes, 0, result, startIndex, kLongLength);
        return startIndex + kLongLength;
    }

    public static int booleanToBytes(byte[] result, Boolean data, int startIndex) {
        if (data == null) {
            data = false;
        }
        result[startIndex++] = data != false ? (byte)1 : 0;
        return startIndex;
    }

    public static int bufferToBytes(byte[] result, byte[] data, int startIndex) {
        int length = data.length;
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        if (length == 0) {
            return startIndex + kBufferLength;
        }
        System.arraycopy(data, 0, result, startIndex += kBufferLength, length);
        return startIndex += length;
    }

    public static int stringToBytes(byte[] result, String data, int startIndex) {
        if (data == null) {
            data = new String();
        }
        byte[] bytes = data.getBytes();
        int length = bytes.length;
        ByteStreamHelper.intArrayTobyte(result, startIndex, length);
        System.arraycopy(bytes, 0, result, startIndex += 4, length);
        return startIndex + length;
    }

    public static <T extends ByteStream> ByteResult<T> fromBytes(byte[] data, int startIndex, Class<T> type) {
        try {
            ByteStream member = (ByteStream)type.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            startIndex = member.fromBytes(data, startIndex);
            return new ByteResult<ByteStream>(member, startIndex);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static <T extends ByteStream> ByteResult<List<T>> arrayFromBytes(byte[] data, int startIndex, Class<T> type) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        startIndex += kVectorLength;
        ArrayList<ByteStream> res = new ArrayList<ByteStream>();
        if (length == 0) {
            return new ByteResult<List<T>>(res, startIndex);
        }
        for (int i = 0; i < length; ++i) {
            try {
                ByteStream member = (ByteStream)type.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                startIndex = member.fromBytes(data, startIndex);
                res.add(member);
                continue;
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return new ByteResult<List<T>>(res, startIndex);
    }

    public static ByteResult<List<Integer>> integerArrayFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        startIndex += kVectorLength;
        ArrayList<Integer> res = new ArrayList<Integer>();
        if (length == 0) {
            return new ByteResult<List<Integer>>(res, startIndex);
        }
        for (int i = 0; i < length; ++i) {
            ByteResult<Integer> member = ByteStreamHelper.integerFromBytes(data, startIndex);
            startIndex = member.endIndex;
            res.add((Integer)member.result);
        }
        return new ByteResult<List<Integer>>(res, startIndex);
    }

    public static ByteResult<List<Double>> doubleArrayFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        startIndex += kVectorLength;
        ArrayList<Double> res = new ArrayList<Double>();
        if (length == 0) {
            return new ByteResult<List<Double>>(res, startIndex);
        }
        for (int i = 0; i < length; ++i) {
            ByteResult<Double> member = ByteStreamHelper.doubleFromBytes(data, startIndex);
            startIndex = member.endIndex;
            res.add((Double)member.result);
        }
        return new ByteResult<List<Double>>(res, startIndex);
    }

    public static ByteResult<List<Byte>> byteArrayFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        startIndex += kVectorLength;
        ArrayList<Byte> res = new ArrayList<Byte>();
        for (int i = 0; i < length; ++i) {
            res.add(data[startIndex++]);
        }
        return new ByteResult<List<Byte>>(res, startIndex);
    }

    public static ByteResult<List<Long>> longArrayFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        startIndex += kVectorLength;
        ArrayList<Long> res = new ArrayList<Long>();
        if (length == 0) {
            return new ByteResult<List<Long>>(res, startIndex);
        }
        for (int i = 0; i < length; ++i) {
            ByteResult<Long> member = ByteStreamHelper.longFromBytes(data, startIndex);
            startIndex = member.endIndex;
            res.add((Long)member.result);
        }
        return new ByteResult<List<Long>>(res, startIndex);
    }

    public static ByteResult<List<Boolean>> booleanArrayFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        startIndex += kVectorLength;
        ArrayList<Boolean> res = new ArrayList<Boolean>();
        if (length == 0) {
            return new ByteResult<List<Boolean>>(res, startIndex);
        }
        for (int i = 0; i < length; ++i) {
            ByteResult<Boolean> member = ByteStreamHelper.booleanFromBytes(data, startIndex);
            startIndex = member.endIndex;
            res.add((Boolean)member.result);
        }
        return new ByteResult<List<Boolean>>(res, startIndex);
    }

    public static ByteResult<List<String>> stringArrayFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        startIndex += kVectorLength;
        ArrayList<String> res = new ArrayList<String>();
        if (length == 0) {
            return new ByteResult<List<String>>(res, startIndex);
        }
        for (int i = 0; i < length; ++i) {
            ByteResult<String> member = ByteStreamHelper.stringFromBytes(data, startIndex);
            startIndex = member.endIndex;
            res.add((String)member.result);
        }
        return new ByteResult<List<String>>(res, startIndex);
    }

    public static int byteArrayToInt(byte[] data, int index) {
        Integer res = ByteBuffer.wrap(data, index, kStringLength).order(ByteOrder.LITTLE_ENDIAN).getInt();
        return res;
    }

    public static void intArrayTobyte(byte[] data, int index, int val) {
        data[index + 3] = (byte)(val >> 24);
        data[index + 2] = (byte)(val >> 16);
        data[index + 1] = (byte)(val >> 8);
        data[index + 0] = (byte)val;
    }

    public static ByteResult<String> stringFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        byte[] bytes = new byte[length];
        System.arraycopy(data, startIndex += 4, bytes, 0, length);
        String res = new String(bytes);
        ByteResult<String> result = new ByteResult<String>(res, startIndex += length);
        return result;
    }

    public static ByteResult<byte[]> bufferFromBytes(byte[] data, int startIndex) {
        int length = ByteStreamHelper.byteArrayToInt(data, startIndex);
        byte[] bytes = new byte[length];
        System.arraycopy(data, startIndex += kBufferLength, bytes, 0, length);
        ByteResult<byte[]> result = new ByteResult<byte[]>(bytes, startIndex += length);
        return result;
    }

    public static ByteResult<Double> doubleFromBytes(byte[] data, int startIndex) {
        Double res = ByteBuffer.wrap(data, startIndex, kDoubleLength).order(ByteOrder.LITTLE_ENDIAN).getDouble();
        ByteResult<Double> result = new ByteResult<Double>(res, startIndex += kDoubleLength);
        return result;
    }

    public static ByteResult<Byte> byteFromBytes(byte[] data, int startIndex) {
        Byte res = data[startIndex++];
        ByteResult<Byte> result = new ByteResult<Byte>(res, startIndex);
        return result;
    }

    public static ByteResult<Long> longFromBytes(byte[] data, int startIndex) {
        Long res = ByteBuffer.wrap(data, startIndex, kLongLength).order(ByteOrder.LITTLE_ENDIAN).getLong();
        ByteResult<Long> result = new ByteResult<Long>(res, startIndex += kLongLength);
        return result;
    }

    public static ByteResult<Boolean> booleanFromBytes(byte[] data, int startIndex) {
        Boolean res = data[startIndex++] != 0;
        ByteResult<Boolean> result = new ByteResult<Boolean>(res, startIndex);
        return result;
    }

    public static ByteResult<Integer> integerFromBytes(byte[] data, int startIndex) {
        int res = ByteBuffer.wrap(data, startIndex, kIntLength).order(ByteOrder.LITTLE_ENDIAN).getInt();
        ByteResult<Integer> result = new ByteResult<Integer>(res, startIndex += kIntLength);
        return result;
    }

    public static <T extends ByteStream> int getLength(T data, Class<T> type) {
        if (data == null) {
            try {
                data = (ByteStream)type.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                return ByteStreamHelper.getLength(data, type);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return data.serializedLength();
    }

    public static int integerGetLength(Integer data) {
        return kIntLength;
    }

    public static int doubleGetLength(Double data) {
        return kDoubleLength;
    }

    public static int byteGetLength(Double data) {
        return 1;
    }

    public static int longGetLength(Long data) {
        return kLongLength;
    }

    public static int booleanGetLength(Boolean data) {
        return 1;
    }

    public static int bufferGetLength(byte[] data) {
        return data.length + kBufferLength;
    }

    public static int stringGetLength(String data) {
        int res = kStringLength;
        if (data == null) {
            return res;
        }
        return res + data.getBytes().length;
    }

    public static <T extends ByteStream> int arrayGetLength(List<T> data) {
        int result = 0;
        result += kVectorLength;
        if (data == null) {
            return result;
        }
        for (int i = 0; i < data.size(); ++i) {
            result += ((ByteStream)data.get(i)).serializedLength();
        }
        return result;
    }

    public static int integerArrayGetLength(List<Integer> data) {
        int result = 0;
        result += kVectorLength;
        if (data == null) {
            return result;
        }
        for (int i = 0; i < data.size(); ++i) {
            result += ByteStreamHelper.integerGetLength(data.get(i));
        }
        return result;
    }

    public static int longArrayGetLength(List<Long> data) {
        int result = 0;
        result += kVectorLength;
        if (data == null) {
            return result;
        }
        for (int i = 0; i < data.size(); ++i) {
            result += ByteStreamHelper.longGetLength(data.get(i));
        }
        return result;
    }

    public static int doubleArrayGetLength(List<Double> data) {
        int result = 0;
        result += kVectorLength;
        if (data == null) {
            return result;
        }
        for (int i = 0; i < data.size(); ++i) {
            result += ByteStreamHelper.doubleGetLength(data.get(i));
        }
        return result;
    }

    public static int boolArrayGetLength(List<Boolean> data) {
        int result = 0;
        result += kVectorLength;
        if (data == null) {
            return result;
        }
        for (int i = 0; i < data.size(); ++i) {
            result += ByteStreamHelper.booleanGetLength(data.get(i));
        }
        return result;
    }

    public static int stringArrayGetLength(List<String> data) {
        int result = 0;
        result += kVectorLength;
        if (data == null) {
            return result;
        }
        for (int i = 0; i < data.size(); ++i) {
            result += ByteStreamHelper.stringGetLength(data.get(i));
        }
        return result;
    }

    public static int byteArrayGetLength(List<Byte> data) {
        return kVectorLength + (data == null ? 0 : data.size());
    }
}

