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
import dji.sdk.keyvalue.value.media.FileTypePair;
import dji.sdk.keyvalue.value.media.PathType;
import org.json.JSONObject;

public class PhysicalPathInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PathType pathType;
    String physicalPath;
    FileTypePair fileTypePair;

    public PhysicalPathInfo() {
    }

    public PhysicalPathInfo(PathType pathType, String string, FileTypePair fileTypePair) {
    }

    public static PhysicalPathInfo fromJson(String string) {
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

    public PathType getPathType() {
        return null;
    }

    public void setPathType(PathType pathType) {
    }

    public String getPhysicalPath() {
        return null;
    }

    public void setPhysicalPath(String string) {
    }

    public FileTypePair getFileTypePair() {
        return null;
    }

    public void setFileTypePair(FileTypePair fileTypePair) {
    }

    public String toString() {
        return null;
    }
}

