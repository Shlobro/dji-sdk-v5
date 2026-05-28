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
import dji.sdk.keyvalue.value.payload.ArPolygonFace;
import dji.sdk.keyvalue.value.payload.ArPolygonStroke;
import org.json.JSONObject;

public class ArCircleInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long uuid;
    ArCoordinate center;
    Double radius;
    ArNormalVector normal_vector;
    ArPolygonFace face;
    ArPolygonStroke stroke;
    Long style_id;

    public ArCircleInfo() {
    }

    public ArCircleInfo(Long l2, ArCoordinate arCoordinate, Double d2, ArNormalVector arNormalVector, ArPolygonFace arPolygonFace, ArPolygonStroke arPolygonStroke, Long l3) {
    }

    public static ArCircleInfo fromJson(String string) {
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

    public ArCoordinate getCenter() {
        return null;
    }

    public void setCenter(ArCoordinate arCoordinate) {
    }

    public Double getRadius() {
        return null;
    }

    public void setRadius(Double d2) {
    }

    public ArNormalVector getNormal_vector() {
        return null;
    }

    public void setNormal_vector(ArNormalVector arNormalVector) {
    }

    public ArPolygonFace getFace() {
        return null;
    }

    public void setFace(ArPolygonFace arPolygonFace) {
    }

    public ArPolygonStroke getStroke() {
        return null;
    }

    public void setStroke(ArPolygonStroke arPolygonStroke) {
    }

    public Long getStyle_id() {
        return null;
    }

    public void setStyle_id(Long l2) {
    }

    public String toString() {
        return null;
    }
}

