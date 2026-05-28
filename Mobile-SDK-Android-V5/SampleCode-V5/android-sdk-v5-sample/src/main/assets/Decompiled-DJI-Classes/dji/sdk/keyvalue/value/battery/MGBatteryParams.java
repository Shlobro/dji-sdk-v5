/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.battery.MGBatteryType;
import org.json.JSONObject;

public class MGBatteryParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer paramVersion;
    MGBatteryType type;
    Integer OtMosErrorThres;
    Integer OtMosRecoveryThres;
    Integer OtMosConnectorErrorThres;
    Integer OtMosConnectorRecoveryThres;
    Integer OtMosBatErrorThres;
    Integer OtMosBatRecoveryThres;
    Integer OtdBatTakeoffErrorThres;
    Integer OtdBatTakeoffRecoveryThres;
    Long DiagEnableStateHardware;
    Long DiagEnableStateSeriousFault;
    Long DiagEnableStateProtection;
    Long DiagEnableStateAlert;
    Long DiagEnableStateAlgo;
    Integer OtdBatFlyingErrorThres;

    public MGBatteryParams() {
    }

    public MGBatteryParams(Integer n, MGBatteryType mGBatteryType, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Long l2, Long l3, Long l4, Long l5, Long l6, Integer n10) {
    }

    public static MGBatteryParams fromJson(String string) {
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

    public Integer getParamVersion() {
        return null;
    }

    public void setParamVersion(Integer n) {
    }

    public MGBatteryType getType() {
        return null;
    }

    public void setType(MGBatteryType mGBatteryType) {
    }

    public Integer getOtMosErrorThres() {
        return null;
    }

    public void setOtMosErrorThres(Integer n) {
    }

    public Integer getOtMosRecoveryThres() {
        return null;
    }

    public void setOtMosRecoveryThres(Integer n) {
    }

    public Integer getOtMosConnectorErrorThres() {
        return null;
    }

    public void setOtMosConnectorErrorThres(Integer n) {
    }

    public Integer getOtMosConnectorRecoveryThres() {
        return null;
    }

    public void setOtMosConnectorRecoveryThres(Integer n) {
    }

    public Integer getOtMosBatErrorThres() {
        return null;
    }

    public void setOtMosBatErrorThres(Integer n) {
    }

    public Integer getOtMosBatRecoveryThres() {
        return null;
    }

    public void setOtMosBatRecoveryThres(Integer n) {
    }

    public Integer getOtdBatTakeoffErrorThres() {
        return null;
    }

    public void setOtdBatTakeoffErrorThres(Integer n) {
    }

    public Integer getOtdBatTakeoffRecoveryThres() {
        return null;
    }

    public void setOtdBatTakeoffRecoveryThres(Integer n) {
    }

    public Long getDiagEnableStateHardware() {
        return null;
    }

    public void setDiagEnableStateHardware(Long l2) {
    }

    public Long getDiagEnableStateSeriousFault() {
        return null;
    }

    public void setDiagEnableStateSeriousFault(Long l2) {
    }

    public Long getDiagEnableStateProtection() {
        return null;
    }

    public void setDiagEnableStateProtection(Long l2) {
    }

    public Long getDiagEnableStateAlert() {
        return null;
    }

    public void setDiagEnableStateAlert(Long l2) {
    }

    public Long getDiagEnableStateAlgo() {
        return null;
    }

    public void setDiagEnableStateAlgo(Long l2) {
    }

    public Integer getOtdBatFlyingErrorThres() {
        return null;
    }

    public void setOtdBatFlyingErrorThres(Integer n) {
    }

    public String toString() {
        return null;
    }
}

