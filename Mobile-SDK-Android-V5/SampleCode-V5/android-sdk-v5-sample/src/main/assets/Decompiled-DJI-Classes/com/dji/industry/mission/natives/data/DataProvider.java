/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package com.dji.industry.mission.natives.data;

import androidx.annotation.Keep;
import dji.v5.common.KeepProguard;

public class DataProvider
implements KeepProguard {
    public static long sCurDeviceId = -1L;
    public static final int WAYPOINT_V2_VERSION = 20;

    public static void setsCurDeviceId(long l2) {
    }

    public static boolean isCurDeviceIdValid() {
        return false;
    }

    @Keep
    public static interface BoolCallback {
        @Keep
        public void onCallback(boolean var1, long var2);
    }

    @Keep
    public static class Location {
        @Keep
        public double latitude;
        @Keep
        public double longitude;
        @Keep
        public double altitude;

        public Location(double d2, double d3, double d4) {
        }
    }

    @Keep
    public static class Point {
        @Keep
        public float x;
        @Keep
        public float y;

        public Point(float f2, float f3) {
        }
    }

    @Keep
    public static class GimbalAttitudeInfo {
        @Keep
        public float pitch;
        @Keep
        public float roll;
        @Keep
        public float yaw;

        public GimbalAttitudeInfo(float f2, float f3, float f4) {
        }
    }

    @Keep
    public static interface LinkReverseCallback {
        @Keep
        public void onCallback(boolean var1, long var2);
    }
}

