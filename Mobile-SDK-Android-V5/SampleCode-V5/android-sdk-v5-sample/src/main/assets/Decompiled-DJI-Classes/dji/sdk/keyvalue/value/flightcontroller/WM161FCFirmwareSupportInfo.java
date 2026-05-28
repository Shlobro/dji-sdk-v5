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

public class WM161FCFirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean atmosphereLightSupported;
    Boolean advancedGoHomeSupported;

    public WM161FCFirmwareSupportInfo() {
    }

    public WM161FCFirmwareSupportInfo(Boolean bl, Boolean bl2) {
    }

    public static WM161FCFirmwareSupportInfo fromJson(String string) {
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

    public Boolean getAtmosphereLightSupported() {
        return null;
    }

    public void setAtmosphereLightSupported(Boolean bl) {
    }

    public Boolean getAdvancedGoHomeSupported() {
        return null;
    }

    public void setAdvancedGoHomeSupported(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

