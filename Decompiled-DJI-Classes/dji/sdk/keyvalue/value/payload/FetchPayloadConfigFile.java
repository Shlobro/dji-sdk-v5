/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.payload.PayloadConfigFile;
import org.json.JSONObject;

public class FetchPayloadConfigFile
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String ouputDir;
    String ouputFileName;
    PayloadConfigFile fileType;

    public FetchPayloadConfigFile() {
    }

    public FetchPayloadConfigFile(String string, String string2, PayloadConfigFile payloadConfigFile) {
    }

    public static FetchPayloadConfigFile fromJson(String string) {
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

    public String getOuputDir() {
        return null;
    }

    public void setOuputDir(String string) {
    }

    public String getOuputFileName() {
        return null;
    }

    public void setOuputFileName(String string) {
    }

    public PayloadConfigFile getFileType() {
        return null;
    }

    public void setFileType(PayloadConfigFile payloadConfigFile) {
    }

    public String toString() {
        return null;
    }
}

