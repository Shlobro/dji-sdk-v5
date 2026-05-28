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
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.gimbal.GimbalType;
import org.json.JSONObject;

public class GimbalComponentInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ComponentIndexType index;
    Integer component_id;
    GimbalType gimbalType;

    public GimbalComponentInfo() {
    }

    public GimbalComponentInfo(ComponentIndexType componentIndexType, Integer n, GimbalType gimbalType) {
    }

    public static GimbalComponentInfo fromJson(String string) {
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

    public ComponentIndexType getIndex() {
        return null;
    }

    public void setIndex(ComponentIndexType componentIndexType) {
    }

    public Integer getComponent_id() {
        return null;
    }

    public void setComponent_id(Integer n) {
    }

    public GimbalType getGimbalType() {
        return null;
    }

    public void setGimbalType(GimbalType gimbalType) {
    }

    public String toString() {
        return null;
    }
}

