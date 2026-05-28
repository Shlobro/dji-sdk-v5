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
import dji.sdk.keyvalue.value.flightcontroller.RealNameRegistrationState;
import org.json.JSONObject;

public class SyncUOMRealNameStatusResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isUOMSystemFailure;
    String uomFailureText;
    String uomFailureURL;
    RealNameRegistrationState status;

    public SyncUOMRealNameStatusResultMsg() {
    }

    public SyncUOMRealNameStatusResultMsg(Boolean bl, String string, String string2, RealNameRegistrationState realNameRegistrationState) {
    }

    public static SyncUOMRealNameStatusResultMsg fromJson(String string) {
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

    public Boolean getIsUOMSystemFailure() {
        return null;
    }

    public void setIsUOMSystemFailure(Boolean bl) {
    }

    public String getUomFailureText() {
        return null;
    }

    public void setUomFailureText(String string) {
    }

    public String getUomFailureURL() {
        return null;
    }

    public void setUomFailureURL(String string) {
    }

    public RealNameRegistrationState getStatus() {
        return null;
    }

    public void setStatus(RealNameRegistrationState realNameRegistrationState) {
    }

    public String toString() {
        return null;
    }
}

