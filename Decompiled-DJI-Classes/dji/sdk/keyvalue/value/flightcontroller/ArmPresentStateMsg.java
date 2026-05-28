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

public class ArmPresentStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean arm1PresentState;
    Boolean arm2PresentState;
    Boolean arm3PresentState;
    Boolean arm4PresentState;
    Boolean arm5PresentState;
    Boolean arm6PresentState;

    public ArmPresentStateMsg() {
    }

    public ArmPresentStateMsg(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6) {
    }

    public static ArmPresentStateMsg fromJson(String string) {
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

    public Boolean getArm1PresentState() {
        return null;
    }

    public void setArm1PresentState(Boolean bl) {
    }

    public Boolean getArm2PresentState() {
        return null;
    }

    public void setArm2PresentState(Boolean bl) {
    }

    public Boolean getArm3PresentState() {
        return null;
    }

    public void setArm3PresentState(Boolean bl) {
    }

    public Boolean getArm4PresentState() {
        return null;
    }

    public void setArm4PresentState(Boolean bl) {
    }

    public Boolean getArm5PresentState() {
        return null;
    }

    public void setArm5PresentState(Boolean bl) {
    }

    public Boolean getArm6PresentState() {
        return null;
    }

    public void setArm6PresentState(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

