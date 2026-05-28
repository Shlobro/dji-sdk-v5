/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class DeviceEnumeration
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String domain;
    String type;
    String sub_type;

    public DeviceEnumeration() {
    }

    public DeviceEnumeration(String string, String string2, String string3) {
    }

    public static DeviceEnumeration fromJson(String string) {
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

    public String getDomain() {
        return null;
    }

    public void setDomain(String string) {
    }

    public String getType() {
        return null;
    }

    public void setType(String string) {
    }

    public String getSub_type() {
        return null;
    }

    public void setSub_type(String string) {
    }

    public String toString() {
        return null;
    }
}

