/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mop;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mop.PointCloudData;
import java.util.List;
import org.json.JSONObject;

public class PointCloudDataDecodeResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer errorCode;
    List<PointCloudData> dataList;

    public PointCloudDataDecodeResult() {
    }

    public PointCloudDataDecodeResult(Integer n, List<PointCloudData> list) {
    }

    public static PointCloudDataDecodeResult fromJson(String string) {
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

    public Integer getErrorCode() {
        return null;
    }

    public void setErrorCode(Integer n) {
    }

    public List<PointCloudData> getDataList() {
        return null;
    }

    public void setDataList(List<PointCloudData> list) {
    }

    public String toString() {
        return null;
    }
}

