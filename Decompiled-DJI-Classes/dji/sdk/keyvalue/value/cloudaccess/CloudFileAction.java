/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.cloudaccess.CloudFileActionState;
import org.json.JSONObject;

public class CloudFileAction
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CloudFileActionState fileAction;
    String fileName;
    String fileLocalPath;
    String fileCloudPath;

    public CloudFileAction() {
    }

    public CloudFileAction(CloudFileActionState cloudFileActionState, String string, String string2, String string3) {
    }

    public static CloudFileAction fromJson(String string) {
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

    public CloudFileActionState getFileAction() {
        return null;
    }

    public void setFileAction(CloudFileActionState cloudFileActionState) {
    }

    public String getFileName() {
        return null;
    }

    public void setFileName(String string) {
    }

    public String getFileLocalPath() {
        return null;
    }

    public void setFileLocalPath(String string) {
    }

    public String getFileCloudPath() {
        return null;
    }

    public void setFileCloudPath(String string) {
    }

    public String toString() {
        return null;
    }
}

