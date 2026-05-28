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
import dji.sdk.keyvalue.value.flightassistant.AIModelClass;
import dji.sdk.keyvalue.value.flightassistant.AIModelLabel;
import java.util.List;
import org.json.JSONObject;

public class AIModelInfo3Msg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    AIModelClass model_class;
    Long model_input_width;
    Long model_input_height;
    Boolean post_process;
    Double post_conf_threshold;
    Double conf_threshold;
    List<AIModelLabel> labels;
    List<AIModelLabel> parsing_labels;
    List<StreamSourceCameraType> image_sources;
    List<CameraThermalPalette> digital_effects;

    public AIModelInfo3Msg() {
    }

    public AIModelInfo3Msg(Integer n, AIModelClass aIModelClass, Long l2, Long l3, Boolean bl, Double d2, Double d3, List<AIModelLabel> list, List<AIModelLabel> list2, List<StreamSourceCameraType> list3, List<CameraThermalPalette> list4) {
    }

    public static AIModelInfo3Msg fromJson(String string) {
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

    public AIModelClass getModel_class() {
        return null;
    }

    public void setModel_class(AIModelClass aIModelClass) {
    }

    public Long getModel_input_width() {
        return null;
    }

    public void setModel_input_width(Long l2) {
    }

    public Long getModel_input_height() {
        return null;
    }

    public void setModel_input_height(Long l2) {
    }

    public Boolean getPost_process() {
        return null;
    }

    public void setPost_process(Boolean bl) {
    }

    public Double getPost_conf_threshold() {
        return null;
    }

    public void setPost_conf_threshold(Double d2) {
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

    public List<AIModelLabel> getParsing_labels() {
        return null;
    }

    public void setParsing_labels(List<AIModelLabel> list) {
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

