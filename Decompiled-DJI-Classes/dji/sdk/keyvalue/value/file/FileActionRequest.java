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
import dji.sdk.keyvalue.value.file.FileActionType;
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.file.FilePackage;
import dji.sdk.keyvalue.value.media.MediaFileTag;
import org.json.JSONObject;

public class FileActionRequest
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileLocation location;
    FileActionType type;
    FilePackage files;
    MediaFileTag batchTagInfo;

    public FileActionRequest() {
    }

    public FileActionRequest(FileLocation fileLocation, FileActionType fileActionType, FilePackage filePackage, MediaFileTag mediaFileTag) {
    }

    public static FileActionRequest fromJson(String string) {
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

    public FileActionType getType() {
        return null;
    }

    public void setType(FileActionType fileActionType) {
    }

    public FilePackage getFiles() {
        return null;
    }

    public void setFiles(FilePackage filePackage) {
    }

    public MediaFileTag getBatchTagInfo() {
        return null;
    }

    public void setBatchTagInfo(MediaFileTag mediaFileTag) {
    }

    public String toString() {
        return null;
    }
}

