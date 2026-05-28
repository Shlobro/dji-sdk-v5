/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.AIBoxExternalStorageState;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AIBoxExternalStorageStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AIBoxExternalStorageState state;

    public AIBoxExternalStorageStateMsg() {
    }

    public AIBoxExternalStorageStateMsg(AIBoxExternalStorageState aIBoxExternalStorageState) {
    }

    public static AIBoxExternalStorageStateMsg fromJson(String string) {
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

    public AIBoxExternalStorageState getState() {
        return null;
    }

    public void setState(AIBoxExternalStorageState aIBoxExternalStorageState) {
    }

    public String toString() {
        return null;
    }
}

