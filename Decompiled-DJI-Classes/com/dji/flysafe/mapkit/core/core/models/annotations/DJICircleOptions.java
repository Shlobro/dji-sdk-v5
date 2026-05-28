/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.ColorInt
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import androidx.annotation.ColorInt;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;

public class DJICircleOptions {
    private DJILatLng center;
    private double radius;
    private float strokeWidth;
    @ColorInt
    private int strokeColor;
    @ColorInt
    private int fillColor;
    private float alpha;
    private float zIndex;

    public DJICircleOptions center(DJILatLng dJILatLng) {
        return null;
    }

    public DJICircleOptions radius(double d2) {
        return null;
    }

    public DJICircleOptions ZIndex(float f2) {
        return null;
    }

    public DJICircleOptions strokeWidth(float f2) {
        return null;
    }

    public DJICircleOptions strokeColor(@ColorInt int n) {
        return null;
    }

    public DJICircleOptions fillColor(@ColorInt int n) {
        return null;
    }

    public DJICircleOptions alpha(float f2) {
        return null;
    }

    public DJILatLng getCenter() {
        return null;
    }

    public double getRadius() {
        return 0.0;
    }

    public float getStrokeWidth() {
        return 0.0f;
    }

    @ColorInt
    public int getStrokeColor() {
        return 0;
    }

    @ColorInt
    public int getFillColor() {
        return 0;
    }

    public float getAlpha() {
        return 0.0f;
    }

    public float getZIndex() {
        return 0.0f;
    }
}

