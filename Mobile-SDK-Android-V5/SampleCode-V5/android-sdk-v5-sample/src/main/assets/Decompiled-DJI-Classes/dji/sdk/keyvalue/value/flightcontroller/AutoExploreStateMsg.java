/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.AutoExploreFileState;
import dji.sdk.keyvalue.value.flightcontroller.AutoExploreModelFixState;
import dji.sdk.keyvalue.value.flightcontroller.AutoExploreState;
import org.json.JSONObject;

public class AutoExploreStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AutoExploreState state;
    AutoExploreFileState fileState;
    AutoExploreModelFixState modelFixState;
    Integer process;

    public AutoExploreStateMsg() {
    }

    public AutoExploreStateMsg(AutoExploreState autoExploreState, AutoExploreFileState autoExploreFileState, AutoExploreModelFixState autoExploreModelFixState, Integer n) {
    }

    public static AutoExploreStateMsg fromJson(String string) {
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

    public AutoExploreState getState() {
        return null;
    }

    public void setState(AutoExploreState autoExploreState) {
    }

    public AutoExploreFileState getFileState() {
        return null;
    }

    public void setFileState(AutoExploreFileState autoExploreFileState) {
    }

    public AutoExploreModelFixState getModelFixState() {
        return null;
    }

    public void setModelFixState(AutoExploreModelFixState autoExploreModelFixState) {
    }

    public Integer getProcess() {
        return null;
    }

    public void setProcess(Integer n) {
    }

    public String toString() {
        return null;
    }
}

