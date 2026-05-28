/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.ESIMOptionType;
import dji.sdk.keyvalue.value.airlink.WlmNewDongleOperator;
import dji.sdk.keyvalue.value.airlink.WlmNewDongleSimSlot;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmESIMInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String IMEI;
    ESIMOptionType optionType;
    WlmNewDongleOperator telecomOperator;
    WlmNewDongleSimSlot sim_slot;

    public WlmESIMInfoMsg() {
    }

    public WlmESIMInfoMsg(String string, ESIMOptionType eSIMOptionType, WlmNewDongleOperator wlmNewDongleOperator, WlmNewDongleSimSlot wlmNewDongleSimSlot) {
    }

    public static WlmESIMInfoMsg fromJson(String string) {
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

    public String getIMEI() {
        return null;
    }

    public void setIMEI(String string) {
    }

    public ESIMOptionType getOptionType() {
        return null;
    }

    public void setOptionType(ESIMOptionType eSIMOptionType) {
    }

    public WlmNewDongleOperator getTelecomOperator() {
        return null;
    }

    public void setTelecomOperator(WlmNewDongleOperator wlmNewDongleOperator) {
    }

    public WlmNewDongleSimSlot getSim_slot() {
        return null;
    }

    public void setSim_slot(WlmNewDongleSimSlot wlmNewDongleSimSlot) {
    }

    public String toString() {
        return null;
    }
}

