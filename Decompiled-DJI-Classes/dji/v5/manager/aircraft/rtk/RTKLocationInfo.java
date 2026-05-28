/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.manager.aircraft.rtk;

import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKHeading;
import dji.sdk.keyvalue.value.rtkmobilestation.RTKLocation;
import org.jetbrains.annotations.Nullable;

public class RTKLocationInfo {
    @Nullable
    private RTKLocation rtkLocation;
    @Nullable
    private RTKHeading rtkHeading;
    @Nullable
    private Double realHeading;
    @Nullable
    private LocationCoordinate3D real3DLocation;

    public RTKLocation getRtkLocation() {
        return null;
    }

    public RTKHeading getRtkHeading() {
        return null;
    }

    public Double getRealHeading() {
        return null;
    }

    public LocationCoordinate3D getReal3DLocation() {
        return null;
    }

    public String toString() {
        return null;
    }
}

