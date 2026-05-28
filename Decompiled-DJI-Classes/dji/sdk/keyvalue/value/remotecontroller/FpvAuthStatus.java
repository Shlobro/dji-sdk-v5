/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.MultiControlChannel;
import org.json.JSONObject;

public class FpvAuthStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean fpvStatus;
    MultiControlChannel fpvOwner;

    public FpvAuthStatus() {
    }

    public FpvAuthStatus(Boolean bl, MultiControlChannel multiControlChannel) {
    }

    public static FpvAuthStatus fromJson(String string) {
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

    public Boolean getFpvStatus() {
        return null;
    }

    public void setFpvStatus(Boolean bl) {
    }

    public MultiControlChannel getFpvOwner() {
        return null;
    }

    public void setFpvOwner(MultiControlChannel multiControlChannel) {
    }

    public String toString() {
        return null;
    }
}

