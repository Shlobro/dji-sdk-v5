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
import dji.sdk.keyvalue.value.flightcontroller.MGPumpInfo;
import dji.sdk.keyvalue.value.flightcontroller.MGSprayWorkState;
import java.util.List;
import org.json.JSONObject;

public class MGSprayDetailInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer version;
    MGSprayWorkState state;
    Boolean isExact;
    Integer remainCapacity;
    Integer sprayedCapacity;
    List<MGPumpInfo> pumpInfos;

    public MGSprayDetailInfo() {
    }

    public MGSprayDetailInfo(Integer n, MGSprayWorkState mGSprayWorkState, Boolean bl, Integer n2, Integer n3, List<MGPumpInfo> list) {
    }

    public static MGSprayDetailInfo fromJson(String string) {
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

    public Integer getVersion() {
        return null;
    }

    public void setVersion(Integer n) {
    }

    public MGSprayWorkState getState() {
        return null;
    }

    public void setState(MGSprayWorkState mGSprayWorkState) {
    }

    public Boolean getIsExact() {
        return null;
    }

    public void setIsExact(Boolean bl) {
    }

    public Integer getRemainCapacity() {
        return null;
    }

    public void setRemainCapacity(Integer n) {
    }

    public Integer getSprayedCapacity() {
        return null;
    }

    public void setSprayedCapacity(Integer n) {
    }

    public List<MGPumpInfo> getPumpInfos() {
        return null;
    }

    public void setPumpInfos(List<MGPumpInfo> list) {
    }

    public String toString() {
        return null;
    }
}

