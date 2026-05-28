/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.converter;

import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.value.BytesOffset;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.lang.reflect.Method;

public class DJIValueConverter<T extends DJIValue>
implements IDJIValueConverter<T, DJIValue> {
    private Class<T> tClass;
    private Method fromJsonMethod;

    public DJIValueConverter(Class<T> clazz) {
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
    public DJIValue toDJIValue(T t) {
        return null;
    }

    @Override
    public Class<T> getClassType() {
        return null;
    }
}

