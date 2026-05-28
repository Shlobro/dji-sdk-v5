/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.waypointv2.gimbal;

import com.dji.industry.mission.waypointv2.gimbal.RotationMode;

public class Rotation {
    public static final float NO_ROTATION = Float.MAX_VALUE;
    private final RotationMode mode;
    private final float pitch;
    private final float roll;
    private final float yaw;
    private final double time;

    private Rotation(Builder builder) {
    }

    public RotationMode getMode() {
        return null;
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

    public double getTime() {
        return 0.0;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* synthetic */ Rotation(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private RotationMode mode;
        private float pitch;
        private float roll;
        private float yaw;
        private double time;

        public Builder mode(RotationMode rotationMode) {
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

        public Builder time(double d2) {
            return null;
        }

        public Builder() {
        }

        public Builder(Rotation rotation) {
        }

        public Rotation build() {
            return null;
        }

        static /* synthetic */ RotationMode access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ float access$100(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$200(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ float access$300(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ double access$400(Builder builder) {
            return 0.0;
        }
    }
}

