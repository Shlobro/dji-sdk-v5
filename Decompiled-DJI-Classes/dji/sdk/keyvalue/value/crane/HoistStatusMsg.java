/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.crane;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.crane.HoistStatus;
import org.json.JSONObject;

public class HoistStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HoistStatus value;

    public HoistStatusMsg() {
    }

    public HoistStatusMsg(HoistStatus hoistStatus) {
    }

    public static HoistStatusMsg fromJson(String string) {
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

    public HoistStatus getValue() {
        return null;
    }

    public void setValue(HoistStatus hoistStatus) {
    }

    public String toString() {
        return null;
    }
}

