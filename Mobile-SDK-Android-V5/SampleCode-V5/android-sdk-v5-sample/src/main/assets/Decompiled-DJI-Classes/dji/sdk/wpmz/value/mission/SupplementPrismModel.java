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
import dji.sdk.wpmz.value.mission.WaylineEulerAngle;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class SupplementPrismModel
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineLocationCoordinate3D> coordinates = new ArrayList<WaylineLocationCoordinate3D>();
    Double height = 0.0;
    WaylineEulerAngle angle;
    WaylineLocationCoordinate3D center;

    public SupplementPrismModel() {
    }

    public SupplementPrismModel(List<WaylineLocationCoordinate3D> coordinates, Double height, WaylineEulerAngle angle, WaylineLocationCoordinate3D center) {
        if (coordinates != null) {
            this.coordinates = coordinates;
        }
        if (height != null) {
            this.height = height;
        }
        if (angle != null) {
            this.angle = angle;
        }
        if (center != null) {
            this.center = center;
        }
    }

    public static SupplementPrismModel fromJson(String jsonString) {
        SupplementPrismModel tmpValueResult_ = new SupplementPrismModel();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray coordinatesJsonArr = jsonObj.getJSONArray("coordinates");
            for (int i = 0; i < coordinatesJsonArr.length(); ++i) {
                tmpValueResult_.coordinates.add(WaylineLocationCoordinate3D.fromJson(coordinatesJsonArr.getString(i)));
            }
            tmpValueResult_.height = jsonObj.getDouble("height");
            tmpValueResult_.angle = WaylineEulerAngle.fromJson(jsonObj.getJSONObject("angle").toString());
            tmpValueResult_.center = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("center").toString());
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
            if (null != this.angle) {
                json.put("angle", (Object)this.angle.toJson());
            }
            if (null != this.center) {
                json.put("center", (Object)this.center.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.angle, WaylineEulerAngle.class);
        return serializedLength += ByteStreamHelper.getLength(this.center, WaylineLocationCoordinate3D.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.coordinates, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.angle, serializedIndex, WaylineEulerAngle.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.center, serializedIndex, WaylineLocationCoordinate3D.class);
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
        ByteResult<WaylineEulerAngle> tmpAngle = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineEulerAngle.class);
        this.angle = (WaylineEulerAngle)tmpAngle.result;
        deserilizationIndex = tmpAngle.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpCenter = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.center = (WaylineLocationCoordinate3D)tmpCenter.result;
        deserilizationIndex = tmpCenter.endIndex;
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

    public WaylineEulerAngle getAngle() {
        return this.angle;
    }

    public void setAngle(WaylineEulerAngle angle) {
        this.angle = angle;
    }

    public WaylineLocationCoordinate3D getCenter() {
        return this.center;
    }

    public void setCenter(WaylineLocationCoordinate3D center) {
        this.center = center;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SupplementPrismModel)) {
            return false;
        }
        SupplementPrismModel that = (SupplementPrismModel)o;
        return Objects.equals(this.coordinates, that.coordinates) && Objects.equals(this.height, that.height) && Objects.equals(this.angle, that.angle) && Objects.equals(this.center, that.center);
    }

    public int hashCode() {
        return Objects.hash(this.coordinates, this.height, this.angle, this.center);
    }
}

