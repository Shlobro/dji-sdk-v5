/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.ExportLogErrorReason;
import dji.sdk.keyvalue.value.camera.ExportLogState;
import org.json.JSONObject;

public class ExportLogStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer progress;
    ExportLogState exportState;
    ExportLogErrorReason errorReason;

    public ExportLogStatusMsg() {
    }

    public ExportLogStatusMsg(Integer n, ExportLogState exportLogState, ExportLogErrorReason exportLogErrorReason) {
    }

    public static ExportLogStatusMsg fromJson(String string) {
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

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public ExportLogState getExportState() {
        return null;
    }

    public void setExportState(ExportLogState exportLogState) {
    }

    public ExportLogErrorReason getErrorReason() {
        return null;
    }

    public void setErrorReason(ExportLogErrorReason exportLogErrorReason) {
    }

    public String toString() {
        return null;
    }
}

