/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class CtrlInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean disableReturnCenter;
    Boolean enableGimbalLock;

    public CtrlInfo() {
    }

    public CtrlInfo(Boolean bl, Boolean bl2) {
    }

    public static CtrlInfo fromJson(String string) {
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

    public Boolean getDisableReturnCenter() {
        return null;
    }

    public void setDisableReturnCenter(Boolean bl) {
    }

    public Boolean getEnableGimbalLock() {
        return null;
    }

    public void setEnableGimbalLock(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

