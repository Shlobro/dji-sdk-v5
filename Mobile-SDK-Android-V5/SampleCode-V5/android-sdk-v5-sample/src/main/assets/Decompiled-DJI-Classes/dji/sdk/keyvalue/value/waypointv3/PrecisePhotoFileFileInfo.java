/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class PrecisePhotoFileFileInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String filePath;
    String fileMD5;

    public PrecisePhotoFileFileInfo() {
    }

    public PrecisePhotoFileFileInfo(String string, String string2) {
    }

    public static PrecisePhotoFileFileInfo fromJson(String string) {
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

    public String getFilePath() {
        return null;
    }

    public void setFilePath(String string) {
    }

    public String getFileMD5() {
        return null;
    }

    public void setFileMD5(String string) {
    }

    public String toString() {
        return null;
    }
}

