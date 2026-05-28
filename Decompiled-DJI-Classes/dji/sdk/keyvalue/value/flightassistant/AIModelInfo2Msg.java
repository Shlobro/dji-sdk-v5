/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.CameraThermalPalette;
import dji.sdk.keyvalue.value.camera.StreamSourceCameraType;
import dji.sdk.keyvalue.value.flightassistant.AIModelLabel;
import java.util.List;
import org.json.JSONObject;

public class AIModelInfo2Msg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    Double conf_threshold;
    List<AIModelLabel> labels;
    List<StreamSourceCameraType> image_sources;
    List<CameraThermalPalette> digital_effects;

    public AIModelInfo2Msg() {
    }

    public AIModelInfo2Msg(Integer n, Double d2, List<AIModelLabel> list, List<StreamSourceCameraType> list2, List<CameraThermalPalette> list3) {
    }

    public static AIModelInfo2Msg fromJson(String string) {
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

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public Double getConf_threshold() {
        return null;
    }

    public void setConf_threshold(Double d2) {
    }

    public List<AIModelLabel> getLabels() {
        return null;
    }

    public void setLabels(List<AIModelLabel> list) {
    }

    public List<StreamSourceCameraType> getImage_sources() {
        return null;
    }

    public void setImage_sources(List<StreamSourceCameraType> list) {
    }

    public List<CameraThermalPalette> getDigital_effects() {
        return null;
    }

    public void setDigital_effects(List<CameraThermalPalette> list) {
    }

    public String toString() {
        return null;
    }
}

