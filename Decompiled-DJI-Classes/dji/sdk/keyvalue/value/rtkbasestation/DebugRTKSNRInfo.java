/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class DebugRTKSNRInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer timestamp;
    Integer snr_source;
    Integer gnss_sys;
    List<Integer> snr;

    public DebugRTKSNRInfo() {
    }

    public DebugRTKSNRInfo(Integer n, Integer n2, Integer n3, List<Integer> list) {
    }

    public static DebugRTKSNRInfo fromJson(String string) {
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

    public Integer getTimestamp() {
        return null;
    }

    public void setTimestamp(Integer n) {
    }

    public Integer getSnr_source() {
        return null;
    }

    public void setSnr_source(Integer n) {
    }

    public Integer getGnss_sys() {
        return null;
    }

    public void setGnss_sys(Integer n) {
    }

    public List<Integer> getSnr() {
        return null;
    }

    public void setSnr(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

