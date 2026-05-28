/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.GimbalHandHeldDirectionType;
import org.json.JSONObject;

public class GimbalHandHeldDirectionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalHandHeldDirectionType value;

    public GimbalHandHeldDirectionMsg() {
    }

    public GimbalHandHeldDirectionMsg(GimbalHandHeldDirectionType gimbalHandHeldDirectionType) {
    }

    public static GimbalHandHeldDirectionMsg fromJson(String string) {
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

    public GimbalHandHeldDirectionType getValue() {
        return null;
    }

    public void setValue(GimbalHandHeldDirectionType gimbalHandHeldDirectionType) {
    }

    public String toString() {
        return null;
    }
}

