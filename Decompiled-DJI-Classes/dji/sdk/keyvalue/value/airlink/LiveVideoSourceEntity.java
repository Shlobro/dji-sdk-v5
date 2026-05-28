/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.ChannelPriority;
import dji.sdk.keyvalue.value.airlink.ChannelType;
import dji.sdk.keyvalue.value.airlink.CodecStrategy;
import dji.sdk.keyvalue.value.airlink.VideoSourceEntity;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LiveVideoSourceEntity
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VideoSourceEntity basicInfo;
    ChannelType channelType;
    Integer channelId;
    CodecStrategy codecType;
    ChannelPriority priority;
    Boolean isMasterRoleSubscribed;
    Boolean isSlaveRoleSubscribed;

    public LiveVideoSourceEntity() {
    }

    public LiveVideoSourceEntity(VideoSourceEntity videoSourceEntity, ChannelType channelType, Integer n, CodecStrategy codecStrategy, ChannelPriority channelPriority, Boolean bl, Boolean bl2) {
    }

    public static LiveVideoSourceEntity fromJson(String string) {
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

    public VideoSourceEntity getBasicInfo() {
        return null;
    }

    public void setBasicInfo(VideoSourceEntity videoSourceEntity) {
    }

    public ChannelType getChannelType() {
        return null;
    }

    public void setChannelType(ChannelType channelType) {
    }

    public Integer getChannelId() {
        return null;
    }

    public void setChannelId(Integer n) {
    }

    public CodecStrategy getCodecType() {
        return null;
    }

    public void setCodecType(CodecStrategy codecStrategy) {
    }

    public ChannelPriority getPriority() {
        return null;
    }

    public void setPriority(ChannelPriority channelPriority) {
    }

    public Boolean getIsMasterRoleSubscribed() {
        return null;
    }

    public void setIsMasterRoleSubscribed(Boolean bl) {
    }

    public Boolean getIsSlaveRoleSubscribed() {
        return null;
    }

    public void setIsSlaveRoleSubscribed(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

