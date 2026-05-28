/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

public class EdgePointModel
implements Cloneable {
    private Long id;
    private double latitude;
    private double longitude;
    private int index;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        EdgePointModel that = (EdgePointModel)o;
        if (Double.compare(that.latitude, this.latitude) != 0) {
            return false;
        }
        if (Double.compare(that.longitude, this.longitude) != 0) {
            return false;
        }
        if (this.index != that.index) {
            return false;
        }
        return this.id != null ? this.id.equals(that.id) : that.id == null;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        long temp = Double.doubleToLongBits(this.latitude);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        temp = Double.doubleToLongBits(this.longitude);
        result = 31 * result + (int)(temp ^ temp >>> 32);
        result = 31 * result + this.index;
        return result;
    }

    public EdgePointModel clone() {
        EdgePointModel model;
        try {
            model = (EdgePointModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            model = null;
        }
        return model;
    }

    public EdgePointModel() {
    }

    public EdgePointModel(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

