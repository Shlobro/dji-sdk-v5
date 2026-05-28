/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class NotSupportAppInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean notSupportDJIGo;
    Boolean notSupportDJIPilot;
    Boolean notSupportDJIMG;
    Boolean notSupportMimo;

    public NotSupportAppInfoMsg() {
    }

    public NotSupportAppInfoMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4) {
    }

    public static NotSupportAppInfoMsg fromJson(String string) {
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

    public Boolean getNotSupportDJIGo() {
        return null;
    }

    public void setNotSupportDJIGo(Boolean bl) {
    }

    public Boolean getNotSupportDJIPilot() {
        return null;
    }

    public void setNotSupportDJIPilot(Boolean bl) {
    }

    public Boolean getNotSupportDJIMG() {
        return null;
    }

    public void setNotSupportDJIMG(Boolean bl) {
    }

    public Boolean getNotSupportMimo() {
        return null;
    }

    public void setNotSupportMimo(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

