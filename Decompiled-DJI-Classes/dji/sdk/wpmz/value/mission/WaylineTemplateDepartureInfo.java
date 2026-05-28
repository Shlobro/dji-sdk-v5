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
import dji.sdk.wpmz.value.mission.WaylineDeparturePointCoordinate2D;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTemplateDepartureInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineDeparturePointCoordinate2D> localCoordinates = new ArrayList<WaylineDeparturePointCoordinate2D>();
    Double height = 0.0;

    public WaylineTemplateDepartureInfo() {
    }

    public WaylineTemplateDepartureInfo(List<WaylineDeparturePointCoordinate2D> localCoordinates, Double height) {
        if (localCoordinates != null) {
            this.localCoordinates = localCoordinates;
        }
        if (height != null) {
            this.height = height;
        }
    }

    public static WaylineTemplateDepartureInfo fromJson(String jsonString) {
        WaylineTemplateDepartureInfo tmpValueResult_ = new WaylineTemplateDepartureInfo();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray localCoordinatesJsonArr = jsonObj.getJSONArray("localCoordinates");
            for (int i = 0; i < localCoordinatesJsonArr.length(); ++i) {
                tmpValueResult_.localCoordinates.add(WaylineDeparturePointCoordinate2D.fromJson(localCoordinatesJsonArr.getString(i)));
            }
            tmpValueResult_.height = jsonObj.getDouble("height");
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
            if (null != this.localCoordinates) {
                JSONArray json_arr_localCoordinates = new JSONArray();
                for (int i = 0; i < this.localCoordinates.size(); ++i) {
                    json_arr_localCoordinates.put((Object)this.localCoordinates.get(i).toJson());
                }
                json.put("localCoordinates", (Object)json_arr_localCoordinates);
            }
            if (null != this.height) {
                json.put("height", (Object)this.height);
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
        serializedLength += ByteStreamHelper.arrayGetLength(this.localCoordinates);
        return serializedLength += ByteStreamHelper.doubleGetLength(this.height);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.localCoordinates, serializedIndex);
        serializedIndex = ByteStreamHelper.doubleToBytes(resultBytes, this.height, serializedIndex);
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
        ByteResult<List<WaylineDeparturePointCoordinate2D>> tmpLocalCoordinates = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineDeparturePointCoordinate2D.class);
        this.localCoordinates = (List)tmpLocalCoordinates.result;
        deserilizationIndex = tmpLocalCoordinates.endIndex;
        ByteResult<Double> tmpHeight = ByteStreamHelper.doubleFromBytes(data, deserilizationIndex);
        this.height = (Double)tmpHeight.result;
        deserilizationIndex = tmpHeight.endIndex;
        return deserilizationIndex;
    }

    public List<WaylineDeparturePointCoordinate2D> getLocalCoordinates() {
        return this.localCoordinates;
    }

    public void setLocalCoordinates(List<WaylineDeparturePointCoordinate2D> localCoordinates) {
        this.localCoordinates = localCoordinates;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTemplateDepartureInfo)) {
            return false;
        }
        WaylineTemplateDepartureInfo that = (WaylineTemplateDepartureInfo)o;
        return Objects.equals(this.localCoordinates, that.localCoordinates) && Objects.equals(this.height, that.height);
    }

    public int hashCode() {
        return Objects.hash(this.localCoordinates, this.height);
    }
}

