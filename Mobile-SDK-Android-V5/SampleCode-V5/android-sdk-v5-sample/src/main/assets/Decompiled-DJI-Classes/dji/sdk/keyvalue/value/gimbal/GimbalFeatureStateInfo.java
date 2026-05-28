/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.gimbal.GimbalFeatureState;
import org.json.JSONObject;

public class GimbalFeatureStateInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    GimbalFeatureState returnCenter;
    GimbalFeatureState joystick;
    GimbalFeatureState changeSystemCoordinate;
    GimbalFeatureState changeMode;
    GimbalFeatureState change3DRoll360;
    GimbalFeatureState changeSportMode;
    Integer timeout;

    public GimbalFeatureStateInfo() {
    }

    public GimbalFeatureStateInfo(GimbalFeatureState gimbalFeatureState, GimbalFeatureState gimbalFeatureState2, GimbalFeatureState gimbalFeatureState3, GimbalFeatureState gimbalFeatureState4, GimbalFeatureState gimbalFeatureState5, GimbalFeatureState gimbalFeatureState6, Integer n) {
    }

    public static GimbalFeatureStateInfo fromJson(String string) {
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

    public GimbalFeatureState getReturnCenter() {
        return null;
    }

    public void setReturnCenter(GimbalFeatureState gimbalFeatureState) {
    }

    public GimbalFeatureState getJoystick() {
        return null;
    }

    public void setJoystick(GimbalFeatureState gimbalFeatureState) {
    }

    public GimbalFeatureState getChangeSystemCoordinate() {
        return null;
    }

    public void setChangeSystemCoordinate(GimbalFeatureState gimbalFeatureState) {
    }

    public GimbalFeatureState getChangeMode() {
        return null;
    }

    public void setChangeMode(GimbalFeatureState gimbalFeatureState) {
    }

    public GimbalFeatureState getChange3DRoll360() {
        return null;
    }

    public void setChange3DRoll360(GimbalFeatureState gimbalFeatureState) {
    }

    public GimbalFeatureState getChangeSportMode() {
        return null;
    }

    public void setChangeSportMode(GimbalFeatureState gimbalFeatureState) {
    }

    public Integer getTimeout() {
        return null;
    }

    public void setTimeout(Integer n) {
    }

    public String toString() {
        return null;
    }
}

