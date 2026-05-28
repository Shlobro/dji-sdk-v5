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
import dji.sdk.keyvalue.value.media.MediaFile;
import java.util.List;
import org.json.JSONObject;

public class MediaBatchFileRequestResult
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<MediaFile> succeededFiles;
    List<MediaFile> failedFiles;
    Boolean allSucceeded;

    public MediaBatchFileRequestResult() {
    }

    public MediaBatchFileRequestResult(List<MediaFile> list, List<MediaFile> list2, Boolean bl) {
    }

    public static MediaBatchFileRequestResult fromJson(String string) {
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

    public List<MediaFile> getSucceededFiles() {
        return null;
    }

    public void setSucceededFiles(List<MediaFile> list) {
    }

    public List<MediaFile> getFailedFiles() {
        return null;
    }

    public void setFailedFiles(List<MediaFile> list) {
    }

    public Boolean getAllSucceeded() {
        return null;
    }

    public void setAllSucceeded(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

