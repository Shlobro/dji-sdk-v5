/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKUndulationType;
import org.json.JSONObject;

public class RTKUndulationTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKUndulationType value;

    public RTKUndulationTypeMsg() {
    }

    public RTKUndulationTypeMsg(RTKUndulationType rTKUndulationType) {
    }

    public static RTKUndulationTypeMsg fromJson(String string) {
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

    public RTKUndulationType getValue() {
        return null;
    }

    public void setValue(RTKUndulationType rTKUndulationType) {
    }

    public String toString() {
        return null;
    }
}

