/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CustomizeRcButtonConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean isEnable;
    Integer mappingConfigDisplayOrder;
    Integer buttonValueStepLength;

    public CustomizeRcButtonConfig() {
    }

    public CustomizeRcButtonConfig(Boolean bl, Integer n, Integer n2) {
    }

    public static CustomizeRcButtonConfig fromJson(String string) {
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

    public Boolean getIsEnable() {
        return null;
    }

    public void setIsEnable(Boolean bl) {
    }

    public Integer getMappingConfigDisplayOrder() {
        return null;
    }

    public void setMappingConfigDisplayOrder(Integer n) {
    }

    public Integer getButtonValueStepLength() {
        return null;
    }

    public void setButtonValueStepLength(Integer n) {
    }

    public String toString() {
        return null;
    }
}

