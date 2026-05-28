/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.SelfDiagnosticCapability;
import dji.sdk.keyvalue.value.common.SelfDiagnosticMotorAction;
import dji.sdk.keyvalue.value.common.SelfDiagnosticPart;
import org.json.JSONObject;

public class SelfDiagnosticRequestInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer seqNum;
    SelfDiagnosticCapability type;
    SelfDiagnosticPart part;
    Integer index;
    SelfDiagnosticMotorAction motorAction;

    public SelfDiagnosticRequestInfo() {
    }

    public SelfDiagnosticRequestInfo(Integer n, SelfDiagnosticCapability selfDiagnosticCapability, SelfDiagnosticPart selfDiagnosticPart, Integer n2, SelfDiagnosticMotorAction selfDiagnosticMotorAction) {
    }

    public static SelfDiagnosticRequestInfo fromJson(String string) {
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

    public Integer getSeqNum() {
        return null;
    }

    public void setSeqNum(Integer n) {
    }

    public SelfDiagnosticCapability getType() {
        return null;
    }

    public void setType(SelfDiagnosticCapability selfDiagnosticCapability) {
    }

    public SelfDiagnosticPart getPart() {
        return null;
    }

    public void setPart(SelfDiagnosticPart selfDiagnosticPart) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public SelfDiagnosticMotorAction getMotorAction() {
        return null;
    }

    public void setMotorAction(SelfDiagnosticMotorAction selfDiagnosticMotorAction) {
    }

    public String toString() {
        return null;
    }
}

