/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylineActionTriggerType;
import org.json.JSONObject;

public class WaylineActionTrigger
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionTriggerType triggerType;
    Double timeInterval;
    Double distanceInterval;

    public WaylineActionTrigger() {
    }

    public WaylineActionTrigger(WaylineActionTriggerType waylineActionTriggerType, Double d2, Double d3) {
    }

    public static WaylineActionTrigger fromJson(String string) {
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

    public WaylineActionTriggerType getTriggerType() {
        return null;
    }

    public void setTriggerType(WaylineActionTriggerType waylineActionTriggerType) {
    }

    public Double getTimeInterval() {
        return null;
    }

    public void setTimeInterval(Double d2) {
    }

    public Double getDistanceInterval() {
        return null;
    }

    public void setDistanceInterval(Double d2) {
    }

    public String toString() {
        return null;
    }
}

