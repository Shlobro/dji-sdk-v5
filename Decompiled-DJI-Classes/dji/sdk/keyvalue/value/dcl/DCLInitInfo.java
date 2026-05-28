/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.dcl;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DCLInitInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String destDirPath;
    String cacheDirPath;

    public DCLInitInfo() {
    }

    public DCLInitInfo(String string, String string2) {
    }

    public static DCLInitInfo fromJson(String string) {
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

    public String getDestDirPath() {
        return null;
    }

    public void setDestDirPath(String string) {
    }

    public String getCacheDirPath() {
        return null;
    }

    public void setCacheDirPath(String string) {
    }

    public String toString() {
        return null;
    }
}

