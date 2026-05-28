/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class GPSSNRInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Integer> GPSSNR;
    List<Integer> GlonassSNR;
    List<Integer> GalileoSNR;
    List<Integer> BeidouSNR;

    public GPSSNRInfoMsg() {
    }

    public GPSSNRInfoMsg(List<Integer> list, List<Integer> list2, List<Integer> list3, List<Integer> list4) {
    }

    public static GPSSNRInfoMsg fromJson(String string) {
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

    public List<Integer> getGPSSNR() {
        return null;
    }

    public void setGPSSNR(List<Integer> list) {
    }

    public List<Integer> getGlonassSNR() {
        return null;
    }

    public void setGlonassSNR(List<Integer> list) {
    }

    public List<Integer> getGalileoSNR() {
        return null;
    }

    public void setGalileoSNR(List<Integer> list) {
    }

    public List<Integer> getBeidouSNR() {
        return null;
    }

    public void setBeidouSNR(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

