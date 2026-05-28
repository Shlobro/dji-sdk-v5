/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package com.dji.flysafe.mapkit.core.core.camera;

import androidx.annotation.NonNull;
import com.dji.flysafe.mapkit.core.core.maps.DJIMap;
import com.dji.flysafe.mapkit.core.core.models.DJICameraPosition;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;

public interface DJICameraUpdate {
    public DJICameraPosition getCameraPosition(@NonNull DJIMap var1);

    public DJILatLng getTarget();

    public float getZoom();

    public float getTilt();

    public float getBearing();
}

