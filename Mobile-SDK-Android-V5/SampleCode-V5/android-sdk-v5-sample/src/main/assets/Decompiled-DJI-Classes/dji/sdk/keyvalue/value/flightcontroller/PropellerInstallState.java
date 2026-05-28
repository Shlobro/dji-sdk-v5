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

public class PropellerInstallState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean frontRightInstallError;
    Boolean frontLeftInstallError;
    Boolean behindLeftInstallError;
    Boolean behindRightInstallError;
    Boolean isTakeoffFail;

    public PropellerInstallState() {
    }

    public PropellerInstallState(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
    }

    public static PropellerInstallState fromJson(String string) {
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

    public Boolean getFrontRightInstallError() {
        return null;
    }

    public void setFrontRightInstallError(Boolean bl) {
    }

    public Boolean getFrontLeftInstallError() {
        return null;
    }

    public void setFrontLeftInstallError(Boolean bl) {
    }

    public Boolean getBehindLeftInstallError() {
        return null;
    }

    public void setBehindLeftInstallError(Boolean bl) {
    }

    public Boolean getBehindRightInstallError() {
        return null;
    }

    public void setBehindRightInstallError(Boolean bl) {
    }

    public Boolean getIsTakeoffFail() {
        return null;
    }

    public void setIsTakeoffFail(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

