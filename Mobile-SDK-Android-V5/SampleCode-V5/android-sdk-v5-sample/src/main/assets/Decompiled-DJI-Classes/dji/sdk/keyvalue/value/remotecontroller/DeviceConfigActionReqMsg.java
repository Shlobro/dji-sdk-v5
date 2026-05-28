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
import dji.sdk.keyvalue.value.remotecontroller.DeviceConfigActionType;
import org.json.JSONObject;

public class DeviceConfigActionReqMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DeviceConfigActionType value;
    String filePath;
    String localeName;

    public DeviceConfigActionReqMsg() {
    }

    public DeviceConfigActionReqMsg(DeviceConfigActionType deviceConfigActionType, String string, String string2) {
    }

    public static DeviceConfigActionReqMsg fromJson(String string) {
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

    public DeviceConfigActionType getValue() {
        return null;
    }

    public void setValue(DeviceConfigActionType deviceConfigActionType) {
    }

    public String getFilePath() {
        return null;
    }

    public void setFilePath(String string) {
    }

    public String getLocaleName() {
        return null;
    }

    public void setLocaleName(String string) {
    }

    public String toString() {
        return null;
    }
}

