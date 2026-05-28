/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import com.dji.flysafe.mapkit.core.core.models.DJILatLng;

public abstract class DJICircle {
    protected DJILatLng positionCache;

    public abstract void remove();

    public abstract void setVisible(boolean var1);

    public abstract boolean isVisible();

    public DJILatLng getCenter() {
        return null;
    }

    public abstract void setFillColor(int var1);

    public abstract void setStrokeColor(int var1);

    public void setCircle(DJILatLng dJILatLng, Double d2) {
    }

    public void setCenter(DJILatLng dJILatLng) {
    }
}

