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
import dji.sdk.keyvalue.value.flightcontroller.TerrainMode;
import org.json.JSONObject;

public class TerrainModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TerrainMode value;

    public TerrainModeMsg() {
    }

    public TerrainModeMsg(TerrainMode terrainMode) {
    }

    public static TerrainModeMsg fromJson(String string) {
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

    public TerrainMode getValue() {
        return null;
    }

    public void setValue(TerrainMode terrainMode) {
    }

    public String toString() {
        return null;
    }
}

