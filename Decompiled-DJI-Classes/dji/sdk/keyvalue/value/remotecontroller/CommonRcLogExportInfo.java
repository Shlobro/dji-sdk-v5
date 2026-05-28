/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.CommonRcLogExportState;
import org.json.JSONObject;

public class CommonRcLogExportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    CommonRcLogExportState state;
    Integer exportFileCount;
    Integer totalFileCount;

    public CommonRcLogExportInfo() {
    }

    public CommonRcLogExportInfo(CommonRcLogExportState commonRcLogExportState, Integer n, Integer n2) {
    }

    public static CommonRcLogExportInfo fromJson(String string) {
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

    public CommonRcLogExportState getState() {
        return null;
    }

    public void setState(CommonRcLogExportState commonRcLogExportState) {
    }

    public Integer getExportFileCount() {
        return null;
    }

    public void setExportFileCount(Integer n) {
    }

    public Integer getTotalFileCount() {
        return null;
    }

    public void setTotalFileCount(Integer n) {
    }

    public String toString() {
        return null;
    }
}

