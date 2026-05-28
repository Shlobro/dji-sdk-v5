/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.Location2D;

public class Location3D
extends Location2D {
    private float altitude;

    public Location3D(double latitude, double longitude, float altitude) {
        super(latitude, longitude);
        this.altitude = altitude;
    }

    public Location3D(double latitude, double longitude) {
        super(latitude, longitude);
    }

    public float getAltitude() {
        return this.altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    @Override
    public String toString() {
        return super.toString() + " Location3D{altitude=" + this.altitude + '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj) && obj instanceof Location3D && Float.floatToIntBits(this.altitude) == Float.floatToIntBits(((Location3D)obj).altitude);
    }

    public boolean isChanged(double lat, double lng, float alt) {
        return Math.abs(this.latitude - lat) >= 1.0E-6 || Math.abs(this.longitude - lng) >= 1.0E-6 || (double)Math.abs(this.altitude - alt) >= 0.1;
    }
}

