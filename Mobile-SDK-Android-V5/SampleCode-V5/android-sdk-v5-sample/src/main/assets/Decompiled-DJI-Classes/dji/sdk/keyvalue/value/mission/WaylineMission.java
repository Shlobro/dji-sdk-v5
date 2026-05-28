/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WaylineMission
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String missionId;
    String missionName;
    String image;
    String address;
    Double createTime;
    Double updateTime;

    public WaylineMission() {
    }

    public WaylineMission(String string, String string2, String string3, String string4, Double d2, Double d3) {
    }

    public static WaylineMission fromJson(String string) {
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

    public String getMissionId() {
        return null;
    }

    public void setMissionId(String string) {
    }

    public String getMissionName() {
        return null;
    }

    public void setMissionName(String string) {
    }

    public String getImage() {
        return null;
    }

    public void setImage(String string) {
    }

    public String getAddress() {
        return null;
    }

    public void setAddress(String string) {
    }

    public Double getCreateTime() {
        return null;
    }

    public void setCreateTime(Double d2) {
    }

    public Double getUpdateTime() {
        return null;
    }

    public void setUpdateTime(Double d2) {
    }

    public String toString() {
        return null;
    }
}

