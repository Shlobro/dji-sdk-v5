/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.AIboxFileExportErrorReason;
import dji.sdk.keyvalue.value.aibox.AIboxFileExportState;
import dji.sdk.keyvalue.value.aibox.ExcuteAIboxFileExportType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class AIboxFileExportStatusMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ExcuteAIboxFileExportType type;
    String id;
    Integer progress;
    AIboxFileExportState exportState;
    AIboxFileExportErrorReason errorReason;

    public AIboxFileExportStatusMsg() {
    }

    public AIboxFileExportStatusMsg(ExcuteAIboxFileExportType excuteAIboxFileExportType, String string, Integer n, AIboxFileExportState aIboxFileExportState, AIboxFileExportErrorReason aIboxFileExportErrorReason) {
    }

    public static AIboxFileExportStatusMsg fromJson(String string) {
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

    public ExcuteAIboxFileExportType getType() {
        return null;
    }

    public void setType(ExcuteAIboxFileExportType excuteAIboxFileExportType) {
    }

    public String getId() {
        return null;
    }

    public void setId(String string) {
    }

    public Integer getProgress() {
        return null;
    }

    public void setProgress(Integer n) {
    }

    public AIboxFileExportState getExportState() {
        return null;
    }

    public void setExportState(AIboxFileExportState aIboxFileExportState) {
    }

    public AIboxFileExportErrorReason getErrorReason() {
        return null;
    }

    public void setErrorReason(AIboxFileExportErrorReason aIboxFileExportErrorReason) {
    }

    public String toString() {
        return null;
    }
}

