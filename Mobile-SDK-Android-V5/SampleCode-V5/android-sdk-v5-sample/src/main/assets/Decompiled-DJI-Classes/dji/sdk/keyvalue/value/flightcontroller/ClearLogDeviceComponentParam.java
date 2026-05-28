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
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.flightcontroller.CleanableDeviceIDType;
import org.json.JSONObject;

public class ClearLogDeviceComponentParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CleanableDeviceIDType deviceID;
    ComponentIndexType componentIndex;

    public ClearLogDeviceComponentParam() {
    }

    public ClearLogDeviceComponentParam(CleanableDeviceIDType cleanableDeviceIDType, ComponentIndexType componentIndexType) {
    }

    public static ClearLogDeviceComponentParam fromJson(String string) {
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

    public CleanableDeviceIDType getDeviceID() {
        return null;
    }

    public void setDeviceID(CleanableDeviceIDType cleanableDeviceIDType) {
    }

    public ComponentIndexType getComponentIndex() {
        return null;
    }

    public void setComponentIndex(ComponentIndexType componentIndexType) {
    }

    public String toString() {
        return null;
    }
}

