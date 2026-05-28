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
import dji.sdk.keyvalue.value.remotecontroller.ShardFilename;
import org.json.JSONObject;

public class ShardFileUploadInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ShardFilename filename;
    byte[] data;
    byte[] md5;

    public ShardFileUploadInfo() {
    }

    public ShardFileUploadInfo(ShardFilename shardFilename, byte[] byArray, byte[] byArray2) {
    }

    public static ShardFileUploadInfo fromJson(String string) {
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

    public ShardFilename getFilename() {
        return null;
    }

    public void setFilename(ShardFilename shardFilename) {
    }

    public byte[] getData() {
        return null;
    }

    public void setData(byte[] byArray) {
    }

    public byte[] getMd5() {
        return null;
    }

    public void setMd5(byte[] byArray) {
    }

    public String toString() {
        return null;
    }
}

