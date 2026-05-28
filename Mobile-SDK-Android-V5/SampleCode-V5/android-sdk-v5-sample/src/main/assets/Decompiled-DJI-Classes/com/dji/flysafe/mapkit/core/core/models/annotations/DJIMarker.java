/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import com.dji.flysafe.mapkit.core.core.models.DJIBitmapDescriptor;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIMarkerOptions;

public abstract class DJIMarker {
    protected DJILatLng positionCache;
    private float rotationCache;
    private Object object;
    private DJIMarkerOptions options;

    public void setPosition(DJILatLng dJILatLng) {
    }

    public void setPositionCache(DJILatLng dJILatLng) {
    }

    public void setRotationCache(float f2) {
    }

    public abstract void setRotation(float var1);

    public float getRotation() {
        return 0.0f;
    }

    public abstract void setIcon(DJIBitmapDescriptor var1);

    public abstract void setAnchor(float var1, float var2);

    public DJILatLng getPosition() {
        return null;
    }

    public abstract void setTitle(String var1);

    public abstract String getTitle();

    public abstract void setVisible(boolean var1);

    public abstract boolean isVisible();

    public abstract void showInfoWindow();

    public abstract void hideInfoWindow();

    public abstract boolean isInfoWindowShown();

    public abstract void remove();

    public void setTag(Object object) {
    }

    public Object getTag() {
        return null;
    }

    public abstract void setDraggable(boolean var1);

    public abstract boolean isDraggable();
}

