/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.model.Mapping2DWaylineModel;

public class Mapping3DWaylineModel
extends Mapping2DWaylineModel {
    private float inclineSpeed;
    private int gimbalPitch;
    private int inclineOverlapH;
    private int inclineOverlapW;

    public float getInclineSpeed() {
        return this.inclineSpeed;
    }

    public void setInclineSpeed(float inclineSpeed) {
        this.inclineSpeed = inclineSpeed;
    }

    public int getGimbalPitch() {
        return this.gimbalPitch;
    }

    public void setGimbalPitch(int gimbalPitch) {
        this.gimbalPitch = gimbalPitch;
    }

    public int getInclineOverlapH() {
        return this.inclineOverlapH;
    }

    public void setInclineOverlapH(int inclineOverlapH) {
        this.inclineOverlapH = inclineOverlapH;
    }

    public int getInclineOverlapW() {
        return this.inclineOverlapW;
    }

    public void setInclineOverlapW(int inclineOverlapW) {
        this.inclineOverlapW = inclineOverlapW;
    }

    @Override
    public Mapping3DWaylineModel clone() {
        return (Mapping3DWaylineModel)super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Mapping3DWaylineModel that = (Mapping3DWaylineModel)o;
        if (Float.compare(that.inclineSpeed, this.inclineSpeed) != 0) {
            return false;
        }
        if (this.gimbalPitch != that.gimbalPitch) {
            return false;
        }
        if (this.inclineOverlapH != that.inclineOverlapH) {
            return false;
        }
        return this.inclineOverlapW == that.inclineOverlapW;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (this.inclineSpeed != 0.0f ? Float.floatToIntBits(this.inclineSpeed) : 0);
        result = 31 * result + this.gimbalPitch;
        result = 31 * result + this.inclineOverlapH;
        result = 31 * result + this.inclineOverlapW;
        return result;
    }
}

