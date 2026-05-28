/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.hms.MGHMSDiagnosticInfo;
import java.util.List;
import org.json.JSONObject;

public class MGHMSDiagnosticMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer senderType;
    Integer senderId;
    Integer senderMid;
    List<MGHMSDiagnosticInfo> diagnosticInfos;

    public MGHMSDiagnosticMsg() {
    }

    public MGHMSDiagnosticMsg(Integer n, Integer n2, Integer n3, List<MGHMSDiagnosticInfo> list) {
    }

    public static MGHMSDiagnosticMsg fromJson(String string) {
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

    public Integer getSenderType() {
        return null;
    }

    public void setSenderType(Integer n) {
    }

    public Integer getSenderId() {
        return null;
    }

    public void setSenderId(Integer n) {
    }

    public Integer getSenderMid() {
        return null;
    }

    public void setSenderMid(Integer n) {
    }

    public List<MGHMSDiagnosticInfo> getDiagnosticInfos() {
        return null;
    }

    public void setDiagnosticInfos(List<MGHMSDiagnosticInfo> list) {
    }

    public String toString() {
        return null;
    }
}

