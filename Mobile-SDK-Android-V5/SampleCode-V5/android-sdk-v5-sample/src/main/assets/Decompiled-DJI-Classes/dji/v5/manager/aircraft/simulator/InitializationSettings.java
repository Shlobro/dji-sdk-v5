/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.IntRange
 */
package dji.v5.manager.aircraft.simulator;

import androidx.annotation.IntRange;
import dji.sdk.keyvalue.value.common.LocationCoordinate2D;

public final class InitializationSettings {
    private LocationCoordinate2D location;
    private int satelliteCount;

    private InitializationSettings(LocationCoordinate2D locationCoordinate2D, int n) {
    }

    public static InitializationSettings createInstance(LocationCoordinate2D locationCoordinate2D, @IntRange(from=0L, to=20L) int n) {
        return null;
    }

    public LocationCoordinate2D getLocation() {
        return null;
    }

    public void setLocation(LocationCoordinate2D locationCoordinate2D) {
    }

    public int getSatelliteCount() {
        return 0;
    }

    public void setSatelliteCount(int n) {
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }
}

