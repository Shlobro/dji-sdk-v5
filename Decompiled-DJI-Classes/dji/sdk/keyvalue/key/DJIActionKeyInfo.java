/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.key;

import dji.sdk.keyvalue.converter.IDJIValueConverter;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.value.base.DJIValue;

public class DJIActionKeyInfo<ParamType, ResultType>
extends DJIKeyInfo<ParamType> {
    private IDJIValueConverter<ResultType, ? extends DJIValue> resultTypeConverter;

    DJIActionKeyInfo(int n, int n2, String string, IDJIValueConverter<ParamType, ? extends DJIValue> iDJIValueConverter, IDJIValueConverter<ResultType, ? extends DJIValue> iDJIValueConverter2) {
    }

    public DJIActionKeyInfo canGet(boolean bl) {
        return null;
    }

    public DJIActionKeyInfo canSet(boolean bl) {
        return null;
    }

    public DJIActionKeyInfo canListen(boolean bl) {
        return null;
    }

    public DJIActionKeyInfo canPerformAction(boolean bl) {
        return null;
    }

    public DJIActionKeyInfo setIsEvent(boolean bl) {
        return null;
    }

    public DJIActionKeyInfo setInnerIdentifier(String string) {
        return null;
    }

    public IDJIValueConverter getResultTypeConverter() {
        return null;
    }
}

