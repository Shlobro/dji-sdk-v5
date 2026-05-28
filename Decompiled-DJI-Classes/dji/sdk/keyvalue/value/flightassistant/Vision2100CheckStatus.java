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
import org.json.JSONObject;

public class Vision2100CheckStatus
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean downLeftSensorException;
    Boolean downRightSensorException;
    Boolean frontLeftSensorException;
    Boolean frontRightSensorException;
    Boolean bottomTofSensorException;
    Boolean topTofSensorException;
    Boolean backLeftSensorException;
    Boolean backRightSensorException;
    Boolean left3DTofSensorException;
    Boolean right3DTofSensorException;
    Boolean downCalibrationException;
    Boolean frontCalibrationException;
    Boolean backCalibrationException;
    Boolean storageException;
    Boolean usb1860Exception;
    Boolean mCException;
    Boolean ultrasoundException;
    Boolean innerException;
    Boolean autoExploreException;
    Boolean depthImageException;
    Boolean voException;
    Boolean avoidException;
    Boolean cpldConnectException;
    Boolean uartMCException;
    Boolean lrtException;
    Boolean hasPropellerGuard;
    Boolean needCalibrationByPC;
    Boolean flightCountNeedCalibration;

    public Vision2100CheckStatus() {
    }

    public Vision2100CheckStatus(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11, Boolean bl12, Boolean bl13, Boolean bl14, Boolean bl15, Boolean bl16, Boolean bl17, Boolean bl18, Boolean bl19, Boolean bl20, Boolean bl21, Boolean bl22, Boolean bl23, Boolean bl24, Boolean bl25, Boolean bl26, Boolean bl27, Boolean bl28) {
    }

    public static Vision2100CheckStatus fromJson(String string) {
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

    public Boolean getDownLeftSensorException() {
        return null;
    }

    public void setDownLeftSensorException(Boolean bl) {
    }

    public Boolean getDownRightSensorException() {
        return null;
    }

    public void setDownRightSensorException(Boolean bl) {
    }

    public Boolean getFrontLeftSensorException() {
        return null;
    }

    public void setFrontLeftSensorException(Boolean bl) {
    }

    public Boolean getFrontRightSensorException() {
        return null;
    }

    public void setFrontRightSensorException(Boolean bl) {
    }

    public Boolean getBottomTofSensorException() {
        return null;
    }

    public void setBottomTofSensorException(Boolean bl) {
    }

    public Boolean getTopTofSensorException() {
        return null;
    }

    public void setTopTofSensorException(Boolean bl) {
    }

    public Boolean getBackLeftSensorException() {
        return null;
    }

    public void setBackLeftSensorException(Boolean bl) {
    }

    public Boolean getBackRightSensorException() {
        return null;
    }

    public void setBackRightSensorException(Boolean bl) {
    }

    public Boolean getLeft3DTofSensorException() {
        return null;
    }

    public void setLeft3DTofSensorException(Boolean bl) {
    }

    public Boolean getRight3DTofSensorException() {
        return null;
    }

    public void setRight3DTofSensorException(Boolean bl) {
    }

    public Boolean getDownCalibrationException() {
        return null;
    }

    public void setDownCalibrationException(Boolean bl) {
    }

    public Boolean getFrontCalibrationException() {
        return null;
    }

    public void setFrontCalibrationException(Boolean bl) {
    }

    public Boolean getBackCalibrationException() {
        return null;
    }

    public void setBackCalibrationException(Boolean bl) {
    }

    public Boolean getStorageException() {
        return null;
    }

    public void setStorageException(Boolean bl) {
    }

    public Boolean getUsb1860Exception() {
        return null;
    }

    public void setUsb1860Exception(Boolean bl) {
    }

    public Boolean getMCException() {
        return null;
    }

    public void setMCException(Boolean bl) {
    }

    public Boolean getUltrasoundException() {
        return null;
    }

    public void setUltrasoundException(Boolean bl) {
    }

    public Boolean getInnerException() {
        return null;
    }

    public void setInnerException(Boolean bl) {
    }

    public Boolean getAutoExploreException() {
        return null;
    }

    public void setAutoExploreException(Boolean bl) {
    }

    public Boolean getDepthImageException() {
        return null;
    }

    public void setDepthImageException(Boolean bl) {
    }

    public Boolean getVoException() {
        return null;
    }

    public void setVoException(Boolean bl) {
    }

    public Boolean getAvoidException() {
        return null;
    }

    public void setAvoidException(Boolean bl) {
    }

    public Boolean getCpldConnectException() {
        return null;
    }

    public void setCpldConnectException(Boolean bl) {
    }

    public Boolean getUartMCException() {
        return null;
    }

    public void setUartMCException(Boolean bl) {
    }

    public Boolean getLrtException() {
        return null;
    }

    public void setLrtException(Boolean bl) {
    }

    public Boolean getHasPropellerGuard() {
        return null;
    }

    public void setHasPropellerGuard(Boolean bl) {
    }

    public Boolean getNeedCalibrationByPC() {
        return null;
    }

    public void setNeedCalibrationByPC(Boolean bl) {
    }

    public Boolean getFlightCountNeedCalibration() {
        return null;
    }

    public void setFlightCountNeedCalibration(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

