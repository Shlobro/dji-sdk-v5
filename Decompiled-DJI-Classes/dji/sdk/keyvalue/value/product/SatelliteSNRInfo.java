/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SatelliteSNRInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer satelliteID;
    Integer snrData;

    public SatelliteSNRInfo() {
    }

    public SatelliteSNRInfo(Integer n, Integer n2) {
    }

    public static SatelliteSNRInfo fromJson(String string) {
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

    public Integer getSatelliteID() {
        return null;
    }

    public void setSatelliteID(Integer n) {
    }

    public Integer getSnrData() {
        return null;
    }

    public void setSnrData(Integer n) {
    }

    public String toString() {
        return null;
    }
}

