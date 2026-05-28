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
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.media.MediaFile;
import java.util.List;
import org.json.JSONObject;

public class MediaDeletionRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileLocation location;
    List<MediaFile> files;
    Boolean isDeleteAll;

    public MediaDeletionRequest() {
    }

    public MediaDeletionRequest(FileLocation fileLocation, List<MediaFile> list, Boolean bl) {
    }

    public static MediaDeletionRequest fromJson(String string) {
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

    public FileLocation getLocation() {
        return null;
    }

    public void setLocation(FileLocation fileLocation) {
    }

    public List<MediaFile> getFiles() {
        return null;
    }

    public void setFiles(List<MediaFile> list) {
    }

    public Boolean getIsDeleteAll() {
        return null;
    }

    public void setIsDeleteAll(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

