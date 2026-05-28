/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.ColorInt
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import androidx.annotation.ColorInt;
import com.dji.flysafe.mapkit.core.core.models.BasePointCollection;
import com.dji.flysafe.mapkit.core.core.models.DJIBitmapDescriptor;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import java.util.List;

public class DJIPolylineOptions
extends BasePointCollection {
    private static final String TAG = "DJIPolylineOptions";
    private static final float DASH_LENGTH = 3.0f;
    private float mWidth;
    private float mZIndex;
    @ColorInt
    private int mColor;
    private boolean mClickable;
    private boolean mGeodesic;
    private boolean mVisible;
    private DJIBitmapDescriptor mBitmapDescriptor;
    private float mDashLength;
    private boolean mDashed;

    public DJIPolylineOptions width(float f2) {
        return null;
    }

    public DJIPolylineOptions ZIndex(float f2) {
        return null;
    }

    public DJIPolylineOptions color(@ColorInt int n) {
        return null;
    }

    public DJIPolylineOptions clickable(boolean bl) {
        return null;
    }

    public DJIPolylineOptions geodesic(boolean bl) {
        return null;
    }

    public DJIPolylineOptions visible(boolean bl) {
        return null;
    }

    public DJIPolylineOptions setTexture(DJIBitmapDescriptor dJIBitmapDescriptor) {
        return null;
    }

    public DJIPolylineOptions setDashed(boolean bl) {
        return null;
    }

    public DJIPolylineOptions setDashLength(float f2) {
        return null;
    }

    public float getWidth() {
        return 0.0f;
    }

    public float getZIndex() {
        return 0.0f;
    }

    @ColorInt
    public int getColor() {
        return 0;
    }

    public boolean isClickable() {
        return false;
    }

    public boolean isGeodesic() {
        return false;
    }

    public boolean isVisible() {
        return false;
    }

    public boolean isDashed() {
        return false;
    }

    public float getDashLength() {
        return 0.0f;
    }

    public DJIBitmapDescriptor getTexture() {
        return null;
    }

    public DJIPolylineOptions add(DJILatLng dJILatLng) {
        return null;
    }

    public DJIPolylineOptions add(DJILatLng ... dJILatLngArray) {
        return null;
    }

    public DJIPolylineOptions addAll(List<DJILatLng> list) {
        return null;
    }
}

