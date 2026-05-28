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
import dji.sdk.keyvalue.value.common.LDMMode;
import dji.sdk.keyvalue.value.common.NetworkRequestSrc;
import java.util.List;
import org.json.JSONObject;

public class LDMConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LDMMode mode;
    List<NetworkRequestSrc> whiteList;

    public LDMConfig() {
    }

    public LDMConfig(LDMMode lDMMode, List<NetworkRequestSrc> list) {
    }

    public static LDMConfig fromJson(String string) {
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

    public LDMMode getMode() {
        return null;
    }

    public void setMode(LDMMode lDMMode) {
    }

    public List<NetworkRequestSrc> getWhiteList() {
        return null;
    }

    public void setWhiteList(List<NetworkRequestSrc> list) {
    }

    public String toString() {
        return null;
    }
}

