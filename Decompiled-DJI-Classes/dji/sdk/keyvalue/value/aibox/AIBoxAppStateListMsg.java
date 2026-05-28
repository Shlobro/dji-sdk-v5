/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.AIboxAppStateMsg;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class AIBoxAppStateListMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<AIboxAppStateMsg> appListState;

    public AIBoxAppStateListMsg() {
    }

    public AIBoxAppStateListMsg(List<AIboxAppStateMsg> list) {
    }

    public static AIBoxAppStateListMsg fromJson(String string) {
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

    public List<AIboxAppStateMsg> getAppListState() {
        return null;
    }

    public void setAppListState(List<AIboxAppStateMsg> list) {
    }

    public String toString() {
        return null;
    }
}

