/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class SpeakerWidget
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean enableTts;
    Boolean enableVoice;

    public SpeakerWidget() {
    }

    public SpeakerWidget(Boolean bl, Boolean bl2) {
    }

    public static SpeakerWidget fromJson(String string) {
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

    public Boolean getEnableTts() {
        return null;
    }

    public void setEnableTts(Boolean bl) {
    }

    public Boolean getEnableVoice() {
        return null;
    }

    public void setEnableVoice(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

