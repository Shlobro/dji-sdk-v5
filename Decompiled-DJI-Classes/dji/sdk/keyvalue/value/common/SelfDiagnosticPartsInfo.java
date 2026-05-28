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
import dji.sdk.keyvalue.value.common.SelfDiagnosticErrorCode;
import dji.sdk.keyvalue.value.common.SelfDiagnosticMotorAction;
import dji.sdk.keyvalue.value.common.SelfDiagnosticPart;
import java.util.List;
import org.json.JSONObject;

public class SelfDiagnosticPartsInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    SelfDiagnosticErrorCode error;
    List<SelfDiagnosticPart> parts;
    List<SelfDiagnosticMotorAction> actions;

    public SelfDiagnosticPartsInfo() {
    }

    public SelfDiagnosticPartsInfo(SelfDiagnosticErrorCode selfDiagnosticErrorCode, List<SelfDiagnosticPart> list, List<SelfDiagnosticMotorAction> list2) {
    }

    public static SelfDiagnosticPartsInfo fromJson(String string) {
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

    public SelfDiagnosticErrorCode getError() {
        return null;
    }

    public void setError(SelfDiagnosticErrorCode selfDiagnosticErrorCode) {
    }

    public List<SelfDiagnosticPart> getParts() {
        return null;
    }

    public void setParts(List<SelfDiagnosticPart> list) {
    }

    public List<SelfDiagnosticMotorAction> getActions() {
        return null;
    }

    public void setActions(List<SelfDiagnosticMotorAction> list) {
    }

    public String toString() {
        return null;
    }
}

