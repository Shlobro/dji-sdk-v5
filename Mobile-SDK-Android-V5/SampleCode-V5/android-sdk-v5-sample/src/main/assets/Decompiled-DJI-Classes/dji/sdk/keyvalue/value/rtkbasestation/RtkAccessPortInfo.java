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

public class RtkAccessPortInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String coordinateFrame;
    Integer port;

    public RtkAccessPortInfo() {
    }

    public RtkAccessPortInfo(String string, Integer n) {
    }

    public static RtkAccessPortInfo fromJson(String string) {
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

    public String getCoordinateFrame() {
        return null;
    }

    public void setCoordinateFrame(String string) {
    }

    public Integer getPort() {
        return null;
    }

    public void setPort(Integer n) {
    }

    public String toString() {
        return null;
    }
}

