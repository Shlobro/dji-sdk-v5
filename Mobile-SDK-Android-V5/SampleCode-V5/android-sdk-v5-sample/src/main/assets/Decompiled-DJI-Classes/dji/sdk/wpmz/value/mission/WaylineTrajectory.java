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
import dji.sdk.wpmz.value.mission.WaylineTrajectorySegment;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

public class WaylineTrajectory
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineTrajectorySegment> trajectory = new ArrayList<WaylineTrajectorySegment>();

    public WaylineTrajectory() {
    }

    public WaylineTrajectory(List<WaylineTrajectorySegment> trajectory) {
        if (trajectory != null) {
            this.trajectory = trajectory;
        }
    }

    public static WaylineTrajectory fromJson(String jsonString) {
        WaylineTrajectory tmpValueResult_ = new WaylineTrajectory();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            JSONArray trajectoryJsonArr = jsonObj.getJSONArray("trajectory");
            for (int i = 0; i < trajectoryJsonArr.length(); ++i) {
                tmpValueResult_.trajectory.add(WaylineTrajectorySegment.fromJson(trajectoryJsonArr.getString(i)));
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
            if (null != this.trajectory) {
                JSONArray json_arr_trajectory = new JSONArray();
                for (int i = 0; i < this.trajectory.size(); ++i) {
                    json_arr_trajectory.put((Object)this.trajectory.get(i).toJson());
                }
                json.put("trajectory", (Object)json_arr_trajectory);
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
        return serializedLength += ByteStreamHelper.arrayGetLength(this.trajectory);
    }

    @Override
    public int toBytes(byte[] resultBytes, int serializedIndex) {
        serializedIndex = ByteStreamHelper.arrayToBytes(resultBytes, this.trajectory, serializedIndex);
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
        ByteResult<List<WaylineTrajectorySegment>> tmpTrajectory = ByteStreamHelper.arrayFromBytes(data, deserilizationIndex, WaylineTrajectorySegment.class);
        this.trajectory = (List)tmpTrajectory.result;
        deserilizationIndex = tmpTrajectory.endIndex;
        return deserilizationIndex;
    }

    public List<WaylineTrajectorySegment> getTrajectory() {
        return this.trajectory;
    }

    public void setTrajectory(List<WaylineTrajectorySegment> trajectory) {
        this.trajectory = trajectory;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? this.toJson().toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WaylineTrajectory)) {
            return false;
        }
        WaylineTrajectory that = (WaylineTrajectory)o;
        return Objects.equals(this.trajectory, that.trajectory);
    }

    public int hashCode() {
        return Objects.hash(this.trajectory);
    }
}

