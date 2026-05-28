/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.RelayDeviceType;
import dji.sdk.keyvalue.value.airlink.RelayMainPathType;
import dji.sdk.keyvalue.value.airlink.RelayTopologyType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class RelayFuncStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayTopologyType relayType;
    Boolean isAllowRelayPairAsTGround;
    Boolean isAllowRelayPairAsLGround;
    Boolean isAllowRelayFuncSwitch;
    Boolean isRelayFuncOpen;
    RelayDeviceType selectedUVA;
    Boolean isMainPathEnabled;
    RelayMainPathType pathType;

    public RelayFuncStatusMsg() {
    }

    public RelayFuncStatusMsg(RelayTopologyType relayTopologyType, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, RelayDeviceType relayDeviceType, Boolean bl5, RelayMainPathType relayMainPathType) {
    }

    public static RelayFuncStatusMsg fromJson(String string) {
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

    public RelayTopologyType getRelayType() {
        return null;
    }

    public void setRelayType(RelayTopologyType relayTopologyType) {
    }

    public Boolean getIsAllowRelayPairAsTGround() {
        return null;
    }

    public void setIsAllowRelayPairAsTGround(Boolean bl) {
    }

    public Boolean getIsAllowRelayPairAsLGround() {
        return null;
    }

    public void setIsAllowRelayPairAsLGround(Boolean bl) {
    }

    public Boolean getIsAllowRelayFuncSwitch() {
        return null;
    }

    public void setIsAllowRelayFuncSwitch(Boolean bl) {
    }

    public Boolean getIsRelayFuncOpen() {
        return null;
    }

    public void setIsRelayFuncOpen(Boolean bl) {
    }

    public RelayDeviceType getSelectedUVA() {
        return null;
    }

    public void setSelectedUVA(RelayDeviceType relayDeviceType) {
    }

    public Boolean getIsMainPathEnabled() {
        return null;
    }

    public void setIsMainPathEnabled(Boolean bl) {
    }

    public RelayMainPathType getPathType() {
        return null;
    }

    public void setPathType(RelayMainPathType relayMainPathType) {
    }

    public String toString() {
        return null;
    }
}

