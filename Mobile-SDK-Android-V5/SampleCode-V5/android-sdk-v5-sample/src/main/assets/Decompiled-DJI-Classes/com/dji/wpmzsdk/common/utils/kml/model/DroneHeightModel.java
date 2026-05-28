/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import java.util.Objects;

public class DroneHeightModel
implements Cloneable {
    private boolean useAbsolute;
    private boolean hasTakeoffHeight;
    private float takeoffHeight;
    private double takeoffLat;
    private double takeoffLng;
    private boolean aboveGroundMode;

    public boolean isUseAbsolute() {
        return this.useAbsolute;
    }

    public void setUseAbsolute(boolean useAbsolute) {
        this.useAbsolute = useAbsolute;
    }

    public boolean isHasTakeoffHeight() {
        return this.hasTakeoffHeight;
    }

    public void setHasTakeoffHeight(boolean hasTakeoffHeight) {
        this.hasTakeoffHeight = hasTakeoffHeight;
    }

    public float getTakeoffHeight() {
        return this.takeoffHeight;
    }

    public void setTakeoffHeight(float takeoffHeight) {
        this.takeoffHeight = takeoffHeight;
    }

    public double getTakeoffLat() {
        return this.takeoffLat;
    }

    public void setTakeoffLat(double takeoffLat) {
        this.takeoffLat = takeoffLat;
    }

    public double getTakeoffLng() {
        return this.takeoffLng;
    }

    public void setTakeoffLng(double takeoffLng) {
        this.takeoffLng = takeoffLng;
    }

    public boolean isAboveGroundMode() {
        return this.aboveGroundMode;
    }

    public void setAboveGroundMode(boolean aboveGroundMode) {
        this.aboveGroundMode = aboveGroundMode;
    }

    public DroneHeightModel clone() {
        try {
            return (DroneHeightModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DroneHeightModel that = (DroneHeightModel)o;
        return this.useAbsolute == that.useAbsolute && this.hasTakeoffHeight == that.hasTakeoffHeight && Float.compare(that.takeoffHeight, this.takeoffHeight) == 0 && Double.compare(that.takeoffLat, this.takeoffLat) == 0 && Double.compare(that.takeoffLng, this.takeoffLng) == 0;
    }

    public int hashCode() {
        return Objects.hash(this.useAbsolute, this.hasTakeoffHeight, Float.valueOf(this.takeoffHeight), this.takeoffLat, this.takeoffLng);
    }
}

