/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.gnss;

import dji.rtk.gnss.Datetime;

public class GnssUtils {
    public static final long Y2100 = 3786480060000L;
    public static final long MS_IN_HOUR = 3600000L;
    public static final long MS_IN_DAY = 86400000L;
    public static final long GPS_UNIX_DIFF = 315964800000L;
    public static final long MS_IN_WEEK = 604800000L;
    public static final long GPS_GLO_DIFF = -75600000L;
    public static final long[] GPST_LEAP_EPOCHS = new long[]{46828800000L, 78364801000L, 109900802000L, 173059203000L, 252028804000L, 315187205000L, 346723206000L, 393984007000L, 425520008000L, 457056009000L, 504489610000L, 551750411000L, 599184012000L, 820108813000L, 914803214000L, 1025136015000L, 1119744016000L, 1167264017000L};
    public static final Datetime BDT_ZEROTIME = new Datetime(2006, 1, 1);
    private static Integer[] gloFreqBands = new Integer[]{1, -4, 5, 6, 1, -4, 5, 6, -2, -7, 0, -1, -2, -7, 0, -1, 4, -3, 3, 2, 4, -3, 3, 2, null, -5, null, null, null};

    private GnssUtils() {
    }

    public static int getLeapSeconds() {
        return 0;
    }

    public static long gps2unix(long l2) {
        return 0L;
    }

    public static int leapSeconds(long l2) {
        return 0;
    }

    public static int leapSecondsU(long l2) {
        return 0;
    }

    public static long gps2unix_leap(long l2) {
        return 0L;
    }

    public static long unix2gps(long l2) {
        return 0L;
    }

    public static long unix2gps_leap(long l2) {
        return 0L;
    }

    public static long gpstime() {
        return 0L;
    }

    public static long extractGpsWeek(long l2) {
        return 0L;
    }

    public static long extractBdsWeek(long l2) {
        return 0L;
    }

    public static long extractMs(long l2) {
        return 0L;
    }

    public static long[] separateMsSecMinHourDayWeek(long l2) {
        return null;
    }

    @Deprecated
    public static long[] separateMsSecMinHour(long l2) {
        return null;
    }

    public static long constructGpsTime(long l2, long l3) {
        return 0L;
    }

    public static long gpsms2gloms(long l2, long l3) {
        return 0L;
    }

    @Deprecated
    public static long gloms2gpsms(long l2, long l3) {
        return 0L;
    }

    public static long gloms2gpstime(long l2, long l3) {
        return 0L;
    }

    public static double dms2deg(int n, int n2, double d2) {
        return 0.0;
    }

    public static double[] deg2dms(double d2) {
        return null;
    }

    public static long addGuessedWeek(long l2, long l3) {
        return 0L;
    }

    public static long addGuessedDays(long l2, long l3) {
        return 0L;
    }

    public static long addGuessedHours(long l2, long l3) {
        return 0L;
    }

    public static Integer gloFreqBand(int n) {
        return null;
    }

    public static Integer gloSatByFreq(int n) {
        return null;
    }

    public static Datetime gps2date(long l2) {
        return null;
    }

    public static Datetime gps2date_leap(long l2) {
        return null;
    }

    public static long getMJD() {
        return 0L;
    }

    public static long getMJD(long l2) {
        return 0L;
    }

    public static long mjdToGpstime(long l2, long l3) {
        return 0L;
    }

    public static boolean isLeapSecond(long l2) {
        return false;
    }
}

