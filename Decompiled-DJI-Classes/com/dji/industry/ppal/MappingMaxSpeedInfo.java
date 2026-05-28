/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.ppal;

public class MappingMaxSpeedInfo {
    private float orthoMaxSpeed;
    private float inclinedMaxSpeed;

    public MappingMaxSpeedInfo(float orthoMaxSpeed, float inclinedMaxSpeed) {
        this.orthoMaxSpeed = orthoMaxSpeed;
        this.inclinedMaxSpeed = inclinedMaxSpeed;
    }

    public float getOrthoMaxSpeed() {
        return this.orthoMaxSpeed;
    }

    public void setOrthoMaxSpeed(float orthoMaxSpeed) {
        this.orthoMaxSpeed = orthoMaxSpeed;
    }

    public float getInclinedMaxSpeed() {
        return this.inclinedMaxSpeed;
    }

    public void setInclinedMaxSpeed(float inclinedMaxSpeed) {
        this.inclinedMaxSpeed = inclinedMaxSpeed;
    }
}

