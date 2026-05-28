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
import org.json.JSONObject;

public class DownloadWorkingInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean running;

    public DownloadWorkingInfo() {
    }

    public DownloadWorkingInfo(Boolean bl) {
    }

    public static DownloadWorkingInfo fromJson(String string) {
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

    public Boolean getRunning() {
        return null;
    }

    public void setRunning(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

