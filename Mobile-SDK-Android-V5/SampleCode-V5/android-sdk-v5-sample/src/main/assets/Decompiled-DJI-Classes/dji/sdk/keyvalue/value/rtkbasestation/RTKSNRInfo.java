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
import java.util.List;
import org.json.JSONObject;

public class RTKSNRInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer timestamp;
    List<Integer> l1;
    List<Integer> l2;
    List<Integer> l5b3;

    public RTKSNRInfo() {
    }

    public RTKSNRInfo(Integer n, List<Integer> list, List<Integer> list2, List<Integer> list3) {
    }

    public static RTKSNRInfo fromJson(String string) {
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

    public Integer getTimestamp() {
        return null;
    }

    public void setTimestamp(Integer n) {
    }

    public List<Integer> getL1() {
        return null;
    }

    public void setL1(List<Integer> list) {
    }

    public List<Integer> getL2() {
        return null;
    }

    public void setL2(List<Integer> list) {
    }

    public List<Integer> getL5b3() {
        return null;
    }

    public void setL5b3(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

