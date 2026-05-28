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
import java.util.List;
import org.json.JSONObject;

public class AIIdentifyDetFilterSetMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer model_index;
    AIIdentifyMode mode;
    List<Integer> targets;

    public AIIdentifyDetFilterSetMsg() {
    }

    public AIIdentifyDetFilterSetMsg(Integer n, AIIdentifyMode aIIdentifyMode, List<Integer> list) {
    }

    public static AIIdentifyDetFilterSetMsg fromJson(String string) {
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

    public List<Integer> getTargets() {
        return null;
    }

    public void setTargets(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

