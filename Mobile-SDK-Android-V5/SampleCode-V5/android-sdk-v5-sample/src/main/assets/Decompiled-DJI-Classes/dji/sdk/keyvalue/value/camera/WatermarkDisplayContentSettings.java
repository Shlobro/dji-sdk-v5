/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.ControlLocation;
import dji.sdk.keyvalue.value.common.LengthUnit;
import dji.sdk.keyvalue.value.common.LonLatFormat;
import org.json.JSONObject;

public class WatermarkDisplayContentSettings
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean droneTypeEnabled;
    Boolean droneSnEnabled;
    Boolean cameraTypeEnabled;
    Boolean cameraSnEnabled;
    Boolean dateTimeEnabled;
    Boolean timeZoneEnabled;
    Boolean gpsLonLatEnabled;
    Boolean gpsAltitudeEnabled;
    Boolean userCustomStringEnabled;
    Boolean manufacturerEnabled;
    LengthUnit lengthUnit;
    LonLatFormat lonLatFormat;
    ControlLocation screenLocation;

    public WatermarkDisplayContentSettings() {
    }

    public WatermarkDisplayContentSettings(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, LengthUnit lengthUnit, LonLatFormat lonLatFormat, ControlLocation controlLocation) {
    }

    public static WatermarkDisplayContentSettings fromJson(String string) {
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

    public Boolean getDroneTypeEnabled() {
        return null;
    }

    public void setDroneTypeEnabled(Boolean bl) {
    }

    public Boolean getDroneSnEnabled() {
        return null;
    }

    public void setDroneSnEnabled(Boolean bl) {
    }

    public Boolean getCameraTypeEnabled() {
        return null;
    }

    public void setCameraTypeEnabled(Boolean bl) {
    }

    public Boolean getCameraSnEnabled() {
        return null;
    }

    public void setCameraSnEnabled(Boolean bl) {
    }

    public Boolean getDateTimeEnabled() {
        return null;
    }

    public void setDateTimeEnabled(Boolean bl) {
    }

    public Boolean getTimeZoneEnabled() {
        return null;
    }

    public void setTimeZoneEnabled(Boolean bl) {
    }

    public Boolean getGpsLonLatEnabled() {
        return null;
    }

    public void setGpsLonLatEnabled(Boolean bl) {
    }

    public Boolean getGpsAltitudeEnabled() {
        return null;
    }

    public void setGpsAltitudeEnabled(Boolean bl) {
    }

    public Boolean getUserCustomStringEnabled() {
        return null;
    }

    public void setUserCustomStringEnabled(Boolean bl) {
    }

    public Boolean getManufacturerEnabled() {
        return null;
    }

    public void setManufacturerEnabled(Boolean bl) {
    }

    public LengthUnit getLengthUnit() {
        return null;
    }

    public void setLengthUnit(LengthUnit lengthUnit) {
    }

    public LonLatFormat getLonLatFormat() {
        return null;
    }

    public void setLonLatFormat(LonLatFormat lonLatFormat) {
    }

    public ControlLocation getScreenLocation() {
        return null;
    }

    public void setScreenLocation(ControlLocation controlLocation) {
    }

    public String toString() {
        return null;
    }
}

