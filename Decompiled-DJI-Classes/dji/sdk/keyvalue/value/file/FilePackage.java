/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.file.CommonFile;
import dji.sdk.keyvalue.value.file.FileType;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFolder;
import java.util.List;
import org.json.JSONObject;

public class FilePackage
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileType type;
    List<MediaFile> media;
    List<CommonFile> common;
    List<MediaFolder> folder;

    public FilePackage() {
    }

    public FilePackage(FileType fileType, List<MediaFile> list, List<CommonFile> list2, List<MediaFolder> list3) {
    }

    public static FilePackage fromJson(String string) {
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

    public FileType getType() {
        return null;
    }

    public void setType(FileType fileType) {
    }

    public List<MediaFile> getMedia() {
        return null;
    }

    public void setMedia(List<MediaFile> list) {
    }

    public List<CommonFile> getCommon() {
        return null;
    }

    public void setCommon(List<CommonFile> list) {
    }

    public List<MediaFolder> getFolder() {
        return null;
    }

    public void setFolder(List<MediaFolder> list) {
    }

    public String toString() {
        return null;
    }
}

