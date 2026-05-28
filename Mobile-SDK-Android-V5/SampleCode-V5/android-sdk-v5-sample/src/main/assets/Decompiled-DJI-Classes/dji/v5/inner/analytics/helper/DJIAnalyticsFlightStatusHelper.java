/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.analytics.helper;

import dji.sdk.keyvalue.value.common.LocationCoordinate2D;
import java.text.DecimalFormat;

public class DJIAnalyticsFlightStatusHelper {
    private double maxAltitude;
    private double totalDistance;
    private LocationCoordinate2D preLocation;
    private long startFlightTime;
    private DecimalFormat df;

    private DJIAnalyticsFlightStatusHelper() {
    }

    public static DJIAnalyticsFlightStatusHelper getInstance() {
        return null;
    }

    public void addListener() {
    }

    public double getMaxAltitude() {
        return 0.0;
    }

    public double getTotalDistance() {
        return 0.0;
    }

    public long getTotalFlightTime() {
        return 0L;
    }

    public void destroy() {
    }

    private void updateDistance(LocationCoordinate2D locationCoordinate2D) {
    }

    private void updateAltitude(double d2) {
    }

    private void refreshFlightStatus() {
    }

    private /* synthetic */ void lambda$addListener$2(Double d2, Double d3) {
    }

    private /* synthetic */ void lambda$addListener$1(LocationCoordinate2D locationCoordinate2D, LocationCoordinate2D locationCoordinate2D2) {
    }

    private /* synthetic */ void lambda$addListener$0(Boolean bl, Boolean bl2) {
    }

    /* synthetic */ DJIAnalyticsFlightStatusHelper(1 var1_1) {
    }

    private static class LazyHolder {
        private static final DJIAnalyticsFlightStatusHelper INSTANCE = new DJIAnalyticsFlightStatusHelper(null);

        private LazyHolder() {
        }

        static /* synthetic */ DJIAnalyticsFlightStatusHelper access$100() {
            return null;
        }
    }
}

