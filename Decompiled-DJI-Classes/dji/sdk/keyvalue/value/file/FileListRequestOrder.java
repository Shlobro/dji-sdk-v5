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
import dji.sdk.keyvalue.value.file.FileListRequestOrderType;
import dji.sdk.keyvalue.value.file.FileListRequestSizeOrderType;
import dji.sdk.keyvalue.value.file.FileListRequestTimeOrderType;
import org.json.JSONObject;

public class FileListRequestOrder
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    FileListRequestOrderType type;
    FileListRequestTimeOrderType timeOrderType;
    FileListRequestSizeOrderType sizeOrderType;

    public FileListRequestOrder() {
    }

    public FileListRequestOrder(FileListRequestOrderType fileListRequestOrderType, FileListRequestTimeOrderType fileListRequestTimeOrderType, FileListRequestSizeOrderType fileListRequestSizeOrderType) {
    }

    public static FileListRequestOrder fromJson(String string) {
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

    public FileListRequestOrderType getType() {
        return null;
    }

    public void setType(FileListRequestOrderType fileListRequestOrderType) {
    }

    public FileListRequestTimeOrderType getTimeOrderType() {
        return null;
    }

    public void setTimeOrderType(FileListRequestTimeOrderType fileListRequestTimeOrderType) {
    }

    public FileListRequestSizeOrderType getSizeOrderType() {
        return null;
    }

    public void setSizeOrderType(FileListRequestSizeOrderType fileListRequestSizeOrderType) {
    }

    public String toString() {
        return null;
    }
}

