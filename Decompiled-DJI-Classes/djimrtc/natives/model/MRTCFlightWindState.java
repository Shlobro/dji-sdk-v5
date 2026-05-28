/*
 * Decompiled with CFR 0.152.
 */
package djimrtc.natives.model;

import djimrtc.natives.model.UtcTime;

public class MRTCFlightWindState {
    private final float speed;
    private final int direction;
    private final UtcTime utcTime;

    public MRTCFlightWindState(Builder builder) {
    }

    public float getSpeed() {
        return 0.0f;
    }

    public int getDirection() {
        return 0;
    }

    public UtcTime getUtcTime() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public static final class Builder {
        private float speed;
        private int direction;
        private UtcTime utcTime;

        public Builder setSpeed(float f2) {
            return null;
        }

        public Builder setDirection(int n) {
            return null;
        }

        public Builder setUtcTime(UtcTime utcTime) {
            return null;
        }

        public MRTCFlightWindState build() {
            return null;
        }

        static /* synthetic */ float access$000(Builder builder) {
            return 0.0f;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ UtcTime access$200(Builder builder) {
            return null;
        }
    }
}

