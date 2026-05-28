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
import org.json.JSONObject;

public class GimbalSelfCheckFlags
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean gyroscopeException;
    Boolean startupException;
    Boolean yawElectronSpeedRegulatorException;
    Boolean rollElectronSpeedRegulatorException;
    Boolean pitchElectronSpeedRegulatorException;
    Boolean swingTooLarge;
    Boolean attitudeException;
    Boolean zeroPositionNotSet;
    Boolean paramterException;
    Boolean freefallProtect;
    Boolean loadTighteningInstallationState;

    public GimbalSelfCheckFlags() {
    }

    public GimbalSelfCheckFlags(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11) {
    }

    public static GimbalSelfCheckFlags fromJson(String string) {
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

    public Boolean getGyroscopeException() {
        return null;
    }

    public void setGyroscopeException(Boolean bl) {
    }

    public Boolean getStartupException() {
        return null;
    }

    public void setStartupException(Boolean bl) {
    }

    public Boolean getYawElectronSpeedRegulatorException() {
        return null;
    }

    public void setYawElectronSpeedRegulatorException(Boolean bl) {
    }

    public Boolean getRollElectronSpeedRegulatorException() {
        return null;
    }

    public void setRollElectronSpeedRegulatorException(Boolean bl) {
    }

    public Boolean getPitchElectronSpeedRegulatorException() {
        return null;
    }

    public void setPitchElectronSpeedRegulatorException(Boolean bl) {
    }

    public Boolean getSwingTooLarge() {
        return null;
    }

    public void setSwingTooLarge(Boolean bl) {
    }

    public Boolean getAttitudeException() {
        return null;
    }

    public void setAttitudeException(Boolean bl) {
    }

    public Boolean getZeroPositionNotSet() {
        return null;
    }

    public void setZeroPositionNotSet(Boolean bl) {
    }

    public Boolean getParamterException() {
        return null;
    }

    public void setParamterException(Boolean bl) {
    }

    public Boolean getFreefallProtect() {
        return null;
    }

    public void setFreefallProtect(Boolean bl) {
    }

    public Boolean getLoadTighteningInstallationState() {
        return null;
    }

    public void setLoadTighteningInstallationState(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

