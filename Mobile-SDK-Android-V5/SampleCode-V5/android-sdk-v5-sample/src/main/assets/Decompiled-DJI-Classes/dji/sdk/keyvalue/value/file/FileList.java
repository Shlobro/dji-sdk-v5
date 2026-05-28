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
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.file.FilePackage;
import org.json.JSONObject;

public class FileList
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileLocation location;
    FilePackage files;
    Boolean hasInvalidFile;

    public FileList() {
    }

    public FileList(FileLocation fileLocation, FilePackage filePackage, Boolean bl) {
    }

    public static FileList fromJson(String string) {
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

    public FilePackage getFiles() {
        return null;
    }

    public void setFiles(FilePackage filePackage) {
    }

    public Boolean getHasInvalidFile() {
        return null;
    }

    public void setHasInvalidFile(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

