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

public class WaylineTrajectoryBezierDescript
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineLocationCoordinate3D wp1Pos;
    WaylineLocationCoordinate3D wp2Pos;
    WaylineLocationCoordinate3D cpt1Pos;
    WaylineLocationCoordinate3D cpt2Pos;

    public WaylineTrajectoryBezierDescript() {
    }

    public WaylineTrajectoryBezierDescript(WaylineLocationCoordinate3D wp1Pos, WaylineLocationCoordinate3D wp2Pos, WaylineLocationCoordinate3D cpt1Pos, WaylineLocationCoordinate3D cpt2Pos) {
        if (wp1Pos != null) {
            this.wp1Pos = wp1Pos;
        }
        if (wp2Pos != null) {
            this.wp2Pos = wp2Pos;
        }
        if (cpt1Pos != null) {
            this.cpt1Pos = cpt1Pos;
        }
        if (cpt2Pos != null) {
            this.cpt2Pos = cpt2Pos;
        }
    }

    public static WaylineTrajectoryBezierDescript fromJson(String jsonString) {
        WaylineTrajectoryBezierDescript tmpValueResult_ = new WaylineTrajectoryBezierDescript();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.wp1Pos = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("wp1Pos").toString());
            tmpValueResult_.wp2Pos = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("wp2Pos").toString());
            tmpValueResult_.cpt1Pos = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("cpt1Pos").toString());
            tmpValueResult_.cpt2Pos = WaylineLocationCoordinate3D.fromJson(jsonObj.getJSONObject("cpt2Pos").toString());
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
            if (null != this.wp1Pos) {
                json.put("wp1Pos", (Object)this.wp1Pos.toJson());
            }
            if (null != this.wp2Pos) {
                json.put("wp2Pos", (Object)this.wp2Pos.toJson());
            }
            if (null != this.cpt1Pos) {
                json.put("cpt1Pos", (Object)this.cpt1Pos.toJson());
            }
            if (null != this.cpt2Pos) {
                json.put("cpt2Pos", (Object)this.cpt2Pos.toJson());
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
        serializedLength += ByteStreamHelper.getLength(this.wp1Pos, WaylineLocationCoordinate3D.class);
        serializedLength += ByteStreamHelper.getLength(this.wp2Pos, WaylineLocationCoordinate3D.class);
        serializedLength += ByteStreamHelper.getLength(this.cpt1Pos, WaylineLocationCoordinate3D.class);
        return serializedLength += ByteStreamHelper.getLength(this.cpt2Pos, WaylineLocationCoordinate3D.class);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.wp1Pos, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.wp2Pos, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.cpt1Pos, serializedIndex, WaylineLocationCoordinate3D.class);
        serializedIndex = ByteStreamHelper.toBytes(resultBytes, this.cpt2Pos, serializedIndex, WaylineLocationCoordinate3D.class);
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
        ByteResult<WaylineLocationCoordinate3D> tmpWp1Pos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.wp1Pos = (WaylineLocationCoordinate3D)tmpWp1Pos.result;
        deserilizationIndex = tmpWp1Pos.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpWp2Pos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.wp2Pos = (WaylineLocationCoordinate3D)tmpWp2Pos.result;
        deserilizationIndex = tmpWp2Pos.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpCpt1Pos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.cpt1Pos = (WaylineLocationCoordinate3D)tmpCpt1Pos.result;
        deserilizationIndex = tmpCpt1Pos.endIndex;
        ByteResult<WaylineLocationCoordinate3D> tmpCpt2Pos = ByteStreamHelper.fromBytes(data, deserilizationIndex, WaylineLocationCoordinate3D.class);
        this.cpt2Pos = (WaylineLocationCoordinate3D)tmpCpt2Pos.result;
        deserilizationIndex = tmpCpt2Pos.endIndex;
        return deserilizationIndex;
    }

    public WaylineLocationCoordinate3D getWp1Pos() {
        return this.wp1Pos;
    }

    public void setWp1Pos(WaylineLocationCoordinate3D wp1Pos) {
        this.wp1Pos = wp1Pos;
    }

    public WaylineLocationCoordinate3D getWp2Pos() {
        return this.wp2Pos;
    }

    public void setWp2Pos(WaylineLocationCoordinate3D wp2Pos) {
        this.wp2Pos = wp2Pos;
    }

    public WaylineLocationCoordinate3D getCpt1Pos() {
        return this.cpt1Pos;
    }

    public void setCpt1Pos(WaylineLocationCoordinate3D cpt1Pos) {
        this.cpt1Pos = cpt1Pos;
    }

    public WaylineLocationCoordinate3D getCpt2Pos() {
        return this.cpt2Pos;
    }

    public void setCpt2Pos(WaylineLocationCoordinate3D cpt2Pos) {
        this.cpt2Pos = cpt2Pos;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTrajectoryBezierDescript)) {
            return false;
        }
        WaylineTrajectoryBezierDescript that = (WaylineTrajectoryBezierDescript)o;
        return Objects.equals(this.wp1Pos, that.wp1Pos) && Objects.equals(this.wp2Pos, that.wp2Pos) && Objects.equals(this.cpt1Pos, that.cpt1Pos) && Objects.equals(this.cpt2Pos, that.cpt2Pos);
    }

    public int hashCode() {
        return Objects.hash(this.wp1Pos, this.wp2Pos, this.cpt1Pos, this.cpt2Pos);
    }
}

