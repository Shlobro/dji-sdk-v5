/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.relay.SDRBlockingInfo;
import dji.sdk.keyvalue.value.relay.SDRBlockingInfoSrcType;
import java.util.List;
import org.json.JSONObject;

public class SDRBlockingInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SDRBlockingInfoSrcType type;
    List<SDRBlockingInfo> value;

    public SDRBlockingInfoMsg() {
    }

    public SDRBlockingInfoMsg(SDRBlockingInfoSrcType sDRBlockingInfoSrcType, List<SDRBlockingInfo> list) {
    }

    public static SDRBlockingInfoMsg fromJson(String string) {
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

    public SDRBlockingInfoSrcType getType() {
        return null;
    }

    public void setType(SDRBlockingInfoSrcType sDRBlockingInfoSrcType) {
    }

    public List<SDRBlockingInfo> getValue() {
        return null;
    }

    public void setValue(List<SDRBlockingInfo> list) {
    }

    public String toString() {
        return null;
    }
}

