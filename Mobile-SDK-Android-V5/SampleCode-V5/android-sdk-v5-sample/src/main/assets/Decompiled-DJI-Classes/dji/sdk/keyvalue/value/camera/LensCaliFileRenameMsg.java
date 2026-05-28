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
import org.json.JSONObject;

public class LensCaliFileRenameMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String oldName;
    String nameNew;

    public LensCaliFileRenameMsg() {
    }

    public LensCaliFileRenameMsg(String string, String string2) {
    }

    public static LensCaliFileRenameMsg fromJson(String string) {
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

    public String getOldName() {
        return null;
    }

    public void setOldName(String string) {
    }

    public String getNameNew() {
        return null;
    }

    public void setNameNew(String string) {
    }

    public String toString() {
        return null;
    }
}

