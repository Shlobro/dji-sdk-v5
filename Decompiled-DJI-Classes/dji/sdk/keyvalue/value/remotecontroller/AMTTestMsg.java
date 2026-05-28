/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.AMTTestChip;
import org.json.JSONObject;

public class AMTTestMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    AMTTestChip chip;
    String scriptName;
    Integer testID;
    Integer timeout;
    String param;

    public AMTTestMsg() {
    }

    public AMTTestMsg(AMTTestChip aMTTestChip, String string, Integer n, Integer n2, String string2) {
    }

    public static AMTTestMsg fromJson(String string) {
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

    public AMTTestChip getChip() {
        return null;
    }

    public void setChip(AMTTestChip aMTTestChip) {
    }

    public String getScriptName() {
        return null;
    }

    public void setScriptName(String string) {
    }

    public Integer getTestID() {
        return null;
    }

    public void setTestID(Integer n) {
    }

    public Integer getTimeout() {
        return null;
    }

    public void setTimeout(Integer n) {
    }

    public String getParam() {
        return null;
    }

    public void setParam(String string) {
    }

    public String toString() {
        return null;
    }
}

