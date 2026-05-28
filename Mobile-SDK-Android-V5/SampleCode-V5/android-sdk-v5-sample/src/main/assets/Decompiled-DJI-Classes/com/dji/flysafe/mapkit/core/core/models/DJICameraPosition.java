/*
 * Decompiled with CFR 0.152.
 */
package com.dji.flysafe.mapkit.core.core.models;

import com.dji.flysafe.mapkit.core.core.models.DJILatLng;

public class DJICameraPosition {
    public final DJILatLng target;
    public final float zoom;
    public final float tilt;
    public final float bearing;

    private DJICameraPosition() {
    }

    public DJICameraPosition(DJILatLng dJILatLng, float f2, float f3, float f4) {
    }

    public DJICameraPosition(DJILatLng dJILatLng, float f2) {
    }

    public DJILatLng getPosition() {
        return null;
    }

    public float getZoom() {
        return 0.0f;
    }

    public float getTilt() {
        return 0.0f;
    }

    public float getBearing() {
        return 0.0f;
    }

    public static final DJICameraPosition fromLatLngZoom(DJILatLng dJILatLng, float f2) {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(Object object) {
        return false;
    }

    public String toString() {
        return null;
    }

    public static Builder builder(DJICameraPosition dJICameraPosition) {
        return null;
    }

    public static final class Builder {
        private DJILatLng target;
        private float zoom;
        private float tilt;
        private float bearing;

        public Builder() {
        }

        public Builder(DJICameraPosition dJICameraPosition) {
        }

        public Builder target(DJILatLng dJILatLng) {
            return null;
        }

        public Builder zoom(float f2) {
            return null;
        }

        public Builder tilt(float f2) {
            return null;
        }

        public Builder bearing(float f2) {
            return null;
        }

        public DJICameraPosition build() {
            return null;
        }
    }
}

