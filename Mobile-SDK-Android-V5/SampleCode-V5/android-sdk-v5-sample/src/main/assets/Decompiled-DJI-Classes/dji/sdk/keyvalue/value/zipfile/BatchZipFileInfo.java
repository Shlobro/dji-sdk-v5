/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.zipfile;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class BatchZipFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<String> srcFilePathVec;
    String dstFilePath;

    public BatchZipFileInfo() {
    }

    public BatchZipFileInfo(List<String> list, String string) {
    }

    public static BatchZipFileInfo fromJson(String string) {
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

    public List<String> getSrcFilePathVec() {
        return null;
    }

    public void setSrcFilePathVec(List<String> list) {
    }

    public String getDstFilePath() {
        return null;
    }

    public void setDstFilePath(String string) {
    }

    public String toString() {
        return null;
    }
}

