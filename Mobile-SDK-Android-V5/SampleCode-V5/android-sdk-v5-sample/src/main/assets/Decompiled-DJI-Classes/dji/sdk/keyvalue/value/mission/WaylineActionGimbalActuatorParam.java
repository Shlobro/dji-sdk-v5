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
import dji.sdk.keyvalue.value.mission.WaylineActionGimbalRotateParam;
import dji.sdk.keyvalue.value.mission.WaylineActionStartSmartObliqueParam;
import dji.sdk.keyvalue.value.mission.WaylineGimbalActuatorActionType;
import org.json.JSONObject;

public class WaylineActionGimbalActuatorParam
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineGimbalActuatorActionType gimbalActionType;
    WaylineActionGimbalRotateParam rotateParam;
    WaylineActionStartSmartObliqueParam startSmartObliqueParam;

    public WaylineActionGimbalActuatorParam() {
    }

    public WaylineActionGimbalActuatorParam(WaylineGimbalActuatorActionType waylineGimbalActuatorActionType, WaylineActionGimbalRotateParam waylineActionGimbalRotateParam, WaylineActionStartSmartObliqueParam waylineActionStartSmartObliqueParam) {
    }

    public static WaylineActionGimbalActuatorParam fromJson(String string) {
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

    public WaylineGimbalActuatorActionType getGimbalActionType() {
        return null;
    }

    public void setGimbalActionType(WaylineGimbalActuatorActionType waylineGimbalActuatorActionType) {
    }

    public WaylineActionGimbalRotateParam getRotateParam() {
        return null;
    }

    public void setRotateParam(WaylineActionGimbalRotateParam waylineActionGimbalRotateParam) {
    }

    public WaylineActionStartSmartObliqueParam getStartSmartObliqueParam() {
        return null;
    }

    public void setStartSmartObliqueParam(WaylineActionStartSmartObliqueParam waylineActionStartSmartObliqueParam) {
    }

    public String toString() {
        return null;
    }
}

