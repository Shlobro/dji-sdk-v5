/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class ChinaOidPublishMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long dataTimestamp;
    String orderId;
    List<Integer> payloadData;

    public ChinaOidPublishMsg() {
    }

    public ChinaOidPublishMsg(Long l2, String string, List<Integer> list) {
    }

    public static ChinaOidPublishMsg fromJson(String string) {
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

    public Long getDataTimestamp() {
        return null;
    }

    public void setDataTimestamp(Long l2) {
    }

    public String getOrderId() {
        return null;
    }

    public void setOrderId(String string) {
    }

    public List<Integer> getPayloadData() {
        return null;
    }

    public void setPayloadData(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

