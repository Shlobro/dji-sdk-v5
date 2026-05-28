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
import dji.sdk.keyvalue.value.common.LDMConfig;
import org.json.JSONObject;

public class SDKInitializeInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LDMConfig ldmConfig;

    public SDKInitializeInfo() {
    }

    public SDKInitializeInfo(LDMConfig lDMConfig) {
    }

    public static SDKInitializeInfo fromJson(String string) {
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

    public LDMConfig getLdmConfig() {
        return null;
    }

    public void setLdmConfig(LDMConfig lDMConfig) {
    }

    public String toString() {
        return null;
    }
}

