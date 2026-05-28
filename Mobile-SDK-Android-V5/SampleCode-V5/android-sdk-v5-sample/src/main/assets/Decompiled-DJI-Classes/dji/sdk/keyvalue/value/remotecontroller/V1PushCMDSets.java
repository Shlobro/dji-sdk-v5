/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class V1PushCMDSets
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> EnablePushCmdSets;

    public V1PushCMDSets() {
    }

    public V1PushCMDSets(List<Integer> list) {
    }

    public static V1PushCMDSets fromJson(String string) {
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

    public List<Integer> getEnablePushCmdSets() {
        return null;
    }

    public void setEnablePushCmdSets(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

