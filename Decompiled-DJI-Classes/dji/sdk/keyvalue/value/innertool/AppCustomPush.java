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
import dji.sdk.keyvalue.value.innertool.AppCustomPushType;
import org.json.JSONObject;

public class AppCustomPush
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AppCustomPushType type;
    String value;

    public AppCustomPush() {
    }

    public AppCustomPush(AppCustomPushType appCustomPushType, String string) {
    }

    public static AppCustomPush fromJson(String string) {
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

    public AppCustomPushType getType() {
        return null;
    }

    public void setType(AppCustomPushType appCustomPushType) {
    }

    public String getValue() {
        return null;
    }

    public void setValue(String string) {
    }

    public String toString() {
        return null;
    }
}

