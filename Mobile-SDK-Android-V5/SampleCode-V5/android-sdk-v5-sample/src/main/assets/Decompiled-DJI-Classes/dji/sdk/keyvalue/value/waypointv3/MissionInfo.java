/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.waypointv3;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.waypointv3.WaylineInfo;
import java.util.List;
import org.json.JSONObject;

public class MissionInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<WaylineInfo> waylineInfo;

    public MissionInfo() {
    }

    public MissionInfo(List<WaylineInfo> list) {
    }

    public static MissionInfo fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public List<WaylineInfo> getWaylineInfo() {
        return null;
    }

    public void setWaylineInfo(List<WaylineInfo> list) {
    }

    public String toString() {
        return null;
    }
}

