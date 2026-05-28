/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.FiveDimensionPressedStatus;
import org.json.JSONObject;

public class RcCustomButtonHardwareStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isC1Click;
    Boolean isC2Click;
    Boolean isC3Click;
    Boolean isC4Click;
    FiveDimensionPressedStatus fiveDimensionPressStatus;

    public RcCustomButtonHardwareStatus() {
    }

    public RcCustomButtonHardwareStatus(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, FiveDimensionPressedStatus fiveDimensionPressedStatus) {
    }

    public static RcCustomButtonHardwareStatus fromJson(String string) {
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

    public Boolean getIsC1Click() {
        return null;
    }

    public void setIsC1Click(Boolean bl) {
    }

    public Boolean getIsC2Click() {
        return null;
    }

    public void setIsC2Click(Boolean bl) {
    }

    public Boolean getIsC3Click() {
        return null;
    }

    public void setIsC3Click(Boolean bl) {
    }

    public Boolean getIsC4Click() {
        return null;
    }

    public void setIsC4Click(Boolean bl) {
    }

    public FiveDimensionPressedStatus getFiveDimensionPressStatus() {
        return null;
    }

    public void setFiveDimensionPressStatus(FiveDimensionPressedStatus fiveDimensionPressedStatus) {
    }

    public String toString() {
        return null;
    }
}

