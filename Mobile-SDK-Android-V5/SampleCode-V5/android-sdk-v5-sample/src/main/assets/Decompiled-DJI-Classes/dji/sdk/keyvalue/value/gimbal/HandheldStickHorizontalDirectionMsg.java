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
import dji.sdk.keyvalue.value.gimbal.HandheldStickHorizontalDirection;
import org.json.JSONObject;

public class HandheldStickHorizontalDirectionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    HandheldStickHorizontalDirection value;

    public HandheldStickHorizontalDirectionMsg() {
    }

    public HandheldStickHorizontalDirectionMsg(HandheldStickHorizontalDirection handheldStickHorizontalDirection) {
    }

    public static HandheldStickHorizontalDirectionMsg fromJson(String string) {
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

    public HandheldStickHorizontalDirection getValue() {
        return null;
    }

    public void setValue(HandheldStickHorizontalDirection handheldStickHorizontalDirection) {
    }

    public String toString() {
        return null;
    }
}

