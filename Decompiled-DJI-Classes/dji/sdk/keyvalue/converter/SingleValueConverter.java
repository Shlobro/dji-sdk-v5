/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.converter;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.value.BytesOffset;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.BoolMsg;
import dji.sdk.keyvalue.value.common.DoubleMsg;
import dji.sdk.keyvalue.value.common.Int64Msg;
import dji.sdk.keyvalue.value.common.IntMsg;
import dji.sdk.keyvalue.value.common.StringMsg;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

public class SingleValueConverter<T, D extends DJIValue>
implements IDJIValueConverter<T, D>,
JNIProguardKeepTag {
    public static SingleValueConverter BooleanConverter = new SingleValueConverter<Boolean, BoolMsg>(Boolean.class, BoolMsg.class);
    public static SingleValueConverter IntegerConverter = new SingleValueConverter<Integer, IntMsg>(Integer.class, IntMsg.class);
    public static SingleValueConverter DoubleConverter = new SingleValueConverter<Double, DoubleMsg>(Double.class, DoubleMsg.class);
    public static SingleValueConverter StringConverter = new SingleValueConverter<String, StringMsg>(String.class, StringMsg.class);
    public static SingleValueConverter LongConverter = new SingleValueConverter<Long, Int64Msg>(Long.class, Int64Msg.class);
    Class<D> dClass;
    Class<T> tClass;
    Constructor<D> constructor;
    Method getValueMethod;
    Method fromStrMethod;
    boolean isDJIValue;
    boolean isString;

    private static String ConvertString(String string) {
        return null;
    }

    private static Map<Class, Method> GetFromStrMethodMap() {
        return null;
    }

    public SingleValueConverter(Class<T> clazz, Class<D> clazz2) {
    }

    @Override
    public T fromBytes(byte[] byArray, BytesOffset bytesOffset) {
        return null;
    }

    @Override
    public T fromStr(String string) {
        return null;
    }

    @Override
    public D toDJIValue(T t) {
        return null;
    }

    @Override
    public Class<T> getClassType() {
        return null;
    }
}

