/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  org.json.JSONObject
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import android.os.Parcel;
import java.util.Objects;
import org.json.JSONObject;

public class LocationCoordinate3D {
    Double latitude = 0.0;
    Double longitude = 0.0;
    Double altitude = 0.0;

    public LocationCoordinate3D() {
    }

    public LocationCoordinate3D(Double latitude, Double longitude, Double altitude) {
        if (latitude != null) {
            this.latitude = latitude;
        }
        if (longitude != null) {
            this.longitude = longitude;
        }
        if (altitude != null) {
            this.altitude = altitude;
        }
    }

    public static LocationCoordinate3D fromJson(String jsonString) {
        LocationCoordinate3D tmpValueResult_ = new LocationCoordinate3D();
        JSONObject jsonObj = null;
        try {
            jsonObj = new JSONObject(jsonString);
            tmpValueResult_.latitude = jsonObj.getDouble("latitude");
            tmpValueResult_.longitude = jsonObj.getDouble("longitude");
            tmpValueResult_.altitude = jsonObj.getDouble("altitude");
        }
        catch (Exception e) {
            tmpValueResult_ = null;
        }
        return tmpValueResult_;
    }

    public JSONObject toJson() {
        JSONObject json = null;
        try {
            json = new JSONObject();
            if (null != this.latitude) {
                json.put("latitude", (Object)this.latitude);
            }
            if (null != this.longitude) {
                json.put("longitude", (Object)this.longitude);
            }
            if (null != this.altitude) {
                json.put("altitude", (Object)this.altitude);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return json;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAltitude() {
        return this.altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public String toString() {
        JSONObject json = this.toJson();
        return json != null ? json.toString() : "";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || !(o instanceof LocationCoordinate3D)) {
            return false;
        }
        LocationCoordinate3D that = (LocationCoordinate3D)o;
        return Objects.equals(this.latitude, that.latitude) && Objects.equals(this.longitude, that.longitude) && Objects.equals(this.altitude, that.altitude);
    }

    public int hashCode() {
        return Objects.hash(this.latitude, this.longitude, this.altitude);
    }

    public int describeContents() {
        return 0;
    }

    protected LocationCoordinate3D(Parcel in) {
        this.latitude = in.readDouble();
        this.longitude = in.readDouble();
        this.altitude = in.readDouble();
    }
}

