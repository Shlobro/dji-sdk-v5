/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.MultiControlAuthorityTypeInfo;
import dji.sdk.keyvalue.value.common.MultiControlChannel;
import java.util.List;
import org.json.JSONObject;

public class MultiControlLostControlInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MultiControlChannel type;
    List<MultiControlAuthorityTypeInfo> value;

    public MultiControlLostControlInfo() {
    }

    public MultiControlLostControlInfo(MultiControlChannel multiControlChannel, List<MultiControlAuthorityTypeInfo> list) {
    }

    public static MultiControlLostControlInfo fromJson(String string) {
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

    public MultiControlChannel getType() {
        return null;
    }

    public void setType(MultiControlChannel multiControlChannel) {
    }

    public List<MultiControlAuthorityTypeInfo> getValue() {
        return null;
    }

    public void setValue(List<MultiControlAuthorityTypeInfo> list) {
    }

    public String toString() {
        return null;
    }
}

