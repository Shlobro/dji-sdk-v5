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
import dji.sdk.keyvalue.value.gimbal.HandheldStickVerticalDirection;
import org.json.JSONObject;

public class HandheldStickVerticalDirectionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HandheldStickVerticalDirection value;

    public HandheldStickVerticalDirectionMsg() {
    }

    public HandheldStickVerticalDirectionMsg(HandheldStickVerticalDirection handheldStickVerticalDirection) {
    }

    public static HandheldStickVerticalDirectionMsg fromJson(String string) {
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

    public HandheldStickVerticalDirection getValue() {
        return null;
    }

    public void setValue(HandheldStickVerticalDirection handheldStickVerticalDirection) {
    }

    public String toString() {
        return null;
    }
}

