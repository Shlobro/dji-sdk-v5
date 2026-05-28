/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.dcl;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DCLSupportInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean support;

    public DCLSupportInfo() {
    }

    public DCLSupportInfo(Boolean bl) {
    }

    public static DCLSupportInfo fromJson(String string) {
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

    public Boolean getSupport() {
        return null;
    }

    public void setSupport(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

