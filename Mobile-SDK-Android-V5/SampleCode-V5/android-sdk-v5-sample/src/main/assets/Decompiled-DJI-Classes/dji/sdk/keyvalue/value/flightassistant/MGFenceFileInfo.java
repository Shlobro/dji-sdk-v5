/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.MGFenceActionType;
import org.json.JSONObject;

public class MGFenceFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MGFenceActionType action;
    String fileName;

    public MGFenceFileInfo() {
    }

    public MGFenceFileInfo(MGFenceActionType mGFenceActionType, String string) {
    }

    public static MGFenceFileInfo fromJson(String string) {
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

    public MGFenceActionType getAction() {
        return null;
    }

    public void setAction(MGFenceActionType mGFenceActionType) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String string) {
    }

    public String toString() {
        return null;
    }
}

