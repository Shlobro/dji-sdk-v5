/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 */
package com.dji.flysafe.mapkit.core.core.maps;

import android.graphics.Point;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;

public interface DJIProjection {
    public DJILatLng fromScreenLocation(Point var1);

    public Point toScreenLocation(DJILatLng var1);
}

