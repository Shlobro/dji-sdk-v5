/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ArTextInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean visible;
    String text;

    public ArTextInfo() {
    }

    public ArTextInfo(Boolean bl, String string) {
    }

    public static ArTextInfo fromJson(String string) {
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

    public Boolean getVisible() {
        return null;
    }

    public void setVisible(Boolean bl) {
    }

    public String getText() {
        return null;
    }

    public void setText(String string) {
    }

    public String toString() {
        return null;
    }
}

