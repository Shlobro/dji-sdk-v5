/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class KeyLogConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean getEnable;
    Boolean setEnable;
    Boolean listenEnable;
    Boolean actionEnable;
    String filter;

    public KeyLogConfig() {
    }

    public KeyLogConfig(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, String string) {
    }

    public static KeyLogConfig fromJson(String string) {
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

    public Boolean getGetEnable() {
        return null;
    }

    public void setGetEnable(Boolean bl) {
    }

    public Boolean getSetEnable() {
        return null;
    }

    public void setSetEnable(Boolean bl) {
    }

    public Boolean getListenEnable() {
        return null;
    }

    public void setListenEnable(Boolean bl) {
    }

    public Boolean getActionEnable() {
        return null;
    }

    public void setActionEnable(Boolean bl) {
    }

    public String getFilter() {
        return null;
    }

    public void setFilter(String string) {
    }

    public String toString() {
        return null;
    }
}

