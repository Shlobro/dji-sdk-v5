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
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.SourceMajorType;
import org.json.JSONObject;

public class StreamHubLiveChannelInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer channelID;
    Integer version;
    SourceMajorType majorType;
    Integer minorType;
    ComponentIndexType devicePos;
    Integer dataIndex;

    public StreamHubLiveChannelInformation() {
    }

    public StreamHubLiveChannelInformation(Integer n, Integer n2, SourceMajorType sourceMajorType, Integer n3, ComponentIndexType componentIndexType, Integer n4) {
    }

    public static StreamHubLiveChannelInformation fromJson(String string) {
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

    public Integer getChannelID() {
        return null;
    }

    public void setChannelID(Integer n) {
    }

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public SourceMajorType getMajorType() {
        return null;
    }

    public void setMajorType(SourceMajorType sourceMajorType) {
    }

    public Integer getMinorType() {
        return null;
    }

    public void setMinorType(Integer n) {
    }

    public ComponentIndexType getDevicePos() {
        return null;
    }

    public void setDevicePos(ComponentIndexType componentIndexType) {
    }

    public Integer getDataIndex() {
        return null;
    }

    public void setDataIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

