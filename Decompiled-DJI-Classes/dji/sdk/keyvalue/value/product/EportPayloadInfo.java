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
import dji.sdk.keyvalue.value.gimbal.GimbalType;
import dji.sdk.keyvalue.value.product.EportGimbalType;
import dji.sdk.keyvalue.value.product.EportPayloadType;
import org.json.JSONObject;

public class EportPayloadInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer cid;
    Integer component_id;
    GimbalType gimbal_type;
    EportGimbalType eport_type;
    EportPayloadType payload_type;

    public EportPayloadInfo() {
    }

    public EportPayloadInfo(Integer n, Integer n2, GimbalType gimbalType, EportGimbalType eportGimbalType, EportPayloadType eportPayloadType) {
    }

    public static EportPayloadInfo fromJson(String string) {
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

    public Integer getCid() {
        return null;
    }

    public void setCid(Integer n) {
    }

    public Integer getComponent_id() {
        return null;
    }

    public void setComponent_id(Integer n) {
    }

    public GimbalType getGimbal_type() {
        return null;
    }

    public void setGimbal_type(GimbalType gimbalType) {
    }

    public EportGimbalType getEport_type() {
        return null;
    }

    public void setEport_type(EportGimbalType eportGimbalType) {
    }

    public EportPayloadType getPayload_type() {
        return null;
    }

    public void setPayload_type(EportPayloadType eportPayloadType) {
    }

    public String toString() {
        return null;
    }
}

