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

public class AccessLockerEncryptionStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isFeatureSupported;
    Boolean isFeatureEnabled;
    Boolean isFeatureNeedToBeVerified;

    public AccessLockerEncryptionStatus() {
    }

    public AccessLockerEncryptionStatus(Boolean bl, Boolean bl2, Boolean bl3) {
    }

    public static AccessLockerEncryptionStatus fromJson(String string) {
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

    public Boolean getIsFeatureSupported() {
        return null;
    }

    public void setIsFeatureSupported(Boolean bl) {
    }

    public Boolean getIsFeatureEnabled() {
        return null;
    }

    public void setIsFeatureEnabled(Boolean bl) {
    }

    public Boolean getIsFeatureNeedToBeVerified() {
        return null;
    }

    public void setIsFeatureNeedToBeVerified(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

