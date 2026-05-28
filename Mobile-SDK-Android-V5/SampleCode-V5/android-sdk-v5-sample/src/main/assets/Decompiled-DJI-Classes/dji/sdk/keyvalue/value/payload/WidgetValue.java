/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.WidgetType;
import org.json.JSONObject;

public class WidgetValue
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WidgetType type;
    Integer index;
    Integer value;

    public WidgetValue() {
    }

    public WidgetValue(WidgetType widgetType, Integer n, Integer n2) {
    }

    public static WidgetValue fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public WidgetType getType() {
        return null;
    }

    public void setType(WidgetType widgetType) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Integer getValue() {
        return null;
    }

    public void setValue(Integer n) {
    }

    public String toString() {
        return null;
    }
}

