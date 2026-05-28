/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package com.dji.flysafe.midware.data.forbid.model;

import androidx.annotation.Keep;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Table;
import com.dji.flysafe.thirdparty.afinal.annotation.sqlite.Transient;
import java.util.List;

@Table(name="airmap_geofence_polygons")
@Keep
public class FlyfrbPolygonSubElement {
    public int id;
    public int area_id;
    public byte[] points;
    public int country;
    public long lat;
    public long lng;
    public int radius;
    public int shape;
    public int sub_area_id;
    public int height;
    public int area_level;
    public long start_at;
    public long end_at;
    @Transient
    private List<DJILatLng> mConvertedPoints;

    public double getLatWithFactor() {
        return 0.0;
    }

    public double getLngWithFactor() {
        return 0.0;
    }

    public List<DJILatLng> getConvertedPoints() {
        return null;
    }

    private void convertPoints() {
    }
}

