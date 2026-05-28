/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.converter;

import dji.sdk.keyvalue.value.BytesOffset;
import dji.sdk.keyvalue.value.base.DJIValue;

public interface IDJIValueConverter<T, D extends DJIValue> {
    public T fromBytes(byte[] var1, BytesOffset var2);

    public T fromStr(String var1);

    public D toDJIValue(T var1);

    public Class<T> getClassType();
}

