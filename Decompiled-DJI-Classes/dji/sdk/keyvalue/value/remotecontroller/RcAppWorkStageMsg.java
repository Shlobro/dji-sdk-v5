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
import dji.sdk.keyvalue.value.remotecontroller.AppWorkStage;
import org.json.JSONObject;

public class RcAppWorkStageMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AppWorkStage appWorkStage;
    Boolean enter;

    public RcAppWorkStageMsg() {
    }

    public RcAppWorkStageMsg(AppWorkStage appWorkStage, Boolean bl) {
    }

    public static RcAppWorkStageMsg fromJson(String string) {
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

    public AppWorkStage getAppWorkStage() {
        return null;
    }

    public void setAppWorkStage(AppWorkStage appWorkStage) {
    }

    public Boolean getEnter() {
        return null;
    }

    public void setEnter(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

