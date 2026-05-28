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

public class SDRHdOffsetParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer pathLossOffset;
    Integer rcLinkOffset;
    Integer txPowerOffset;
    Integer distOffset;

    public SDRHdOffsetParams() {
    }

    public SDRHdOffsetParams(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static SDRHdOffsetParams fromJson(String string) {
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

    public Integer getPathLossOffset() {
        return null;
    }

    public void setPathLossOffset(Integer n) {
    }

    public Integer getRcLinkOffset() {
        return null;
    }

    public void setRcLinkOffset(Integer n) {
    }

    public Integer getTxPowerOffset() {
        return null;
    }

    public void setTxPowerOffset(Integer n) {
    }

    public Integer getDistOffset() {
        return null;
    }

    public void setDistOffset(Integer n) {
    }

    public String toString() {
        return null;
    }
}

