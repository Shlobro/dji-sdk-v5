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
import dji.sdk.keyvalue.value.payload.ArCoordinate;
import dji.sdk.keyvalue.value.payload.ArNormalVector;
import org.json.JSONObject;

public class ArPivotAxisInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long uuid;
    Boolean show;
    ArCoordinate pivot;
    ArNormalVector normal_vector;

    public ArPivotAxisInfo() {
    }

    public ArPivotAxisInfo(Long l2, Boolean bl, ArCoordinate arCoordinate, ArNormalVector arNormalVector) {
    }

    public static ArPivotAxisInfo fromJson(String string) {
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

    public Long getUuid() {
        return null;
    }

    public void setUuid(Long l2) {
    }

    public Boolean getShow() {
        return null;
    }

    public void setShow(Boolean bl) {
    }

    public ArCoordinate getPivot() {
        return null;
    }

    public void setPivot(ArCoordinate arCoordinate) {
    }

    public ArNormalVector getNormal_vector() {
        return null;
    }

    public void setNormal_vector(ArNormalVector arNormalVector) {
    }

    public String toString() {
        return null;
    }
}

