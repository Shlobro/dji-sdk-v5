/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils;

public class DJIGpsUtils {
    private static final double ZERO_DEBOUNCE_THRESHOLD = 1.0E-8;

    public static boolean isAvailable(double latitude, double longitude) {
        boolean result = Math.abs(latitude) <= 90.0 && Math.abs(longitude) <= 180.0 && (!DJIGpsUtils.isZero(latitude) || !DJIGpsUtils.isZero(longitude));
        return result;
    }

    private static boolean isZero(double value) {
        return -1.0E-8 <= value && value <= 1.0E-8;
    }
}

