/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.converter;

import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.value.BytesOffset;
import dji.sdk.keyvalue.value.common.EmptyMsg;

public class EmptyValueConverter
implements IDJIValueConverter<EmptyMsg, EmptyMsg> {
    public static EmptyValueConverter converter = new EmptyValueConverter();
    private static EmptyMsg value = new EmptyMsg();

    @Override
    public EmptyMsg fromBytes(byte[] byArray, BytesOffset bytesOffset) {
        return null;
    }

    @Override
    public EmptyMsg fromStr(String string) {
        return null;
    }

    @Override
    public EmptyMsg toDJIValue(EmptyMsg emptyMsg) {
        return null;
    }

    @Override
    public Class<EmptyMsg> getClassType() {
        return null;
    }
}

