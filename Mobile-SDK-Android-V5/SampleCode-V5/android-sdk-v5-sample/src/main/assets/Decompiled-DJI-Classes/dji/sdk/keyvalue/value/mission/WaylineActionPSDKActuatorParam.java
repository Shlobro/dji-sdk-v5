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
import org.json.JSONObject;

public class WaylineActionPSDKActuatorParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer actionType;
    Integer actionIndex;
    Double actionParam;

    public WaylineActionPSDKActuatorParam() {
    }

    public WaylineActionPSDKActuatorParam(Integer n, Integer n2, Double d2) {
    }

    public static WaylineActionPSDKActuatorParam fromJson(String string) {
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

    public Integer getActionType() {
        return null;
    }

    public void setActionType(Integer n) {
    }

    public Integer getActionIndex() {
        return null;
    }

    public void setActionIndex(Integer n) {
    }

    public Double getActionParam() {
        return null;
    }

    public void setActionParam(Double d2) {
    }

    public String toString() {
        return null;
    }
}

