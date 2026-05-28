/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DatalinkMonitorRegistResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String hostName;
    String messageName;
    Integer csdkRetCode;
    Integer retCode;
    Integer index;

    public DatalinkMonitorRegistResult() {
    }

    public DatalinkMonitorRegistResult(String string, String string2, Integer n, Integer n2, Integer n3) {
    }

    public static DatalinkMonitorRegistResult fromJson(String string) {
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

    public String getHostName() {
        return null;
    }

    public void setHostName(String string) {
    }

    public String getMessageName() {
        return null;
    }

    public void setMessageName(String string) {
    }

    public Integer getCsdkRetCode() {
        return null;
    }

    public void setCsdkRetCode(Integer n) {
    }

    public Integer getRetCode() {
        return null;
    }

    public void setRetCode(Integer n) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

