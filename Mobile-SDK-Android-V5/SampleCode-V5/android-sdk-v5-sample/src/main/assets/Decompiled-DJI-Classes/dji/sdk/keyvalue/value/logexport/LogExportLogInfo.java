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

public class LogExportLogInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer moduleId;
    Integer flyId;
    Integer logTag;
    Integer listId;
    Integer size;

    public LogExportLogInfo() {
    }

    public LogExportLogInfo(Integer n, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static LogExportLogInfo fromJson(String string) {
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

    public Integer getModuleId() {
        return null;
    }

    public void setModuleId(Integer n) {
    }

    public Integer getFlyId() {
        return null;
    }

    public void setFlyId(Integer n) {
    }

    public Integer getLogTag() {
        return null;
    }

    public void setLogTag(Integer n) {
    }

    public Integer getListId() {
        return null;
    }

    public void setListId(Integer n) {
    }

    public Integer getSize() {
        return null;
    }

    public void setSize(Integer n) {
    }

    public String toString() {
        return null;
    }
}

