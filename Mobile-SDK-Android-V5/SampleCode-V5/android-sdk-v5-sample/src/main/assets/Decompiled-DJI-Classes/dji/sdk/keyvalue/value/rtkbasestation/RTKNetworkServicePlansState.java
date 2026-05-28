/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.rtkbasestation.RTKNetworkServiceAccountState;
import dji.sdk.keyvalue.value.rtkbasestation.RTKNetworkServicePlan;
import java.util.List;
import org.json.JSONObject;

public class RTKNetworkServicePlansState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKNetworkServiceAccountState accountState;
    Integer supportedRenewalTimes;
    List<RTKNetworkServicePlan> plans;

    public RTKNetworkServicePlansState() {
    }

    public RTKNetworkServicePlansState(RTKNetworkServiceAccountState rTKNetworkServiceAccountState, Integer n, List<RTKNetworkServicePlan> list) {
    }

    public static RTKNetworkServicePlansState fromJson(String string) {
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

    public RTKNetworkServiceAccountState getAccountState() {
        return null;
    }

    public void setAccountState(RTKNetworkServiceAccountState rTKNetworkServiceAccountState) {
    }

    public Integer getSupportedRenewalTimes() {
        return null;
    }

    public void setSupportedRenewalTimes(Integer n) {
    }

    public List<RTKNetworkServicePlan> getPlans() {
        return null;
    }

    public void setPlans(List<RTKNetworkServicePlan> list) {
    }

    public String toString() {
        return null;
    }
}

