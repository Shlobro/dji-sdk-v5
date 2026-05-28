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
import dji.sdk.keyvalue.value.camera.H1FormatSSDType;
import org.json.JSONObject;

public class H1FormatSSDMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    H1FormatSSDType type;

    public H1FormatSSDMsg() {
    }

    public H1FormatSSDMsg(H1FormatSSDType h1FormatSSDType) {
    }

    public static H1FormatSSDMsg fromJson(String string) {
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

    public H1FormatSSDType getType() {
        return null;
    }

    public void setType(H1FormatSSDType h1FormatSSDType) {
    }

    public String toString() {
        return null;
    }
}

