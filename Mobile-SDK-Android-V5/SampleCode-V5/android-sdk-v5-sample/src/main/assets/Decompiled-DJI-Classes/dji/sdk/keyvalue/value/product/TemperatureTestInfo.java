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
import dji.sdk.keyvalue.value.product.ChannelTemperatureInfo;
import java.util.List;
import org.json.JSONObject;

public class TemperatureTestInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer classId;
    Integer groupId;
    List<ChannelTemperatureInfo> channelDataList;

    public TemperatureTestInfo() {
    }

    public TemperatureTestInfo(Integer n, Integer n2, List<ChannelTemperatureInfo> list) {
    }

    public static TemperatureTestInfo fromJson(String string) {
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

    public Integer getClassId() {
        return null;
    }

    public void setClassId(Integer n) {
    }

    public Integer getGroupId() {
        return null;
    }

    public void setGroupId(Integer n) {
    }

    public List<ChannelTemperatureInfo> getChannelDataList() {
        return null;
    }

    public void setChannelDataList(List<ChannelTemperatureInfo> list) {
    }

    public String toString() {
        return null;
    }
}

