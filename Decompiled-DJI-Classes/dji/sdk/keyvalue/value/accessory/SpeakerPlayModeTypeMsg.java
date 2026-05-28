/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.accessory;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.accessory.SpeakerPlayModeType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SpeakerPlayModeTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SpeakerPlayModeType value;

    public SpeakerPlayModeTypeMsg() {
    }

    public SpeakerPlayModeTypeMsg(SpeakerPlayModeType speakerPlayModeType) {
    }

    public static SpeakerPlayModeTypeMsg fromJson(String string) {
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

    public SpeakerPlayModeType getValue() {
        return null;
    }

    public void setValue(SpeakerPlayModeType speakerPlayModeType) {
    }

    public String toString() {
        return null;
    }
}

