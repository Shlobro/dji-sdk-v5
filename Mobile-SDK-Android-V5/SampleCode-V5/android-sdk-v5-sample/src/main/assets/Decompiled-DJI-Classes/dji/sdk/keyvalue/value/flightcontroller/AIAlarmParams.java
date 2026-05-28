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
import dji.sdk.keyvalue.value.flightcontroller.AIAlarmAlgorithm;
import dji.sdk.keyvalue.value.flightcontroller.AiAlarmTargetInfo;
import java.util.List;
import org.json.JSONObject;

public class AIAlarmParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AIAlarmAlgorithm type;
    Integer interval;
    List<AiAlarmTargetInfo> target_info;
    List<Integer> streams;

    public AIAlarmParams() {
    }

    public AIAlarmParams(AIAlarmAlgorithm aIAlarmAlgorithm, Integer n, List<AiAlarmTargetInfo> list, List<Integer> list2) {
    }

    public static AIAlarmParams fromJson(String string) {
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

    public AIAlarmAlgorithm getType() {
        return null;
    }

    public void setType(AIAlarmAlgorithm aIAlarmAlgorithm) {
    }

    public Integer getInterval() {
        return null;
    }

    public void setInterval(Integer n) {
    }

    public List<AiAlarmTargetInfo> getTarget_info() {
        return null;
    }

    public void setTarget_info(List<AiAlarmTargetInfo> list) {
    }

    public List<Integer> getStreams() {
        return null;
    }

    public void setStreams(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

