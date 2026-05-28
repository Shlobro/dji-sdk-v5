/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.SDRQualityDetectCmd;
import dji.sdk.keyvalue.value.common.SDRQualityDetectScene;
import org.json.JSONObject;

public class SDRQualityDetectReqMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SDRQualityDetectCmd cmd;
    SDRQualityDetectScene scene;

    public SDRQualityDetectReqMsg() {
    }

    public SDRQualityDetectReqMsg(SDRQualityDetectCmd sDRQualityDetectCmd, SDRQualityDetectScene sDRQualityDetectScene) {
    }

    public static SDRQualityDetectReqMsg fromJson(String string) {
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

    public SDRQualityDetectCmd getCmd() {
        return null;
    }

    public void setCmd(SDRQualityDetectCmd sDRQualityDetectCmd) {
    }

    public SDRQualityDetectScene getScene() {
        return null;
    }

    public void setScene(SDRQualityDetectScene sDRQualityDetectScene) {
    }

    public String toString() {
        return null;
    }
}

