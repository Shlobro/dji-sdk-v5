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
import dji.sdk.keyvalue.value.common.UtmissUploadStatus;
import org.json.JSONObject;

public class UtmissUploadRecordMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String orderID;
    UtmissUploadStatus status;
    Boolean netWorkState;
    Boolean switchState;
    String timeStamp;

    public UtmissUploadRecordMsg() {
    }

    public UtmissUploadRecordMsg(String string, UtmissUploadStatus utmissUploadStatus, Boolean bl, Boolean bl2, String string2) {
    }

    public static UtmissUploadRecordMsg fromJson(String string) {
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

    public String getOrderID() {
        return null;
    }

    public void setOrderID(String string) {
    }

    public UtmissUploadStatus getStatus() {
        return null;
    }

    public void setStatus(UtmissUploadStatus utmissUploadStatus) {
    }

    public Boolean getNetWorkState() {
        return null;
    }

    public void setNetWorkState(Boolean bl) {
    }

    public Boolean getSwitchState() {
        return null;
    }

    public void setSwitchState(Boolean bl) {
    }

    public String getTimeStamp() {
        return null;
    }

    public void setTimeStamp(String string) {
    }

    public String toString() {
        return null;
    }
}

