/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.OfflineMapFileInfo;
import dji.sdk.keyvalue.value.flightcontroller.OfflineMapServiceStatus;
import dji.sdk.keyvalue.value.flightcontroller.OfflineMapStatusInDronePosition;
import org.json.JSONObject;

public class OfflineMapServiceInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    OfflineMapServiceStatus service_status;
    OfflineMapStatusInDronePosition map_status_in_drone_pos;
    OfflineMapFileInfo dem_file_info;

    public OfflineMapServiceInfoMsg() {
    }

    public OfflineMapServiceInfoMsg(OfflineMapServiceStatus offlineMapServiceStatus, OfflineMapStatusInDronePosition offlineMapStatusInDronePosition, OfflineMapFileInfo offlineMapFileInfo) {
    }

    public static OfflineMapServiceInfoMsg fromJson(String string) {
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

    public OfflineMapServiceStatus getService_status() {
        return null;
    }

    public void setService_status(OfflineMapServiceStatus offlineMapServiceStatus) {
    }

    public OfflineMapStatusInDronePosition getMap_status_in_drone_pos() {
        return null;
    }

    public void setMap_status_in_drone_pos(OfflineMapStatusInDronePosition offlineMapStatusInDronePosition) {
    }

    public OfflineMapFileInfo getDem_file_info() {
        return null;
    }

    public void setDem_file_info(OfflineMapFileInfo offlineMapFileInfo) {
    }

    public String toString() {
        return null;
    }
}

