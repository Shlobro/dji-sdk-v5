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
import org.json.JSONObject;

public class RequireIFrameMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer channel1;
    Integer channel2;
    Integer channel3;

    public RequireIFrameMsg() {
    }

    public RequireIFrameMsg(Integer n, Integer n2, Integer n3) {
    }

    public static RequireIFrameMsg fromJson(String string) {
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

    public Integer getChannel1() {
        return null;
    }

    public void setChannel1(Integer n) {
    }

    public Integer getChannel2() {
        return null;
    }

    public void setChannel2(Integer n) {
    }

    public Integer getChannel3() {
        return null;
    }

    public void setChannel3(Integer n) {
    }

    public String toString() {
        return null;
    }
}

