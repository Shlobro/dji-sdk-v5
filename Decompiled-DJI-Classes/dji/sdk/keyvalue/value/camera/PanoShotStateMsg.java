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
import dji.sdk.keyvalue.value.camera.PanoShotState;
import org.json.JSONObject;

public class PanoShotStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PanoShotState value;

    public PanoShotStateMsg() {
    }

    public PanoShotStateMsg(PanoShotState panoShotState) {
    }

    public static PanoShotStateMsg fromJson(String string) {
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

    public PanoShotState getValue() {
        return null;
    }

    public void setValue(PanoShotState panoShotState) {
    }

    public String toString() {
        return null;
    }
}

