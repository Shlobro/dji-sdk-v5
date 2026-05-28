/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent.flyto;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;

@Keep
public class FlyToTarget {
    private LocationCoordinate3D targetLocation;
    private int maxSpeed;
    private int securityTakeoffHeight;

    public int getMaxSpeed() {
        return 0;
    }

    public void setMaxSpeed(Integer n) {
    }

    public int getSecurityTakeoffHeight() {
        return 0;
    }

    public void setSecurityTakeoffHeight(Integer n) {
    }

    public LocationCoordinate3D getTargetLocation() {
        return null;
    }

    public void setTargetLocation(LocationCoordinate3D locationCoordinate3D) {
    }
}

