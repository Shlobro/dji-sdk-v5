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
import org.json.JSONObject;

public class VisionAllowedDirectionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean frontAllowed;
    Boolean backAllowed;
    Boolean leftAllowed;
    Boolean rightAllowed;

    public VisionAllowedDirectionInfo() {
    }

    public VisionAllowedDirectionInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4) {
    }

    public static VisionAllowedDirectionInfo fromJson(String string) {
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

    public Boolean getFrontAllowed() {
        return null;
    }

    public void setFrontAllowed(Boolean bl) {
    }

    public Boolean getBackAllowed() {
        return null;
    }

    public void setBackAllowed(Boolean bl) {
    }

    public Boolean getLeftAllowed() {
        return null;
    }

    public void setLeftAllowed(Boolean bl) {
    }

    public Boolean getRightAllowed() {
        return null;
    }

    public void setRightAllowed(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

