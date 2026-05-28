/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.mapkit.core.core.models.annotations;

import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import com.dji.flysafe.mapkit.core.core.models.annotations.DJIGroupCircleOptions;
import java.util.List;

public interface DJIGroupCircle {
    public void remove();

    public void setVisible(boolean var1);

    public boolean isVisible();

    public void setZIndex(float var1);

    public float getZIndex();

    public void setFillColor(int var1);

    public void setStrokeColor(int var1);

    public void setCircles(List<DJILatLng> var1, List<Double> var2);

    public DJIGroupCircleOptions getOptions();
}

