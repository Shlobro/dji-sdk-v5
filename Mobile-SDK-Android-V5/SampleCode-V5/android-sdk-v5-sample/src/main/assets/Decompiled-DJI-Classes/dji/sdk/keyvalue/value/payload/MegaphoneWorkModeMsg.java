/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.MegaphoneWorkMode;
import org.json.JSONObject;

public class MegaphoneWorkModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MegaphoneWorkMode value;

    public MegaphoneWorkModeMsg() {
    }

    public MegaphoneWorkModeMsg(MegaphoneWorkMode megaphoneWorkMode) {
    }

    public static MegaphoneWorkModeMsg fromJson(String string) {
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

    public MegaphoneWorkMode getValue() {
        return null;
    }

    public void setValue(MegaphoneWorkMode megaphoneWorkMode) {
    }

    public String toString() {
        return null;
    }
}

