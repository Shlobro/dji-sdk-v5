/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmRttInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean rttCanUse;
    Boolean missRateCanUse;
    Integer averRttMs;
    Integer minRttMs;
    Integer maxRttMs;
    Integer missRate;

    public WlmRttInfo() {
    }

    public WlmRttInfo(Boolean bl, Boolean bl2, Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static WlmRttInfo fromJson(String string) {
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

    public Boolean getRttCanUse() {
        return null;
    }

    public void setRttCanUse(Boolean bl) {
    }

    public Boolean getMissRateCanUse() {
        return null;
    }

    public void setMissRateCanUse(Boolean bl) {
    }

    public Integer getAverRttMs() {
        return null;
    }

    public void setAverRttMs(Integer n) {
    }

    public Integer getMinRttMs() {
        return null;
    }

    public void setMinRttMs(Integer n) {
    }

    public Integer getMaxRttMs() {
        return null;
    }

    public void setMaxRttMs(Integer n) {
    }

    public Integer getMissRate() {
        return null;
    }

    public void setMissRate(Integer n) {
    }

    public String toString() {
        return null;
    }
}

