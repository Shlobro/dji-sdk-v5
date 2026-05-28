/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.DongleISP;
import dji.sdk.keyvalue.value.airlink.DongleMode;
import dji.sdk.keyvalue.value.airlink.SIMCardType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WlmSIMCardInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String IMEI;
    SIMCardType type;
    DongleMode switchMode;
    DongleISP ISP;
    String ICCID;

    public WlmSIMCardInfo() {
    }

    public WlmSIMCardInfo(String string, SIMCardType sIMCardType, DongleMode dongleMode, DongleISP dongleISP, String string2) {
    }

    public static WlmSIMCardInfo fromJson(String string) {
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

    public SIMCardType getType() {
        return null;
    }

    public void setType(SIMCardType sIMCardType) {
    }

    public DongleMode getSwitchMode() {
        return null;
    }

    public void setSwitchMode(DongleMode dongleMode) {
    }

    public DongleISP getISP() {
        return null;
    }

    public void setISP(DongleISP dongleISP) {
    }

    public String getICCID() {
        return null;
    }

    public void setICCID(String string) {
    }

    public String toString() {
        return null;
    }
}

