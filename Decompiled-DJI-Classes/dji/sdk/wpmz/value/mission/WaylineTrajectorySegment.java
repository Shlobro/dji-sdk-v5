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
import dji.sdk.wpmz.value.mission.WaylineTrajectoryBezierDescript;
import dji.sdk.wpmz.value.mission.WaylineTrajectoryLineDescript;
import dji.sdk.wpmz.value.mission.WaylineTrajectoryTurnDescript;
import dji.sdk.wpmz.value.mission.WaylineTrajectoryType;
import java.util.Objects;
import org.json.JSONObject;

public class WaylineTrajectorySegment
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineTrajectoryType type = WaylineTrajectoryType.UNKNOWN;
    WaylineTrajectoryBezierDescript bezierDescript;
    WaylineTrajectoryLineDescript lineDescript;
    WaylineTrajectoryTurnDescript turnDescript;

    public WaylineTrajectorySegment() {
    }

    public WaylineTrajectorySegment(WaylineTrajectoryType type, WaylineTrajectoryBezierDescript bezierDescript, WaylineTrajectoryLineDescript lineDescript, WaylineTrajectoryTurnDescript turnDescript) {
        if (type != null) {
            this.type = type;
        }
        if (bezierDescript != null) {
            this.bezierDescript = bezierDescript;
        }
        if (lineDescript != null) {
            this.lineDescript = lineDescript;
        }
        if (turnDescript != null) {
            this.turnDescript = turnDescript;
        }
    }

    public static WaylineTrajectorySegment fromJson(String jsonString) {
        WaylineTrajectorySegment tmpValueResult_ = new WaylineTrajectorySegment();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.type = WaylineTrajectoryType.find(jsonObj.getInt("type"));
            tmpValueResult_.bezierDescript = WaylineTrajectoryBezierDescript.fromJson(jsonObj.getJSONObject("bezierDescript").toString());
            tmpValueResult_.lineDescript = WaylineTrajectoryLineDescript.fromJson(jsonObj.getJSONObject("lineDescript").toString());
            tmpValueResult_.turnDescript = WaylineTrajectoryTurnDescript.fromJson(jsonObj.getJSONObject("turnDescript").toString());
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
            if (null != this.type) {
                json.put("type", this.type.value());
            }
            if (null != this.bezierDescript) {
                json.put("bezierDescript", (Object)this.bezierDescript.toJson());
            }
            if (null != this.lineDescript) {
                json.put("lineDescript", (Object)this.lineDescript.toJson());
            }
            if (null != this.turnDescript) {
                json.put("turnDescript", (Object)this.turnDescript.toJson());
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
        serializedLength += ByteStreamHelper.integerGetLength(this.type.value());
        serializedLength += ByteStreamHelper.getLength(this.bezierDescript, WaylineTrajectoryBezierDescript.class);
        serializedLength += ByteStreamHelper.getLength(this.lineDescript, WaylineTrajectoryLineDescript.class);
        return serializedLength += ByteStreamHelper.getLength(this.turnDescript, WaylineTrajectoryTurnDescript.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.integerToBytes(resultBytes, this.type.value(), serializedIndex);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.bezierDescript, serializedIndex, WaylineTrajectoryBezierDescript.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.lineDescript, serializedIndex, WaylineTrajectoryLineDescript.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.turnDescript, serializedIndex, WaylineTrajectoryTurnDescript.class);
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
        ByteResult<Integer> tmpType = ByteStreamHelper.integerFromBytes(data, deserilizationIndex);
        this.type = WaylineTrajectoryType.find((Integer)tmpType.result);
        deserilizationIndex = tmpType.endIndex;
        ByteResult<WaylineTrajectoryBezierDescript> tmpBezierDescript = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTrajectoryBezierDescript.class);
        this.bezierDescript = (WaylineTrajectoryBezierDescript)tmpBezierDescript.result;
        deserilizationIndex = tmpBezierDescript.endIndex;
        ByteResult<WaylineTrajectoryLineDescript> tmpLineDescript = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTrajectoryLineDescript.class);
        this.lineDescript = (WaylineTrajectoryLineDescript)tmpLineDescript.result;
        deserilizationIndex = tmpLineDescript.endIndex;
        ByteResult<WaylineTrajectoryTurnDescript> tmpTurnDescript = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineTrajectoryTurnDescript.class);
        this.turnDescript = (WaylineTrajectoryTurnDescript)tmpTurnDescript.result;
        deserilizationIndex = tmpTurnDescript.endIndex;
        return deserilizationIndex;
    }

    public WaylineTrajectoryType getType() {
        return this.type;
    }

    public void setType(WaylineTrajectoryType type) {
        this.type = type;
    }

    public WaylineTrajectoryBezierDescript getBezierDescript() {
        return this.bezierDescript;
    }

    public void setBezierDescript(WaylineTrajectoryBezierDescript bezierDescript) {
        this.bezierDescript = bezierDescript;
    }

    public WaylineTrajectoryLineDescript getLineDescript() {
        return this.lineDescript;
    }

    public void setLineDescript(WaylineTrajectoryLineDescript lineDescript) {
        this.lineDescript = lineDescript;
    }

    public WaylineTrajectoryTurnDescript getTurnDescript() {
        return this.turnDescript;
    }

    public void setTurnDescript(WaylineTrajectoryTurnDescript turnDescript) {
        this.turnDescript = turnDescript;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTrajectorySegment)) {
            return false;
        }
        WaylineTrajectorySegment that = (WaylineTrajectorySegment)o;
        return Objects.equals(this.type, that.type) && Objects.equals(this.bezierDescript, that.bezierDescript) && Objects.equals(this.lineDescript, that.lineDescript) && Objects.equals(this.turnDescript, that.turnDescript);
    }

    public int hashCode() {
        return Objects.hash(this.type, this.bezierDescript, this.lineDescript, this.turnDescript);
    }
}

