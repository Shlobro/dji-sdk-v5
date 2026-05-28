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
import dji.sdk.keyvalue.value.camera.TimeCodeExternalSourceState;
import dji.sdk.keyvalue.value.camera.TimeCodeModeMsg;
import dji.sdk.keyvalue.value.camera.TimeCodeValueMsg;
import org.json.JSONObject;

public class TimeCodeInfoMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    TimeCodeModeMsg mode;
    TimeCodeValueMsg value;
    TimeCodeExternalSourceState externalState;

    public TimeCodeInfoMsg() {
    }

    public TimeCodeInfoMsg(TimeCodeModeMsg timeCodeModeMsg, TimeCodeValueMsg timeCodeValueMsg, TimeCodeExternalSourceState timeCodeExternalSourceState) {
    }

    public static TimeCodeInfoMsg fromJson(String string) {
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

    public TimeCodeModeMsg getMode() {
        return null;
    }

    public void setMode(TimeCodeModeMsg timeCodeModeMsg) {
    }

    public TimeCodeValueMsg getValue() {
        return null;
    }

    public void setValue(TimeCodeValueMsg timeCodeValueMsg) {
    }

    public TimeCodeExternalSourceState getExternalState() {
        return null;
    }

    public void setExternalState(TimeCodeExternalSourceState timeCodeExternalSourceState) {
    }

    public String toString() {
        return null;
    }
}

