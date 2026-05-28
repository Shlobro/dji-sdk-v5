/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.ColorInt
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import androidx.annotation.ColorInt;
import com.dji.flysafe.mapkit.core.core.models.BasePointCollection;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import java.util.List;

public class DJIPolygonOptions
extends BasePointCollection {
    private static final String TAG = "DJIPolygonOptions";
    private float mWidth;
    private float mZIndex;
    @ColorInt
    private int mStrokeColor;
    @ColorInt
    private int mFillColor;
    private boolean mVisible;

    public DJIPolygonOptions strokeWidth(float f2) {
        return null;
    }

    public DJIPolygonOptions ZIndex(float f2) {
        return null;
    }

    public DJIPolygonOptions strokeColor(@ColorInt int n) {
        return null;
    }

    public DJIPolygonOptions fillColor(@ColorInt int n) {
        return null;
    }

    public float getStrokeWidth() {
        return 0.0f;
    }

    public float getZIndex() {
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

    public boolean isVisible() {
        return false;
    }

    public DJIPolygonOptions add(DJILatLng dJILatLng) {
        return null;
    }

    public DJIPolygonOptions add(DJILatLng ... dJILatLngArray) {
        return null;
    }

    public DJIPolygonOptions addAll(List<DJILatLng> list) {
        return null;
    }
}

