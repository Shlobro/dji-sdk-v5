/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.intelligent.spotlight;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.value.common.DoubleRect;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.v5.manager.intelligent.TargetType;

@Keep
public class SpotLightTarget {
    private TargetType targetType;
    private LocationCoordinate3D targetLocation;
    private Integer targetIndex;
    private DoubleRect targetRect;

    public TargetType getTargetType() {
        return null;
    }

    public void setTargetType(TargetType targetType) {
    }

    public LocationCoordinate3D getTargetLocation() {
        return null;
    }

    public void setTargetLocation(LocationCoordinate3D locationCoordinate3D) {
    }

    public Integer getTargetIndex() {
        return null;
    }

    public void setTargetIndex(Integer n) {
    }

    public DoubleRect getTargetRect() {
        return null;
    }

    public void setTargetRect(DoubleRect doubleRect) {
    }
}

