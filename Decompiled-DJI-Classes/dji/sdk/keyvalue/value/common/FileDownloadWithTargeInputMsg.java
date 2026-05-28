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
import org.json.JSONObject;

public class FileDownloadWithTargeInputMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String savePath;
    String targetPath;
    Integer targetType;
    Integer targetIndex;

    public FileDownloadWithTargeInputMsg() {
    }

    public FileDownloadWithTargeInputMsg(String string, String string2, Integer n, Integer n2) {
    }

    public static FileDownloadWithTargeInputMsg fromJson(String string) {
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

    public String getSavePath() {
        return null;
    }

    public void setSavePath(String string) {
    }

    public String getTargetPath() {
        return null;
    }

    public void setTargetPath(String string) {
    }

    public Integer getTargetType() {
        return null;
    }

    public void setTargetType(Integer n) {
    }

    public Integer getTargetIndex() {
        return null;
    }

    public void setTargetIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

