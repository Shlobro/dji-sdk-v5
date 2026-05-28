/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.aibox.ExcuteAIboxFileExportAction;
import dji.sdk.keyvalue.value.aibox.ExcuteAIboxFileExportType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ExcuteAIboxFileExportMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ExcuteAIboxFileExportType type;
    ExcuteAIboxFileExportAction action;
    String id;

    public ExcuteAIboxFileExportMsg() {
    }

    public ExcuteAIboxFileExportMsg(ExcuteAIboxFileExportType excuteAIboxFileExportType, ExcuteAIboxFileExportAction excuteAIboxFileExportAction, String string) {
    }

    public static ExcuteAIboxFileExportMsg fromJson(String string) {
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

    public ExcuteAIboxFileExportAction getAction() {
        return null;
    }

    public void setAction(ExcuteAIboxFileExportAction excuteAIboxFileExportAction) {
    }

    public String getId() {
        return null;
    }

    public void setId(String string) {
    }

    public String toString() {
        return null;
    }
}

