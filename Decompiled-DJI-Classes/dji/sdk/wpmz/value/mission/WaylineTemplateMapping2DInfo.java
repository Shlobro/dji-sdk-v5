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
import dji.sdk.wpmz.value.mission.LimitCircleAreaParam;
import dji.sdk.wpmz.value.mission.LimitPolygonAreaParam;
import dji.sdk.wpmz.value.mission.LookAtSceneParam;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineMappingCameraAngleParam;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylineTemplateShootType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplateMapping2DInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean caliFlightEnable = false;
    Boolean elevationOptimizeEnable = false;
    Boolean smartObliqueEnable = false;
    Integer smartObliqueGimbalPitch = 0;
    Boolean isSmartObliqueGimbalPitchSet = false;
    WaylineTemplateShootType shootType = WaylineTemplateShootType.UNKNOWN;
    Integer direction = 0;
    Double margin = 0.0;
    List<WaylineLocationCoordinate3D> coordinates = new ArrayList<WaylineLocationCoordinate3D>();
    Double height = 0.0;
    Double ellipsoidHeight = 0.0;
    WaylineOverlap overlap;
    Boolean isCameraAngleParamSet = false;
    WaylineMappingCameraAngleParam cameraAngleParam;
    Boolean facadeWaylineEnable = false;
    Boolean isLookAtSceneSet = false;
    LookAtSceneParam lookAtScene;
    Boolean efficiencyFlightModeEnable = false;
    Boolean quickOrthoMappingEnable = false;
    Integer quickOrthoMappingPitch = 0;
    List<LimitCircleAreaParam> circleLimitAreas = new ArrayList<LimitCircleAreaParam>();
    List<LimitPolygonAreaParam> polygonLimitAreas = new ArrayList<LimitPolygonAreaParam>();

    public WaylineTemplateMapping2DInfo() {
    }

    public WaylineTemplateMapping2DInfo(Boolean caliFlightEnable, Boolean elevationOptimizeEnable, Boolean smartObliqueEnable, Integer smartObliqueGimbalPitch, Boolean isSmartObliqueGimbalPitchSet, WaylineTemplateShootType shootType, Integer direction, Double margin, List<WaylineLocationCoordinate3D> coordinates, Double height, Double ellipsoidHeight, WaylineOverlap overlap, Boolean isCameraAngleParamSet, WaylineMappingCameraAngleParam cameraAngleParam, Boolean facadeWaylineEnable, Boolean isLookAtSceneSet, LookAtSceneParam lookAtScene, Boolean efficiencyFlightModeEnable, Boolean quickOrthoMappingEnable, Integer quickOrthoMappingPitch, List<LimitCircleAreaParam> circleLimitAreas, List<LimitPolygonAreaParam> polygonLimitAreas) {
        if (caliFlightEnable != null) {
            this.caliFlightEnable = caliFlightEnable;
        }
        if (elevationOptimizeEnable != null) {
            this.elevationOptimizeEnable = elevationOptimizeEnable;
        }
        if (smartObliqueEnable != null) {
            this.smartObliqueEnable = smartObliqueEnable;
        }
        if (smartObliqueGimbalPitch != null) {
            this.smartObliqueGimbalPitch = smartObliqueGimbalPitch;
        }
        if (isSmartObliqueGimbalPitchSet != null) {
            this.isSmartObliqueGimbalPitchSet = isSmartObliqueGimbalPitchSet;
        }
        if (shootType != null) {
            this.shootType = shootType;
        }
        if (direction != null) {
            this.direction = direction;
        }
        if (margin != null) {
            this.margin = margin;
        }
        if (coordinates != null) {
            this.coordinates = coordinates;
        }
        if (height != null) {
            this.height = height;
        }
        if (ellipsoidHeight != null) {
            this.ellipsoidHeight = ellipsoidHeight;
        }
        if (overlap != null) {
            this.overlap = overlap;
        }
        if (isCameraAngleParamSet != null) {
            this.isCameraAngleParamSet = isCameraAngleParamSet;
        }
        if (cameraAngleParam != null) {
            this.cameraAngleParam = cameraAngleParam;
        }
        if (facadeWaylineEnable != null) {
            this.facadeWaylineEnable = facadeWaylineEnable;
        }
        if (isLookAtSceneSet != null) {
            this.isLookAtSceneSet = isLookAtSceneSet;
        }
        if (lookAtScene != null) {
            this.lookAtScene = lookAtScene;
        }
        if (efficiencyFlightModeEnable != null) {
            this.efficiencyFlightModeEnable = efficiencyFlightModeEnable;
        }
        if (quickOrthoMappingEnable != null) {
            this.quickOrthoMappingEnable = quickOrthoMappingEnable;
        }
        if (quickOrthoMappingPitch != null) {
            this.quickOrthoMappingPitch = quickOrthoMappingPitch;
        }
        if (circleLimitAreas != null) {
            this.circleLimitAreas = circleLimitAreas;
        }
        if (polygonLimitAreas != null) {
            this.polygonLimitAreas = polygonLimitAreas;
        }
    }

    public static WaylineTemplateMapping2DInfo fromJson(String jsonString) {
        WaylineTemplateMapping2DInfo tmpValueResult_ = new WaylineTemplateMapping2DInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.caliFlightEnable = jsonObj.getBoolean("caliFlightEnable");
            tmpValueResult_.elevationOptimizeEnable = jsonObj.getBoolean("elevationOptimizeEnable");
            tmpValueResult_.smartObliqueEnable = jsonObj.getBoolean("smartObliqueEnable");
            tmpValueResult_.smartObliqueGimbalPitch = jsonObj.getInt("smartObliqueGimbalPitch");
            tmpValueResult_.isSmartObliqueGimbalPitchSet = jsonObj.getBoolean("isSmartObliqueGimbalPitchSet");
            tmpValueResult_.shootType = WaylineTemplateShootType.find(jsonObj.getInt("shootType"));
            tmpValueResult_.direction = jsonObj.getInt("direction");
            tmpValueResult_.margin = jsonObj.getDouble("margin");
            JSONArray coordinatesJsonArr = jsonObj.getJSONArray("coordinates");
            for (int i = 0; i < coordinatesJsonArr.length(); ++i) {
                tmpValueResult_.coordinates.add(WaylineLocationCoordinate3D.fromJson(coordinatesJsonArr.getString(i)));
            }
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.ellipsoidHeight = jsonObj.getDouble("ellipsoidHeight");
            tmpValueResult_.overlap = WaylineOverlap.fromJson(jsonObj.getJSONObject("overlap").toString());
            tmpValueResult_.isCameraAngleParamSet = jsonObj.getBoolean("isCameraAngleParamSet");
            tmpValueResult_.cameraAngleParam = WaylineMappingCameraAngleParam.fromJson(jsonObj.getJSONObject("cameraAngleParam").toString());
            tmpValueResult_.facadeWaylineEnable = jsonObj.getBoolean("facadeWaylineEnable");
            tmpValueResult_.isLookAtSceneSet = jsonObj.getBoolean("isLookAtSceneSet");
            tmpValueResult_.lookAtScene = LookAtSceneParam.fromJson(jsonObj.getJSONObject("lookAtScene").toString());
            tmpValueResult_.efficiencyFlightModeEnable = jsonObj.getBoolean("efficiencyFlightModeEnable");
            tmpValueResult_.quickOrthoMappingEnable = jsonObj.getBoolean("quickOrthoMappingEnable");
            tmpValueResult_.quickOrthoMappingPitch = jsonObj.getInt("quickOrthoMappingPitch");
            JSONArray circleLimitAreasJsonArr = jsonObj.getJSONArray("circleLimitAreas");
            for (int i = 0; i < circleLimitAreasJsonArr.length(); ++i) {
                tmpValueResult_.circleLimitAreas.add(LimitCircleAreaParam.fromJson(circleLimitAreasJsonArr.getString(i)));
            }
            JSONArray polygonLimitAreasJsonArr = jsonObj.getJSONArray("polygonLimitAreas");
            for (int i = 0; i < polygonLimitAreasJsonArr.length(); ++i) {
                tmpValueResult_.polygonLimitAreas.add(LimitPolygonAreaParam.fromJson(polygonLimitAreasJsonArr.getString(i)));
            }
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
            if (null != this.caliFlightEnable) {
                json.put("caliFlightEnable", (Object)this.caliFlightEnable);
            }
            if (null != this.elevationOptimizeEnable) {
                json.put("elevationOptimizeEnable", (Object)this.elevationOptimizeEnable);
            }
            if (null != this.smartObliqueEnable) {
                json.put("smartObliqueEnable", (Object)this.smartObliqueEnable);
            }
            if (null != this.smartObliqueGimbalPitch) {
                json.put("smartObliqueGimbalPitch", (Object)this.smartObliqueGimbalPitch);
            }
            if (null != this.isSmartObliqueGimbalPitchSet) {
                json.put("isSmartObliqueGimbalPitchSet", (Object)this.isSmartObliqueGimbalPitchSet);
            }
            if (null != this.shootType) {
                json.put("shootType", this.shootType.value());
            }
            if (null != this.direction) {
                json.put("direction", (Object)this.direction);
            }
            if (null != this.margin) {
                json.put("margin", (Object)this.margin);
            }
            if (null != this.coordinates) {
                JSONArray json_arr_coordinates = new JSONArray();
                for (i = 0; i < this.coordinates.size(); ++i) {
                    json_arr_coordinates.put((Object)this.coordinates.get(i).toJson());
                }
                json.put("coordinates", (Object)json_arr_coordinates);
            }
            if (null != this.height) {
                json.put("height", (Object)this.height);
            }
            if (null != this.ellipsoidHeight) {
                json.put("ellipsoidHeight", (Object)this.ellipsoidHeight);
            }
            if (null != this.overlap) {
                json.put("overlap", (Object)this.overlap.toJson());
            }
            if (null != this.isCameraAngleParamSet) {
                json.put("isCameraAngleParamSet", (Object)this.isCameraAngleParamSet);
            }
            if (null != this.cameraAngleParam) {
                json.put("cameraAngleParam", (Object)this.cameraAngleParam.toJson());
            }
            if (null != this.facadeWaylineEnable) {
                json.put("facadeWaylineEnable", (Object)this.facadeWaylineEnable);
            }
            if (null != this.isLookAtSceneSet) {
                json.put("isLookAtSceneSet", (Object)this.isLookAtSceneSet);
            }
            if (null != this.lookAtScene) {
                json.put("lookAtScene", (Object)this.lookAtScene.toJson());
            }
            if (null != this.efficiencyFlightModeEnable) {
                json.put("efficiencyFlightModeEnable", (Object)this.efficiencyFlightModeEnable);
            }
            if (null != this.quickOrthoMappingEnable) {
                json.put("quickOrthoMappingEnable", (Object)this.quickOrthoMappingEnable);
            }
            if (null != this.quickOrthoMappingPitch) {
                json.put("quickOrthoMappingPitch", (Object)this.quickOrthoMappingPitch);
            }
            if (null != this.circleLimitAreas) {
                JSONArray json_arr_circleLimitAreas = new JSONArray();
                for (i = 0; i < this.circleLimitAreas.size(); ++i) {
                    json_arr_circleLimitAreas.put((Object)this.circleLimitAreas.get(i).toJson());
                }
                json.put("circleLimitAreas", (Object)json_arr_circleLimitAreas);
            }
            if (null != this.polygonLimitAreas) {
                JSONArray json_arr_polygonLimitAreas = new JSONArray();
                for (i = 0; i < this.polygonLimitAreas.size(); ++i) {
                    json_arr_polygonLimitAreas.put((Object)this.polygonLimitAreas.get(i).toJson());
                }
                json.put("polygonLimitAreas", (Object)json_arr_polygonLimitAreas);
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
        serializedLength += ByteStreamHelper.booleanGetLength(this.caliFlightEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.elevationOptimizeEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.smartObliqueEnable);
        serializedLength += ByteStreamHelper.integerGetLength(this.smartObliqueGimbalPitch);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isSmartObliqueGimbalPitchSet);
        serializedLength += ByteStreamHelper.integerGetLength(this.shootType.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.direction);
        serializedLength += ByteStreamHelper.doubleGetLength(this.margin);
        serializedLength += ByteStreamHelper.arrayGetLength(this.coordinates);
        serializedLength += ByteStreamHelper.doubleGetLength(this.height);
        serializedLength += ByteStreamHelper.doubleGetLength(this.ellipsoidHeight);
        serializedLength += ByteStreamHelper.getLength(this.overlap, WaylineOverlap.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isCameraAngleParamSet);
        serializedLength += ByteStreamHelper.getLength(this.cameraAngleParam, WaylineMappingCameraAngleParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.facadeWaylineEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.isLookAtSceneSet);
        serializedLength += ByteStreamHelper.getLength(this.lookAtScene, LookAtSceneParam.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.efficiencyFlightModeEnable);
        serializedLength += ByteStreamHelper.booleanGetLength(this.quickOrthoMappingEnable);
        serializedLength += ByteStreamHelper.integerGetLength(this.quickOrthoMappingPitch);
        serializedLength += ByteStreamHelper.arrayGetLength(this.circleLimitAreas);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.polygonLimitAreas);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.caliFlightEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.elevationOptimizeEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.smartObliqueEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.smartObliqueGimbalPitch, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isSmartObliqueGimbalPitchSet, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.shootType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.direction, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.margin, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.coordinates, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.ellipsoidHeight, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.overlap, serializedIndex, WaylineOverlap.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isCameraAngleParamSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.cameraAngleParam, serializedIndex, WaylineMappingCameraAngleParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.facadeWaylineEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.isLookAtSceneSet, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.lookAtScene, serializedIndex, LookAtSceneParam.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.efficiencyFlightModeEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.quickOrthoMappingEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.quickOrthoMappingPitch, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.circleLimitAreas, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.polygonLimitAreas, serializedIndex);
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
        ByteResult<Boolean> tmpCaliFlightEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.caliFlightEnable = (Boolean)tmpCaliFlightEnable.result;
        deserilizationIndex = tmpCaliFlightEnable.endIndex;
        ByteResult<Boolean> tmpElevationOptimizeEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.elevationOptimizeEnable = (Boolean)tmpElevationOptimizeEnable.result;
        deserilizationIndex = tmpElevationOptimizeEnable.endIndex;
        ByteResult<Boolean> tmpSmartObliqueEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.smartObliqueEnable = (Boolean)tmpSmartObliqueEnable.result;
        deserilizationIndex = tmpSmartObliqueEnable.endIndex;
        ByteResult<Integer> tmpSmartObliqueGimbalPitch = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.smartObliqueGimbalPitch = (Integer)tmpSmartObliqueGimbalPitch.result;
        deserilizationIndex = tmpSmartObliqueGimbalPitch.endIndex;
        ByteResult<Boolean> tmpIsSmartObliqueGimbalPitchSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isSmartObliqueGimbalPitchSet = (Boolean)tmpIsSmartObliqueGimbalPitchSet.result;
        deserilizationIndex = tmpIsSmartObliqueGimbalPitchSet.endIndex;
        ByteResult<Integer> tmpShootType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.shootType = WaylineTemplateShootType.find((Integer)tmpShootType.result);
        deserilizationIndex = tmpShootType.endIndex;
        ByteResult<Integer> tmpDirection = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.direction = (Integer)tmpDirection.result;
        deserilizationIndex = tmpDirection.endIndex;
        ByteResult<Double> tmpMargin = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.margin = (Double)tmpMargin.result;
        deserilizationIndex = tmpMargin.endIndex;
        ByteResult<List<WaylineLocationCoordinate3D>> tmpCoordinates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.coordinates = (List)tmpCoordinates.result;
        deserilizationIndex = tmpCoordinates.endIndex;
        ByteResult<Double> tmpHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.height = (Double)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        ByteResult<Double> tmpEllipsoidHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.ellipsoidHeight = (Double)tmpEllipsoidHeight.result;
        deserilizationIndex = tmpEllipsoidHeight.endIndex;
        ByteResult<WaylineOverlap> tmpOverlap = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineOverlap.class);
        this.overlap = (WaylineOverlap)tmpOverlap.result;
        deserilizationIndex = tmpOverlap.endIndex;
        ByteResult<Boolean> tmpIsCameraAngleParamSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isCameraAngleParamSet = (Boolean)tmpIsCameraAngleParamSet.result;
        deserilizationIndex = tmpIsCameraAngleParamSet.endIndex;
        ByteResult<WaylineMappingCameraAngleParam> tmpCameraAngleParam = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineMappingCameraAngleParam.class);
        this.cameraAngleParam = (WaylineMappingCameraAngleParam)tmpCameraAngleParam.result;
        deserilizationIndex = tmpCameraAngleParam.endIndex;
        ByteResult<Boolean> tmpFacadeWaylineEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.facadeWaylineEnable = (Boolean)tmpFacadeWaylineEnable.result;
        deserilizationIndex = tmpFacadeWaylineEnable.endIndex;
        ByteResult<Boolean> tmpIsLookAtSceneSet = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.isLookAtSceneSet = (Boolean)tmpIsLookAtSceneSet.result;
        deserilizationIndex = tmpIsLookAtSceneSet.endIndex;
        ByteResult<LookAtSceneParam> tmpLookAtScene = ByteStreamHelper.fromBytes(data, deserilizationIndex, LookAtSceneParam.class);
        this.lookAtScene = (LookAtSceneParam)tmpLookAtScene.result;
        deserilizationIndex = tmpLookAtScene.endIndex;
        ByteResult<Boolean> tmpEfficiencyFlightModeEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.efficiencyFlightModeEnable = (Boolean)tmpEfficiencyFlightModeEnable.result;
        deserilizationIndex = tmpEfficiencyFlightModeEnable.endIndex;
        ByteResult<Boolean> tmpQuickOrthoMappingEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.quickOrthoMappingEnable = (Boolean)tmpQuickOrthoMappingEnable.result;
        deserilizationIndex = tmpQuickOrthoMappingEnable.endIndex;
        ByteResult<Integer> tmpQuickOrthoMappingPitch = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.quickOrthoMappingPitch = (Integer)tmpQuickOrthoMappingPitch.result;
        deserilizationIndex = tmpQuickOrthoMappingPitch.endIndex;
        ByteResult<List<LimitCircleAreaParam>> tmpCircleLimitAreas = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, LimitCircleAreaParam.class);
        this.circleLimitAreas = (List)tmpCircleLimitAreas.result;
        deserilizationIndex = tmpCircleLimitAreas.endIndex;
        ByteResult<List<LimitPolygonAreaParam>> tmpPolygonLimitAreas = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, LimitPolygonAreaParam.class);
        this.polygonLimitAreas = (List)tmpPolygonLimitAreas.result;
        deserilizationIndex = tmpPolygonLimitAreas.endIndex;
        return deserilizationIndex;
    }

    public Boolean getCaliFlightEnable() {
        return this.caliFlightEnable;
    }

    public void setCaliFlightEnable(Boolean caliFlightEnable) {
        this.caliFlightEnable = caliFlightEnable;
    }

    public Boolean getElevationOptimizeEnable() {
        return this.elevationOptimizeEnable;
    }

    public void setElevationOptimizeEnable(Boolean elevationOptimizeEnable) {
        this.elevationOptimizeEnable = elevationOptimizeEnable;
    }

    public Boolean getSmartObliqueEnable() {
        return this.smartObliqueEnable;
    }

    public void setSmartObliqueEnable(Boolean smartObliqueEnable) {
        this.smartObliqueEnable = smartObliqueEnable;
    }

    public Integer getSmartObliqueGimbalPitch() {
        return this.smartObliqueGimbalPitch;
    }

    public void setSmartObliqueGimbalPitch(Integer smartObliqueGimbalPitch) {
        this.smartObliqueGimbalPitch = smartObliqueGimbalPitch;
    }

    public Boolean getIsSmartObliqueGimbalPitchSet() {
        return this.isSmartObliqueGimbalPitchSet;
    }

    public void setIsSmartObliqueGimbalPitchSet(Boolean isSmartObliqueGimbalPitchSet) {
        this.isSmartObliqueGimbalPitchSet = isSmartObliqueGimbalPitchSet;
    }

    public WaylineTemplateShootType getShootType() {
        return this.shootType;
    }

    public void setShootType(WaylineTemplateShootType shootType) {
        this.shootType = shootType;
    }

    public Integer getDirection() {
        return this.direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public Double getMargin() {
        return this.margin;
    }

    public void setMargin(Double margin) {
        this.margin = margin;
    }

    public List<WaylineLocationCoordinate3D> getCoordinates() {
        return this.coordinates;
    }

    public void setCoordinates(List<WaylineLocationCoordinate3D> coordinates) {
        this.coordinates = coordinates;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getEllipsoidHeight() {
        return this.ellipsoidHeight;
    }

    public void setEllipsoidHeight(Double ellipsoidHeight) {
        this.ellipsoidHeight = ellipsoidHeight;
    }

    public WaylineOverlap getOverlap() {
        return this.overlap;
    }

    public void setOverlap(WaylineOverlap overlap) {
        this.overlap = overlap;
    }

    public Boolean getIsCameraAngleParamSet() {
        return this.isCameraAngleParamSet;
    }

    public void setIsCameraAngleParamSet(Boolean isCameraAngleParamSet) {
        this.isCameraAngleParamSet = isCameraAngleParamSet;
    }

    public WaylineMappingCameraAngleParam getCameraAngleParam() {
        return this.cameraAngleParam;
    }

    public void setCameraAngleParam(WaylineMappingCameraAngleParam cameraAngleParam) {
        this.cameraAngleParam = cameraAngleParam;
    }

    public Boolean getFacadeWaylineEnable() {
        return this.facadeWaylineEnable;
    }

    public void setFacadeWaylineEnable(Boolean facadeWaylineEnable) {
        this.facadeWaylineEnable = facadeWaylineEnable;
    }

    public Boolean getIsLookAtSceneSet() {
        return this.isLookAtSceneSet;
    }

    public void setIsLookAtSceneSet(Boolean isLookAtSceneSet) {
        this.isLookAtSceneSet = isLookAtSceneSet;
    }

    public LookAtSceneParam getLookAtScene() {
        return this.lookAtScene;
    }

    public void setLookAtScene(LookAtSceneParam lookAtScene) {
        this.lookAtScene = lookAtScene;
    }

    public Boolean getEfficiencyFlightModeEnable() {
        return this.efficiencyFlightModeEnable;
    }

    public void setEfficiencyFlightModeEnable(Boolean efficiencyFlightModeEnable) {
        this.efficiencyFlightModeEnable = efficiencyFlightModeEnable;
    }

    public Boolean getQuickOrthoMappingEnable() {
        return this.quickOrthoMappingEnable;
    }

    public void setQuickOrthoMappingEnable(Boolean quickOrthoMappingEnable) {
        this.quickOrthoMappingEnable = quickOrthoMappingEnable;
    }

    public Integer getQuickOrthoMappingPitch() {
        return this.quickOrthoMappingPitch;
    }

    public void setQuickOrthoMappingPitch(Integer quickOrthoMappingPitch) {
        this.quickOrthoMappingPitch = quickOrthoMappingPitch;
    }

    public List<LimitCircleAreaParam> getCircleLimitAreas() {
        return this.circleLimitAreas;
    }

    public void setCircleLimitAreas(List<LimitCircleAreaParam> circleLimitAreas) {
        this.circleLimitAreas = circleLimitAreas;
    }

    public List<LimitPolygonAreaParam> getPolygonLimitAreas() {
        return this.polygonLimitAreas;
    }

    public void setPolygonLimitAreas(List<LimitPolygonAreaParam> polygonLimitAreas) {
        this.polygonLimitAreas = polygonLimitAreas;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTemplateMapping2DInfo)) {
            return false;
        }
        WaylineTemplateMapping2DInfo that = (WaylineTemplateMapping2DInfo)o;
        return Objects.equals(this.caliFlightEnable, that.caliFlightEnable) && Objects.equals(this.elevationOptimizeEnable, that.elevationOptimizeEnable) && Objects.equals(this.smartObliqueEnable, that.smartObliqueEnable) && Objects.equals(this.smartObliqueGimbalPitch, that.smartObliqueGimbalPitch) && Objects.equals(this.isSmartObliqueGimbalPitchSet, that.isSmartObliqueGimbalPitchSet) && Objects.equals(this.shootType, that.shootType) && Objects.equals(this.direction, that.direction) && Objects.equals(this.margin, that.margin) && Objects.equals(this.coordinates, that.coordinates) && Objects.equals(this.height, that.height) && Objects.equals(this.ellipsoidHeight, that.ellipsoidHeight) && Objects.equals(this.overlap, that.overlap) && Objects.equals(this.isCameraAngleParamSet, that.isCameraAngleParamSet) && Objects.equals(this.cameraAngleParam, that.cameraAngleParam) && Objects.equals(this.facadeWaylineEnable, that.facadeWaylineEnable) && Objects.equals(this.isLookAtSceneSet, that.isLookAtSceneSet) && Objects.equals(this.lookAtScene, that.lookAtScene) && Objects.equals(this.efficiencyFlightModeEnable, that.efficiencyFlightModeEnable) && Objects.equals(this.quickOrthoMappingEnable, that.quickOrthoMappingEnable) && Objects.equals(this.quickOrthoMappingPitch, that.quickOrthoMappingPitch) && Objects.equals(this.circleLimitAreas, that.circleLimitAreas) && Objects.equals(this.polygonLimitAreas, that.polygonLimitAreas);
    }

    public int hashCode() {
        return Objects.hash(this.caliFlightEnable, this.elevationOptimizeEnable, this.smartObliqueEnable, this.smartObliqueGimbalPitch, this.isSmartObliqueGimbalPitchSet, this.shootType, this.direction, this.margin, this.coordinates, this.height, this.ellipsoidHeight, this.overlap, this.isCameraAngleParamSet, this.cameraAngleParam, this.facadeWaylineEnable, this.isLookAtSceneSet, this.lookAtScene, this.efficiencyFlightModeEnable, this.quickOrthoMappingEnable, this.quickOrthoMappingPitch, this.circleLimitAreas, this.polygonLimitAreas);
    }
}

