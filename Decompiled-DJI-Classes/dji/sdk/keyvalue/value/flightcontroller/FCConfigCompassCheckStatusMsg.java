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
import dji.sdk.keyvalue.value.flightcontroller.FCConfigCompassCheckStatus;
import org.json.JSONObject;

public class FCConfigCompassCheckStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FCConfigCompassCheckStatus value;

    public FCConfigCompassCheckStatusMsg() {
    }

    public FCConfigCompassCheckStatusMsg(FCConfigCompassCheckStatus fCConfigCompassCheckStatus) {
    }

    public static FCConfigCompassCheckStatusMsg fromJson(String string) {
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

    public FCConfigCompassCheckStatus getValue() {
        return null;
    }

    public void setValue(FCConfigCompassCheckStatus fCConfigCompassCheckStatus) {
    }

    public String toString() {
        return null;
    }
}

