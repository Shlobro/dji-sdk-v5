/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LogExportFileSelectModule
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer moduleIndex;
    Integer tagIndex;

    public LogExportFileSelectModule() {
    }

    public LogExportFileSelectModule(Integer n, Integer n2) {
    }

    public static LogExportFileSelectModule fromJson(String string) {
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

    public Integer getModuleIndex() {
        return null;
    }

    public void setModuleIndex(Integer n) {
    }

    public Integer getTagIndex() {
        return null;
    }

    public void setTagIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

