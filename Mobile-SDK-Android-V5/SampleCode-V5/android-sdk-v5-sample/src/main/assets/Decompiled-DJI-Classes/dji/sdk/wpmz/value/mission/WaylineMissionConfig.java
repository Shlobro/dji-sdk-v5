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
import dji.sdk.wpmz.value.mission.WaylineAvoidInfo;
import dji.sdk.wpmz.value.mission.WaylineDroneInfo;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostAction;
import dji.sdk.wpmz.value.mission.WaylineExitOnRCLostBehavior;
import dji.sdk.wpmz.value.mission.WaylineFinishedAction;
import dji.sdk.wpmz.value.mission.WaylineFlyToWaylineMode;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylinePayloadInfo;
import dji.sdk.wpmz.value.mission.WaylinePrecisionType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineMissionConfig
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineFlyToWaylineMode flyToWaylineMode = WaylineFlyToWaylineMode.UNKNOWN;
    WaylineFinishedAction finishAction = WaylineFinishedAction.UNKNOWN;
    WaylineExitOnRCLostBehavior exitOnRCLostBehavior = WaylineExitOnRCLostBehavior.UNKNOWN;
    WaylineExitOnRCLostAction exitOnRCLostType = WaylineExitOnRCLostAction.UNKNOWN;
    Double globalTransitionalSpeed = 0.0;
    Double securityTakeOffHeight = 0.0;
    Boolean isSecurityTakeOffHeightSet = false;
    WaylineLocationCoordinate3D takeOffPositionRef;
    Boolean isTakeOffPositionRefSet = false;
    Double takeOffPositionAGL = 0.0;
    Boolean isTakeOffPositionAGLSet = false;
    WaylineLocationCoordinate3D startPositionRef;
    Boolean isStartPositionRefSet = false;
    WaylineDroneInfo droneInfo;
    List<WaylinePayloadInfo> payloadInfo = new ArrayList<WaylinePayloadInfo>();
    Double globalRTHHeight = 0.0;
    Boolean isGlobalRTHHeightSet = false;
    WaylineAvoidInfo avoidInfo;
    Boolean isAvoidInfoSet = false;
    Boolean isAvoidLimitAreaSet = false;
    WaylinePrecisionType precisionType = WaylinePrecisionType.UNKNOWN;
    Boolean isPrecisionSet = false;

    public WaylineMissionConfig() {
    }

    public WaylineMissionConfig(WaylineFlyToWaylineMode flyToWaylineMode, WaylineFinishedAction finishAction, WaylineExitOnRCLostBehavior exitOnRCLostBehavior, WaylineExitOnRCLostAction exitOnRCLostType, Double globalTransitionalSpeed, Double securityTakeOffHeight, Boolean isSecurityTakeOffHeightSet, WaylineLocationCoordinate3D takeOffPositionRef, Boolean isTakeOffPositionRefSet, Double takeOffPositionAGL, Boolean isTakeOffPositionAGLSet, WaylineLocationCoordinate3D startPositionRef, Boolean isStartPositionRefSet, WaylineDroneInfo droneInfo, List<WaylinePayloadInfo> payloadInfo, Double globalRTHHeight, Boolean isGlobalRTHHeightSet, WaylineAvoidInfo avoidInfo, Boolean isAvoidInfoSet, Boolean isAvoidLimitAreaSet, WaylinePrecisionType precisionType, Boolean isPrecisionSet) {
        if (flyToWaylineMode != null) {
            this.flyToWaylineMode = flyToWaylineMode;
        }
        if (finishAction != null) {
            this.finishAction = finishAction;
        }
        if (exitOnRCLostBehavior != null) {
            this.exitOnRCLostBehavior = exitOnRCLostBehavior;
        }
        if (exitOnRCLostType != null) {
            this.exitOnRCLostType = exitOnRCLostType;
        }
        if (globalTransitionalSpeed != null) {
            this.globalTransitionalSpeed = globalTransitionalSpeed;
        }
        if (securityTakeOffHeight != null) {
            this.securityTakeOffHeight = securityTakeOffHeight;
        }
        if (isSecurityTakeOffHeightSet != null) {
            this.isSecurityTakeOffHeightSet = isSecurityTakeOffHeightSet;
        }
        if (takeOffPositionRef != null) {
            this.takeOffPositionRef = takeOffPositionRef;
        }
        if (isTakeOffPositionRefSet != null) {
            this.isTakeOffPositionRefSet = isTakeOffPositionRefSet;
        }
        if (takeOffPositionAGL != null) {
            this.takeOffPositionAGL = takeOffPositionAGL;
        }
        if (isTakeOffPositionAGLSet != null) {
            this.isTakeOffPositionAGLSet = isTakeOffPositionAGLSet;
        }
        if (startPositionRef != null) {
            this.startPositionRef = startPositionRef;
        }
        if (isStartPositionRefSet != null) {
            this.isStartPositionRefSet = isStartPositionRefSet;
        }
        if (droneInfo != null) {
            this.droneInfo = droneInfo;
        }
        if (payloadInfo != null) {
            this.payloadInfo = payloadInfo;
        }
        if (globalRTHHeight != null) {
            this.globalRTHHeight = globalRTHHeight;
        }
        if (isGlobalRTHHeightSet != null) {
            this.isGlobalRTHHeightSet = isGlobalRTHHeightSet;
        }
        if (avoidInfo != null) {
            this.avoidInfo = avoidInfo;
        }
        if (isAvoidInfoSet != null) {
            this.isAvoidInfoSet = isAvoidInfoSet;
        }
        if (isAvoidLimitAreaSet != null) {
            this.isAvoidLimitAreaSet = isAvoidLimitAreaSet;
        }
        if (precisionType != null) {
            this.precisionType = precisionType;
        }
        if (isPrecisionSet != null) {
            this.isPrecisionSet = isPrecisionSet;
        }
    }

    public static WaylineMissionConfig fromJson(String jsonString) {
        WaylineMissionConfig tmpValueResult_ = new WaylineMissionConfig();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.flyToWaylineMode = WaylineFlyToWaylineMode.find(jsonObj.getInt("flyToWaylineMode"));
            tmpValueResult_.finishAction = WaylineFinishedAction.find(jsonObj.getInt("finishAction"));
            tmpValueResult_.exitOnRCLostBehavior = WaylineExitOnRCLostBehavior.find(jsonObj.getInt("exitOnRCLostBehavior"));
            tmpValueResult_.exitOnRCLostType = WaylineExitOnRCLostAction.find(jsonObj.getInt("exitOnRCLostType"));
            tmpValueResult_.globalTransitionalSpeed = jsonObj.getDouble("globalTransitionalSpeed");
            tmpValueResult_.securityTakeOffHeight = jsonObj.getDouble("securityTakeOffHeight");
            tmpValueResult_.isSecurityTakeOffHeightSet = jsonObj.getBoolean("isSecurityTakeOffHeightSet");
            tmpValueResult_.takeOffPositionRef = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("takeOffPositionRef").toString());
            tmpValueResult_.isTakeOffPositionRefSet = jsonObj.getBoolean("isTakeOffPositionRefSet");
            tmpValueResult_.takeOffPositionAGL = jsonObj.getDouble("takeOffPositionAGL");
            tmpValueResult_.isTakeOffPositionAGLSet = jsonObj.getBoolean("isTakeOffPositionAGLSet");
            tmpValueResult_.startPositionRef = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("startPositionRef").toString());
            tmpValueResult_.isStartPositionRefSet = jsonObj.getBoolean("isStartPositionRefSet");
            tmpValueResult_.droneInfo = WaylineDroneInfo.fromJson(jsonObj.getJSONObject("droneInfo").toString());
            JSONArray payloadInfoJsonArr = jsonObj.getJSONArray("payloadInfo");
            for (int i = 0; i < payloadInfoJsonArr.length(); ++i) {
                tmpValueResult_.payloadInfo.add(WaylinePayloadInfo.fromJson(payloadInfoJsonArr.getString(i)));
            }
            tmpValueResult_.globalRTHHeight = jsonObj.getDouble("globalRTHHeight");
            tmpValueResult_.isGlobalRTHHeightSet = jsonObj.getBoolean("isGlobalRTHHeightSet");
            tmpValueResult_.avoidInfo = WaylineAvoidInfo.fromJson(jsonObj.getJSONObject("avoidInfo").toString());
            tmpValueResult_.isAvoidInfoSet = jsonObj.getBoolean("isAvoidInfoSet");
            tmpValueResult_.isAvoidLimitAreaSet = jsonObj.getBoolean("isAvoidLimitAreaSet");
            tmpValueResult_.precisionType = WaylinePrecisionType.find(jsonObj.getInt("precisionType"));
            tmpValueResult_.isPrecisionSet = jsonObj.getBoolean("isPrecisionSet");
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
            json = new JSONObject();
            if (null != this.flyToWaylineMode) {
                json.put("flyToWaylineMode", this.flyToWaylineMode.value());
            }
            if (null != this.finishAction) {
                json.put("finishAction", this.finishAction.value());
            }
            if (null != this.exitOnRCLostBehavior) {
                json.put("exitOnRCLostBehavior", this.exitOnRCLostBehavior.value());
            }
            if (null != this.exitOnRCLostType) {
                json.put("exitOnRCLostType", this.exitOnRCLostType.value());
            }
            if (null != this.globalTransitionalSpeed) {
                json.put("globalTransitionalSpeed", (Object)this.globalTransitionalSpeed);
            }
            if (null != this.securityTakeOffHeight) {
                json.put("securityTakeOffHeight", (Object)this.securityTakeOffHeight);
            }
            if (null != this.isSecurityTakeOffHeightSet) {
                json.put("isSecurityTakeOffHeightSet", (Object)this.isSecurityTakeOffHeightSet);
            }
            if (null != this.takeOffPositionRef) {
                json.put("takeOffPositionRef", (Object)this.takeOffPositionRef.toJson());
            }
            if (null != this.isTakeOffPositionRefSet) {
                json.put("isTakeOffPositionRefSet", (Object)this.isTakeOffPositionRefSet);
            }
            if (null != this.takeOffPositionAGL) {
                json.put("takeOffPositionAGL", (Object)this.takeOffPositionAGL);
            }
            if (null != this.isTakeOffPositionAGLSet) {
                json.put("isTakeOffPositionAGLSet", (Object)this.isTakeOffPositionAGLSet);
            }
            if (null != this.startPositionRef) {
                json.put("startPositionRef", (Object)this.startPositionRef.toJson());
            }
            if (null != this.isStartPositionRefSet) {
                json.put("isStartPositionRefSet", (Object)this.isStartPositionRefSet);
            }
            if (null != this.droneInfo) {
                json.put("droneInfo", (Object)this.droneInfo.toJson());
            }
            if (null != this.payloadInfo) {
                JSONArray json_arr_payloadInfo = new JSONArray();
                for (int i = 0; i < this.payloadInfo.size(); ++i) {
                    json_arr_payloadInfo.put((Object)this.payloadInfo.get(i).toJson());
                }
                json.put("payloadInfo", (Object)json_arr_payloadInfo);
            }
            if (null != this.globalRTHHeight) {
                json.put("globalRTHHeight", (Object)this.globalRTHHeight);
            }
            if (null != this.isGlobalRTHHeightSet) {
                json.put("isGlobalRTHHeightSet", (Object)this.isGlobalRTHHeightSet);
            }
            if (null != this.avoidInfo) {
                json.put("avoidInfo", (Object)this.avoidInfo.toJson());
            }
            if (null != this.isAvoidInfoSet) {
                json.put("isAvoidInfoSet", (Object)this.isAvoidInfoSet);
            }
            if (null != this.isAvoidLimitAreaSet) {
                json.put("isAvoidLimitAreaSet", (Object)this.isAvoidLimitAreaSet);
            }
            if (null != this.precisionType) {
                json.put("precisionType", this.precisionType.value());
            }
            if (null != this.isPrecisionSet) {
                json.put("isPrecisionSet", (Object)this.isPrecisionSet);
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
        serializedLength += ByteStreamHelper.integerGetLength(this.flyToWaylineMode.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.finishAction.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.exitOnRCLostBehavior.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.exitOnRCLostType.value());
        serializedLength += ByteStreamHelper.doubleGetLength(this.globalTransitionalSpeed);
        serializedLength += ByteStreamHelper.doubleGetLength(this.securityTakeOffHeight);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isSecurityTakeOffHeightSet);
        serializedLength += ByteStreamHelper.getLength(this.takeOffPositionRef, WaylineLocationCoordinate3D.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isTakeOffPositionRefSet);
        serializedLength += ByteStreamHelper.doubleGetLength(this.takeOffPositionAGL);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isTakeOffPositionAGLSet);
        serializedLength += ByteStreamHelper.getLength(this.startPositionRef, WaylineLocationCoordinate3D.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isStartPositionRefSet);
        serializedLength += ByteStreamHelper.getLength(this.droneInfo, WaylineDroneInfo.class);
        serializedLength += ByteStreamHelper.arrayGetLength(this.payloadInfo);
        serializedLength += ByteStreamHelper.doubleGetLength(this.globalRTHHeight);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isGlobalRTHHeightSet);
        serializedLength += ByteStreamHelper.getLength(this.avoidInfo, WaylineAvoidInfo.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isAvoidInfoSet);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isAvoidLimitAreaSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.precisionType.value());
        return serializedLength += ByteStreamHelper.booleanGetLength(this.isPrecisionSet);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.flyToWaylineMode.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.finishAction.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.exitOnRCLostBehavior.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.exitOnRCLostType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.globalTransitionalSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.securityTakeOffHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isSecurityTakeOffHeightSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.takeOffPositionRef, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isTakeOffPositionRefSet, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.takeOffPositionAGL, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isTakeOffPositionAGLSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.startPositionRef, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isStartPositionRefSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.droneInfo, serializedIndex, WaylineDroneInfo.class);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.payloadInfo, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.globalRTHHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isGlobalRTHHeightSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.avoidInfo, serializedIndex, WaylineAvoidInfo.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isAvoidInfoSet, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isAvoidLimitAreaSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.precisionType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isPrecisionSet, serializedIndex);
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
        ByteResult<Integer> tmpFlyToWaylineMode = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.flyToWaylineMode = WaylineFlyToWaylineMode.find((Integer)tmpFlyToWaylineMode.result);
        deserilizationIndex = tmpFlyToWaylineMode.endIndex;
        ByteResult<Integer> tmpFinishAction = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.finishAction = WaylineFinishedAction.find((Integer)tmpFinishAction.result);
        deserilizationIndex = tmpFinishAction.endIndex;
        ByteResult<Integer> tmpExitOnRCLostBehavior = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.exitOnRCLostBehavior = WaylineExitOnRCLostBehavior.find((Integer)tmpExitOnRCLostBehavior.result);
        deserilizationIndex = tmpExitOnRCLostBehavior.endIndex;
        ByteResult<Integer> tmpExitOnRCLostType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.exitOnRCLostType = WaylineExitOnRCLostAction.find((Integer)tmpExitOnRCLostType.result);
        deserilizationIndex = tmpExitOnRCLostType.endIndex;
        ByteResult<Double> tmpGlobalTransitionalSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.globalTransitionalSpeed = (Double)tmpGlobalTransitionalSpeed.result;
        deserilizationIndex = tmpGlobalTransitionalSpeed.endIndex;
        ByteResult<Double> tmpSecurityTakeOffHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.securityTakeOffHeight = (Double)tmpSecurityTakeOffHeight.result;
        deserilizationIndex = tmpSecurityTakeOffHeight.endIndex;
        ByteResult<Boolean> tmpIsSecurityTakeOffHeightSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isSecurityTakeOffHeightSet = (Boolean)tmpIsSecurityTakeOffHeightSet.result;
        deserilizationIndex = tmpIsSecurityTakeOffHeightSet.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpTakeOffPositionRef = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.takeOffPositionRef = (WaylineLocationCoordinate3D)tmpTakeOffPositionRef.result;
        deserilizationIndex = tmpTakeOffPositionRef.endIndex;
        ByteResult<Boolean> tmpIsTakeOffPositionRefSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isTakeOffPositionRefSet = (Boolean)tmpIsTakeOffPositionRefSet.result;
        deserilizationIndex = tmpIsTakeOffPositionRefSet.endIndex;
        ByteResult<Double> tmpTakeOffPositionAGL = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.takeOffPositionAGL = (Double)tmpTakeOffPositionAGL.result;
        deserilizationIndex = tmpTakeOffPositionAGL.endIndex;
        ByteResult<Boolean> tmpIsTakeOffPositionAGLSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isTakeOffPositionAGLSet = (Boolean)tmpIsTakeOffPositionAGLSet.result;
        deserilizationIndex = tmpIsTakeOffPositionAGLSet.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpStartPositionRef = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.startPositionRef = (WaylineLocationCoordinate3D)tmpStartPositionRef.result;
        deserilizationIndex = tmpStartPositionRef.endIndex;
        ByteResult<Boolean> tmpIsStartPositionRefSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isStartPositionRefSet = (Boolean)tmpIsStartPositionRefSet.result;
        deserilizationIndex = tmpIsStartPositionRefSet.endIndex;
        ByteResult<WaylineDroneInfo> tmpDroneInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineDroneInfo.class);
        this.droneInfo = (WaylineDroneInfo)tmpDroneInfo.result;
        deserilizationIndex = tmpDroneInfo.endIndex;
        ByteResult<List<WaylinePayloadInfo>> tmpPayloadInfo = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylinePayloadInfo.class);
        this.payloadInfo = (List)tmpPayloadInfo.result;
        deserilizationIndex = tmpPayloadInfo.endIndex;
        ByteResult<Double> tmpGlobalRTHHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.globalRTHHeight = (Double)tmpGlobalRTHHeight.result;
        deserilizationIndex = tmpGlobalRTHHeight.endIndex;
        ByteResult<Boolean> tmpIsGlobalRTHHeightSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isGlobalRTHHeightSet = (Boolean)tmpIsGlobalRTHHeightSet.result;
        deserilizationIndex = tmpIsGlobalRTHHeightSet.endIndex;
        ByteResult<WaylineAvoidInfo> tmpAvoidInfo = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineAvoidInfo.class);
        this.avoidInfo = (WaylineAvoidInfo)tmpAvoidInfo.result;
        deserilizationIndex = tmpAvoidInfo.endIndex;
        ByteResult<Boolean> tmpIsAvoidInfoSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isAvoidInfoSet = (Boolean)tmpIsAvoidInfoSet.result;
        deserilizationIndex = tmpIsAvoidInfoSet.endIndex;
        ByteResult<Boolean> tmpIsAvoidLimitAreaSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isAvoidLimitAreaSet = (Boolean)tmpIsAvoidLimitAreaSet.result;
        deserilizationIndex = tmpIsAvoidLimitAreaSet.endIndex;
        ByteResult<Integer> tmpPrecisionType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.precisionType = WaylinePrecisionType.find((Integer)tmpPrecisionType.result);
        deserilizationIndex = tmpPrecisionType.endIndex;
        ByteResult<Boolean> tmpIsPrecisionSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isPrecisionSet = (Boolean)tmpIsPrecisionSet.result;
        deserilizationIndex = tmpIsPrecisionSet.endIndex;
        return deserilizationIndex;
    }

    public WaylineFlyToWaylineMode getFlyToWaylineMode() {
        return this.flyToWaylineMode;
    }

    public void setFlyToWaylineMode(WaylineFlyToWaylineMode flyToWaylineMode) {
        this.flyToWaylineMode = flyToWaylineMode;
    }

    public WaylineFinishedAction getFinishAction() {
        return this.finishAction;
    }

    public void setFinishAction(WaylineFinishedAction finishAction) {
        this.finishAction = finishAction;
    }

    public WaylineExitOnRCLostBehavior getExitOnRCLostBehavior() {
        return this.exitOnRCLostBehavior;
    }

    public void setExitOnRCLostBehavior(WaylineExitOnRCLostBehavior exitOnRCLostBehavior) {
        this.exitOnRCLostBehavior = exitOnRCLostBehavior;
    }

    public WaylineExitOnRCLostAction getExitOnRCLostType() {
        return this.exitOnRCLostType;
    }

    public void setExitOnRCLostType(WaylineExitOnRCLostAction exitOnRCLostType) {
        this.exitOnRCLostType = exitOnRCLostType;
    }

    public Double getGlobalTransitionalSpeed() {
        return this.globalTransitionalSpeed;
    }

    public void setGlobalTransitionalSpeed(Double globalTransitionalSpeed) {
        this.globalTransitionalSpeed = globalTransitionalSpeed;
    }

    public Double getSecurityTakeOffHeight() {
        return this.securityTakeOffHeight;
    }

    public void setSecurityTakeOffHeight(Double securityTakeOffHeight) {
        this.securityTakeOffHeight = securityTakeOffHeight;
    }

    public Boolean getIsSecurityTakeOffHeightSet() {
        return this.isSecurityTakeOffHeightSet;
    }

    public void setIsSecurityTakeOffHeightSet(Boolean isSecurityTakeOffHeightSet) {
        this.isSecurityTakeOffHeightSet = isSecurityTakeOffHeightSet;
    }

    public WaylineLocationCoordinate3D getTakeOffPositionRef() {
        return this.takeOffPositionRef;
    }

    public void setTakeOffPositionRef(WaylineLocationCoordinate3D takeOffPositionRef) {
        this.takeOffPositionRef = takeOffPositionRef;
    }

    public Boolean getIsTakeOffPositionRefSet() {
        return this.isTakeOffPositionRefSet;
    }

    public void setIsTakeOffPositionRefSet(Boolean isTakeOffPositionRefSet) {
        this.isTakeOffPositionRefSet = isTakeOffPositionRefSet;
    }

    public Double getTakeOffPositionAGL() {
        return this.takeOffPositionAGL;
    }

    public void setTakeOffPositionAGL(Double takeOffPositionAGL) {
        this.takeOffPositionAGL = takeOffPositionAGL;
    }

    public Boolean getIsTakeOffPositionAGLSet() {
        return this.isTakeOffPositionAGLSet;
    }

    public void setIsTakeOffPositionAGLSet(Boolean isTakeOffPositionAGLSet) {
        this.isTakeOffPositionAGLSet = isTakeOffPositionAGLSet;
    }

    public WaylineLocationCoordinate3D getStartPositionRef() {
        return this.startPositionRef;
    }

    public void setStartPositionRef(WaylineLocationCoordinate3D startPositionRef) {
        this.startPositionRef = startPositionRef;
    }

    public Boolean getIsStartPositionRefSet() {
        return this.isStartPositionRefSet;
    }

    public void setIsStartPositionRefSet(Boolean isStartPositionRefSet) {
        this.isStartPositionRefSet = isStartPositionRefSet;
    }

    public WaylineDroneInfo getDroneInfo() {
        return this.droneInfo;
    }

    public void setDroneInfo(WaylineDroneInfo droneInfo) {
        this.droneInfo = droneInfo;
    }

    public List<WaylinePayloadInfo> getPayloadInfo() {
        return this.payloadInfo;
    }

    public void setPayloadInfo(List<WaylinePayloadInfo> payloadInfo) {
        this.payloadInfo = payloadInfo;
    }

    public Double getGlobalRTHHeight() {
        return this.globalRTHHeight;
    }

    public void setGlobalRTHHeight(Double globalRTHHeight) {
        this.globalRTHHeight = globalRTHHeight;
    }

    public Boolean getIsGlobalRTHHeightSet() {
        return this.isGlobalRTHHeightSet;
    }

    public void setIsGlobalRTHHeightSet(Boolean isGlobalRTHHeightSet) {
        this.isGlobalRTHHeightSet = isGlobalRTHHeightSet;
    }

    public WaylineAvoidInfo getAvoidInfo() {
        return this.avoidInfo;
    }

    public void setAvoidInfo(WaylineAvoidInfo avoidInfo) {
        this.avoidInfo = avoidInfo;
    }

    public Boolean getIsAvoidInfoSet() {
        return this.isAvoidInfoSet;
    }

    public void setIsAvoidInfoSet(Boolean isAvoidInfoSet) {
        this.isAvoidInfoSet = isAvoidInfoSet;
    }

    public Boolean getIsAvoidLimitAreaSet() {
        return this.isAvoidLimitAreaSet;
    }

    public void setIsAvoidLimitAreaSet(Boolean isAvoidLimitAreaSet) {
        this.isAvoidLimitAreaSet = isAvoidLimitAreaSet;
    }

    public WaylinePrecisionType getPrecisionType() {
        return this.precisionType;
    }

    public void setPrecisionType(WaylinePrecisionType precisionType) {
        this.precisionType = precisionType;
    }

    public Boolean getIsPrecisionSet() {
        return this.isPrecisionSet;
    }

    public void setIsPrecisionSet(Boolean isPrecisionSet) {
        this.isPrecisionSet = isPrecisionSet;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineMissionConfig)) {
            return false;
        }
        WaylineMissionConfig that = (WaylineMissionConfig)o;
        return Objects.equals(this.flyToWaylineMode, that.flyToWaylineMode) && Objects.equals(this.finishAction, that.finishAction) && Objects.equals(this.exitOnRCLostBehavior, that.exitOnRCLostBehavior) && Objects.equals(this.exitOnRCLostType, that.exitOnRCLostType) && Objects.equals(this.globalTransitionalSpeed, that.globalTransitionalSpeed) && Objects.equals(this.securityTakeOffHeight, that.securityTakeOffHeight) && Objects.equals(this.isSecurityTakeOffHeightSet, that.isSecurityTakeOffHeightSet) && Objects.equals(this.takeOffPositionRef, that.takeOffPositionRef) && Objects.equals(this.isTakeOffPositionRefSet, that.isTakeOffPositionRefSet) && Objects.equals(this.takeOffPositionAGL, that.takeOffPositionAGL) && Objects.equals(this.isTakeOffPositionAGLSet, that.isTakeOffPositionAGLSet) && Objects.equals(this.startPositionRef, that.startPositionRef) && Objects.equals(this.isStartPositionRefSet, that.isStartPositionRefSet) && Objects.equals(this.droneInfo, that.droneInfo) && Objects.equals(this.payloadInfo, that.payloadInfo) && Objects.equals(this.globalRTHHeight, that.globalRTHHeight) && Objects.equals(this.isGlobalRTHHeightSet, that.isGlobalRTHHeightSet) && Objects.equals(this.avoidInfo, that.avoidInfo) && Objects.equals(this.isAvoidInfoSet, that.isAvoidInfoSet) && Objects.equals(this.isAvoidLimitAreaSet, that.isAvoidLimitAreaSet) && Objects.equals(this.precisionType, that.precisionType) && Objects.equals(this.isPrecisionSet, that.isPrecisionSet);
    }

    public int hashCode() {
        return Objects.hash(this.flyToWaylineMode, this.finishAction, this.exitOnRCLostBehavior, this.exitOnRCLostType, this.globalTransitionalSpeed, this.securityTakeOffHeight, this.isSecurityTakeOffHeightSet, this.takeOffPositionRef, this.isTakeOffPositionRefSet, this.takeOffPositionAGL, this.isTakeOffPositionAGLSet, this.startPositionRef, this.isStartPositionRefSet, this.droneInfo, this.payloadInfo, this.globalRTHHeight, this.isGlobalRTHHeightSet, this.avoidInfo, this.isAvoidInfoSet, this.isAvoidLimitAreaSet, this.precisionType, this.isPrecisionSet);
    }
}

