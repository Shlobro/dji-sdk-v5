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

public class AeroScopeClientSwitchInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean sn;
    Boolean gps;
    Boolean homeGps;
    Boolean droneID;
    Boolean flyPlan;
    Boolean uuid;
    Boolean appGps;
    Boolean customContent;

    public AeroScopeClientSwitchInfo() {
    }

    public AeroScopeClientSwitchInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8) {
    }

    public static AeroScopeClientSwitchInfo fromJson(String string) {
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

    public Boolean getSn() {
        return null;
    }

    public void setSn(Boolean bl) {
    }

    public Boolean getGps() {
        return null;
    }

    public void setGps(Boolean bl) {
    }

    public Boolean getHomeGps() {
        return null;
    }

    public void setHomeGps(Boolean bl) {
    }

    public Boolean getDroneID() {
        return null;
    }

    public void setDroneID(Boolean bl) {
    }

    public Boolean getFlyPlan() {
        return null;
    }

    public void setFlyPlan(Boolean bl) {
    }

    public Boolean getUuid() {
        return null;
    }

    public void setUuid(Boolean bl) {
    }

    public Boolean getAppGps() {
        return null;
    }

    public void setAppGps(Boolean bl) {
    }

    public Boolean getCustomContent() {
        return null;
    }

    public void setCustomContent(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

