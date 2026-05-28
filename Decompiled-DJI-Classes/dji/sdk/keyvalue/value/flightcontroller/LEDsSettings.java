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

public class LEDsSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean frontLEDsOn;
    Boolean statusIndicatorLEDsOn;
    Boolean rearLEDsOn;
    Boolean navigationLEDsOn;

    public LEDsSettings() {
    }

    public LEDsSettings(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4) {
    }

    public static LEDsSettings fromJson(String string) {
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

    public Boolean getFrontLEDsOn() {
        return null;
    }

    public void setFrontLEDsOn(Boolean bl) {
    }

    public Boolean getStatusIndicatorLEDsOn() {
        return null;
    }

    public void setStatusIndicatorLEDsOn(Boolean bl) {
    }

    public Boolean getRearLEDsOn() {
        return null;
    }

    public void setRearLEDsOn(Boolean bl) {
    }

    public Boolean getNavigationLEDsOn() {
        return null;
    }

    public void setNavigationLEDsOn(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

