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
import dji.sdk.keyvalue.value.flightcontroller.OfflineMapFileStatus;
import org.json.JSONObject;

public class OfflineMapFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String file_name;
    String checksum;
    OfflineMapFileStatus status;
    Boolean file_existed;

    public OfflineMapFileInfo() {
    }

    public OfflineMapFileInfo(String string, String string2, OfflineMapFileStatus offlineMapFileStatus, Boolean bl) {
    }

    public static OfflineMapFileInfo fromJson(String string) {
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

    public String getFile_name() {
        return null;
    }

    public void setFile_name(String string) {
    }

    public String getChecksum() {
        return null;
    }

    public void setChecksum(String string) {
    }

    public OfflineMapFileStatus getStatus() {
        return null;
    }

    public void setStatus(OfflineMapFileStatus offlineMapFileStatus) {
    }

    public Boolean getFile_existed() {
        return null;
    }

    public void setFile_existed(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

