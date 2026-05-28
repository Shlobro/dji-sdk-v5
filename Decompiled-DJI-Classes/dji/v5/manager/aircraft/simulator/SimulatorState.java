/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.simulator;

import dji.sdk.keyvalue.value.common.LocationCoordinate2D;

public class SimulatorState {
    private final boolean areMotorsOn;
    private final boolean isFlying;
    private final float pitch;
    private final float roll;
    private final float yaw;
    private final float positionX;
    private final float positionY;
    private final float positionZ;
    private final LocationCoordinate2D location;

    private SimulatorState(Builder builder) {
    }

    public boolean areMotorsOn() {
        return false;
    }

    public boolean isFlying() {
        return false;
    }

    public float getPitch() {
        return 0.0f;
    }

    public float getRoll() {
        return 0.0f;
    }

    public float getYaw() {
        return 0.0f;
    }

    public float getPositionX() {
        return 0.0f;
    }

    public float getPositionY() {
        return 0.0f;
    }

    public float getPositionZ() {
        return 0.0f;
    }

    public LocationCoordinate2D getLocation() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* synthetic */ SimulatorState(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private boolean areMotorsOn;
        private boolean isFlying;
        private float pitch;
        private float roll;
        private float yaw;
        private float positionX;
        private float positionY;
        private float positionZ;
        private LocationCoordinate2D location;

        public Builder areMotorsOn(boolean bl) {
            return null;
        }

        public Builder isFlying(boolean bl) {
            return null;
        }

        public Builder pitch(float f2) {
            return null;
        }

        public Builder roll(float f2) {
            return null;
        }

        public Builder yaw(float f2) {
            return null;
        }

        public Builder positionX(float f2) {
            return null;
        }

        public Builder positionY(float f2) {
            return null;
        }

        public Builder positionZ(float f2) {
            return null;
        }

        public Builder location(double d2, double d3) {
            return null;
        }

        public SimulatorState build() {
            return null;
        }

        static /* synthetic */ boolean access$000(Builder builder) {
            return false;
        }

        static /* synthetic */ boolean access$100(Builder builder) {
            return false;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$300(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$400(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$500(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$600(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$700(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ LocationCoordinate2D access$800(Builder builder) {
            return null;
        }
    }
}

