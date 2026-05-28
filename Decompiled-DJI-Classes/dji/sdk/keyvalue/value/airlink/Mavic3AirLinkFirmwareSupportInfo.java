/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class Mavic3AirLinkFirmwareSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean lteFusionSupported;
    Boolean quickWiFiSupported;

    public Mavic3AirLinkFirmwareSupportInfo() {
    }

    public Mavic3AirLinkFirmwareSupportInfo(Boolean bl, Boolean bl2) {
    }

    public static Mavic3AirLinkFirmwareSupportInfo fromJson(String string) {
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

    public Boolean getLteFusionSupported() {
        return null;
    }

    public void setLteFusionSupported(Boolean bl) {
    }

    public Boolean getQuickWiFiSupported() {
        return null;
    }

    public void setQuickWiFiSupported(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

