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
import dji.sdk.keyvalue.value.flightcontroller.PropellerRotationStatus;
import org.json.JSONObject;

public class PropellerRotationCommandResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean commandExecuteResult;
    PropellerRotationStatus status;

    public PropellerRotationCommandResult() {
    }

    public PropellerRotationCommandResult(Boolean bl, PropellerRotationStatus propellerRotationStatus) {
    }

    public static PropellerRotationCommandResult fromJson(String string) {
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

    public Boolean getCommandExecuteResult() {
        return null;
    }

    public void setCommandExecuteResult(Boolean bl) {
    }

    public PropellerRotationStatus getStatus() {
        return null;
    }

    public void setStatus(PropellerRotationStatus propellerRotationStatus) {
    }

    public String toString() {
        return null;
    }
}

