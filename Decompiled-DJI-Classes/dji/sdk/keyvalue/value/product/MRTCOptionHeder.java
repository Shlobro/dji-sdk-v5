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
import dji.sdk.keyvalue.value.product.MRTCVersion;
import org.json.JSONObject;

public class MRTCOptionHeder
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    MRTCVersion mrtcVersion;
    Integer streamId;

    public MRTCOptionHeder() {
    }

    public MRTCOptionHeder(MRTCVersion mRTCVersion, Integer n) {
    }

    public static MRTCOptionHeder fromJson(String string) {
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

    public MRTCVersion getMrtcVersion() {
        return null;
    }

    public void setMrtcVersion(MRTCVersion mRTCVersion) {
    }

    public Integer getStreamId() {
        return null;
    }

    public void setStreamId(Integer n) {
    }

    public String toString() {
        return null;
    }
}

