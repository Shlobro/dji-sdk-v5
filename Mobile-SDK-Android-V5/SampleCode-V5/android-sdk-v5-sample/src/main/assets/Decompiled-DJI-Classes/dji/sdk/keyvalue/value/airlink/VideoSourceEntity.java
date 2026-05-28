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
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.SourceMajorType;
import org.json.JSONObject;

public class VideoSourceEntity
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer sourceId;
    SourceMajorType majorType;
    Integer minorType;
    ComponentIndexType position;
    Integer componentId;

    public VideoSourceEntity() {
    }

    public VideoSourceEntity(Integer n, SourceMajorType sourceMajorType, Integer n2, ComponentIndexType componentIndexType, Integer n3) {
    }

    public static VideoSourceEntity fromJson(String string) {
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

    public Integer getSourceId() {
        return null;
    }

    public void setSourceId(Integer n) {
    }

    public SourceMajorType getMajorType() {
        return null;
    }

    public void setMajorType(SourceMajorType sourceMajorType) {
    }

    public Integer getMinorType() {
        return null;
    }

    public void setMinorType(Integer n) {
    }

    public ComponentIndexType getPosition() {
        return null;
    }

    public void setPosition(ComponentIndexType componentIndexType) {
    }

    public Integer getComponentId() {
        return null;
    }

    public void setComponentId(Integer n) {
    }

    public String toString() {
        return null;
    }
}

