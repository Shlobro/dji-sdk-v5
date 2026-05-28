/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class VoltageWarningInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean WarningLevel1;
    Boolean WarningLevel2;

    public VoltageWarningInfo() {
    }

    public VoltageWarningInfo(Boolean bl, Boolean bl2) {
    }

    public static VoltageWarningInfo fromJson(String string) {
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

    public Boolean getWarningLevel1() {
        return null;
    }

    public void setWarningLevel1(Boolean bl) {
    }

    public Boolean getWarningLevel2() {
        return null;
    }

    public void setWarningLevel2(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

