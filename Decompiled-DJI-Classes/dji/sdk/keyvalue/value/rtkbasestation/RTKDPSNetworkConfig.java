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
import org.json.JSONObject;

public class RTKDPSNetworkConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String dsk;
    String dss;
    String deviceId;
    String deviceType;

    public RTKDPSNetworkConfig() {
    }

    public RTKDPSNetworkConfig(String string, String string2, String string3, String string4) {
    }

    public static RTKDPSNetworkConfig fromJson(String string) {
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

    public String getDsk() {
        return null;
    }

    public void setDsk(String string) {
    }

    public String getDss() {
        return null;
    }

    public void setDss(String string) {
    }

    public String getDeviceId() {
        return null;
    }

    public void setDeviceId(String string) {
    }

    public String getDeviceType() {
        return null;
    }

    public void setDeviceType(String string) {
    }

    public String toString() {
        return null;
    }
}

