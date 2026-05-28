/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.glass.CommonFileType;
import org.json.JSONObject;

public class CommonFileSyncInputMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String save_path;
    CommonFileType file_type;

    public CommonFileSyncInputMsg() {
    }

    public CommonFileSyncInputMsg(String string, CommonFileType commonFileType) {
    }

    public static CommonFileSyncInputMsg fromJson(String string) {
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

    public String getSave_path() {
        return null;
    }

    public void setSave_path(String string) {
    }

    public CommonFileType getFile_type() {
        return null;
    }

    public void setFile_type(CommonFileType commonFileType) {
    }

    public String toString() {
        return null;
    }
}

