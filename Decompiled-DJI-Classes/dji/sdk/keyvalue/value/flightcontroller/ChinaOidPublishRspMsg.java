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
import dji.sdk.keyvalue.value.flightcontroller.ChinaOidNetworkStatus;
import dji.sdk.keyvalue.value.flightcontroller.ChinaOidReportResult;
import org.json.JSONObject;

public class ChinaOidPublishRspMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long dataTimestamp;
    ChinaOidReportResult reportResult;
    ChinaOidNetworkStatus networkState;

    public ChinaOidPublishRspMsg() {
    }

    public ChinaOidPublishRspMsg(Long l2, ChinaOidReportResult chinaOidReportResult, ChinaOidNetworkStatus chinaOidNetworkStatus) {
    }

    public static ChinaOidPublishRspMsg fromJson(String string) {
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

    public ChinaOidReportResult getReportResult() {
        return null;
    }

    public void setReportResult(ChinaOidReportResult chinaOidReportResult) {
    }

    public ChinaOidNetworkStatus getNetworkState() {
        return null;
    }

    public void setNetworkState(ChinaOidNetworkStatus chinaOidNetworkStatus) {
    }

    public String toString() {
        return null;
    }
}

