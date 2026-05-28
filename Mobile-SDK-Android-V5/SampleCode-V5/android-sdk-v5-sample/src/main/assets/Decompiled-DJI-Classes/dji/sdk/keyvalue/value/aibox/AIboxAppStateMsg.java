/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.AIboxAppState;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AIboxAppStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String id;
    AIboxAppState state;

    public AIboxAppStateMsg() {
    }

    public AIboxAppStateMsg(String string, AIboxAppState aIboxAppState) {
    }

    public static AIboxAppStateMsg fromJson(String string) {
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

    public String getId() {
        return null;
    }

    public void setId(String string) {
    }

    public AIboxAppState getState() {
        return null;
    }

    public void setState(AIboxAppState aIboxAppState) {
    }

    public String toString() {
        return null;
    }
}

