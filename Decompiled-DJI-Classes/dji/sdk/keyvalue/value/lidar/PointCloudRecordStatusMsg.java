/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.lidar.PointCloudRecordStatus;
import org.json.JSONObject;

public class PointCloudRecordStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PointCloudRecordStatus value;

    public PointCloudRecordStatusMsg() {
    }

    public PointCloudRecordStatusMsg(PointCloudRecordStatus pointCloudRecordStatus) {
    }

    public static PointCloudRecordStatusMsg fromJson(String string) {
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

    public PointCloudRecordStatus getValue() {
        return null;
    }

    public void setValue(PointCloudRecordStatus pointCloudRecordStatus) {
    }

    public String toString() {
        return null;
    }
}

