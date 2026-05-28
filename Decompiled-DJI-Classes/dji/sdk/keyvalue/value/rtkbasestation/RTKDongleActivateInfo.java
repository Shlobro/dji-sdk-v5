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

public class RTKDongleActivateInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isActivated;
    Long timeStamp;
    String boardSN;
    String boardUID;
    String softwareVersion;

    public RTKDongleActivateInfo() {
    }

    public RTKDongleActivateInfo(Boolean bl, Long l2, String string, String string2, String string3) {
    }

    public static RTKDongleActivateInfo fromJson(String string) {
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

    public Boolean getIsActivated() {
        return null;
    }

    public void setIsActivated(Boolean bl) {
    }

    public Long getTimeStamp() {
        return null;
    }

    public void setTimeStamp(Long l2) {
    }

    public String getBoardSN() {
        return null;
    }

    public void setBoardSN(String string) {
    }

    public String getBoardUID() {
        return null;
    }

    public void setBoardUID(String string) {
    }

    public String getSoftwareVersion() {
        return null;
    }

    public void setSoftwareVersion(String string) {
    }

    public String toString() {
        return null;
    }
}

