/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value;

import dji.sdk.wpmz.value.BytesOffset;
import dji.sdk.wpmz.value.base.DJIValue;

public class DJIValueHelper {
    public static <T extends DJIValue> T fromBytes(Class<T> tClass, byte[] bytes, BytesOffset offset) {
        DJIValue t;
        if (bytes == null) {
            return null;
        }
        if (bytes.length == offset.getOffset()) {
            return null;
        }
        try {
            t = (DJIValue)tClass.newInstance();
            DJIValueHelper.fromBytes(t, bytes, offset);
        }
        catch (Exception e) {
            t = null;
        }
        return (T)t;
    }

    public static <T extends DJIValue> void fromBytes(T o, byte[] bytes, BytesOffset offset) {
        try {
            offset.setOffset(o.fromBytes(bytes, offset.getOffset()));
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static <T extends DJIValue> T fromBytes(Class<T> tClass, byte[] bytes) {
        return DJIValueHelper.fromBytes(tClass, bytes, new BytesOffset());
    }
}

