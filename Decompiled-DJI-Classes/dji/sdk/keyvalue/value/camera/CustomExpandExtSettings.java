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
import dji.sdk.keyvalue.value.common.EnCodingType;
import org.json.JSONObject;

public class CustomExpandExtSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long index;
    EnCodingType encodingType;
    String customContent;

    public CustomExpandExtSettings() {
    }

    public CustomExpandExtSettings(Long l2, EnCodingType enCodingType, String string) {
    }

    public static CustomExpandExtSettings fromJson(String string) {
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

    public Long getIndex() {
        return null;
    }

    public void setIndex(Long l2) {
    }

    public EnCodingType getEncodingType() {
        return null;
    }

    public void setEncodingType(EnCodingType enCodingType) {
    }

    public String getCustomContent() {
        return null;
    }

    public void setCustomContent(String string) {
    }

    public String toString() {
        return null;
    }
}

