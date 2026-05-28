/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmRttInfo;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class WlmRttInfoList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WlmRttInfo> infoList;

    public WlmRttInfoList() {
    }

    public WlmRttInfoList(List<WlmRttInfo> list) {
    }

    public static WlmRttInfoList fromJson(String string) {
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

    public List<WlmRttInfo> getInfoList() {
        return null;
    }

    public void setInfoList(List<WlmRttInfo> list) {
    }

    public String toString() {
        return null;
    }
}

