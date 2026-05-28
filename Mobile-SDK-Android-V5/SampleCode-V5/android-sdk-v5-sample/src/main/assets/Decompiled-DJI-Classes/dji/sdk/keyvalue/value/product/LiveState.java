/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.LiveStateItem;
import dji.sdk.keyvalue.value.product.StreamHubProtocol;
import java.util.List;
import org.json.JSONObject;

public class LiveState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    StreamHubProtocol protocol;
    List<LiveStateItem> stateItem;

    public LiveState() {
    }

    public LiveState(StreamHubProtocol streamHubProtocol, List<LiveStateItem> list) {
    }

    public static LiveState fromJson(String string) {
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

    public StreamHubProtocol getProtocol() {
        return null;
    }

    public void setProtocol(StreamHubProtocol streamHubProtocol) {
    }

    public List<LiveStateItem> getStateItem() {
        return null;
    }

    public void setStateItem(List<LiveStateItem> list) {
    }

    public String toString() {
        return null;
    }
}

