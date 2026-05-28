/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKReceiverInfo;
import java.util.List;
import org.json.JSONObject;

public class RTKSatelliteInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<RTKReceiverInfo> mobileStationReceiver1Info;
    List<RTKReceiverInfo> mobileStationReceiver2Info;
    List<RTKReceiverInfo> baseStationReceiverInfo;

    public RTKSatelliteInfo() {
    }

    public RTKSatelliteInfo(List<RTKReceiverInfo> list, List<RTKReceiverInfo> list2, List<RTKReceiverInfo> list3) {
    }

    public static RTKSatelliteInfo fromJson(String string) {
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

    public List<RTKReceiverInfo> getMobileStationReceiver1Info() {
        return null;
    }

    public void setMobileStationReceiver1Info(List<RTKReceiverInfo> list) {
    }

    public List<RTKReceiverInfo> getMobileStationReceiver2Info() {
        return null;
    }

    public void setMobileStationReceiver2Info(List<RTKReceiverInfo> list) {
    }

    public List<RTKReceiverInfo> getBaseStationReceiverInfo() {
        return null;
    }

    public void setBaseStationReceiverInfo(List<RTKReceiverInfo> list) {
    }

    public String toString() {
        return null;
    }
}

