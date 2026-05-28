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
import dji.sdk.keyvalue.value.flightcontroller.TerrainFollowingMode;
import org.json.JSONObject;

public class TerrainFollowingModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TerrainFollowingMode value;

    public TerrainFollowingModeMsg() {
    }

    public TerrainFollowingModeMsg(TerrainFollowingMode terrainFollowingMode) {
    }

    public static TerrainFollowingModeMsg fromJson(String string) {
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

    public TerrainFollowingMode getValue() {
        return null;
    }

    public void setValue(TerrainFollowingMode terrainFollowingMode) {
    }

    public String toString() {
        return null;
    }
}

