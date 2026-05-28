/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.RTKCmdType;
import org.json.JSONObject;

public class RTKAuthEncrpytReqMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKCmdType cmdType;
    String rcSN;
    String userID;

    public RTKAuthEncrpytReqMsg() {
    }

    public RTKAuthEncrpytReqMsg(RTKCmdType rTKCmdType, String string, String string2) {
    }

    public static RTKAuthEncrpytReqMsg fromJson(String string) {
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

    public RTKCmdType getCmdType() {
        return null;
    }

    public void setCmdType(RTKCmdType rTKCmdType) {
    }

    public String getRcSN() {
        return null;
    }

    public void setRcSN(String string) {
    }

    public String getUserID() {
        return null;
    }

    public void setUserID(String string) {
    }

    public String toString() {
        return null;
    }
}

