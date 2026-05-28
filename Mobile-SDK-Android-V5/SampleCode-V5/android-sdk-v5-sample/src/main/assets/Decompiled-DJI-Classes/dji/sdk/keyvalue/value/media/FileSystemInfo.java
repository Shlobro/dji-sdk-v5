/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class FileSystemInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer maxDirNumber;
    Integer lastestDirNumber;
    Integer maxFileNumberInDir;

    public FileSystemInfo() {
    }

    public FileSystemInfo(Integer n, Integer n2, Integer n3) {
    }

    public static FileSystemInfo fromJson(String string) {
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

    public Integer getMaxDirNumber() {
        return null;
    }

    public void setMaxDirNumber(Integer n) {
    }

    public Integer getLastestDirNumber() {
        return null;
    }

    public void setLastestDirNumber(Integer n) {
    }

    public Integer getMaxFileNumberInDir() {
        return null;
    }

    public void setMaxFileNumberInDir(Integer n) {
    }

    public String toString() {
        return null;
    }
}

