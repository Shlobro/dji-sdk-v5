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
import dji.sdk.wpmz.value.mission.GeometryTrajectoryStartPositionType;
import dji.sdk.wpmz.value.mission.GeometryTrajectoryType;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import dji.sdk.wpmz.value.mission.WaylineOverlap;
import dji.sdk.wpmz.value.mission.WaylineTemplateShootType;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplateMappingPrismInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineLocationCoordinate3D> coordinates = new ArrayList<WaylineLocationCoordinate3D>();
    Double height = 0.0;
    WaylineTemplateShootType shootType = WaylineTemplateShootType.UNKNOWN;
    GeometryTrajectoryType trajectoryType = GeometryTrajectoryType.UNKNOWN;
    WaylineOverlap overlap;
    Boolean shootTopFaceEnable = false;
    Double topFaceFlightSpeed = 0.0;
    Double scanExtent = 0.0;
    Double scanOffset = 0.0;
    GeometryTrajectoryStartPositionType startPositionType = GeometryTrajectoryStartPositionType.UNKNOWN;

    public WaylineTemplateMappingPrismInfo() {
    }

    public WaylineTemplateMappingPrismInfo(List<WaylineLocationCoordinate3D> coordinates, Double height, WaylineTemplateShootType shootType, GeometryTrajectoryType trajectoryType, WaylineOverlap overlap, Boolean shootTopFaceEnable, Double topFaceFlightSpeed, Double scanExtent, Double scanOffset, GeometryTrajectoryStartPositionType startPositionType) {
        if (coordinates != null) {
            this.coordinates = coordinates;
        }
        if (height != null) {
            this.height = height;
        }
        if (shootType != null) {
            this.shootType = shootType;
        }
        if (trajectoryType != null) {
            this.trajectoryType = trajectoryType;
        }
        if (overlap != null) {
            this.overlap = overlap;
        }
        if (shootTopFaceEnable != null) {
            this.shootTopFaceEnable = shootTopFaceEnable;
        }
        if (topFaceFlightSpeed != null) {
            this.topFaceFlightSpeed = topFaceFlightSpeed;
        }
        if (scanExtent != null) {
            this.scanExtent = scanExtent;
        }
        if (scanOffset != null) {
            this.scanOffset = scanOffset;
        }
        if (startPositionType != null) {
            this.startPositionType = startPositionType;
        }
    }

    public static WaylineTemplateMappingPrismInfo fromJson(String jsonString) {
        WaylineTemplateMappingPrismInfo tmpValueResult_ = new WaylineTemplateMappingPrismInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray coordinatesJsonArr = jsonObj.getJSONArray("coordinates");
            for (int i = 0; i < coordinatesJsonArr.length(); ++i) {
                tmpValueResult_.coordinates.add(WaylineLocationCoordinate3D.fromJson(coordinatesJsonArr.getString(i)));
            }
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.shootType = WaylineTemplateShootType.find(jsonObj.getInt("shootType"));
            tmpValueResult_.trajectoryType = GeometryTrajectoryType.find(jsonObj.getInt("trajectoryType"));
            tmpValueResult_.overlap = WaylineOverlap.fromJson(jsonObj.getJSONObject("overlap").toString());
            tmpValueResult_.shootTopFaceEnable = jsonObj.getBoolean("shootTopFaceEnable");
            tmpValueResult_.topFaceFlightSpeed = jsonObj.getDouble("topFaceFlightSpeed");
            tmpValueResult_.scanExtent = jsonObj.getDouble("scanExtent");
            tmpValueResult_.scanOffset = jsonObj.getDouble("scanOffset");
            tmpValueResult_.startPositionType = GeometryTrajectoryStartPositionType.find(jsonObj.getInt("startPositionType"));
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
            if (null != this.coordinates) {
                JSONArray json_arr_coordinates = new JSONArray();
                for (int i = 0; i < this.coordinates.size(); ++i) {
                    json_arr_coordinates.put((Object)this.coordinates.get(i).toJson());
                }
                json.put("coordinates", (Object)json_arr_coordinates);
            }
            if (null != this.height) {
                json.put("height", (Object)this.height);
            }
            if (null != this.shootType) {
                json.put("shootType", this.shootType.value());
            }
            if (null != this.trajectoryType) {
                json.put("trajectoryType", this.trajectoryType.value());
            }
            if (null != this.overlap) {
                json.put("overlap", (Object)this.overlap.toJson());
            }
            if (null != this.shootTopFaceEnable) {
                json.put("shootTopFaceEnable", (Object)this.shootTopFaceEnable);
            }
            if (null != this.topFaceFlightSpeed) {
                json.put("topFaceFlightSpeed", (Object)this.topFaceFlightSpeed);
            }
            if (null != this.scanExtent) {
                json.put("scanExtent", (Object)this.scanExtent);
            }
            if (null != this.scanOffset) {
                json.put("scanOffset", (Object)this.scanOffset);
            }
            if (null != this.startPositionType) {
                json.put("startPositionType", this.startPositionType.value());
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
        serializedLength += ByteStreamHelper.arrayGetLength(this.coordinates);
        serializedLength += ByteStreamHelper.doubleGetLength(this.height);
        serializedLength += ByteStreamHelper.integerGetLength(this.shootType.value());
        serializedLength += ByteStreamHelper.integerGetLength(this.trajectoryType.value());
        serializedLength += ByteStreamHelper.getLength(this.overlap, WaylineOverlap.class);
        serializedLength += ByteStreamHelper.booleanGetLength(this.shootTopFaceEnable);
        serializedLength += ByteStreamHelper.doubleGetLength(this.topFaceFlightSpeed);
        serializedLength += ByteStreamHelper.doubleGetLength(this.scanExtent);
        serializedLength += ByteStreamHelper.doubleGetLength(this.scanOffset);
        return serializedLength += ByteStreamHelper.integerGetLength(this.startPositionType.value());
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.coordinates, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.shootType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.trajectoryType.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.overlap, serializedIndex, WaylineOverlap.class);
        serializedIndex = ByteStreamHelper.booleanToBytes(resultBytes, this.shootTopFaceEnable, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.topFaceFlightSpeed, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.scanExtent, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.scanOffset, serializedIndex);
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.startPositionType.value(), serializedIndex);
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
        ByteResult<List<WaylineLocationCoordinate3D>> tmpCoordinates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.coordinates = (List)tmpCoordinates.result;
        deserilizationIndex = tmpCoordinates.endIndex;
        ByteResult<Double> tmpHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.height = (Double)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        ByteResult<Integer> tmpShootType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.shootType = WaylineTemplateShootType.find((Integer)tmpShootType.result);
        deserilizationIndex = tmpShootType.endIndex;
        ByteResult<Integer> tmpTrajectoryType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.trajectoryType = GeometryTrajectoryType.find((Integer)tmpTrajectoryType.result);
        deserilizationIndex = tmpTrajectoryType.endIndex;
        ByteResult<WaylineOverlap> tmpOverlap = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineOverlap.class);
        this.overlap = (WaylineOverlap)tmpOverlap.result;
        deserilizationIndex = tmpOverlap.endIndex;
        ByteResult<Boolean> tmpShootTopFaceEnable = ByteStreamHelper.booleanFromBytes(data, deserilizationIndex);
        this.shootTopFaceEnable = (Boolean)tmpShootTopFaceEnable.result;
        deserilizationIndex = tmpShootTopFaceEnable.endIndex;
        ByteResult<Double> tmpTopFaceFlightSpeed = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.topFaceFlightSpeed = (Double)tmpTopFaceFlightSpeed.result;
        deserilizationIndex = tmpTopFaceFlightSpeed.endIndex;
        ByteResult<Double> tmpScanExtent = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.scanExtent = (Double)tmpScanExtent.result;
        deserilizationIndex = tmpScanExtent.endIndex;
        ByteResult<Double> tmpScanOffset = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.scanOffset = (Double)tmpScanOffset.result;
        deserilizationIndex = tmpScanOffset.endIndex;
        ByteResult<Integer> tmpStartPositionType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.startPositionType = GeometryTrajectoryStartPositionType.find((Integer)tmpStartPositionType.result);
        deserilizationIndex = tmpStartPositionType.endIndex;
        return deserilizationIndex;
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

    public WaylineTemplateShootType getShootType() {
        return this.shootType;
    }

    public void setShootType(WaylineTemplateShootType shootType) {
        this.shootType = shootType;
    }

    public GeometryTrajectoryType getTrajectoryType() {
        return this.trajectoryType;
    }

    public void setTrajectoryType(GeometryTrajectoryType trajectoryType) {
        this.trajectoryType = trajectoryType;
    }

    public WaylineOverlap getOverlap() {
        return this.overlap;
    }

    public void setOverlap(WaylineOverlap overlap) {
        this.overlap = overlap;
    }

    public Boolean getShootTopFaceEnable() {
        return this.shootTopFaceEnable;
    }

    public void setShootTopFaceEnable(Boolean shootTopFaceEnable) {
        this.shootTopFaceEnable = shootTopFaceEnable;
    }

    public Double getTopFaceFlightSpeed() {
        return this.topFaceFlightSpeed;
    }

    public void setTopFaceFlightSpeed(Double topFaceFlightSpeed) {
        this.topFaceFlightSpeed = topFaceFlightSpeed;
    }

    public Double getScanExtent() {
        return this.scanExtent;
    }

    public void setScanExtent(Double scanExtent) {
        this.scanExtent = scanExtent;
    }

    public Double getScanOffset() {
        return this.scanOffset;
    }

    public void setScanOffset(Double scanOffset) {
        this.scanOffset = scanOffset;
    }

    public GeometryTrajectoryStartPositionType getStartPositionType() {
        return this.startPositionType;
    }

    public void setStartPositionType(GeometryTrajectoryStartPositionType startPositionType) {
        this.startPositionType = startPositionType;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTemplateMappingPrismInfo)) {
            return false;
        }
        WaylineTemplateMappingPrismInfo that = (WaylineTemplateMappingPrismInfo)o;
        return Objects.equals(this.coordinates, that.coordinates) && Objects.equals(this.height, that.height) && Objects.equals(this.shootType, that.shootType) && Objects.equals(this.trajectoryType, that.trajectoryType) && Objects.equals(this.overlap, that.overlap) && Objects.equals(this.shootTopFaceEnable, that.shootTopFaceEnable) && Objects.equals(this.topFaceFlightSpeed, that.topFaceFlightSpeed) && Objects.equals(this.scanExtent, that.scanExtent) && Objects.equals(this.scanOffset, that.scanOffset) && Objects.equals(this.startPositionType, that.startPositionType);
    }

    public int hashCode() {
        return Objects.hash(this.coordinates, this.height, this.shootType, this.trajectoryType, this.overlap, this.shootTopFaceEnable, this.topFaceFlightSpeed, this.scanExtent, this.scanOffset, this.startPositionType);
    }
}

