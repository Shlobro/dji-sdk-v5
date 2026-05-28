/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.cloudaccess.BatteriesInfo;
import java.util.List;
import org.json.JSONObject;

public class CloudBatteriesOSDInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer capacity_percent;
    Integer remain_flight_time;
    Integer return_home_power;
    Integer landing_power;
    List<BatteriesInfo> batteries;

    public CloudBatteriesOSDInfo() {
    }

    public CloudBatteriesOSDInfo(Integer n, Integer n2, Integer n3, Integer n4, List<BatteriesInfo> list) {
    }

    public static CloudBatteriesOSDInfo fromJson(String string) {
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

    public Integer getCapacity_percent() {
        return null;
    }

    public void setCapacity_percent(Integer n) {
    }

    public Integer getRemain_flight_time() {
        return null;
    }

    public void setRemain_flight_time(Integer n) {
    }

    public Integer getReturn_home_power() {
        return null;
    }

    public void setReturn_home_power(Integer n) {
    }

    public Integer getLanding_power() {
        return null;
    }

    public void setLanding_power(Integer n) {
    }

    public List<BatteriesInfo> getBatteries() {
        return null;
    }

    public void setBatteries(List<BatteriesInfo> list) {
    }

    public String toString() {
        return null;
    }
}

