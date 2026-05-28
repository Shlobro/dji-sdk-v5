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
import dji.sdk.keyvalue.value.camera.ThermalScene;
import org.json.JSONObject;

public class ThermalSceneMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ThermalScene value;

    public ThermalSceneMsg() {
    }

    public ThermalSceneMsg(ThermalScene thermalScene) {
    }

    public static ThermalSceneMsg fromJson(String string) {
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

    public ThermalScene getValue() {
        return null;
    }

    public void setValue(ThermalScene thermalScene) {
    }

    public String toString() {
        return null;
    }
}

