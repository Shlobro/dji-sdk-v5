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
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootPoint;
import dji.sdk.keyvalue.value.mission.WaylineActionAccurateShootSize;
import org.json.JSONObject;

public class WaylineActionAccurateShootPhotoTargetRect
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    WaylineActionAccurateShootPoint position;
    WaylineActionAccurateShootSize size;
    Double angle;

    public WaylineActionAccurateShootPhotoTargetRect() {
    }

    public WaylineActionAccurateShootPhotoTargetRect(WaylineActionAccurateShootPoint waylineActionAccurateShootPoint, WaylineActionAccurateShootSize waylineActionAccurateShootSize, Double d2) {
    }

    public static WaylineActionAccurateShootPhotoTargetRect fromJson(String string) {
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

    public WaylineActionAccurateShootPoint getPosition() {
        return null;
    }

    public void setPosition(WaylineActionAccurateShootPoint waylineActionAccurateShootPoint) {
    }

    public WaylineActionAccurateShootSize getSize() {
        return null;
    }

    public void setSize(WaylineActionAccurateShootSize waylineActionAccurateShootSize) {
    }

    public Double getAngle() {
        return null;
    }

    public void setAngle(Double d2) {
    }

    public String toString() {
        return null;
    }
}

