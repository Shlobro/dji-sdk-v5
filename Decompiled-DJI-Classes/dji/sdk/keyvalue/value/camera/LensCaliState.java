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
import dji.sdk.keyvalue.value.camera.LensCaliType;
import org.json.JSONObject;

public class LensCaliState
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean inCali;
    LensCaliType type;
    String currentName;

    public LensCaliState() {
    }

    public LensCaliState(Boolean bl, LensCaliType lensCaliType, String string) {
    }

    public static LensCaliState fromJson(String string) {
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

    public Boolean getInCali() {
        return null;
    }

    public void setInCali(Boolean bl) {
    }

    public LensCaliType getType() {
        return null;
    }

    public void setType(LensCaliType lensCaliType) {
    }

    public String getCurrentName() {
        return null;
    }

    public void setCurrentName(String string) {
    }

    public String toString() {
        return null;
    }
}

