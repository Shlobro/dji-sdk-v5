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
import dji.sdk.keyvalue.value.camera.StreamSourceCameraType;
import java.util.List;
import org.json.JSONObject;

public class CameraIntriParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    StreamSourceCameraType camera_type;
    Integer width;
    Integer height;
    Double focal_length;
    Double focus_position;
    Double fx;
    Double fy;
    Double cx;
    Double cy;
    List<Double> radial_coeffs;
    List<Double> tangent_coeffs;

    public CameraIntriParam() {
    }

    public CameraIntriParam(StreamSourceCameraType streamSourceCameraType, Integer n, Integer n2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, List<Double> list, List<Double> list2) {
    }

    public static CameraIntriParam fromJson(String string) {
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

    public StreamSourceCameraType getCamera_type() {
        return null;
    }

    public void setCamera_type(StreamSourceCameraType streamSourceCameraType) {
    }

    public Integer getWidth() {
        return null;
    }

    public void setWidth(Integer n) {
    }

    public Integer getHeight() {
        return null;
    }

    public void setHeight(Integer n) {
    }

    public Double getFocal_length() {
        return null;
    }

    public void setFocal_length(Double d2) {
    }

    public Double getFocus_position() {
        return null;
    }

    public void setFocus_position(Double d2) {
    }

    public Double getFx() {
        return null;
    }

    public void setFx(Double d2) {
    }

    public Double getFy() {
        return null;
    }

    public void setFy(Double d2) {
    }

    public Double getCx() {
        return null;
    }

    public void setCx(Double d2) {
    }

    public Double getCy() {
        return null;
    }

    public void setCy(Double d2) {
    }

    public List<Double> getRadial_coeffs() {
        return null;
    }

    public void setRadial_coeffs(List<Double> list) {
    }

    public List<Double> getTangent_coeffs() {
        return null;
    }

    public void setTangent_coeffs(List<Double> list) {
    }

    public String toString() {
        return null;
    }
}

