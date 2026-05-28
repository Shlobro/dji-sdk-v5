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
import dji.sdk.keyvalue.value.remotecontroller.MissionCenterDeployErrorCode;
import org.json.JSONObject;

public class MissionCenterDeployErrorCodeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MissionCenterDeployErrorCode value;

    public MissionCenterDeployErrorCodeMsg() {
    }

    public MissionCenterDeployErrorCodeMsg(MissionCenterDeployErrorCode missionCenterDeployErrorCode) {
    }

    public static MissionCenterDeployErrorCodeMsg fromJson(String string) {
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

    public MissionCenterDeployErrorCode getValue() {
        return null;
    }

    public void setValue(MissionCenterDeployErrorCode missionCenterDeployErrorCode) {
    }

    public String toString() {
        return null;
    }
}

