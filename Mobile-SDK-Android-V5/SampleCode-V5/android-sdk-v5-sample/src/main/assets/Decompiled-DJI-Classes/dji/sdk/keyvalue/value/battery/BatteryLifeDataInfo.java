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
import java.util.List;
import org.json.JSONObject;

public class BatteryLifeDataInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long timeRequest;
    Long index;
    Long validFlag;
    Long validTimeStamp;
    Long tl_vl;
    Long tl_vm;
    Long tl_vh;
    Long tlm_vl;
    Long tlm_vm;
    Long tlm_vh;
    Long tm_vl;
    Long tm_vm;
    Long tm_vh;
    Long tmh_vl;
    Long tmh_vm;
    Long tmh_vh;
    Long th_vl;
    Long th_vm;
    Long th_vh;
    Long th_dsg;
    Long t_idle;
    Long timeStamp;
    Integer vMin;
    Integer vMax;
    List<Integer> vl;
    List<Integer> vh;
    List<Integer> chargeTimes;
    Integer chargeTemperatureMax;
    Integer dsgTimes;
    Integer dsgMaxTemperature;
    Integer tMin;
    Integer tMax;

    public BatteryLifeDataInfo() {
    }

    public BatteryLifeDataInfo(Long l2, Long l3, Long l4, Long l5, Long l6, Long l7, Long l8, Long l9, Long l10, Long l11, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Long l19, Long l20, Long l21, Long l22, Long l23, Integer n, Integer n2, List<Integer> list, List<Integer> list2, List<Integer> list3, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7) {
    }

    public static BatteryLifeDataInfo fromJson(String string) {
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

    public Long getTimeRequest() {
        return null;
    }

    public void setTimeRequest(Long l2) {
    }

    public Long getIndex() {
        return null;
    }

    public void setIndex(Long l2) {
    }

    public Long getValidFlag() {
        return null;
    }

    public void setValidFlag(Long l2) {
    }

    public Long getValidTimeStamp() {
        return null;
    }

    public void setValidTimeStamp(Long l2) {
    }

    public Long getTl_vl() {
        return null;
    }

    public void setTl_vl(Long l2) {
    }

    public Long getTl_vm() {
        return null;
    }

    public void setTl_vm(Long l2) {
    }

    public Long getTl_vh() {
        return null;
    }

    public void setTl_vh(Long l2) {
    }

    public Long getTlm_vl() {
        return null;
    }

    public void setTlm_vl(Long l2) {
    }

    public Long getTlm_vm() {
        return null;
    }

    public void setTlm_vm(Long l2) {
    }

    public Long getTlm_vh() {
        return null;
    }

    public void setTlm_vh(Long l2) {
    }

    public Long getTm_vl() {
        return null;
    }

    public void setTm_vl(Long l2) {
    }

    public Long getTm_vm() {
        return null;
    }

    public void setTm_vm(Long l2) {
    }

    public Long getTm_vh() {
        return null;
    }

    public void setTm_vh(Long l2) {
    }

    public Long getTmh_vl() {
        return null;
    }

    public void setTmh_vl(Long l2) {
    }

    public Long getTmh_vm() {
        return null;
    }

    public void setTmh_vm(Long l2) {
    }

    public Long getTmh_vh() {
        return null;
    }

    public void setTmh_vh(Long l2) {
    }

    public Long getTh_vl() {
        return null;
    }

    public void setTh_vl(Long l2) {
    }

    public Long getTh_vm() {
        return null;
    }

    public void setTh_vm(Long l2) {
    }

    public Long getTh_vh() {
        return null;
    }

    public void setTh_vh(Long l2) {
    }

    public Long getTh_dsg() {
        return null;
    }

    public void setTh_dsg(Long l2) {
    }

    public Long getT_idle() {
        return null;
    }

    public void setT_idle(Long l2) {
    }

    public Long getTimeStamp() {
        return null;
    }

    public void setTimeStamp(Long l2) {
    }

    public Integer getVMin() {
        return null;
    }

    public void setVMin(Integer n) {
    }

    public Integer getVMax() {
        return null;
    }

    public void setVMax(Integer n) {
    }

    public List<Integer> getVl() {
        return null;
    }

    public void setVl(List<Integer> list) {
    }

    public List<Integer> getVh() {
        return null;
    }

    public void setVh(List<Integer> list) {
    }

    public List<Integer> getChargeTimes() {
        return null;
    }

    public void setChargeTimes(List<Integer> list) {
    }

    public Integer getChargeTemperatureMax() {
        return null;
    }

    public void setChargeTemperatureMax(Integer n) {
    }

    public Integer getDsgTimes() {
        return null;
    }

    public void setDsgTimes(Integer n) {
    }

    public Integer getDsgMaxTemperature() {
        return null;
    }

    public void setDsgMaxTemperature(Integer n) {
    }

    public Integer getTMin() {
        return null;
    }

    public void setTMin(Integer n) {
    }

    public Integer getTMax() {
        return null;
    }

    public void setTMax(Integer n) {
    }

    public String toString() {
        return null;
    }
}

