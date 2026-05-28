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
import dji.sdk.keyvalue.value.remotecontroller.RcLanguage;
import dji.sdk.keyvalue.value.remotecontroller.RcUnits;
import org.json.JSONObject;

public class RcUnitAndLanguageMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RcUnits units;
    RcLanguage language;

    public RcUnitAndLanguageMsg() {
    }

    public RcUnitAndLanguageMsg(RcUnits rcUnits, RcLanguage rcLanguage) {
    }

    public static RcUnitAndLanguageMsg fromJson(String string) {
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

    public RcUnits getUnits() {
        return null;
    }

    public void setUnits(RcUnits rcUnits) {
    }

    public RcLanguage getLanguage() {
        return null;
    }

    public void setLanguage(RcLanguage rcLanguage) {
    }

    public String toString() {
        return null;
    }
}

