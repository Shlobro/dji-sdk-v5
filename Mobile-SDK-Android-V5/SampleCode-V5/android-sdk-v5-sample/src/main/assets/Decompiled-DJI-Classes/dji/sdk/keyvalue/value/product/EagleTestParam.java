/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.DJIChip;
import org.json.JSONObject;

public class EagleTestParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String cmd;
    Integer cmdLength;
    Integer cmdId;
    Integer timeout;
    Integer paramLen;
    String param;
    DJIChip chip;

    public EagleTestParam() {
    }

    public EagleTestParam(String string, Integer n, Integer n2, Integer n3, Integer n4, String string2, DJIChip dJIChip) {
    }

    public static EagleTestParam fromJson(String string) {
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

    public String getCmd() {
        return null;
    }

    public void setCmd(String string) {
    }

    public Integer getCmdLength() {
        return null;
    }

    public void setCmdLength(Integer n) {
    }

    public Integer getCmdId() {
        return null;
    }

    public void setCmdId(Integer n) {
    }

    public Integer getTimeout() {
        return null;
    }

    public void setTimeout(Integer n) {
    }

    public Integer getParamLen() {
        return null;
    }

    public void setParamLen(Integer n) {
    }

    public String getParam() {
        return null;
    }

    public void setParam(String string) {
    }

    public DJIChip getChip() {
        return null;
    }

    public void setChip(DJIChip dJIChip) {
    }

    public String toString() {
        return null;
    }
}

