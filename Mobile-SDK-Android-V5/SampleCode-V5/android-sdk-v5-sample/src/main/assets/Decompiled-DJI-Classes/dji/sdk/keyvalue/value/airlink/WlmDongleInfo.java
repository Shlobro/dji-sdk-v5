/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmDongleWorkState;
import dji.sdk.keyvalue.value.airlink.WlmLinkQualityLevel;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmDongleInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer protocolVersion;
    String sn;
    Boolean isDjiDevice;
    Boolean isNeedUpgrade;
    Boolean isSimCardInserted;
    Boolean isNeedForceUpgrade;
    WlmDongleWorkState workState;
    String version;
    Long txDataBytes;
    Long rxDataBytes;
    WlmLinkQualityLevel deviceNetworkQuality;
    WlmLinkQualityLevel deviceServerQuality;
    Integer dongleType;
    Integer slotIndex;

    public WlmDongleInfo() {
    }

    public WlmDongleInfo(Integer n, String string, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, WlmDongleWorkState wlmDongleWorkState, String string2, Long l2, Long l3, WlmLinkQualityLevel wlmLinkQualityLevel, WlmLinkQualityLevel wlmLinkQualityLevel2, Integer n2, Integer n3) {
    }

    public static WlmDongleInfo fromJson(String string) {
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

    public Integer getProtocolVersion() {
        return null;
    }

    public void setProtocolVersion(Integer n) {
    }

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public Boolean getIsDjiDevice() {
        return null;
    }

    public void setIsDjiDevice(Boolean bl) {
    }

    public Boolean getIsNeedUpgrade() {
        return null;
    }

    public void setIsNeedUpgrade(Boolean bl) {
    }

    public Boolean getIsSimCardInserted() {
        return null;
    }

    public void setIsSimCardInserted(Boolean bl) {
    }

    public Boolean getIsNeedForceUpgrade() {
        return null;
    }

    public void setIsNeedForceUpgrade(Boolean bl) {
    }

    public WlmDongleWorkState getWorkState() {
        return null;
    }

    public void setWorkState(WlmDongleWorkState wlmDongleWorkState) {
    }

    public String getVersion() {
        return null;
    }

    public void setVersion(String string) {
    }

    public Long getTxDataBytes() {
        return null;
    }

    public void setTxDataBytes(Long l2) {
    }

    public Long getRxDataBytes() {
        return null;
    }

    public void setRxDataBytes(Long l2) {
    }

    public WlmLinkQualityLevel getDeviceNetworkQuality() {
        return null;
    }

    public void setDeviceNetworkQuality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public WlmLinkQualityLevel getDeviceServerQuality() {
        return null;
    }

    public void setDeviceServerQuality(WlmLinkQualityLevel wlmLinkQualityLevel) {
    }

    public Integer getDongleType() {
        return null;
    }

    public void setDongleType(Integer n) {
    }

    public Integer getSlotIndex() {
        return null;
    }

    public void setSlotIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

