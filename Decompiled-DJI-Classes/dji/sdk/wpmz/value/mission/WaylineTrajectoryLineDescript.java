/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;
import dji.sdk.wpmz.value.ByteResult;
import dji.sdk.wpmz.value.ByteStream;
import dji.sdk.wpmz.value.ByteStreamHelper;
import dji.sdk.wpmz.value.base.DJIValue;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineTrajectoryLineDescript
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineLocationCoordinate3D startPos;
    WaylineLocationCoordinate3D endPos;

    public WaylineTrajectoryLineDescript() {
    }

    public WaylineTrajectoryLineDescript(WaylineLocationCoordinate3D startPos, WaylineLocationCoordinate3D endPos) {
        if (startPos != null) {
            this.startPos = startPos;
        }
        if (endPos != null) {
            this.endPos = endPos;
        }
    }

    public static WaylineTrajectoryLineDescript fromJson(String jsonString) {
        WaylineTrajectoryLineDescript tmpValueResult_ = new WaylineTrajectoryLineDescript();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.startPos = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("startPos").toString());
            tmpValueResult_.endPos = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("endPos").toString());
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
            if (null != this.startPos) {
                json.put("startPos", (Object)this.startPos.toJson());
            }
            if (null != this.endPos) {
                json.put("endPos", (Object)this.endPos.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.startPos, WaylineLocationCoordinate3D.class);
        return serializedLength += ByteStreamHelper.getLength(this.endPos, WaylineLocationCoordinate3D.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.startPos, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.endPos, serializedIndex, WaylineLocationCoordinate3D.class);
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
        ByteResult<WaylineLocationCoordinate3D> tmpStartPos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.startPos = (WaylineLocationCoordinate3D)tmpStartPos.result;
        deserilizationIndex = tmpStartPos.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpEndPos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.endPos = (WaylineLocationCoordinate3D)tmpEndPos.result;
        deserilizationIndex = tmpEndPos.endIndex;
        return deserilizationIndex;
    }

    public WaylineLocationCoordinate3D getStartPos() {
        return this.startPos;
    }

    public void setStartPos(WaylineLocationCoordinate3D startPos) {
        this.startPos = startPos;
    }

    public WaylineLocationCoordinate3D getEndPos() {
        return this.endPos;
    }

    public void setEndPos(WaylineLocationCoordinate3D endPos) {
        this.endPos = endPos;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTrajectoryLineDescript)) {
            return false;
        }
        WaylineTrajectoryLineDescript that = (WaylineTrajectoryLineDescript)o;
        return Objects.equals(this.startPos, that.startPos) && Objects.equals(this.endPos, that.endPos);
    }

    public int hashCode() {
        return Objects.hash(this.startPos, this.endPos);
    }
}

