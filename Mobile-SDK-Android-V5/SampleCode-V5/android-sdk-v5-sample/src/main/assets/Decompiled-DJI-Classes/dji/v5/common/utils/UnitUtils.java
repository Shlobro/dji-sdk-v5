/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.common.utils;

import android.content.Context;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class UnitUtils {
    public static final float LENGTH_METRIC2IMPERIAL = 3.2808f;
    public static final float SPEED_METRIC2IMPERIAL = 2.2369f;
    public static final float SPEED_MS_TO_KMH = 3.6f;
    public static final float LENGTH_METRIC2INCH = 39.4f;
    public static final float LENGTH_MILE2FOOT = 5280.0f;
    public static final float TEMPERATURE_K2C = 273.15f;
    public static final int UNIT_IMPERIAL = 0;
    public static final int UNIT_METRIC_KM = 1;
    public static final int UNIT_METRIC = 2;
    public static final int UNIT_ALL = 3;
    public static final int TEMPERATURE_FAHRENHEIT = 0;
    public static final int TEMPERATURE_CELSIUS = 1;
    public static final int TEMPERATURE_KELVIN = 2;
    public static final int AREA_UNIT_METER_SQUARE = 0;
    public static final int AREA_UNIT_ACRE = 1;
    public static final int AREA_UNIT_HECTARE = 2;
    private static final DecimalFormat sDecimalFormat = new DecimalFormat("###,###,###,###", new DecimalFormatSymbols(Locale.US));
    public static final String PREF_KEY_UNIT = "pref_key_unit";

    public static final float kelvinToCelsius(float f2) {
        return 0.0f;
    }

    public static final float celsiusToKelvin(float f2) {
        return 0.0f;
    }

    public static final float celsiusToFahrenheit(float f2) {
        return 0.0f;
    }

    public static final float fahrenheitToCelsius(float f2) {
        return 0.0f;
    }

    public static float metricToImperialByLength(float f2) {
        return 0.0f;
    }

    public static float imperialToMetricByLength(float f2) {
        return 0.0f;
    }

    public static float metricToImperialBySpeed(float f2) {
        return 0.0f;
    }

    public static float imperialToMetricBySpeed(float f2) {
        return 0.0f;
    }

    public static float getValueFromMetricByLength(float f2, UnitType unitType) {
        return 0.0f;
    }

    public static float getValueFromMetricByLength(float f2) {
        return 0.0f;
    }

    public static float getValueFromImperialByLength(float f2, UnitType unitType) {
        return 0.0f;
    }

    public static float getMetricFromCurrentUnitByLength(float f2) {
        return 0.0f;
    }

    public static float getValueFromMetricBySpeed(float f2, UnitType unitType) {
        return 0.0f;
    }

    public static float getValueFromImperialBySpeed(float f2, UnitType unitType) {
        return 0.0f;
    }

    public static float getValueToImperialBySpeed(float f2, UnitType unitType) {
        return 0.0f;
    }

    public static String getUintStrByLength(UnitType unitType) {
        return null;
    }

    public static float footToMile(float f2) {
        return 0.0f;
    }

    public static String getUintStr() {
        return null;
    }

    public static String getUintStrBySpeed(UnitType unitType) {
        return null;
    }

    public static boolean isMetric(UnitType unitType) {
        return false;
    }

    public static String getSpeedUnit() {
        return null;
    }

    public static boolean moreThanMile(float f2) {
        return false;
    }

    public static final float fromMeterPerSecondToKiloMeterPerHour(float f2) {
        return 0.0f;
    }

    public static int getCurrentUnit() {
        return 0;
    }

    public static boolean isMetricUnits() {
        return false;
    }

    public static float transformLength(float f2) {
        return 0.0f;
    }

    public static float transformLength2(float f2) {
        return 0.0f;
    }

    public static String transformLengthByFormat(float f2, int n) {
        return null;
    }

    public static String transformLengthByFormat2(float f2, int n) {
        return null;
    }

    public static String transformLengthByFormat(float f2) {
        return null;
    }

    public static float transFormSpeedIntoDifferentUnit(float f2) {
        return 0.0f;
    }

    public static float transFormSpeedIntoDifferentUnit(float f2, int n) {
        return 0.0f;
    }

    public static String formatBitRate(float f2) {
        return null;
    }

    public static String formatBitRate(float f2, boolean bl) {
        return null;
    }

    public static float squareMeter2Acre(Context context, float f2) {
        return 0.0f;
    }

    public static float squareMeter2Hectare(float f2) {
        return 0.0f;
    }

    public static double roundNotNegZero(double d2, int n) {
        return 0.0;
    }

    public static final class UnitType
    extends Enum<UnitType> {
        public static final /* enum */ UnitType METRIC = new UnitType("Metric", 0);
        public static final /* enum */ UnitType IMPERIAL = new UnitType("Imperial", 1);
        private String stringValue;
        private int intValue;
        private static final /* synthetic */ UnitType[] $VALUES;

        public static UnitType[] values() {
            return null;
        }

        public static UnitType valueOf(String string2) {
            return null;
        }

        private UnitType(String string3, int n2) {
        }

        public String toString() {
            return null;
        }

        private static /* synthetic */ UnitType[] $values() {
            return null;
        }

        static {
            $VALUES = UnitType.$values();
        }
    }
}

