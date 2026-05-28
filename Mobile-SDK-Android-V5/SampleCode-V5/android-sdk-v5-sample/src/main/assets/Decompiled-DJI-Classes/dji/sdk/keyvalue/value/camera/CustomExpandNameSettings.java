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
import dji.sdk.keyvalue.value.common.RelativePosition;
import org.json.JSONObject;

public class CustomExpandNameSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    EnCodingType encodingType;
    RelativePosition relativePosition;
    String customContent;
    Integer priority;
    Boolean forceCreateFolder;

    public CustomExpandNameSettings() {
    }

    public CustomExpandNameSettings(EnCodingType enCodingType, RelativePosition relativePosition, String string, Integer n, Boolean bl) {
    }

    public static CustomExpandNameSettings fromJson(String string) {
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

    public EnCodingType getEncodingType() {
        return null;
    }

    public void setEncodingType(EnCodingType enCodingType) {
    }

    public RelativePosition getRelativePosition() {
        return null;
    }

    public void setRelativePosition(RelativePosition relativePosition) {
    }

    public String getCustomContent() {
        return null;
    }

    public void setCustomContent(String string) {
    }

    public Integer getPriority() {
        return null;
    }

    public void setPriority(Integer n) {
    }

    public Boolean getForceCreateFolder() {
        return null;
    }

    public void setForceCreateFolder(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

