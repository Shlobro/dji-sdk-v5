/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.SmartEyeTargetSelectedCmdType;
import org.json.JSONObject;

public class SmartEyeTargetSelectInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SmartEyeTargetSelectedCmdType cmdType;
    Integer targetIndex;

    public SmartEyeTargetSelectInfo() {
    }

    public SmartEyeTargetSelectInfo(SmartEyeTargetSelectedCmdType smartEyeTargetSelectedCmdType, Integer n) {
    }

    public static SmartEyeTargetSelectInfo fromJson(String string) {
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

    public SmartEyeTargetSelectedCmdType getCmdType() {
        return null;
    }

    public void setCmdType(SmartEyeTargetSelectedCmdType smartEyeTargetSelectedCmdType) {
    }

    public Integer getTargetIndex() {
        return null;
    }

    public void setTargetIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

