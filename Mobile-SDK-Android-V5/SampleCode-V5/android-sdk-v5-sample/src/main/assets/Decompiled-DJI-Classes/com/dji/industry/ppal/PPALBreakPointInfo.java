/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.ppal;

public class PPALBreakPointInfo {
    private double longitude;
    private double latitude;
    private float altitude;
    private float percent;
    private float distance;
    private int waypointIndex;
    private float waypointPercent;
    private float length;
    private float duration;
    private float remainLength;
    private float remainDuration;
    private int photoNum;
    private int remainNum;
    private int waypointNum;

    public PPALBreakPointInfo(double longitude, double latitude, float altitude, float percent, float distance, int waypointIndex, float waypointPercent, float length, float duration, float remainLength, float remainDuration, int photoNum, int remainNum, int waypointNum) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.percent = percent;
        this.distance = distance;
        this.waypointIndex = waypointIndex;
        this.waypointPercent = waypointPercent;
        this.length = length;
        this.duration = duration;
        this.remainLength = remainLength;
        this.remainDuration = remainDuration;
        this.photoNum = photoNum;
        this.remainNum = remainNum;
        this.waypointNum = waypointNum;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public float getAltitude() {
        return this.altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    public float getPercent() {
        return this.percent;
    }

    public void setPercent(float percent) {
        this.percent = percent;
    }

    public float getDistance() {
        return this.distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public int getWaypointIndex() {
        return this.waypointIndex;
    }

    public void setWaypointIndex(int waypointIndex) {
        this.waypointIndex = waypointIndex;
    }

    public float getWaypointPercent() {
        return this.waypointPercent;
    }

    public void setWaypointPercent(float waypointPercent) {
        this.waypointPercent = waypointPercent;
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

    public float getRemainLength() {
        return this.remainLength;
    }

    public void setRemainLength(float remainLength) {
        this.remainLength = remainLength;
    }

    public float getRemainDuration() {
        return this.remainDuration;
    }

    public void setRemainDuration(float remainDuration) {
        this.remainDuration = remainDuration;
    }

    public int getPhotoNum() {
        return this.photoNum;
    }

    public void setPhotoNum(int photoNum) {
        this.photoNum = photoNum;
    }

    public int getRemainNum() {
        return this.remainNum;
    }

    public void setRemainNum(int remainNum) {
        this.remainNum = remainNum;
    }

    public int getWaypointNum() {
        return this.waypointNum;
    }

    public void setWaypointNum(int waypointNum) {
        this.waypointNum = waypointNum;
    }
}

