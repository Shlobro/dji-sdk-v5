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
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class LimitPolygonAreaParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String uuid = "";
    String hash = "";
    List<WaylineLocationCoordinate3D> polygonPoints = new ArrayList<WaylineLocationCoordinate3D>();

    public LimitPolygonAreaParam() {
    }

    public LimitPolygonAreaParam(String uuid, String hash, List<WaylineLocationCoordinate3D> polygonPoints) {
        if (uuid != null) {
            this.uuid = uuid;
        }
        if (hash != null) {
            this.hash = hash;
        }
        if (polygonPoints != null) {
            this.polygonPoints = polygonPoints;
        }
    }

    public static LimitPolygonAreaParam fromJson(String jsonString) {
        LimitPolygonAreaParam tmpValueResult_ = new LimitPolygonAreaParam();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.uuid = jsonObj.getString("uuid");
            tmpValueResult_.hash = jsonObj.getString("hash");
            JSONArray polygonPointsJsonArr = jsonObj.getJSONArray("polygonPoints");
            for (int i = 0; i < polygonPointsJsonArr.length(); ++i) {
                tmpValueResult_.polygonPoints.add(WaylineLocationCoordinate3D.fromJson(polygonPointsJsonArr.getString(i)));
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
            json = new JSONObject();
            if (null != this.uuid) {
                json.put("uuid", (Object)this.uuid);
            }
            if (null != this.hash) {
                json.put("hash", (Object)this.hash);
            }
            if (null != this.polygonPoints) {
                JSONArray json_arr_polygonPoints = new JSONArray();
                for (int i = 0; i < this.polygonPoints.size(); ++i) {
                    json_arr_polygonPoints.put((Object)this.polygonPoints.get(i).toJson());
                }
                json.put("polygonPoints", (Object)json_arr_polygonPoints);
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
        serializedLength += ByteStreamHelper.stringGetLength(this.uuid);
        serializedLength += ByteStreamHelper.stringGetLength(this.hash);
        return serializedLength += ByteStreamHelper.arrayGetLength(this.polygonPoints);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.uuid, serializedIndex);
        serializedIndex = ByteStreamHelper.stringToBytes(resultBytes, this.hash, serializedIndex);
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.polygonPoints, serializedIndex);
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
        ByteResult<String> tmpUuid = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.uuid = (String)tmpUuid.result;
        deserilizationIndex = tmpUuid.endIndex;
        ByteResult<String> tmpHash = ByteStreamHelper.stringFromBytes(data, deserilizationIndex);
        this.hash = (String)tmpHash.result;
        deserilizationIndex = tmpHash.endIndex;
        ByteResult<List<WaylineLocationCoordinate3D>> tmpPolygonPoints = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.polygonPoints = (List)tmpPolygonPoints.result;
        deserilizationIndex = tmpPolygonPoints.endIndex;
        return deserilizationIndex;
    }

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getHash() {
        return this.hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public List<WaylineLocationCoordinate3D> getPolygonPoints() {
        return this.polygonPoints;
    }

    public void setPolygonPoints(List<WaylineLocationCoordinate3D> polygonPoints) {
        this.polygonPoints = polygonPoints;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LimitPolygonAreaParam)) {
            return false;
        }
        LimitPolygonAreaParam that = (LimitPolygonAreaParam)o;
        return Objects.equals(this.uuid, that.uuid) && Objects.equals(this.hash, that.hash) && Objects.equals(this.polygonPoints, that.polygonPoints);
    }

    public int hashCode() {
        return Objects.hash(this.uuid, this.hash, this.polygonPoints);
    }
}

