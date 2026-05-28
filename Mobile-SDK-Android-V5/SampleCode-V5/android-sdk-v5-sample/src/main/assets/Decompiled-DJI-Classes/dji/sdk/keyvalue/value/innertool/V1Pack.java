/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.innertool.V1PackHeader;
import java.util.List;
import org.json.JSONObject;

public class V1Pack
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    V1PackHeader header;
    List<Integer> data;

    public V1Pack() {
    }

    public V1Pack(V1PackHeader v1PackHeader, List<Integer> list) {
    }

    public static V1Pack fromJson(String string) {
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

    public V1PackHeader getHeader() {
        return null;
    }

    public void setHeader(V1PackHeader v1PackHeader) {
    }

    public List<Integer> getData() {
        return null;
    }

    public void setData(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

