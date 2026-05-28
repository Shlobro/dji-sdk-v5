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
import dji.sdk.keyvalue.value.payload.PayloadSubType;
import dji.sdk.keyvalue.value.payload.PayloadType;
import org.json.JSONObject;

public class PSDKComponentInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer component_id;
    String payload_name;
    PayloadType payload_type;
    PayloadSubType payload_sub_type;
    Boolean is_reg_ai_label_info;

    public PSDKComponentInfo() {
    }

    public PSDKComponentInfo(Integer n, String string, PayloadType payloadType, PayloadSubType payloadSubType, Boolean bl) {
    }

    public static PSDKComponentInfo fromJson(String string) {
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

    public Integer getComponent_id() {
        return null;
    }

    public void setComponent_id(Integer n) {
    }

    public String getPayload_name() {
        return null;
    }

    public void setPayload_name(String string) {
    }

    public PayloadType getPayload_type() {
        return null;
    }

    public void setPayload_type(PayloadType payloadType) {
    }

    public PayloadSubType getPayload_sub_type() {
        return null;
    }

    public void setPayload_sub_type(PayloadSubType payloadSubType) {
    }

    public Boolean getIs_reg_ai_label_info() {
        return null;
    }

    public void setIs_reg_ai_label_info(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

