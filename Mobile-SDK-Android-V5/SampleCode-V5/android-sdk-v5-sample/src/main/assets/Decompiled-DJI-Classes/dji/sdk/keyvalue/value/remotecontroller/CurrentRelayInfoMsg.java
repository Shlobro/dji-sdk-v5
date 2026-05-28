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
import dji.sdk.keyvalue.value.remotecontroller.RelayBroadcastPeriod;
import dji.sdk.keyvalue.value.remotecontroller.RelayOwnerState;
import dji.sdk.keyvalue.value.remotecontroller.RelaySSIDMsg;
import org.json.JSONObject;

public class CurrentRelayInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer uav_id;
    Boolean is_first_cfg;
    Boolean is_broadcast_hide;
    Boolean is_broadcast_enable;
    Integer passwd_mod_count;
    RelayBroadcastPeriod period;
    RelaySSIDMsg ssid_info;
    RelayOwnerState owner;
    Boolean seized_switch;

    public CurrentRelayInfoMsg() {
    }

    public CurrentRelayInfoMsg(Integer n, Boolean bl, Boolean bl2, Boolean bl3, Integer n2, RelayBroadcastPeriod relayBroadcastPeriod, RelaySSIDMsg relaySSIDMsg, RelayOwnerState relayOwnerState, Boolean bl4) {
    }

    public static CurrentRelayInfoMsg fromJson(String string) {
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

    public Integer getUav_id() {
        return null;
    }

    public void setUav_id(Integer n) {
    }

    public Boolean getIs_first_cfg() {
        return null;
    }

    public void setIs_first_cfg(Boolean bl) {
    }

    public Boolean getIs_broadcast_hide() {
        return null;
    }

    public void setIs_broadcast_hide(Boolean bl) {
    }

    public Boolean getIs_broadcast_enable() {
        return null;
    }

    public void setIs_broadcast_enable(Boolean bl) {
    }

    public Integer getPasswd_mod_count() {
        return null;
    }

    public void setPasswd_mod_count(Integer n) {
    }

    public RelayBroadcastPeriod getPeriod() {
        return null;
    }

    public void setPeriod(RelayBroadcastPeriod relayBroadcastPeriod) {
    }

    public RelaySSIDMsg getSsid_info() {
        return null;
    }

    public void setSsid_info(RelaySSIDMsg relaySSIDMsg) {
    }

    public RelayOwnerState getOwner() {
        return null;
    }

    public void setOwner(RelayOwnerState relayOwnerState) {
    }

    public Boolean getSeized_switch() {
        return null;
    }

    public void setSeized_switch(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

