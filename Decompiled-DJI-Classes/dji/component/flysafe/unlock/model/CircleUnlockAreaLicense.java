/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.unlock.model;

import androidx.annotation.Keep;
import dji.component.flysafe.unlock.model.WhiteListLicense;
import dji.csdk.flysafe.v3.License;

@Keep
public class CircleUnlockAreaLicense
extends WhiteListLicense {
    private float latitude;
    private float longitude;
    private float radius;
    private int limitedHeight;

    public CircleUnlockAreaLicense() {
    }

    public CircleUnlockAreaLicense(License license) {
    }

    public float getLatitude() {
        return 0.0f;
    }

    public void setLatitude(float f2) {
    }

    public float getLongitude() {
        return 0.0f;
    }

    public void setLongitude(float f2) {
    }

    public float getRadius() {
        return 0.0f;
    }

    public void setRadius(float f2) {
    }

    public int getLimitedHeight() {
        return 0;
    }

    public void setLimitedHeight(int n) {
    }
}

