/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.glass.GlassType;
import org.json.JSONObject;

public class GlassTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GlassType value;

    public GlassTypeMsg() {
    }

    public GlassTypeMsg(GlassType glassType) {
    }

    public static GlassTypeMsg fromJson(String string) {
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

    public GlassType getValue() {
        return null;
    }

    public void setValue(GlassType glassType) {
    }

    public String toString() {
        return null;
    }
}

