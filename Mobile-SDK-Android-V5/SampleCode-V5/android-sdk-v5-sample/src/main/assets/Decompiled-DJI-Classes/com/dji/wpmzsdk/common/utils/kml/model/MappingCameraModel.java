/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import android.os.Parcel;

public class MappingCameraModel
implements Cloneable {
    private Long id;
    private String name;
    private float focalLength;
    private float sensorWidth;
    private float sensorHeight;
    private int imageWidth;
    private int imageHeight;
    private float shotInterval;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getFocalLength() {
        return this.focalLength;
    }

    public void setFocalLength(float focalLength) {
        this.focalLength = focalLength;
    }

    public float getSensorWidth() {
        return this.sensorWidth;
    }

    public void setSensorWidth(float sensorWidth) {
        this.sensorWidth = sensorWidth;
    }

    public float getSensorHeight() {
        return this.sensorHeight;
    }

    public void setSensorHeight(float sensorHeight) {
        this.sensorHeight = sensorHeight;
    }

    public int getImageWidth() {
        return this.imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return this.imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public float getShotInterval() {
        return this.shotInterval;
    }

    public void setShotInterval(float shotInterval) {
        this.shotInterval = shotInterval;
    }

    public void updateValue(MappingCameraModel model) {
        this.id = model.id;
        this.name = model.name;
        this.focalLength = model.focalLength;
        this.sensorHeight = model.sensorHeight;
        this.sensorWidth = model.sensorWidth;
        this.imageHeight = model.imageHeight;
        this.imageWidth = model.imageWidth;
        this.shotInterval = model.shotInterval;
    }

    public boolean valueEquals(MappingCameraModel that) {
        if (that == null) {
            return false;
        }
        if (Float.compare(that.focalLength, this.focalLength) != 0) {
            return false;
        }
        if (Float.compare(that.sensorWidth, this.sensorWidth) != 0) {
            return false;
        }
        if (Float.compare(that.sensorHeight, this.sensorHeight) != 0) {
            return false;
        }
        if (this.imageWidth != that.imageWidth) {
            return false;
        }
        if (this.imageHeight != that.imageHeight) {
            return false;
        }
        if (Float.compare(that.shotInterval, this.shotInterval) != 0) {
            return false;
        }
        return this.name != null ? this.name.equals(that.name) : that.name == null;
    }

    public MappingCameraModel clone() {
        MappingCameraModel model;
        try {
            model = (MappingCameraModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            model = null;
        }
        return model;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        MappingCameraModel that = (MappingCameraModel)o;
        if (Float.compare(that.focalLength, this.focalLength) != 0) {
            return false;
        }
        if (Float.compare(that.sensorWidth, this.sensorWidth) != 0) {
            return false;
        }
        if (Float.compare(that.sensorHeight, this.sensorHeight) != 0) {
            return false;
        }
        if (this.imageWidth != that.imageWidth) {
            return false;
        }
        if (this.imageHeight != that.imageHeight) {
            return false;
        }
        if (Float.compare(that.shotInterval, this.shotInterval) != 0) {
            return false;
        }
        if (this.id != null ? !this.id.equals(that.id) : that.id != null) {
            return false;
        }
        return this.name != null ? this.name.equals(that.name) : that.name == null;
    }

    public int hashCode() {
        int result = this.id != null ? this.id.hashCode() : 0;
        result = 31 * result + (this.name != null ? this.name.hashCode() : 0);
        result = 31 * result + (this.focalLength != 0.0f ? Float.floatToIntBits(this.focalLength) : 0);
        result = 31 * result + (this.sensorWidth != 0.0f ? Float.floatToIntBits(this.sensorWidth) : 0);
        result = 31 * result + (this.sensorHeight != 0.0f ? Float.floatToIntBits(this.sensorHeight) : 0);
        result = 31 * result + this.imageWidth;
        result = 31 * result + this.imageHeight;
        result = 31 * result + (this.shotInterval != 0.0f ? Float.floatToIntBits(this.shotInterval) : 0);
        return result;
    }

    public MappingCameraModel() {
    }

    protected MappingCameraModel(Parcel in) {
        this.id = (Long)in.readValue(Long.class.getClassLoader());
        this.name = in.readString();
        this.focalLength = in.readFloat();
        this.sensorWidth = in.readFloat();
        this.sensorHeight = in.readFloat();
        this.imageWidth = in.readInt();
        this.imageHeight = in.readInt();
        this.shotInterval = in.readFloat();
    }
}

