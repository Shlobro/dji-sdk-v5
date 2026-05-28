/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class H1MediaFileCustomInformationMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> value;

    public H1MediaFileCustomInformationMsg() {
    }

    public H1MediaFileCustomInformationMsg(List<Integer> list) {
    }

    public static H1MediaFileCustomInformationMsg fromJson(String string) {
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

    public List<Integer> getValue() {
        return null;
    }

    public void setValue(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

