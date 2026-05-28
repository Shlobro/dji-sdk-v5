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
import dji.sdk.keyvalue.value.lidar.PointCloudRecordCommand;
import org.json.JSONObject;

public class PointCloudRecordMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PointCloudRecordCommand value;

    public PointCloudRecordMsg() {
    }

    public PointCloudRecordMsg(PointCloudRecordCommand pointCloudRecordCommand) {
    }

    public static PointCloudRecordMsg fromJson(String string) {
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

    public PointCloudRecordCommand getValue() {
        return null;
    }

    public void setValue(PointCloudRecordCommand pointCloudRecordCommand) {
    }

    public String toString() {
        return null;
    }
}

