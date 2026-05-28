/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DJIComponentParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer componentType;
    Integer componentIndex;

    public DJIComponentParam() {
    }

    public DJIComponentParam(Integer n, Integer n2) {
    }

    public static DJIComponentParam fromJson(String string) {
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

    public Integer getComponentType() {
        return null;
    }

    public void setComponentType(Integer n) {
    }

    public Integer getComponentIndex() {
        return null;
    }

    public void setComponentIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

