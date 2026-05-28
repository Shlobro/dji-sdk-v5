/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.RelayProductType;
import java.util.List;
import org.json.JSONObject;

public class RelayProductTypeListMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<RelayProductType> types;

    public RelayProductTypeListMsg() {
    }

    public RelayProductTypeListMsg(List<RelayProductType> list) {
    }

    public static RelayProductTypeListMsg fromJson(String string) {
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

    public List<RelayProductType> getTypes() {
        return null;
    }

    public void setTypes(List<RelayProductType> list) {
    }

    public String toString() {
        return null;
    }
}

