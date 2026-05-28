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
import dji.sdk.keyvalue.value.flightcontroller.WaylineTargetAlarmActionMsg;
import java.util.List;
import org.json.JSONObject;

public class WaylineTargetAlarmMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineTargetAlarmActionMsg> actions;
    Integer cnt_down_time;
    String uuid;
    Boolean with_alarm_state;
    Boolean alarm_on;
    AIAlarmAlgorithm type;
    Integer interval;
    List<AiAlarmTargetInfo> target_info;
    List<Integer> streams;

    public WaylineTargetAlarmMsg() {
    }

    public WaylineTargetAlarmMsg(List<WaylineTargetAlarmActionMsg> list, Integer n, String string, Boolean bl, Boolean bl2, AIAlarmAlgorithm aIAlarmAlgorithm, Integer n2, List<AiAlarmTargetInfo> list2, List<Integer> list3) {
    }

    public static WaylineTargetAlarmMsg fromJson(String string) {
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

    public List<WaylineTargetAlarmActionMsg> getActions() {
        return null;
    }

    public void setActions(List<WaylineTargetAlarmActionMsg> list) {
    }

    public Integer getCnt_down_time() {
        return null;
    }

    public void setCnt_down_time(Integer n) {
    }

    public String getUuid() {
        return null;
    }

    public void setUuid(String string) {
    }

    public Boolean getWith_alarm_state() {
        return null;
    }

    public void setWith_alarm_state(Boolean bl) {
    }

    public Boolean getAlarm_on() {
        return null;
    }

    public void setAlarm_on(Boolean bl) {
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

