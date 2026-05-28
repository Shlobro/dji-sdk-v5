/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.ObstacleAvoidanceState;
import org.json.JSONObject;

public class ObstacleAvoidanceStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ObstacleAvoidanceState frontState;
    ObstacleAvoidanceState leftState;
    ObstacleAvoidanceState backState;
    ObstacleAvoidanceState rightState;
    ObstacleAvoidanceState upState;
    ObstacleAvoidanceState downState;

    public ObstacleAvoidanceStateMsg() {
    }

    public ObstacleAvoidanceStateMsg(ObstacleAvoidanceState obstacleAvoidanceState, ObstacleAvoidanceState obstacleAvoidanceState2, ObstacleAvoidanceState obstacleAvoidanceState3, ObstacleAvoidanceState obstacleAvoidanceState4, ObstacleAvoidanceState obstacleAvoidanceState5, ObstacleAvoidanceState obstacleAvoidanceState6) {
    }

    public static ObstacleAvoidanceStateMsg fromJson(String string) {
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

    public ObstacleAvoidanceState getFrontState() {
        return null;
    }

    public void setFrontState(ObstacleAvoidanceState obstacleAvoidanceState) {
    }

    public ObstacleAvoidanceState getLeftState() {
        return null;
    }

    public void setLeftState(ObstacleAvoidanceState obstacleAvoidanceState) {
    }

    public ObstacleAvoidanceState getBackState() {
        return null;
    }

    public void setBackState(ObstacleAvoidanceState obstacleAvoidanceState) {
    }

    public ObstacleAvoidanceState getRightState() {
        return null;
    }

    public void setRightState(ObstacleAvoidanceState obstacleAvoidanceState) {
    }

    public ObstacleAvoidanceState getUpState() {
        return null;
    }

    public void setUpState(ObstacleAvoidanceState obstacleAvoidanceState) {
    }

    public ObstacleAvoidanceState getDownState() {
        return null;
    }

    public void setDownState(ObstacleAvoidanceState obstacleAvoidanceState) {
    }

    public String toString() {
        return null;
    }
}

