/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class MultiControlStatusInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean rcAAppOnline;
    Boolean rcAOnline;
    Boolean rcBAppOnline;
    Boolean rcBOnline;

    public MultiControlStatusInfo() {
    }

    public MultiControlStatusInfo(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4) {
    }

    public static MultiControlStatusInfo fromJson(String string) {
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

    public Boolean getRcAAppOnline() {
        return null;
    }

    public void setRcAAppOnline(Boolean bl) {
    }

    public Boolean getRcAOnline() {
        return null;
    }

    public void setRcAOnline(Boolean bl) {
    }

    public Boolean getRcBAppOnline() {
        return null;
    }

    public void setRcBAppOnline(Boolean bl) {
    }

    public Boolean getRcBOnline() {
        return null;
    }

    public void setRcBOnline(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

