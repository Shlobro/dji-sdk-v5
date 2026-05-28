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

public class DroneNestThirdPartyMqttConfigMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String addr;
    String userName;
    String passwd;

    public DroneNestThirdPartyMqttConfigMsg() {
    }

    public DroneNestThirdPartyMqttConfigMsg(String string, String string2, String string3) {
    }

    public static DroneNestThirdPartyMqttConfigMsg fromJson(String string) {
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

    public String getAddr() {
        return null;
    }

    public void setAddr(String string) {
    }

    public String getUserName() {
        return null;
    }

    public void setUserName(String string) {
    }

    public String getPasswd() {
        return null;
    }

    public void setPasswd(String string) {
    }

    public String toString() {
        return null;
    }
}

