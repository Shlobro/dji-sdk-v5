/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.ppal;

import java.util.List;

public class StripAreaInfo {
    private List<byte[]> waylines;
    private double maxLeftExtend;
    private double maxRightExtend;
    private byte[] leftLimitPoint;
    private byte[] rightLimitPoint;

    public StripAreaInfo(List<byte[]> waylines, double maxLeftExtend, double maxRightExtend, byte[] leftLimitPoint, byte[] rightLimitPoint) {
        this.waylines = waylines;
        this.maxLeftExtend = maxLeftExtend;
        this.maxRightExtend = maxRightExtend;
        this.leftLimitPoint = leftLimitPoint;
        this.rightLimitPoint = rightLimitPoint;
    }

    public List<byte[]> getWaylines() {
        return this.waylines;
    }

    public void setWaylines(List<byte[]> waylines) {
        this.waylines = waylines;
    }

    public double getMaxLeftExtend() {
        return this.maxLeftExtend;
    }

    public void setMaxLeftExtend(double maxLeftExtend) {
        this.maxLeftExtend = maxLeftExtend;
    }

    public double getMaxRightExtend() {
        return this.maxRightExtend;
    }

    public void setMaxRightExtend(double maxRightExtend) {
        this.maxRightExtend = maxRightExtend;
    }

    public byte[] getLeftLimitPoint() {
        return this.leftLimitPoint;
    }

    public void setLeftLimitPoint(byte[] leftLimitPoint) {
        this.leftLimitPoint = leftLimitPoint;
    }

    public byte[] getRightLimitPoint() {
        return this.rightLimitPoint;
    }

    public void setRightLimitPoint(byte[] rightLimitPoint) {
        this.rightLimitPoint = rightLimitPoint;
    }
}

