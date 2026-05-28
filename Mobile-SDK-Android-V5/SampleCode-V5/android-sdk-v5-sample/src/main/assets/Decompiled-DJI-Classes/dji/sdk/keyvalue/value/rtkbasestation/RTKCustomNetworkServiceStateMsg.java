/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.RTKServiceState;
import org.json.JSONObject;

public class RTKCustomNetworkServiceStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKServiceState value;

    public RTKCustomNetworkServiceStateMsg() {
    }

    public RTKCustomNetworkServiceStateMsg(RTKServiceState rTKServiceState) {
    }

    public static RTKCustomNetworkServiceStateMsg fromJson(String string) {
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

    public RTKServiceState getValue() {
        return null;
    }

    public void setValue(RTKServiceState rTKServiceState) {
    }

    public String toString() {
        return null;
    }
}

