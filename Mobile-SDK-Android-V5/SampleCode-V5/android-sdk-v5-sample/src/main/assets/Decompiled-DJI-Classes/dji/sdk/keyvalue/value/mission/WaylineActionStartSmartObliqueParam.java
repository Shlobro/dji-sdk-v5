/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.mission;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.mission.WaylineActionSmartObliqueCycleMode;
import dji.sdk.keyvalue.value.mission.WaylineActionSmartObliquePointInfo;
import java.util.List;
import org.json.JSONObject;

public class WaylineActionStartSmartObliqueParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionSmartObliqueCycleMode mode;
    List<WaylineActionSmartObliquePointInfo> points;

    public WaylineActionStartSmartObliqueParam() {
    }

    public WaylineActionStartSmartObliqueParam(WaylineActionSmartObliqueCycleMode waylineActionSmartObliqueCycleMode, List<WaylineActionSmartObliquePointInfo> list) {
    }

    public static WaylineActionStartSmartObliqueParam fromJson(String string) {
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

    public WaylineActionSmartObliqueCycleMode getMode() {
        return null;
    }

    public void setMode(WaylineActionSmartObliqueCycleMode waylineActionSmartObliqueCycleMode) {
    }

    public List<WaylineActionSmartObliquePointInfo> getPoints() {
        return null;
    }

    public void setPoints(List<WaylineActionSmartObliquePointInfo> list) {
    }

    public String toString() {
        return null;
    }
}

