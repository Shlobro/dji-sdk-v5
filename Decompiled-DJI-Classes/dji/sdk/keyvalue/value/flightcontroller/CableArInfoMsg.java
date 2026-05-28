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
import dji.sdk.keyvalue.value.flightcontroller.CableArInfo;
import java.util.List;
import org.json.JSONObject;

public class CableArInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long timestamp;
    List<CableArInfo> cables;

    public CableArInfoMsg() {
    }

    public CableArInfoMsg(Long l2, List<CableArInfo> list) {
    }

    public static CableArInfoMsg fromJson(String string) {
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

    public Long getTimestamp() {
        return null;
    }

    public void setTimestamp(Long l2) {
    }

    public List<CableArInfo> getCables() {
        return null;
    }

    public void setCables(List<CableArInfo> list) {
    }

    public String toString() {
        return null;
    }
}

