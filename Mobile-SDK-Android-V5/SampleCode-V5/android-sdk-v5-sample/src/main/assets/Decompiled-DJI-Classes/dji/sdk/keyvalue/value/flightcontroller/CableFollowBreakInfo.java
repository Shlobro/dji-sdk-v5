/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightcontroller.CableFollowDirection;
import org.json.JSONObject;

public class CableFollowBreakInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer errorCode;
    LocationCoordinate3D curPos;
    CableFollowDirection direction;
    Boolean isBreakInfoValid;

    public CableFollowBreakInfo() {
    }

    public CableFollowBreakInfo(Integer n, LocationCoordinate3D locationCoordinate3D, CableFollowDirection cableFollowDirection, Boolean bl) {
    }

    public static CableFollowBreakInfo fromJson(String string) {
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

    public Integer getErrorCode() {
        return null;
    }

    public void setErrorCode(Integer n) {
    }

    public LocationCoordinate3D getCurPos() {
        return null;
    }

    public void setCurPos(LocationCoordinate3D locationCoordinate3D) {
    }

    public CableFollowDirection getDirection() {
        return null;
    }

    public void setDirection(CableFollowDirection cableFollowDirection) {
    }

    public Boolean getIsBreakInfoValid() {
        return null;
    }

    public void setIsBreakInfoValid(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

