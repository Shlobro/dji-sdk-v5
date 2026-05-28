/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.ppal;

public class WaypointInfo {
    private float length;
    private float duration;
    private float area;
    private int pointNum;
    private int photoNum;

    public WaypointInfo() {
    }

    public WaypointInfo(float length, float duration, float area, int pointNum, int photoNum) {
        this.length = length;
        this.duration = duration;
        this.area = area;
        this.pointNum = pointNum;
        this.photoNum = photoNum;
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getDuration() {
        return this.duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getArea() {
        return this.area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public int getPointNum() {
        return this.pointNum;
    }

    public void setPointNum(int pointNum) {
        this.pointNum = pointNum;
    }

    public int getPhotoNum() {
        return this.photoNum;
    }

    public void setPhotoNum(int photoNum) {
        this.photoNum = photoNum;
    }
}

