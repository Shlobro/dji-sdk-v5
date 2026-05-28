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
import dji.sdk.keyvalue.value.remotecontroller.RelayConnectedDevice;
import dji.sdk.keyvalue.value.remotecontroller.RelayOccupySupported;
import dji.sdk.keyvalue.value.remotecontroller.RelaySSIDMsg;
import org.json.JSONObject;

public class ScannedRelayInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer uav_id;
    Integer signal_val;
    Boolean is_hide;
    Boolean is_relay;
    Boolean is_occupied;
    String working_dev;
    Integer passwd_mod_count;
    RelaySSIDMsg ssid_info;
    Double position_lon;
    Double position_lat;
    RelayConnectedDevice connected_dev;
    RelayOccupySupported allow_occupy;

    public ScannedRelayInfo() {
    }

    public ScannedRelayInfo(Integer n, Integer n2, Boolean bl, Boolean bl2, Boolean bl3, String string, Integer n3, RelaySSIDMsg relaySSIDMsg, Double d2, Double d3, RelayConnectedDevice relayConnectedDevice, RelayOccupySupported relayOccupySupported) {
    }

    public static ScannedRelayInfo fromJson(String string) {
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

    public Integer getSignal_val() {
        return null;
    }

    public void setSignal_val(Integer n) {
    }

    public Boolean getIs_hide() {
        return null;
    }

    public void setIs_hide(Boolean bl) {
    }

    public Boolean getIs_relay() {
        return null;
    }

    public void setIs_relay(Boolean bl) {
    }

    public Boolean getIs_occupied() {
        return null;
    }

    public void setIs_occupied(Boolean bl) {
    }

    public String getWorking_dev() {
        return null;
    }

    public void setWorking_dev(String string) {
    }

    public Integer getPasswd_mod_count() {
        return null;
    }

    public void setPasswd_mod_count(Integer n) {
    }

    public RelaySSIDMsg getSsid_info() {
        return null;
    }

    public void setSsid_info(RelaySSIDMsg relaySSIDMsg) {
    }

    public Double getPosition_lon() {
        return null;
    }

    public void setPosition_lon(Double d2) {
    }

    public Double getPosition_lat() {
        return null;
    }

    public void setPosition_lat(Double d2) {
    }

    public RelayConnectedDevice getConnected_dev() {
        return null;
    }

    public void setConnected_dev(RelayConnectedDevice relayConnectedDevice) {
    }

    public RelayOccupySupported getAllow_occupy() {
        return null;
    }

    public void setAllow_occupy(RelayOccupySupported relayOccupySupported) {
    }

    public String toString() {
        return null;
    }
}

