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
import dji.sdk.keyvalue.value.camera.CameraNightSceneModeMsg;
import java.util.List;
import org.json.JSONObject;

public class CameraNightSceneModeRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<CameraNightSceneModeMsg> value;

    public CameraNightSceneModeRangeMsg() {
    }

    public CameraNightSceneModeRangeMsg(List<CameraNightSceneModeMsg> list) {
    }

    public static CameraNightSceneModeRangeMsg fromJson(String string) {
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

    public List<CameraNightSceneModeMsg> getValue() {
        return null;
    }

    public void setValue(List<CameraNightSceneModeMsg> list) {
    }

    public String toString() {
        return null;
    }
}

