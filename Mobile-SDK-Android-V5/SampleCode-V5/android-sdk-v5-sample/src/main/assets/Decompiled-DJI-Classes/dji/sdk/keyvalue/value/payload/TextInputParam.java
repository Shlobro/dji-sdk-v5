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

public class TextInputParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean visible;
    String title;
    String desc;

    public TextInputParam() {
    }

    public TextInputParam(Boolean bl, String string, String string2) {
    }

    public static TextInputParam fromJson(String string) {
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

    public String getTitle() {
        return null;
    }

    public void setTitle(String string) {
    }

    public String getDesc() {
        return null;
    }

    public void setDesc(String string) {
    }

    public String toString() {
        return null;
    }
}

