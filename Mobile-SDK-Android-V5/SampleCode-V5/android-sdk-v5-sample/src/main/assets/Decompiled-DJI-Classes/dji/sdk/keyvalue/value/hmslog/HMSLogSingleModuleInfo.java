/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class HMSLogSingleModuleInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer type;
    String filepath;
    String module;
    String addr;
    Long size;
    Integer boot_index;
    Integer flight_index;
    Integer time;
    String date;
    Integer tag;
    Boolean isSupportPreCom;

    public HMSLogSingleModuleInfo() {
    }

    public HMSLogSingleModuleInfo(Integer n, String string, String string2, String string3, Long l2, Integer n2, Integer n3, Integer n4, String string4, Integer n5, Boolean bl) {
    }

    public static HMSLogSingleModuleInfo fromJson(String string) {
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

    public Integer getType() {
        return null;
    }

    public void setType(Integer n) {
    }

    public String getFilepath() {
        return null;
    }

    public void setFilepath(String string) {
    }

    public String getModule() {
        return null;
    }

    public void setModule(String string) {
    }

    public String getAddr() {
        return null;
    }

    public void setAddr(String string) {
    }

    public Long getSize() {
        return null;
    }

    public void setSize(Long l2) {
    }

    public Integer getBoot_index() {
        return null;
    }

    public void setBoot_index(Integer n) {
    }

    public Integer getFlight_index() {
        return null;
    }

    public void setFlight_index(Integer n) {
    }

    public Integer getTime() {
        return null;
    }

    public void setTime(Integer n) {
    }

    public String getDate() {
        return null;
    }

    public void setDate(String string) {
    }

    public Integer getTag() {
        return null;
    }

    public void setTag(Integer n) {
    }

    public Boolean getIsSupportPreCom() {
        return null;
    }

    public void setIsSupportPreCom(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

