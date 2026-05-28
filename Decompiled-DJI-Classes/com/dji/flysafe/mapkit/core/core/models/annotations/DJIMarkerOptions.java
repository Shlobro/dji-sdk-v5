/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.PointF
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import android.graphics.PointF;
import com.dji.flysafe.mapkit.core.core.models.DJIBitmapDescriptor;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;

public class DJIMarkerOptions {
    private boolean mDraggable;
    private DJILatLng mPosition;
    private PointF mAnchor;
    private DJIBitmapDescriptor mIcon;
    private float mRotation;
    private int mZIndex;
    private boolean isCustomAnchor;
    private boolean mVisible;
    private String mTitle;
    private boolean mFlat;
    private boolean mInfoWindowEnable;

    public DJIMarkerOptions draggable(boolean bl) {
        return null;
    }

    public DJIMarkerOptions position(DJILatLng dJILatLng) {
        return null;
    }

    public DJIMarkerOptions anchor(float f2, float f3) {
        return null;
    }

    public DJIMarkerOptions icon(DJIBitmapDescriptor dJIBitmapDescriptor) {
        return null;
    }

    public DJIMarkerOptions rotation(float f2) {
        return null;
    }

    public DJIMarkerOptions zIndex(int n) {
        return null;
    }

    public DJIMarkerOptions visible(boolean bl) {
        return null;
    }

    public DJIMarkerOptions title(String string) {
        return null;
    }

    public DJIMarkerOptions flat(boolean bl) {
        return null;
    }

    public boolean getDraggable() {
        return false;
    }

    public DJILatLng getPosition() {
        return null;
    }

    public float getAnchorU() {
        return 0.0f;
    }

    public float getAnchorV() {
        return 0.0f;
    }

    public DJIBitmapDescriptor getIcon() {
        return null;
    }

    public float getRotation() {
        return 0.0f;
    }

    public int getZIndex() {
        return 0;
    }

    public boolean isCustomAnchor() {
        return false;
    }

    public boolean getVisible() {
        return false;
    }

    public String getTitle() {
        return null;
    }

    public boolean isFlat() {
        return false;
    }

    public boolean isInfoWindowEnable() {
        return false;
    }

    public DJIMarkerOptions setInfoWindowEnable(boolean bl) {
        return null;
    }
}

