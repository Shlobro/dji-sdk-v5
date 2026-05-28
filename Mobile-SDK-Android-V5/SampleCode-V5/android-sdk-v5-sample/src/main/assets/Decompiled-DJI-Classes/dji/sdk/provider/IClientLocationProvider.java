/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.provider;

import dji.sdk.keyvalue.value.common.LocationCoordinate3D;

public interface IClientLocationProvider {
    public LocationCoordinate3D currentLocation();
}

