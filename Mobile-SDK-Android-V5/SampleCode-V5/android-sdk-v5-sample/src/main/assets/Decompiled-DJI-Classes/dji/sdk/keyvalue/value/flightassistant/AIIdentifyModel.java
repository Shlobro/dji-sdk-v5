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
import dji.sdk.keyvalue.value.flightassistant.AIIdentifyMode;
import org.json.JSONObject;

public class AIIdentifyModel
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer model_index;
    AIIdentifyMode mode;

    public AIIdentifyModel() {
    }

    public AIIdentifyModel(Integer n, AIIdentifyMode aIIdentifyMode) {
    }

    public static AIIdentifyModel fromJson(String string) {
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

    public Integer getModel_index() {
        return null;
    }

    public void setModel_index(Integer n) {
    }

    public AIIdentifyMode getMode() {
        return null;
    }

    public void setMode(AIIdentifyMode aIIdentifyMode) {
    }

    public String toString() {
        return null;
    }
}

