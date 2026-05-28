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

public class WaylineCustomPayloadActionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer actionType;
    String actionName;
    Double maxParamValue;
    Double minParamValue;

    public WaylineCustomPayloadActionInfo() {
    }

    public WaylineCustomPayloadActionInfo(Integer n, String string, Double d2, Double d3) {
    }

    public static WaylineCustomPayloadActionInfo fromJson(String string) {
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

    public String getActionName() {
        return null;
    }

    public void setActionName(String string) {
    }

    public Double getMaxParamValue() {
        return null;
    }

    public void setMaxParamValue(Double d2) {
    }

    public Double getMinParamValue() {
        return null;
    }

    public void setMinParamValue(Double d2) {
    }

    public String toString() {
        return null;
    }
}

