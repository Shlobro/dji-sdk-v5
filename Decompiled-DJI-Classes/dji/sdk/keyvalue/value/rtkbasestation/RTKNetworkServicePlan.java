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
import dji.sdk.keyvalue.value.rtkbasestation.RTKNetworkServicePlanState;
import dji.sdk.keyvalue.value.rtkbasestation.RTKNetworkServicePlanType;
import org.json.JSONObject;

public class RTKNetworkServicePlan
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RTKNetworkServicePlanType type;
    String activatedDate;
    String expiredDate;
    RTKNetworkServicePlanState state;

    public RTKNetworkServicePlan() {
    }

    public RTKNetworkServicePlan(RTKNetworkServicePlanType rTKNetworkServicePlanType, String string, String string2, RTKNetworkServicePlanState rTKNetworkServicePlanState) {
    }

    public static RTKNetworkServicePlan fromJson(String string) {
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

    public RTKNetworkServicePlanType getType() {
        return null;
    }

    public void setType(RTKNetworkServicePlanType rTKNetworkServicePlanType) {
    }

    public String getActivatedDate() {
        return null;
    }

    public void setActivatedDate(String string) {
    }

    public String getExpiredDate() {
        return null;
    }

    public void setExpiredDate(String string) {
    }

    public RTKNetworkServicePlanState getState() {
        return null;
    }

    public void setState(RTKNetworkServicePlanState rTKNetworkServicePlanState) {
    }

    public String toString() {
        return null;
    }
}

