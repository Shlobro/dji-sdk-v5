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

public class EscState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isStall;
    Boolean isEmpty;
    Boolean isUnbalance;
    Boolean isESCDDisconnected;
    Boolean isTemperHigh;

    public EscState() {
    }

    public EscState(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
    }

    public static EscState fromJson(String string) {
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

    public Boolean getIsStall() {
        return null;
    }

    public void setIsStall(Boolean bl) {
    }

    public Boolean getIsEmpty() {
        return null;
    }

    public void setIsEmpty(Boolean bl) {
    }

    public Boolean getIsUnbalance() {
        return null;
    }

    public void setIsUnbalance(Boolean bl) {
    }

    public Boolean getIsESCDDisconnected() {
        return null;
    }

    public void setIsESCDDisconnected(Boolean bl) {
    }

    public Boolean getIsTemperHigh() {
        return null;
    }

    public void setIsTemperHigh(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

