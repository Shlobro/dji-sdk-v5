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
import org.json.JSONObject;

public class RedundancySensorUsedStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer nsIndex;
    Integer accIndex;
    Integer gyroIndex;
    Integer magIndex;
    Integer gpsIndex;
    Integer baroIndex;
    Boolean isRTKUsed;
    Boolean isVOUsed;
    Boolean isUSUsed;
    Boolean isRadarUsed;

    public RedundancySensorUsedStateMsg() {
    }

    public RedundancySensorUsedStateMsg(Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4) {
    }

    public static RedundancySensorUsedStateMsg fromJson(String string) {
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

    public Integer getNsIndex() {
        return null;
    }

    public void setNsIndex(Integer n) {
    }

    public Integer getAccIndex() {
        return null;
    }

    public void setAccIndex(Integer n) {
    }

    public Integer getGyroIndex() {
        return null;
    }

    public void setGyroIndex(Integer n) {
    }

    public Integer getMagIndex() {
        return null;
    }

    public void setMagIndex(Integer n) {
    }

    public Integer getGpsIndex() {
        return null;
    }

    public void setGpsIndex(Integer n) {
    }

    public Integer getBaroIndex() {
        return null;
    }

    public void setBaroIndex(Integer n) {
    }

    public Boolean getIsRTKUsed() {
        return null;
    }

    public void setIsRTKUsed(Boolean bl) {
    }

    public Boolean getIsVOUsed() {
        return null;
    }

    public void setIsVOUsed(Boolean bl) {
    }

    public Boolean getIsUSUsed() {
        return null;
    }

    public void setIsUSUsed(Boolean bl) {
    }

    public Boolean getIsRadarUsed() {
        return null;
    }

    public void setIsRadarUsed(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

