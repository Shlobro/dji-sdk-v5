/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.LinkMode;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LinkModeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LinkMode value;

    public LinkModeMsg() {
    }

    public LinkModeMsg(LinkMode linkMode) {
    }

    public static LinkModeMsg fromJson(String string) {
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

    public LinkMode getValue() {
        return null;
    }

    public void setValue(LinkMode linkMode) {
    }

    public String toString() {
        return null;
    }
}

