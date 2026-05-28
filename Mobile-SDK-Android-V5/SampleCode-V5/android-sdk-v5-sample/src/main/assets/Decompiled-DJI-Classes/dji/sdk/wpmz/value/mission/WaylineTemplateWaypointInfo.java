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
import dji.sdk.wpmz.value.mission.WaylineWaypoint;
import dji.sdk.wpmz.value.mission.WaylineWaypointGimbalHeadingParam;
import dji.sdk.wpmz.value.mission.WaylineWaypointPitchMode;
import dji.sdk.wpmz.value.mission.WaylineWaypointTurnMode;
import dji.sdk.wpmz.value.mission.WaylineWaypointYawParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplateWaypointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineWaypointYawParam globalYawParam;
    Boolean isTemplateGlobalYawParamSet = false;
    WaylineWaypointGimbalHeadingParam globalGimbalHeadingParam;
    Boolean isTemplateGlobalGimbalHeadingParamSet = false;
    WaylineWaypointTurnMode globalTurnMode = WaylineWaypointTurnMode.UNKNOWN;
    Boolean isTemplateGlobalTurnModeSet = false;
    Boolean useStraightLine = false;
    WaylineActionGroup globalAction;
    Boolean isGlobalActionSet = false;
    Double globalFlightHeight = 0.0;
    Boolean isGlobalFlightHeightSet = false;
    List<WaylineWaypoint> waypoints = new ArrayList<WaylineWaypoint>();
    List<WaylineActionGroup> actionGroups = new ArrayList<WaylineActionGroup>();
    WaylineWaypointPitchMode pitchMode = WaylineWaypointPitchMode.UNKNOWN;
    Boolean caliFlightEnable = false;
    AgricultureWorkMode agricultureWorkMode = AgricultureWorkMode.UNKNOWN;

    public WaylineTemplateWaypointInfo() {
    }

    public WaylineTemplateWaypointInfo(WaylineWaypointYawParam globalYawParam, Boolean isTemplateGlobalYawParamSet, WaylineWaypointGimbalHeadingParam globalGimbalHeadingParam, Boolean isTemplateGlobalGimbalHeadingParamSet, WaylineWaypointTurnMode globalTurnMode, Boolean isTemplateGlobalTurnModeSet, Boolean useStraightLine, WaylineActionGroup globalAction, Boolean isGlobalActionSet, Double globalFlightHeight, Boolean isGlobalFlightHeightSet, List<WaylineWaypoint> waypoints, List<WaylineActionGroup> actionGroups, WaylineWaypointPitchMode pitchMode, Boolean caliFlightEnable, AgricultureWorkMode agricultureWorkMode) {
        if (globalYawParam != null) {
            this.globalYawParam = globalYawParam;
        }
        if (isTemplateGlobalYawParamSet != null) {
            this.isTemplateGlobalYawParamSet = isTemplateGlobalYawParamSet;
        }
        if (globalGimbalHeadingParam != null) {
            this.globalGimbalHeadingParam = globalGimbalHeadingParam;
        }
        if (isTemplateGlobalGimbalHeadingParamSet != null) {
            this.isTemplateGlobalGimbalHeadingParamSet = isTemplateGlobalGimbalHeadingParamSet;
        }
        if (globalTurnMode != null) {
            this.globalTurnMode = globalTurnMode;
        }
        if (isTemplateGlobalTurnModeSet != null) {
            this.isTemplateGlobalTurnModeSet = isTemplateGlobalTurnModeSet;
        }
        if (useStraightLine != null) {
            this.useStraightLine = useStraightLine;
        }
        if (globalAction != null) {
            this.globalAction = globalAction;
        }
        if (isGlobalActionSet != null) {
            this.isGlobalActionSet = isGlobalActionSet;
        }
        if (globalFlightHeight != null) {
            this.globalFlightHeight = globalFlightHeight;
        }
        if (isGlobalFlightHeightSet != null) {
            this.isGlobalFlightHeightSet = isGlobalFlightHeightSet;
        }
        if (waypoints != null) {
            this.waypoints = waypoints;
        }
        if (actionGroups != null) {
            this.actionGroups = actionGroups;
        }
        if (pitchMode != null) {
            this.pitchMode = pitchMode;
        }
        if (caliFlightEnable != null) {
            this.caliFlightEnable = caliFlightEnable;
        }
        if (agricultureWorkMode != null) {
            this.agricultureWorkMode = agricultureWorkMode;
        }
    }

    public static WaylineTemplateWaypointInfo fromJson(String jsonString) {
        WaylineTemplateWaypointInfo tmpValueResult_ = new WaylineTemplateWaypointInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.globalYawParam = WaylineWaypointYawParam.fromJson(jsonObj.getJSONObject("globalYawParam").toString());
            tmpValueResult_.isTemplateGlobalYawParamSet = jsonObj.getBoolean("isTemplateGlobalYawParamSet");
            tmpValueResult_.globalGimbalHeadingParam = WaylineWaypointGimbalHeadingParam.fromJson(jsonObj.getJSONObject("globalGimbalHeadingParam").toString());
            tmpValueResult_.isTemplateGlobalGimbalHeadingParamSet = jsonObj.getBoolean("isTemplateGlobalGimbalHeadingParamSet");
            tmpValueResult_.globalTurnMode = WaylineWaypointTurnMode.find(jsonObj.getInt("globalTurnMode"));
            tmpValueResult_.isTemplateGlobalTurnModeSet = jsonObj.getBoolean("isTemplateGlobalTurnModeSet");
            tmpValueResult_.useStraightLine = jsonObj.getBoolean("useStraightLine");
            tmpValueResult_.globalAction = WaylineActionGroup.fromJson(jsonObj.getJSONObject("globalAction").toString());
            tmpValueResult_.isGlobalActionSet = jsonObj.getBoolean("isGlobalActionSet");
            tmpValueResult_.globalFlightHeight = jsonObj.getDouble("globalFlightHeight");
            tmpValueResult_.isGlobalFlightHeightSet = jsonObj.getBoolean("isGlobalFlightHeightSet");
            JSONArray waypointsJsonArr = jsonObj.getJSONArray("waypoints");
            for (int i = 0; i < waypointsJsonArr.length(); ++i) {
                tmpValueResult_.waypoints.add(WaylineWaypoint.fromJson(waypointsJsonArr.getString(i)));
            }
            JSONArray actionGroupsJsonArr = jsonObj.getJSONArray("actionGroups");
            for (int i = 0; i < actionGroupsJsonArr.length(); ++i) {
                tmpValueResult_.actionGroups.add(WaylineActionGroup.fromJson(actionGroupsJsonArr.getString(i)));
            }
            tmpValueResult_.pitchMode = WaylineWaypointPitchMode.find(jsonObj.getInt("pitchMode"));
            tmpValueResult_.caliFlightEnable = jsonObj.getBoolean("caliFlightEnable");
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
            if (null != this.globalYawParam) {
                json.put("globalYawParam", (Object)this.globalYawParam.toJson());
            }
            if (null != this.isTemplateGlobalYawParamSet) {
                json.put("isTemplateGlobalYawParamSet", (Object)this.isTemplateGlobalYawParamSet);
            }
            if (null != this.globalGimbalHeadingParam) {
                json.put("globalGimbalHeadingParam", (Object)this.globalGimbalHeadingParam.toJson());
            }
            if (null != this.isTemplateGlobalGimbalHeadingParamSet) {
                json.put("isTemplateGlobalGimbalHeadingParamSet", (Object)this.isTemplateGlobalGimbalHeadingParamSet);
            }
            if (null != this.globalTurnMode) {
                json.put("globalTurnMode", this.globalTurnMode.value());
            }
            if (null != this.isTemplateGlobalTurnModeSet) {
                json.put("isTemplateGlobalTurnModeSet", (Object)this.isTemplateGlobalTurnModeSet);
            }
            if (null != this.useStraightLine) {
                json.put("useStraightLine", (Object)this.useStraightLine);
            }
            if (null != this.globalAction) {
                json.put("globalAction", (Object)this.globalAction.toJson());
            }
            if (null != this.isGlobalActionSet) {
                json.put("isGlobalActionSet", (Object)this.isGlobalActionSet);
            }
            if (null != this.globalFlightHeight) {
                json.put("globalFlightHeight", (Object)this.globalFlightHeight);
            }
            if (null != this.isGlobalFlightHeightSet) {
                json.put("isGlobalFlightHeightSet", (Object)this.isGlobalFlightHeightSet);
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
            if (null != this.pitchMode) {
                json.put("pitchMode", this.pitchMode.value());
            }
            if (null != this.caliFlightEnable) {
                json.put("caliFlightEnable", (Object)this.caliFlightEnable);
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
        serializedLength += ByteStreamHelper.getLength(this.globalYawParam, WaylineWaypointYawParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isTemplateGlobalYawParamSet);
        serializedLength += ByteStreamHelper.getLength(this.globalGimbalHeadingParam, WaylineWaypointGimbalHeadingParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isTemplateGlobalGimbalHeadingParamSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.globalTurnMode.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.isTemplateGlobalTurnModeSet);
        serializedLength += ByteStreamHelper.booleanGetLength(this.useStraightLine);
        serializedLength += ByteStreamHelper.getLength(this.globalAction, WaylineActionGroup.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isGlobalActionSet);
        serializedLength += ByteStreamHelper.doubleGetLength(this.globalFlightHeight);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isGlobalFlightHeightSet);
        serializedLength += ByteStreamHelper.arrayGetLength(this.waypoints);
        serializedLength += ByteStreamHelper.arrayGetLength(this.actionGroups);
        serializedLength += ByteStreamHelper.integerGetLength(this.pitchMode.value());
        serializedLength += ByteStreamHelper.booleanGetLength(this.caliFlightEnable);
        return serializedLength += ByteStreamHelper.integerGetLength(this.agricultureWorkMode.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.globalYawParam, serializedIndex, WaylineWaypointYawParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isTemplateGlobalYawParamSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.globalGimbalHeadingParam, serializedIndex, WaylineWaypointGimbalHeadingParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isTemplateGlobalGimbalHeadingParamSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.globalTurnMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isTemplateGlobalTurnModeSet, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.useStraightLine, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.globalAction, serializedIndex, WaylineActionGroup.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isGlobalActionSet, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.globalFlightHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isGlobalFlightHeightSet, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.waypoints, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.actionGroups, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.pitchMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.caliFlightEnable, serializedIndex);
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
        ByteResult<WaylineWaypointYawParam> tmpGlobalYawParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointYawParam.class);
        this.globalYawParam = (WaylineWaypointYawParam)tmpGlobalYawParam.result;
        deserilizationIndex = tmpGlobalYawParam.endIndex;
        ByteResult<Boolean> tmpIsTemplateGlobalYawParamSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isTemplateGlobalYawParamSet = (Boolean)tmpIsTemplateGlobalYawParamSet.result;
        deserilizationIndex = tmpIsTemplateGlobalYawParamSet.endIndex;
        ByteResult<WaylineWaypointGimbalHeadingParam> tmpGlobalGimbalHeadingParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineWaypointGimbalHeadingParam.class);
        this.globalGimbalHeadingParam = (WaylineWaypointGimbalHeadingParam)tmpGlobalGimbalHeadingParam.result;
        deserilizationIndex = tmpGlobalGimbalHeadingParam.endIndex;
        ByteResult<Boolean> tmpIsTemplateGlobalGimbalHeadingParamSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isTemplateGlobalGimbalHeadingParamSet = (Boolean)tmpIsTemplateGlobalGimbalHeadingParamSet.result;
        deserilizationIndex = tmpIsTemplateGlobalGimbalHeadingParamSet.endIndex;
        ByteResult<Integer> tmpGlobalTurnMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.globalTurnMode = WaylineWaypointTurnMode.find((Integer)tmpGlobalTurnMode.result);
        deserilizationIndex = tmpGlobalTurnMode.endIndex;
        ByteResult<Boolean> tmpIsTemplateGlobalTurnModeSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isTemplateGlobalTurnModeSet = (Boolean)tmpIsTemplateGlobalTurnModeSet.result;
        deserilizationIndex = tmpIsTemplateGlobalTurnModeSet.endIndex;
        ByteResult<Boolean> tmpUseStraightLine = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.useStraightLine = (Boolean)tmpUseStraightLine.result;
        deserilizationIndex = tmpUseStraightLine.endIndex;
        ByteResult<WaylineActionGroup> tmpGlobalAction = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineActionGroup.class);
        this.globalAction = (WaylineActionGroup)tmpGlobalAction.result;
        deserilizationIndex = tmpGlobalAction.endIndex;
        ByteResult<Boolean> tmpIsGlobalActionSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isGlobalActionSet = (Boolean)tmpIsGlobalActionSet.result;
        deserilizationIndex = tmpIsGlobalActionSet.endIndex;
        ByteResult<Double> tmpGlobalFlightHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.globalFlightHeight = (Double)tmpGlobalFlightHeight.result;
        deserilizationIndex = tmpGlobalFlightHeight.endIndex;
        ByteResult<Boolean> tmpIsGlobalFlightHeightSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isGlobalFlightHeightSet = (Boolean)tmpIsGlobalFlightHeightSet.result;
        deserilizationIndex = tmpIsGlobalFlightHeightSet.endIndex;
        ByteResult<List<WaylineWaypoint>> tmpWaypoints = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineWaypoint.class);
        this.waypoints = (List)tmpWaypoints.result;
        deserilizationIndex = tmpWaypoints.endIndex;
        ByteResult<List<WaylineActionGroup>> tmpActionGroups = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineActionGroup.class);
        this.actionGroups = (List)tmpActionGroups.result;
        deserilizationIndex = tmpActionGroups.endIndex;
        ByteResult<Integer> tmpPitchMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.pitchMode = WaylineWaypointPitchMode.find((Integer)tmpPitchMode.result);
        deserilizationIndex = tmpPitchMode.endIndex;
        ByteResult<Boolean> tmpCaliFlightEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.caliFlightEnable = (Boolean)tmpCaliFlightEnable.result;
        deserilizationIndex = tmpCaliFlightEnable.endIndex;
        ByteResult<Integer> tmpAgricultureWorkMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.agricultureWorkMode = AgricultureWorkMode.find((Integer)tmpAgricultureWorkMode.result);
        deserilizationIndex = tmpAgricultureWorkMode.endIndex;
        return deserilizationIndex;
    }

    public WaylineWaypointYawParam getGlobalYawParam() {
        return this.globalYawParam;
    }

    public void setGlobalYawParam(WaylineWaypointYawParam globalYawParam) {
        this.globalYawParam = globalYawParam;
    }

    public Boolean getIsTemplateGlobalYawParamSet() {
        return this.isTemplateGlobalYawParamSet;
    }

    public void setIsTemplateGlobalYawParamSet(Boolean isTemplateGlobalYawParamSet) {
        this.isTemplateGlobalYawParamSet = isTemplateGlobalYawParamSet;
    }

    public WaylineWaypointGimbalHeadingParam getGlobalGimbalHeadingParam() {
        return this.globalGimbalHeadingParam;
    }

    public void setGlobalGimbalHeadingParam(WaylineWaypointGimbalHeadingParam globalGimbalHeadingParam) {
        this.globalGimbalHeadingParam = globalGimbalHeadingParam;
    }

    public Boolean getIsTemplateGlobalGimbalHeadingParamSet() {
        return this.isTemplateGlobalGimbalHeadingParamSet;
    }

    public void setIsTemplateGlobalGimbalHeadingParamSet(Boolean isTemplateGlobalGimbalHeadingParamSet) {
        this.isTemplateGlobalGimbalHeadingParamSet = isTemplateGlobalGimbalHeadingParamSet;
    }

    public WaylineWaypointTurnMode getGlobalTurnMode() {
        return this.globalTurnMode;
    }

    public void setGlobalTurnMode(WaylineWaypointTurnMode globalTurnMode) {
        this.globalTurnMode = globalTurnMode;
    }

    public Boolean getIsTemplateGlobalTurnModeSet() {
        return this.isTemplateGlobalTurnModeSet;
    }

    public void setIsTemplateGlobalTurnModeSet(Boolean isTemplateGlobalTurnModeSet) {
        this.isTemplateGlobalTurnModeSet = isTemplateGlobalTurnModeSet;
    }

    public Boolean getUseStraightLine() {
        return this.useStraightLine;
    }

    public void setUseStraightLine(Boolean useStraightLine) {
        this.useStraightLine = useStraightLine;
    }

    public WaylineActionGroup getGlobalAction() {
        return this.globalAction;
    }

    public void setGlobalAction(WaylineActionGroup globalAction) {
        this.globalAction = globalAction;
    }

    public Boolean getIsGlobalActionSet() {
        return this.isGlobalActionSet;
    }

    public void setIsGlobalActionSet(Boolean isGlobalActionSet) {
        this.isGlobalActionSet = isGlobalActionSet;
    }

    public Double getGlobalFlightHeight() {
        return this.globalFlightHeight;
    }

    public void setGlobalFlightHeight(Double globalFlightHeight) {
        this.globalFlightHeight = globalFlightHeight;
    }

    public Boolean getIsGlobalFlightHeightSet() {
        return this.isGlobalFlightHeightSet;
    }

    public void setIsGlobalFlightHeightSet(Boolean isGlobalFlightHeightSet) {
        this.isGlobalFlightHeightSet = isGlobalFlightHeightSet;
    }

    public List<WaylineWaypoint> getWaypoints() {
        return this.waypoints;
    }

    public void setWaypoints(List<WaylineWaypoint> waypoints) {
        this.waypoints = waypoints;
    }

    public List<WaylineActionGroup> getActionGroups() {
        return this.actionGroups;
    }

    public void setActionGroups(List<WaylineActionGroup> actionGroups) {
        this.actionGroups = actionGroups;
    }

    public WaylineWaypointPitchMode getPitchMode() {
        return this.pitchMode;
    }

    public void setPitchMode(WaylineWaypointPitchMode pitchMode) {
        this.pitchMode = pitchMode;
    }

    public Boolean getCaliFlightEnable() {
        return this.caliFlightEnable;
    }

    public void setCaliFlightEnable(Boolean caliFlightEnable) {
        this.caliFlightEnable = caliFlightEnable;
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
        if (!(o instanceof WaylineTemplateWaypointInfo)) {
            return false;
        }
        WaylineTemplateWaypointInfo that = (WaylineTemplateWaypointInfo)o;
        return Objects.equals(this.globalYawParam, that.globalYawParam) && Objects.equals(this.isTemplateGlobalYawParamSet, that.isTemplateGlobalYawParamSet) && Objects.equals(this.globalGimbalHeadingParam, that.globalGimbalHeadingParam) && Objects.equals(this.isTemplateGlobalGimbalHeadingParamSet, that.isTemplateGlobalGimbalHeadingParamSet) && Objects.equals(this.globalTurnMode, that.globalTurnMode) && Objects.equals(this.isTemplateGlobalTurnModeSet, that.isTemplateGlobalTurnModeSet) && Objects.equals(this.useStraightLine, that.useStraightLine) && Objects.equals(this.globalAction, that.globalAction) && Objects.equals(this.isGlobalActionSet, that.isGlobalActionSet) && Objects.equals(this.globalFlightHeight, that.globalFlightHeight) && Objects.equals(this.isGlobalFlightHeightSet, that.isGlobalFlightHeightSet) && Objects.equals(this.waypoints, that.waypoints) && Objects.equals(this.actionGroups, that.actionGroups) && Objects.equals(this.pitchMode, that.pitchMode) && Objects.equals(this.caliFlightEnable, that.caliFlightEnable) && Objects.equals(this.agricultureWorkMode, that.agricultureWorkMode);
    }

    public int hashCode() {
        return Objects.hash(this.globalYawParam, this.isTemplateGlobalYawParamSet, this.globalGimbalHeadingParam, this.isTemplateGlobalGimbalHeadingParamSet, this.globalTurnMode, this.isTemplateGlobalTurnModeSet, this.useStraightLine, this.globalAction, this.isGlobalActionSet, this.globalFlightHeight, this.isGlobalFlightHeightSet, this.waypoints, this.actionGroups, this.pitchMode, this.caliFlightEnable, this.agricultureWorkMode);
    }
}

