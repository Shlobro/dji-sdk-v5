/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.EsimActivateState;
import dji.sdk.keyvalue.value.airlink.WlmNewDongleEsimProfile;
import dji.sdk.keyvalue.value.airlink.WlmNewDongleSimSlot;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class WlmNewDongleState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String sn;
    String eid;
    WlmNewDongleSimSlot simSlot;
    EsimActivateState esimActivateState;
    List<WlmNewDongleEsimProfile> esimProfiles;

    public WlmNewDongleState() {
    }

    public WlmNewDongleState(String string, String string2, WlmNewDongleSimSlot wlmNewDongleSimSlot, EsimActivateState esimActivateState, List<WlmNewDongleEsimProfile> list) {
    }

    public static WlmNewDongleState fromJson(String string) {
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

    public String getSn() {
        return null;
    }

    public void setSn(String string) {
    }

    public String getEid() {
        return null;
    }

    public void setEid(String string) {
    }

    public WlmNewDongleSimSlot getSimSlot() {
        return null;
    }

    public void setSimSlot(WlmNewDongleSimSlot wlmNewDongleSimSlot) {
    }

    public EsimActivateState getEsimActivateState() {
        return null;
    }

    public void setEsimActivateState(EsimActivateState esimActivateState) {
    }

    public List<WlmNewDongleEsimProfile> getEsimProfiles() {
        return null;
    }

    public void setEsimProfiles(List<WlmNewDongleEsimProfile> list) {
    }

    public String toString() {
        return null;
    }
}

