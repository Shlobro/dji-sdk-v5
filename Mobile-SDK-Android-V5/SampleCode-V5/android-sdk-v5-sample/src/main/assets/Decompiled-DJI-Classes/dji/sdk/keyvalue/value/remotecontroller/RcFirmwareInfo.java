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
import dji.sdk.keyvalue.value.remotecontroller.RcFirmwareDesc;
import dji.sdk.keyvalue.value.remotecontroller.RcFirmwareType;
import java.util.List;
import org.json.JSONObject;

public class RcFirmwareInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer firmwareCapacity;
    RcFirmwareType curFirmwareType;
    List<RcFirmwareDesc> firmwareDesc;

    public RcFirmwareInfo() {
    }

    public RcFirmwareInfo(Integer n, RcFirmwareType rcFirmwareType, List<RcFirmwareDesc> list) {
    }

    public static RcFirmwareInfo fromJson(String string) {
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

    public Integer getFirmwareCapacity() {
        return null;
    }

    public void setFirmwareCapacity(Integer n) {
    }

    public RcFirmwareType getCurFirmwareType() {
        return null;
    }

    public void setCurFirmwareType(RcFirmwareType rcFirmwareType) {
    }

    public List<RcFirmwareDesc> getFirmwareDesc() {
        return null;
    }

    public void setFirmwareDesc(List<RcFirmwareDesc> list) {
    }

    public String toString() {
        return null;
    }
}

