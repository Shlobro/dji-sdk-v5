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
import org.json.JSONObject;

public class MRTCVersion
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer versionMajor;
    Integer versionMinor;
    Integer revision;
    Integer step;

    public MRTCVersion() {
    }

    public MRTCVersion(Integer n, Integer n2, Integer n3, Integer n4) {
    }

    public static MRTCVersion fromJson(String string) {
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

    public Integer getVersionMajor() {
        return null;
    }

    public void setVersionMajor(Integer n) {
    }

    public Integer getVersionMinor() {
        return null;
    }

    public void setVersionMinor(Integer n) {
    }

    public Integer getRevision() {
        return null;
    }

    public void setRevision(Integer n) {
    }

    public Integer getStep() {
        return null;
    }

    public void setStep(Integer n) {
    }

    public String toString() {
        return null;
    }
}

