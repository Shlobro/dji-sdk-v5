/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DongleReleaseNoteMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String version;
    String releaseNote;

    public DongleReleaseNoteMsg() {
    }

    public DongleReleaseNoteMsg(String string, String string2) {
    }

    public static DongleReleaseNoteMsg fromJson(String string) {
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

    public String getVersion() {
        return null;
    }

    public void setVersion(String string) {
    }

    public String getReleaseNote() {
        return null;
    }

    public void setReleaseNote(String string) {
    }

    public String toString() {
        return null;
    }
}

