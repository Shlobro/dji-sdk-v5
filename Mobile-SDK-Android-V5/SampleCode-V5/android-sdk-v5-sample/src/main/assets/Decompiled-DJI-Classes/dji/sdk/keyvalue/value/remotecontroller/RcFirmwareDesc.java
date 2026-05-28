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
import dji.sdk.keyvalue.value.remotecontroller.RcFirmwareType;
import org.json.JSONObject;

public class RcFirmwareDesc
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String firmwareName;
    String uavName;
    String firmwareVersion;
    String hdvtVersion;
    String mcuVersion;
    Integer firmwareIndex;
    RcFirmwareType type;

    public RcFirmwareDesc() {
    }

    public RcFirmwareDesc(String string, String string2, String string3, String string4, String string5, Integer n, RcFirmwareType rcFirmwareType) {
    }

    public static RcFirmwareDesc fromJson(String string) {
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

    public String getFirmwareName() {
        return null;
    }

    public void setFirmwareName(String string) {
    }

    public String getUavName() {
        return null;
    }

    public void setUavName(String string) {
    }

    public String getFirmwareVersion() {
        return null;
    }

    public void setFirmwareVersion(String string) {
    }

    public String getHdvtVersion() {
        return null;
    }

    public void setHdvtVersion(String string) {
    }

    public String getMcuVersion() {
        return null;
    }

    public void setMcuVersion(String string) {
    }

    public Integer getFirmwareIndex() {
        return null;
    }

    public void setFirmwareIndex(Integer n) {
    }

    public RcFirmwareType getType() {
        return null;
    }

    public void setType(RcFirmwareType rcFirmwareType) {
    }

    public String toString() {
        return null;
    }
}

