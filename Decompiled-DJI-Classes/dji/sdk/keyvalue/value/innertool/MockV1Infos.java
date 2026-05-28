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
import dji.sdk.keyvalue.value.innertool.MockV1Info;
import java.util.List;
import org.json.JSONObject;

public class MockV1Infos
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<MockV1Info> value;

    public MockV1Infos() {
    }

    public MockV1Infos(List<MockV1Info> list) {
    }

    public static MockV1Infos fromJson(String string) {
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

    public List<MockV1Info> getValue() {
        return null;
    }

    public void setValue(List<MockV1Info> list) {
    }

    public String toString() {
        return null;
    }
}

