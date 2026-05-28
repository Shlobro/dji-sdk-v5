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
import dji.sdk.keyvalue.value.payload.ArNormalVector;
import dji.sdk.keyvalue.value.payload.ArPointInfo;
import dji.sdk.keyvalue.value.payload.ArPolygonFace;
import dji.sdk.keyvalue.value.payload.ArPolygonStroke;
import java.util.List;
import org.json.JSONObject;

public class ArPolygonInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long uuid;
    List<ArPointInfo> points;
    ArPolygonFace face;
    ArPolygonStroke stroke;
    ArNormalVector normal_vector;
    Long style_id;

    public ArPolygonInfo() {
    }

    public ArPolygonInfo(Long l2, List<ArPointInfo> list, ArPolygonFace arPolygonFace, ArPolygonStroke arPolygonStroke, ArNormalVector arNormalVector, Long l3) {
    }

    public static ArPolygonInfo fromJson(String string) {
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

    public List<ArPointInfo> getPoints() {
        return null;
    }

    public void setPoints(List<ArPointInfo> list) {
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

    public ArNormalVector getNormal_vector() {
        return null;
    }

    public void setNormal_vector(ArNormalVector arNormalVector) {
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

