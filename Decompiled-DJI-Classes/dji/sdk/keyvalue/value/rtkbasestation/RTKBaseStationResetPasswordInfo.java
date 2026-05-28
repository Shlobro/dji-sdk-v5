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
import org.json.JSONObject;

public class RTKBaseStationResetPasswordInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String curPwd;
    String newPwd;

    public RTKBaseStationResetPasswordInfo() {
    }

    public RTKBaseStationResetPasswordInfo(String string, String string2) {
    }

    public static RTKBaseStationResetPasswordInfo fromJson(String string) {
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

    public String getCurPwd() {
        return null;
    }

    public void setCurPwd(String string) {
    }

    public String getNewPwd() {
        return null;
    }

    public void setNewPwd(String string) {
    }

    public String toString() {
        return null;
    }
}

