/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import dji.sdk.wpmz.value.mission.AgricultureWorkMode;
import dji.sdk.wpmz.value.mission.WaylineActionGroup;
import dji.sdk.wpmz.value.mission.WaylineActionInfo;
import dji.sdk.wpmz.value.mission.WaylineExecuteAltitudeMode;
import dji.sdk.wpmz.value.mission.WaylineExecuteCoordinateMode;
import dji.sdk.wpmz.value.mission.WaylineExecuteWaypoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class Wayline
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer waylineId = 0;
    Integer templateId = 0;
    Double distance = 0.0;
    Double duration = 0.0;
    Double autoFlightSpeed = 0.0;
    WaylineExecuteAltitudeMode mode = WaylineExecuteAltitudeMode.UNKNOWN;
    WaylineExecuteCoordinateMode coordinateMode = WaylineExecuteCoordinateMode.UNKNOWN;
    List<WaylineActionInfo> waylineStartActions = new ArrayList<WaylineActionInfo>();
    List<WaylineExecuteWaypoint> waypoints = new ArrayList<WaylineExecuteWaypoint>();
    List<WaylineActionGroup> actionGroups = new ArrayList<WaylineActionGroup>();
    AgricultureWorkMode agricultureWorkMode = AgricultureWorkMode.UNKNOWN;

    public Wayline() {
    }

    public Wayline(Integer waylineId, Integer templateId, Double distance, Double duration, Double autoFlightSpeed, WaylineExecuteAltitudeMode mode, WaylineExecuteCoordinateMode coordinateMode, List<WaylineActionInfo> waylineStartActions, List<WaylineExecuteWaypoint> waypoints, List<WaylineActionGroup> actionGroups, AgricultureWorkMode agricultureWorkMode) {
        if (waylineId != null) {
            this.waylineId = waylineId;
        }
        if (templateId != null) {
            this.templateId = templateId;
        }
        if (distance != null) {
            this.distance = distance;
        }
        if (duration != null) {
            this.duration = duration;
        }
        if (autoFlightSpeed != null) {
            this.autoFlightSpeed = autoFlightSpeed;
        }
        if (mode != null) {
            this.mode = mode;
        }
        if (coordinateMode != null) {
            this.coordinateMode = coordinateMode;
        }
        if (waylineStartActions != null) {
            this.waylineStartActions = waylineStartActions;
        }
        if (waypoints != null) {
            this.waypoints = waypoints;
        }
        if (actionGroups != null) {
            this.actionGroups = actionGroups;
        }
        if (agricultureWorkMode != null) {
            this.agricultureWorkMode = agricultureWorkMode;
        }
    }

    public static Wayline fromJson(String jsonString) {
        Wayline tmpValueResult_ = new Wayline();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.waylineId = jsonObj.getInt("waylineId");
            tmpValueResult_.templateId = jsonObj.getInt("templateId");
            tmpValueResult_.distance = jsonObj.getDouble("distance");
            tmpValueResult_.duration = jsonObj.getDouble("duration");
            tmpValueResult_.autoFlightSpeed = jsonObj.getDouble("autoFlightSpeed");
            tmpValueResult_.mode = WaylineExecuteAltitudeMode.find(jsonObj.getInt("mode"));
            tmpValueResult_.coordinateMode = WaylineExecuteCoordinateMode.find(jsonObj.getInt("coordinateMode"));
            JSONArray waylineStartActionsJsonArr = jsonObj.getJSONArray("waylineStartActions");
            for (int i = 0; i < waylineStartActionsJsonArr.length(); ++i) {
                tmpValueResult_.waylineStartActions.add(WaylineActionInfo.fromJson(waylineStartActionsJsonArr.getString(i)));
            }
            JSONArray waypointsJsonArr = jsonObj.getJSONArray("waypoints");
            for (int i = 0; i < waypointsJsonArr.length(); ++i) {
                tmpValueResult_.waypoints.add(WaylineExecuteWaypoint.fromJson(waypointsJsonArr.getString(i)));
            }
            JSONArray actionGroupsJsonArr = jsonObj.getJSONArray("actionGroups");
            for (int i = 0; i < actionGroupsJsonArr.length(); ++i) {
                tmpValueResult_.actionGroups.add(WaylineActionGroup.fromJson(actionGroupsJsonArr.getString(i)));
            }
            tmpValueResult_.agricultureWorkMode = AgricultureWorkMode.find(jsonObj.getInt("agricultureWorkMode"));
        }
        catch (Exception e) {
            tmpValueResult_ = null;
        }
        return tmpValueResult_;
    }

    @Override
    public JSONObject toJson() {
        JSONObject json = null;
        try {
            int i;
            json = new JSONObject();
            if (null != this.waylineId) {
                json.put("waylineId", (Object)this.waylineId);
            }
            if (null != this.templateId) {
                json.put("templateId", (Object)this.templateId);
            }
            if (null != this.distance) {
                json.put("distance", (Object)this.distance);
            }
            if (null != this.duration) {
                json.put("duration", (Object)this.duration);
            }
            if (null != this.autoFlightSpeed) {
                json.put("autoFlightSpeed", (Object)this.autoFlightSpeed);
            }
            if (null != this.mode) {
                json.put("mode", this.mode.value());
            }
            if (null != this.coordinateMode) {
                json.put("coordinateMode", this.coordinateMode.value());
            }
            if (null != this.waylineStartActions) {
                JSONArray json_arr_waylineStartActions = new JSONArray();
                for (i = 0; i < this.waylineStartActions.size(); ++i) {
                    json_arr_waylineStartActions.put((Object)this.waylineStartActions.get(i).toJson());
                }
                json.put("waylineStartActions", (Object)json_arr_waylineStartActions);
            }
            if (null != this.waypoints) {
                JSONArray json_arr_waypoints = new JSONArray();
                for (i = 0; i < this.waypoints.size(); ++i) {
                    json_arr_waypoints.put((Object)this.waypoints.get(i).toJson());
                }
                json.put("waypoints", (Object)json_arr_waypoints);
            }
            if (null != this.actionGroups) {
                JSONArray json_arr_actionGroups = new JSONArray();
                for (i = 0; i < this.actionGroups.size(); ++i) {
                    json_arr_actionGroups.put((Object)this.actionGroups.get(i).toJson());
                }
                json.put("actionGroups", (Object)json_arr_actionGroups);
            }
            if (null != this.agricultureWorkMode) {
                json.put("agricultureWorkMode", this.agricultureWorkMode.value());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public int serializedLength() {
        int serializedLength = 0;
        serializedLength += ByteStreamHelper.integerGetLength(this.waylineId);
        serializedLength += ByteStreamHelper.integerGetLength(this.templateId);
        serializedLength += ByteStreamHelper.doubleGetLength(this.distance);
        serializedLength += ByteStreamHelper.doubleGetLength(this.duration);
        serializedLength += ByteStreamHelper.doubleGetLength(this.autoFlightSpeed);
        serializedLength += ByteStreamHelper.integerGetLength(this.mode.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.coordinateMode.value());
        serializedLength += ByteStreamHelper.arrayGetLength(this.waylineStartActions);
        serializedLength += ByteStreamHelper.arrayGetLength(this.waypoints);
        serializedLength += ByteStreamHelper.arrayGetLength(this.actionGroups);
        return serializedLength += ByteStreamHelper.integerGetLength(this.agricultureWorkMode.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.waylineId, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.templateId, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.distance, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.duration, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.autoFlightSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.mode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.coordinateMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.waylineStartActions, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.waypoints, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.actionGroups, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.agricultureWorkMode.value(), serializedIndex);
        return serializedIndex;
    }

    @Override
    public byte[] toBytes() {
        byte[] resultBytes = new byte[this.serializedLength()];
        this.toBytes(resultBytes, 0);
        return resultBytes;
    }

    @Override
    public int fromBytes(byte[] data, int deserilizationIndex) {
        ByteResult<Integer> tmpWaylineId = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.waylineId = (Integer)tmpWaylineId.result;
        deserilizationIndex = tmpWaylineId.endIndex;
        ByteResult<Integer> tmpTemplateId = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.templateId = (Integer)tmpTemplateId.result;
        deserilizationIndex = tmpTemplateId.endIndex;
        ByteResult<Double> tmpDistance = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.distance = (Double)tmpDistance.result;
        deserilizationIndex = tmpDistance.endIndex;
        ByteResult<Double> tmpDuration = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.duration = (Double)tmpDuration.result;
        deserilizationIndex = tmpDuration.endIndex;
        ByteResult<Double> tmpAutoFlightSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.autoFlightSpeed = (Double)tmpAutoFlightSpeed.result;
        deserilizationIndex = tmpAutoFlightSpeed.endIndex;
        ByteResult<Integer> tmpMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.mode = WaylineExecuteAltitudeMode.find((Integer)tmpMode.result);
        deserilizationIndex = tmpMode.endIndex;
        ByteResult<Integer> tmpCoordinateMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.coordinateMode = WaylineExecuteCoordinateMode.find((Integer)tmpCoordinateMode.result);
        deserilizationIndex = tmpCoordinateMode.endIndex;
        ByteResult<List<WaylineActionInfo>> tmpWaylineStartActions = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineActionInfo.class);
        this.waylineStartActions = (List)tmpWaylineStartActions.result;
        deserilizationIndex = tmpWaylineStartActions.endIndex;
        ByteResult<List<WaylineExecuteWaypoint>> tmpWaypoints = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineExecuteWaypoint.class);
        this.waypoints = (List)tmpWaypoints.result;
        deserilizationIndex = tmpWaypoints.endIndex;
        ByteResult<List<WaylineActionGroup>> tmpActionGroups = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineActionGroup.class);
        this.actionGroups = (List)tmpActionGroups.result;
        deserilizationIndex = tmpActionGroups.endIndex;
        ByteResult<Integer> tmpAgricultureWorkMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.agricultureWorkMode = AgricultureWorkMode.find((Integer)tmpAgricultureWorkMode.result);
        deserilizationIndex = tmpAgricultureWorkMode.endIndex;
        return deserilizationIndex;
    }

    public Integer getWaylineId() {
        return this.waylineId;
    }

    public void setWaylineId(Integer waylineId) {
        this.waylineId = waylineId;
    }

    public Integer getTemplateId() {
        return this.templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Double getDistance() {
        return this.distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getDuration() {
        return this.duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    public Double getAutoFlightSpeed() {
        return this.autoFlightSpeed;
    }

    public void setAutoFlightSpeed(Double autoFlightSpeed) {
        this.autoFlightSpeed = autoFlightSpeed;
    }

    public WaylineExecuteAltitudeMode getMode() {
        return this.mode;
    }

    public void setMode(WaylineExecuteAltitudeMode mode) {
        this.mode = mode;
    }

    public WaylineExecuteCoordinateMode getCoordinateMode() {
        return this.coordinateMode;
    }

    public void setCoordinateMode(WaylineExecuteCoordinateMode coordinateMode) {
        this.coordinateMode = coordinateMode;
    }

    public List<WaylineActionInfo> getWaylineStartActions() {
        return this.waylineStartActions;
    }

    public void setWaylineStartActions(List<WaylineActionInfo> waylineStartActions) {
        this.waylineStartActions = waylineStartActions;
    }

    public List<WaylineExecuteWaypoint> getWaypoints() {
        return this.waypoints;
    }

    public void setWaypoints(List<WaylineExecuteWaypoint> waypoints) {
        this.waypoints = waypoints;
    }

    public List<WaylineActionGroup> getActionGroups() {
        return this.actionGroups;
    }

    public void setActionGroups(List<WaylineActionGroup> actionGroups) {
        this.actionGroups = actionGroups;
    }

    public AgricultureWorkMode getAgricultureWorkMode() {
        return this.agricultureWorkMode;
    }

    public void setAgricultureWorkMode(AgricultureWorkMode agricultureWorkMode) {
        this.agricultureWorkMode = agricultureWorkMode;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Wayline)) {
            return false;
        }
        Wayline that = (Wayline)o;
        return Objects.equals(this.waylineId, that.waylineId) && Objects.equals(this.templateId, that.templateId) && Objects.equals(this.distance, that.distance) && Objects.equals(this.duration, that.duration) && Objects.equals(this.autoFlightSpeed, that.autoFlightSpeed) && Objects.equals(this.mode, that.mode) && Objects.equals(this.coordinateMode, that.coordinateMode) && Objects.equals(this.waylineStartActions, that.waylineStartActions) && Objects.equals(this.waypoints, that.waypoints) && Objects.equals(this.actionGroups, that.actionGroups) && Objects.equals(this.agricultureWorkMode, that.agricultureWorkMode);
    }

    public int hashCode() {
        return Objects.hash(this.waylineId, this.templateId, this.distance, this.duration, this.autoFlightSpeed, this.mode, this.coordinateMode, this.waylineStartActions, this.waypoints, this.actionGroups, this.agricultureWorkMode);
    }
}

