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
import dji.sdk.keyvalue.value.flightcontroller.WaylineTargetAlarmAction;
import org.json.JSONObject;

public class AiAlarmActionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineTargetAlarmAction action_type;
    Integer action_duration;
    Integer action_times;

    public AiAlarmActionInfo() {
    }

    public AiAlarmActionInfo(WaylineTargetAlarmAction waylineTargetAlarmAction, Integer n, Integer n2) {
    }

    public static AiAlarmActionInfo fromJson(String string) {
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

    public WaylineTargetAlarmAction getAction_type() {
        return null;
    }

    public void setAction_type(WaylineTargetAlarmAction waylineTargetAlarmAction) {
    }

    public Integer getAction_duration() {
        return null;
    }

    public void setAction_duration(Integer n) {
    }

    public Integer getAction_times() {
        return null;
    }

    public void setAction_times(Integer n) {
    }

    public String toString() {
        return null;
    }
}

