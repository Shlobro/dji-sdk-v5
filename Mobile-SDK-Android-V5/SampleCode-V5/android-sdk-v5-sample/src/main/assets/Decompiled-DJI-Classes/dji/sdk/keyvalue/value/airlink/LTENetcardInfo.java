/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.LTENetState;
import dji.sdk.keyvalue.value.airlink.LTEType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class LTENetcardInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LTEType netcardType;
    String netcardName;
    LTENetState netState;

    public LTENetcardInfo() {
    }

    public LTENetcardInfo(LTEType lTEType, String string, LTENetState lTENetState) {
    }

    public static LTENetcardInfo fromJson(String string) {
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

    public LTEType getNetcardType() {
        return null;
    }

    public void setNetcardType(LTEType lTEType) {
    }

    public String getNetcardName() {
        return null;
    }

    public void setNetcardName(String string) {
    }

    public LTENetState getNetState() {
        return null;
    }

    public void setNetState(LTENetState lTENetState) {
    }

    public String toString() {
        return null;
    }
}

