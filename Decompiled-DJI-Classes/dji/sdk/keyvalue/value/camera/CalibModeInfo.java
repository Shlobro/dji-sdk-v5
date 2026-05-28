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
import dji.sdk.keyvalue.value.camera.CalibDate;
import org.json.JSONObject;

public class CalibModeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean is_user_calib;
    CalibDate calib_date;

    public CalibModeInfo() {
    }

    public CalibModeInfo(Boolean bl, CalibDate calibDate) {
    }

    public static CalibModeInfo fromJson(String string) {
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

    public Boolean getIs_user_calib() {
        return null;
    }

    public void setIs_user_calib(Boolean bl) {
    }

    public CalibDate getCalib_date() {
        return null;
    }

    public void setCalib_date(CalibDate calibDate) {
    }

    public String toString() {
        return null;
    }
}

