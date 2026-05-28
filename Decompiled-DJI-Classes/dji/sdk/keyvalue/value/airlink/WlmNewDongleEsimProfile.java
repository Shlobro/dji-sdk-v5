/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.WlmNewDongleOperator;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmNewDongleEsimProfile
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String iccid;
    WlmNewDongleOperator telecomOperator;
    Boolean enable;

    public WlmNewDongleEsimProfile() {
    }

    public WlmNewDongleEsimProfile(String string, WlmNewDongleOperator wlmNewDongleOperator, Boolean bl) {
    }

    public static WlmNewDongleEsimProfile fromJson(String string) {
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

    public String getIccid() {
        return null;
    }

    public void setIccid(String string) {
    }

    public WlmNewDongleOperator getTelecomOperator() {
        return null;
    }

    public void setTelecomOperator(WlmNewDongleOperator wlmNewDongleOperator) {
    }

    public Boolean getEnable() {
        return null;
    }

    public void setEnable(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

