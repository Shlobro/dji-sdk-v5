/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CustomModeIndex;
import dji.sdk.keyvalue.value.camera.CustomModeOperation;
import org.json.JSONObject;

public class CustomModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CustomModeIndex customIndex;
    CustomModeOperation operation;

    public CustomModeMsg() {
    }

    public CustomModeMsg(CustomModeIndex customModeIndex, CustomModeOperation customModeOperation) {
    }

    public static CustomModeMsg fromJson(String string) {
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

    public CustomModeIndex getCustomIndex() {
        return null;
    }

    public void setCustomIndex(CustomModeIndex customModeIndex) {
    }

    public CustomModeOperation getOperation() {
        return null;
    }

    public void setOperation(CustomModeOperation customModeOperation) {
    }

    public String toString() {
        return null;
    }
}

