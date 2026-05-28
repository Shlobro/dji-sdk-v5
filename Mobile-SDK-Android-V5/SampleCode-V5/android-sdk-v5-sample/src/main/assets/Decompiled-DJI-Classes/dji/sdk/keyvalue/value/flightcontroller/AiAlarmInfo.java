/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightcontroller.AiAlarmActionInfo;
import dji.sdk.keyvalue.value.flightcontroller.AiAlarmTargetInfo;
import java.util.List;
import org.json.JSONObject;

public class AiAlarmInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String alarm_uuid;
    Integer alarm_time;
    Integer media_index;
    LocationCoordinate3D alarm_location;
    List<AiAlarmTargetInfo> target_infos;
    List<AiAlarmActionInfo> action_infos;
    Integer waypoint_index;
    Integer algorithm_source;
    String alarm_title;
    String alarm_content;
    Integer payload_index;

    public AiAlarmInfo() {
    }

    public AiAlarmInfo(String string, Integer n, Integer n2, LocationCoordinate3D locationCoordinate3D, List<AiAlarmTargetInfo> list, List<AiAlarmActionInfo> list2, Integer n3, Integer n4, String string2, String string3, Integer n5) {
    }

    public static AiAlarmInfo fromJson(String string) {
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

    public String getAlarm_uuid() {
        return null;
    }

    public void setAlarm_uuid(String string) {
    }

    public Integer getAlarm_time() {
        return null;
    }

    public void setAlarm_time(Integer n) {
    }

    public Integer getMedia_index() {
        return null;
    }

    public void setMedia_index(Integer n) {
    }

    public LocationCoordinate3D getAlarm_location() {
        return null;
    }

    public void setAlarm_location(LocationCoordinate3D locationCoordinate3D) {
    }

    public List<AiAlarmTargetInfo> getTarget_infos() {
        return null;
    }

    public void setTarget_infos(List<AiAlarmTargetInfo> list) {
    }

    public List<AiAlarmActionInfo> getAction_infos() {
        return null;
    }

    public void setAction_infos(List<AiAlarmActionInfo> list) {
    }

    public Integer getWaypoint_index() {
        return null;
    }

    public void setWaypoint_index(Integer n) {
    }

    public Integer getAlgorithm_source() {
        return null;
    }

    public void setAlgorithm_source(Integer n) {
    }

    public String getAlarm_title() {
        return null;
    }

    public void setAlarm_title(String string) {
    }

    public String getAlarm_content() {
        return null;
    }

    public void setAlarm_content(String string) {
    }

    public Integer getPayload_index() {
        return null;
    }

    public void setPayload_index(Integer n) {
    }

    public String toString() {
        return null;
    }
}

