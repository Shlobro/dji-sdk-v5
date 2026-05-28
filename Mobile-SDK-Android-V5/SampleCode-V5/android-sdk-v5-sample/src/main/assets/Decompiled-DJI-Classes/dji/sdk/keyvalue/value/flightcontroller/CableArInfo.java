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
import dji.sdk.keyvalue.value.flightcontroller.CableArEndpoint;
import org.json.JSONObject;

public class CableArInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer cable_id;
    CableArEndpoint start;
    CableArEndpoint end;

    public CableArInfo() {
    }

    public CableArInfo(Integer n, CableArEndpoint cableArEndpoint, CableArEndpoint cableArEndpoint2) {
    }

    public static CableArInfo fromJson(String string) {
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

    public Integer getCable_id() {
        return null;
    }

    public void setCable_id(Integer n) {
    }

    public CableArEndpoint getStart() {
        return null;
    }

    public void setStart(CableArEndpoint cableArEndpoint) {
    }

    public CableArEndpoint getEnd() {
        return null;
    }

    public void setEnd(CableArEndpoint cableArEndpoint) {
    }

    public String toString() {
        return null;
    }
}

