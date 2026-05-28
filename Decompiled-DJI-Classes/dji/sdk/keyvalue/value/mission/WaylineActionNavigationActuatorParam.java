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
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootPhotoOperatingParam;
import dji.sdk.keyvalue.value.mission.WaylineNavigationActuatorActionType;
import org.json.JSONObject;

public class WaylineActionNavigationActuatorParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineNavigationActuatorActionType naviActionType;
    WaylineActionAccurateShootPhotoOperatingParam accurateShootParam;

    public WaylineActionNavigationActuatorParam() {
    }

    public WaylineActionNavigationActuatorParam(WaylineNavigationActuatorActionType waylineNavigationActuatorActionType, WaylineActionAccurateShootPhotoOperatingParam waylineActionAccurateShootPhotoOperatingParam) {
    }

    public static WaylineActionNavigationActuatorParam fromJson(String string) {
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

    public WaylineNavigationActuatorActionType getNaviActionType() {
        return null;
    }

    public void setNaviActionType(WaylineNavigationActuatorActionType waylineNavigationActuatorActionType) {
    }

    public WaylineActionAccurateShootPhotoOperatingParam getAccurateShootParam() {
        return null;
    }

    public void setAccurateShootParam(WaylineActionAccurateShootPhotoOperatingParam waylineActionAccurateShootPhotoOperatingParam) {
    }

    public String toString() {
        return null;
    }
}

