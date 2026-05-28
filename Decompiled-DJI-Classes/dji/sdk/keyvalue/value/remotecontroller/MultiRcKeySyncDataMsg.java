/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class MultiRcKeySyncDataMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer componentType;
    Integer componentIndex;
    Integer subComponentType;
    Integer subComponentIndex;
    Integer keyIndex;

    public MultiRcKeySyncDataMsg() {
    }

    public MultiRcKeySyncDataMsg(Integer n, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static MultiRcKeySyncDataMsg fromJson(String string) {
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

    public Integer getSubComponentType() {
        return null;
    }

    public void setSubComponentType(Integer n) {
    }

    public Integer getSubComponentIndex() {
        return null;
    }

    public void setSubComponentIndex(Integer n) {
    }

    public Integer getKeyIndex() {
        return null;
    }

    public void setKeyIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

