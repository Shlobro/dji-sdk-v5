/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.diagnostic;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.diagnostic.DiagnosticCode;
import dji.sdk.keyvalue.value.diagnostic.DiagnosticLevel;
import dji.sdk.keyvalue.value.diagnostic.DiagnosticType;
import org.json.JSONObject;

public class Diagnostic
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    DiagnosticCode code;
    DiagnosticType type;
    DiagnosticLevel level;
    Integer componentIndex;

    public Diagnostic() {
    }

    public Diagnostic(DiagnosticCode diagnosticCode, DiagnosticType diagnosticType, DiagnosticLevel diagnosticLevel, Integer n) {
    }

    public static Diagnostic fromJson(String string) {
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

    public DiagnosticCode getCode() {
        return null;
    }

    public void setCode(DiagnosticCode diagnosticCode) {
    }

    public DiagnosticType getType() {
        return null;
    }

    public void setType(DiagnosticType diagnosticType) {
    }

    public DiagnosticLevel getLevel() {
        return null;
    }

    public void setLevel(DiagnosticLevel diagnosticLevel) {
    }

    public Integer getComponentIndex() {
        return null;
    }

    public void setComponentIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

