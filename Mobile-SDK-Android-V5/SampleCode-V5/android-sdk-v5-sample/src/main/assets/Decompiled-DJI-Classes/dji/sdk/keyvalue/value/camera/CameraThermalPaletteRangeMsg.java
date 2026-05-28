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
import dji.sdk.keyvalue.value.camera.CameraThermalPalette;
import java.util.List;
import org.json.JSONObject;

public class CameraThermalPaletteRangeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<CameraThermalPalette> value;

    public CameraThermalPaletteRangeMsg() {
    }

    public CameraThermalPaletteRangeMsg(List<CameraThermalPalette> list) {
    }

    public static CameraThermalPaletteRangeMsg fromJson(String string) {
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

    public List<CameraThermalPalette> getValue() {
        return null;
    }

    public void setValue(List<CameraThermalPalette> list) {
    }

    public String toString() {
        return null;
    }
}

