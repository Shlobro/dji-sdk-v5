/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylinePayloadFocusMode;
import dji.sdk.keyvalue.value.mission.WaylinePayloadMeteringMode;
import dji.sdk.keyvalue.value.mission.WaylinePayloadReturnMode;
import dji.sdk.keyvalue.value.mission.WaylinePayloadScanningMode;
import java.util.List;
import org.json.JSONObject;

public class WaylinePayloadParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylinePayloadFocusMode focusMode;
    WaylinePayloadMeteringMode meteringMode;
    Boolean dewarpingEnable;
    WaylinePayloadReturnMode returnMode;
    Integer samplingRate;
    WaylinePayloadScanningMode scanningMode;
    Boolean modelColoringEnable;
    List<String> imageFormat;

    public WaylinePayloadParam() {
    }

    public WaylinePayloadParam(WaylinePayloadFocusMode waylinePayloadFocusMode, WaylinePayloadMeteringMode waylinePayloadMeteringMode, Boolean bl, WaylinePayloadReturnMode waylinePayloadReturnMode, Integer n, WaylinePayloadScanningMode waylinePayloadScanningMode, Boolean bl2, List<String> list) {
    }

    public static WaylinePayloadParam fromJson(String string) {
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

    public WaylinePayloadFocusMode getFocusMode() {
        return null;
    }

    public void setFocusMode(WaylinePayloadFocusMode waylinePayloadFocusMode) {
    }

    public WaylinePayloadMeteringMode getMeteringMode() {
        return null;
    }

    public void setMeteringMode(WaylinePayloadMeteringMode waylinePayloadMeteringMode) {
    }

    public Boolean getDewarpingEnable() {
        return null;
    }

    public void setDewarpingEnable(Boolean bl) {
    }

    public WaylinePayloadReturnMode getReturnMode() {
        return null;
    }

    public void setReturnMode(WaylinePayloadReturnMode waylinePayloadReturnMode) {
    }

    public Integer getSamplingRate() {
        return null;
    }

    public void setSamplingRate(Integer n) {
    }

    public WaylinePayloadScanningMode getScanningMode() {
        return null;
    }

    public void setScanningMode(WaylinePayloadScanningMode waylinePayloadScanningMode) {
    }

    public Boolean getModelColoringEnable() {
        return null;
    }

    public void setModelColoringEnable(Boolean bl) {
    }

    public List<String> getImageFormat() {
        return null;
    }

    public void setImageFormat(List<String> list) {
    }

    public String toString() {
        return null;
    }
}

