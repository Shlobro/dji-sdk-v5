/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.simulator;

public class SimulatorWindInfo {
    private int windSpeedX;
    private int windSpeedY;
    private int windSpeedZ;

    public int getWindSpeedX() {
        return 0;
    }

    public int getWindSpeedY() {
        return 0;
    }

    public int getWindSpeedZ() {
        return 0;
    }

    private SimulatorWindInfo(int n, int n2, int n3) {
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    /* synthetic */ SimulatorWindInfo(int n, int n2, int n3, 1 var4_4) {
    }

    public static class Builder {
        private int wind_speed_x;
        private int wind_speed_y;
        private int wind_speed_z;

        public Builder windSpeedX(int n) {
            return null;
        }

        public Builder windSpeedY(int n) {
            return null;
        }

        public Builder windSpeedZ(int n) {
            return null;
        }

        public SimulatorWindInfo build() {
            return null;
        }
    }
}

