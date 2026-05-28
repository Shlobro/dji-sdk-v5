/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class FiveDimensionPressedStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean rightwards;
    Boolean leftwards;
    Boolean middlePressed;
    Boolean downwards;
    Boolean upwards;

    public FiveDimensionPressedStatus() {
    }

    public FiveDimensionPressedStatus(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5) {
    }

    public static FiveDimensionPressedStatus fromJson(String string) {
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

    public Boolean getRightwards() {
        return null;
    }

    public void setRightwards(Boolean bl) {
    }

    public Boolean getLeftwards() {
        return null;
    }

    public void setLeftwards(Boolean bl) {
    }

    public Boolean getMiddlePressed() {
        return null;
    }

    public void setMiddlePressed(Boolean bl) {
    }

    public Boolean getDownwards() {
        return null;
    }

    public void setDownwards(Boolean bl) {
    }

    public Boolean getUpwards() {
        return null;
    }

    public void setUpwards(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

