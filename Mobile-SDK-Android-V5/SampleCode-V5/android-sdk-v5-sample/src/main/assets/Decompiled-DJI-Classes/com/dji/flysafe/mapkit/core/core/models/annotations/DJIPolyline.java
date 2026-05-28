/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import java.util.List;

public interface DJIPolyline {
    public void remove();

    public void setWidth(float var1);

    public void setPoints(List<DJILatLng> var1);

    public void setColor(int var1);
}

