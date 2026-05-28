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
import dji.sdk.keyvalue.value.camera.CameraNightSceneMode;
import org.json.JSONObject;

public class CameraNightSceneModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CameraNightSceneMode value;

    public CameraNightSceneModeMsg() {
    }

    public CameraNightSceneModeMsg(CameraNightSceneMode cameraNightSceneMode) {
    }

    public static CameraNightSceneModeMsg fromJson(String string) {
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

    public CameraNightSceneMode getValue() {
        return null;
    }

    public void setValue(CameraNightSceneMode cameraNightSceneMode) {
    }

    public String toString() {
        return null;
    }
}

