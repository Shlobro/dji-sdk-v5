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
import dji.sdk.keyvalue.value.camera.H1DebugLogMode;
import org.json.JSONObject;

public class H1DebugLogEnabledMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    H1DebugLogMode mode;
    Boolean enableAE;
    Boolean enbaleAWB;
    Boolean enbaleAF;
    Boolean enbaleADJ;
    Boolean enbaleService;

    public H1DebugLogEnabledMsg() {
    }

    public H1DebugLogEnabledMsg(H1DebugLogMode h1DebugLogMode, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
    }

    public static H1DebugLogEnabledMsg fromJson(String string) {
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

    public H1DebugLogMode getMode() {
        return null;
    }

    public void setMode(H1DebugLogMode h1DebugLogMode) {
    }

    public Boolean getEnableAE() {
        return null;
    }

    public void setEnableAE(Boolean bl) {
    }

    public Boolean getEnbaleAWB() {
        return null;
    }

    public void setEnbaleAWB(Boolean bl) {
    }

    public Boolean getEnbaleAF() {
        return null;
    }

    public void setEnbaleAF(Boolean bl) {
    }

    public Boolean getEnbaleADJ() {
        return null;
    }

    public void setEnbaleADJ(Boolean bl) {
    }

    public Boolean getEnbaleService() {
        return null;
    }

    public void setEnbaleService(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

