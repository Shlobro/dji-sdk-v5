/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.converter;

import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.value.BytesOffset;
import dji.sdk.keyvalue.value.common.BufferMsg;

public class BufferConverter
implements IDJIValueConverter<byte[], BufferMsg> {
    public static BufferConverter converter = new BufferConverter();
    private static BufferMsg value = new BufferMsg();

    @Override
    public byte[] fromBytes(byte[] byArray, BytesOffset bytesOffset) {
        return null;
    }

    @Override
    public byte[] fromStr(String string) {
        return null;
    }

    @Override
    public BufferMsg toDJIValue(byte[] byArray) {
        return null;
    }

    @Override
    public Class<byte[]> getClassType() {
        return null;
    }
}

