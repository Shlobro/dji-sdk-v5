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
import dji.sdk.keyvalue.value.mission.WaylineCustomPayloadActionInfo;
import java.util.List;
import org.json.JSONObject;

public class WaylinePayloadInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer index;
    String name;
    Double focalLength;
    Double sensorW;
    Double sensorH;
    Integer imageW;
    Integer imageH;
    Double minShootInterval;
    List<WaylineCustomPayloadActionInfo> customActionInfos;

    public WaylinePayloadInfo() {
    }

    public WaylinePayloadInfo(Integer n, String string, Double d2, Double d3, Double d4, Integer n2, Integer n3, Double d5, List<WaylineCustomPayloadActionInfo> list) {
    }

    public static WaylinePayloadInfo fromJson(String string) {
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

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public Double getFocalLength() {
        return null;
    }

    public void setFocalLength(Double d2) {
    }

    public Double getSensorW() {
        return null;
    }

    public void setSensorW(Double d2) {
    }

    public Double getSensorH() {
        return null;
    }

    public void setSensorH(Double d2) {
    }

    public Integer getImageW() {
        return null;
    }

    public void setImageW(Integer n) {
    }

    public Integer getImageH() {
        return null;
    }

    public void setImageH(Integer n) {
    }

    public Double getMinShootInterval() {
        return null;
    }

    public void setMinShootInterval(Double d2) {
    }

    public List<WaylineCustomPayloadActionInfo> getCustomActionInfos() {
        return null;
    }

    public void setCustomActionInfos(List<WaylineCustomPayloadActionInfo> list) {
    }

    public String toString() {
        return null;
    }
}

