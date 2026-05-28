/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class WaylineActionAccurateShootPhotoFileInformation
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer file_size;
    String file_path;

    public WaylineActionAccurateShootPhotoFileInformation() {
    }

    public WaylineActionAccurateShootPhotoFileInformation(Integer n, String string) {
    }

    public static WaylineActionAccurateShootPhotoFileInformation fromJson(String string) {
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

    public Integer getFile_size() {
        return null;
    }

    public void setFile_size(Integer n) {
    }

    public String getFile_path() {
        return null;
    }

    public void setFile_path(String string) {
    }

    public String toString() {
        return null;
    }
}

