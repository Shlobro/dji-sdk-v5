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
import dji.sdk.keyvalue.value.flightcontroller.FCGNSSType;
import dji.sdk.keyvalue.value.product.SatelliteSNRInfo;
import java.util.List;
import org.json.JSONObject;

public class GNSSInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FCGNSSType type;
    List<SatelliteSNRInfo> snr;

    public GNSSInfo() {
    }

    public GNSSInfo(FCGNSSType fCGNSSType, List<SatelliteSNRInfo> list) {
    }

    public static GNSSInfo fromJson(String string) {
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

    public FCGNSSType getType() {
        return null;
    }

    public void setType(FCGNSSType fCGNSSType) {
    }

    public List<SatelliteSNRInfo> getSnr() {
        return null;
    }

    public void setSnr(List<SatelliteSNRInfo> list) {
    }

    public String toString() {
        return null;
    }
}

