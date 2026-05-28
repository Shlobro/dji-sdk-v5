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
import dji.sdk.keyvalue.value.media.MediaFileStarTag;
import java.util.List;
import org.json.JSONObject;

public class MediaStarTagRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileLocation location;
    MediaFileStarTag starTag;
    List<MediaFile> files;

    public MediaStarTagRequest() {
    }

    public MediaStarTagRequest(FileLocation fileLocation, MediaFileStarTag mediaFileStarTag, List<MediaFile> list) {
    }

    public static MediaStarTagRequest fromJson(String string) {
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

    public MediaFileStarTag getStarTag() {
        return null;
    }

    public void setStarTag(MediaFileStarTag mediaFileStarTag) {
    }

    public List<MediaFile> getFiles() {
        return null;
    }

    public void setFiles(List<MediaFile> list) {
    }

    public String toString() {
        return null;
    }
}

