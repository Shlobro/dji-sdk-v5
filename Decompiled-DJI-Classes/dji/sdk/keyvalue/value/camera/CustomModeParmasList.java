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
import dji.sdk.keyvalue.value.camera.CustomModeParmas;
import java.util.List;
import org.json.JSONObject;

public class CustomModeParmasList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CustomModeIndex currentIndex;
    List<CustomModeParmas> paramsList;

    public CustomModeParmasList() {
    }

    public CustomModeParmasList(CustomModeIndex customModeIndex, List<CustomModeParmas> list) {
    }

    public static CustomModeParmasList fromJson(String string) {
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

    public CustomModeIndex getCurrentIndex() {
        return null;
    }

    public void setCurrentIndex(CustomModeIndex customModeIndex) {
    }

    public List<CustomModeParmas> getParamsList() {
        return null;
    }

    public void setParamsList(List<CustomModeParmas> list) {
    }

    public String toString() {
        return null;
    }
}

