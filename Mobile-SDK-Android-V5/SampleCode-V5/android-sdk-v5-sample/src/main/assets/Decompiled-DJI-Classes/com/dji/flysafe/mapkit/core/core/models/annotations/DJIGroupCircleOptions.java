/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.ColorInt
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import androidx.annotation.ColorInt;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import java.util.List;

public class DJIGroupCircleOptions {
    private List<DJILatLng> centers;
    private List<Double> radius;
    private float strokeWidth;
    private int strokeColor;
    private int fillColor;
    private float alpha;
    private float zIndex;

    public DJIGroupCircleOptions centers(List<DJILatLng> list) {
        return null;
    }

    public DJIGroupCircleOptions radius(List<Double> list) {
        return null;
    }

    public DJIGroupCircleOptions ZIndex(float f2) {
        return null;
    }

    public DJIGroupCircleOptions strokeWidth(float f2) {
        return null;
    }

    public DJIGroupCircleOptions strokeColor(@ColorInt int n) {
        return null;
    }

    public DJIGroupCircleOptions fillColor(@ColorInt int n) {
        return null;
    }

    public DJIGroupCircleOptions alpha(float f2) {
        return null;
    }

    public List<DJILatLng> getCenters() {
        return null;
    }

    public List<Double> getRadius() {
        return null;
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

