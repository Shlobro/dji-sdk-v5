/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.VfenceFileState;
import org.json.JSONObject;

public class VfenceFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    VfenceFileState state;
    String fileName;
    String checkSum;

    public VfenceFileInfo() {
    }

    public VfenceFileInfo(VfenceFileState vfenceFileState, String string, String string2) {
    }

    public static VfenceFileInfo fromJson(String string) {
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

    public VfenceFileState getState() {
        return null;
    }

    public void setState(VfenceFileState vfenceFileState) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String string) {
    }

    public String getCheckSum() {
        return null;
    }

    public void setCheckSum(String string) {
    }

    public String toString() {
        return null;
    }
}

