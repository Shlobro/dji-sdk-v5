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
import dji.sdk.keyvalue.value.gimbal.JoystickControlSpeedMsg;
import org.json.JSONObject;

public class GimbalJoystickControlSpeedMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    JoystickControlSpeedMsg yaw;
    JoystickControlSpeedMsg roll;
    JoystickControlSpeedMsg pitch;

    public GimbalJoystickControlSpeedMsg() {
    }

    public GimbalJoystickControlSpeedMsg(JoystickControlSpeedMsg joystickControlSpeedMsg, JoystickControlSpeedMsg joystickControlSpeedMsg2, JoystickControlSpeedMsg joystickControlSpeedMsg3) {
    }

    public static GimbalJoystickControlSpeedMsg fromJson(String string) {
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

    public JoystickControlSpeedMsg getYaw() {
        return null;
    }

    public void setYaw(JoystickControlSpeedMsg joystickControlSpeedMsg) {
    }

    public JoystickControlSpeedMsg getRoll() {
        return null;
    }

    public void setRoll(JoystickControlSpeedMsg joystickControlSpeedMsg) {
    }

    public JoystickControlSpeedMsg getPitch() {
        return null;
    }

    public void setPitch(JoystickControlSpeedMsg joystickControlSpeedMsg) {
    }

    public String toString() {
        return null;
    }
}

