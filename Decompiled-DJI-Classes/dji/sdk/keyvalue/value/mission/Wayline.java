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
import dji.sdk.keyvalue.value.mission.WaylineActionGroup;
import dji.sdk.keyvalue.value.mission.WaylineCoordinateParam;
import dji.sdk.keyvalue.value.mission.WaylineWaypoint;
import java.util.List;
import org.json.JSONObject;

public class Wayline
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waylineId;
    Integer templateId;
    Double distance;
    Double duration;
    Double autoFlightSpeed;
    WaylineCoordinateParam coordinateParam;
    List<WaylineWaypoint> waypoints;
    List<WaylineActionGroup> actionGroups;

    public Wayline() {
    }

    public Wayline(Integer n, Integer n2, Double d2, Double d3, Double d4, WaylineCoordinateParam waylineCoordinateParam, List<WaylineWaypoint> list, List<WaylineActionGroup> list2) {
    }

    public static Wayline fromJson(String string) {
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

    public Integer getWaylineId() {
        return null;
    }

    public void setWaylineId(Integer n) {
    }

    public Integer getTemplateId() {
        return null;
    }

    public void setTemplateId(Integer n) {
    }

    public Double getDistance() {
        return null;
    }

    public void setDistance(Double d2) {
    }

    public Double getDuration() {
        return null;
    }

    public void setDuration(Double d2) {
    }

    public Double getAutoFlightSpeed() {
        return null;
    }

    public void setAutoFlightSpeed(Double d2) {
    }

    public WaylineCoordinateParam getCoordinateParam() {
        return null;
    }

    public void setCoordinateParam(WaylineCoordinateParam waylineCoordinateParam) {
    }

    public List<WaylineWaypoint> getWaypoints() {
        return null;
    }

    public void setWaypoints(List<WaylineWaypoint> list) {
    }

    public List<WaylineActionGroup> getActionGroups() {
        return null;
    }

    public void setActionGroups(List<WaylineActionGroup> list) {
    }

    public String toString() {
        return null;
    }
}

