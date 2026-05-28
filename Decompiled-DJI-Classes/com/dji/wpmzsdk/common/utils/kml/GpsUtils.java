/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.Region
 *  android.location.Location
 */
package com.dji.wpmzsdk.common.utils.kml;

import android.graphics.Path;
import android.graphics.Region;
import android.location.Location;
import com.dji.wpmzsdk.common.utils.kml.GeoidManager;
import com.dji.wpmzsdk.common.utils.kml.model.DJILatLng;
import com.dji.wpmzsdk.common.utils.kml.model.Location2D;
import com.dji.wpmzsdk.common.utils.kml.model.Location3D;
import com.dji.wpmzsdk.common.utils.kml.model.LocationCoordinate3D;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GpsUtils {
    private static final String TAG = "GpsUtils";
    public static boolean OPEN = true;
    private static final double M_PI = Math.PI;
    public static final double CHANGED_TAG = 1.0E-6;
    private static final double MOVING_THRESHOLD = 2.5E-6;
    private static final float MAX_DISTANCE = 100000.0f;
    private static final float[] distanceResult = new float[2];
    private static Rectangle[] region = new Rectangle[]{new Rectangle(49.2204, 79.4462, 42.8899, 96.33), new Rectangle(54.1415, 109.6872, 39.3742, 135.0002), new Rectangle(42.8899, 73.1246, 29.5297, 124.143255), new Rectangle(29.5297, 82.9684, 26.7186, 97.0352), new Rectangle(29.5297, 97.0253, 20.414096, 124.367395), new Rectangle(20.414096, 107.975793, 17.871542, 111.744104)};
    private static Rectangle[] exclude = new Rectangle[]{new Rectangle(25.398623, 119.921265, 21.785006, 122.497559), new Rectangle(22.284, 101.8652, 20.0988, 106.665), new Rectangle(21.5422, 106.4525, 20.4878, 108.051), new Rectangle(55.8175, 109.0323, 50.3257, 119.127), new Rectangle(55.8175, 127.4568, 49.5574, 137.0227), new Rectangle(44.8922, 131.2662, 42.5692, 137.0227)};
    private static int TIMES = 1;

    private static double transformLat(double x, double y) {
        double ret = -100.0 + 2.0 * x + 3.0 * y + 0.2 * y * y + 0.1 * x * y + 0.2 * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * Math.PI) + 20.0 * Math.sin(2.0 * x * Math.PI)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(y * Math.PI) + 40.0 * Math.sin(y / 3.0 * Math.PI)) * 2.0 / 3.0;
        return ret += (160.0 * Math.sin(y / 12.0 * Math.PI) + 320.0 * Math.sin(y * Math.PI / 30.0)) * 2.0 / 3.0;
    }

    private static double transformLon(double x, double y) {
        double ret = 300.0 + x + 2.0 * y + 0.1 * x * x + 0.1 * x * y + 0.1 * Math.sqrt(Math.abs(x));
        ret += (20.0 * Math.sin(6.0 * x * Math.PI) + 20.0 * Math.sin(2.0 * x * Math.PI)) * 2.0 / 3.0;
        ret += (20.0 * Math.sin(x * Math.PI) + 40.0 * Math.sin(x / 3.0 * Math.PI)) * 2.0 / 3.0;
        return ret += (150.0 * Math.sin(x / 12.0 * Math.PI) + 300.0 * Math.sin(x / 30.0 * Math.PI)) * 2.0 / 3.0;
    }

    private static Location2D delta(Location2D source) {
        double a = 6378245.0;
        double ee = 0.006693421622965943;
        double dLat = GpsUtils.transformLat(source.getLongitude() - 105.0, source.getLatitude() - 35.0);
        double dLng = GpsUtils.transformLon(source.getLongitude() - 105.0, source.getLatitude() - 35.0);
        double radLat = source.getLatitude() / 180.0 * Math.PI;
        double magic = Math.sin(radLat);
        magic = 1.0 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = dLat * 180.0 / (a * (1.0 - ee) / (magic * sqrtMagic) * Math.PI);
        dLng = dLng * 180.0 / (a / sqrtMagic * Math.cos(radLat) * Math.PI);
        return new Location2D(dLat, dLng);
    }

    private static DJILatLng delta(DJILatLng source) {
        double a = 6378245.0;
        double ee = 0.006693421622965943;
        double dLat = GpsUtils.transformLat(source.longitude - 105.0, source.latitude - 35.0);
        double dLng = GpsUtils.transformLon(source.longitude - 105.0, source.latitude - 35.0);
        double radLat = source.latitude / 180.0 * Math.PI;
        double magic = Math.sin(radLat);
        magic = 1.0 - ee * magic * magic;
        double sqrtMagic = Math.sqrt(magic);
        dLat = dLat * 180.0 / (a * (1.0 - ee) / (magic * sqrtMagic) * Math.PI);
        dLng = dLng * 180.0 / (a / sqrtMagic * Math.cos(radLat) * Math.PI);
        return new DJILatLng(dLat, dLng);
    }

    public static DJILatLng wgs2gcj(DJILatLng source) {
        if (!GpsUtils.IsInsideChina(source)) {
            return source;
        }
        DJILatLng latLng = GpsUtils.delta(source);
        double latitude = source.latitude + latLng.latitude;
        double longitude = source.longitude + latLng.longitude;
        return new DJILatLng(latitude, longitude);
    }

    public static Location2D wgs2gcj(Location2D source) {
        if (!GpsUtils.IsInsideChina(source)) {
            return source;
        }
        Location2D latLng = GpsUtils.delta(source);
        double latitude = source.latitude + latLng.latitude;
        double longitude = source.longitude + latLng.longitude;
        return new Location2D(latitude, longitude);
    }

    public static DJILatLng gcj2wgs(DJILatLng source) {
        if (!GpsUtils.IsInsideChina(source)) {
            return source;
        }
        DJILatLng latLng = GpsUtils.delta(source);
        double latitude = source.latitude - latLng.latitude;
        double longitude = source.longitude - latLng.longitude;
        return new DJILatLng(latitude, longitude);
    }

    public static Location2D gcj2wgs(Location2D source) {
        if (!GpsUtils.IsInsideChina(source)) {
            return source;
        }
        Location2D latLng = GpsUtils.delta(source);
        double latitude = source.latitude - latLng.latitude;
        double longitude = source.longitude - latLng.longitude;
        return new Location2D(latitude, longitude);
    }

    public static Location2D gcj2wgsMust(Location2D source) {
        Location2D latLng = GpsUtils.delta(source);
        double latitude = source.latitude - latLng.latitude;
        double longitude = source.longitude - latLng.longitude;
        return new Location2D(latitude, longitude);
    }

    public static DJILatLng wgs2gcjMust(DJILatLng source) {
        DJILatLng latLng = GpsUtils.delta(source);
        double latitude = source.latitude + latLng.latitude;
        double longitude = source.longitude + latLng.longitude;
        return new DJILatLng(latitude, longitude);
    }

    public static Location2D wgs2gcjMust(Location2D source) {
        Location2D latLng = GpsUtils.delta(source);
        double latitude = source.latitude + latLng.latitude;
        double longitude = source.longitude + latLng.longitude;
        return new Location2D(latitude, longitude);
    }

    public static Location3D wgs2gcjMust(Location3D source) {
        Location2D latLng = GpsUtils.delta(source);
        double latitude = source.latitude + latLng.latitude;
        double longitude = source.longitude + latLng.longitude;
        return new Location3D(latitude, longitude, source.getAltitude());
    }

    public static DJILatLng gcj2wgsMust(DJILatLng source) {
        DJILatLng latLng = GpsUtils.delta(source);
        double latitude = source.latitude - latLng.latitude;
        double longitude = source.longitude - latLng.longitude;
        return new DJILatLng(latitude, longitude, source.altitude, source.accuracy);
    }

    public static Location3D gcj2wgsMust(Location3D source) {
        Location2D latLng = GpsUtils.delta(source);
        double latitude = source.latitude - latLng.latitude;
        double longitude = source.longitude - latLng.longitude;
        return new Location3D(latitude, longitude, source.getAltitude());
    }

    public static DJILatLng gcj2wgs_exact(DJILatLng source) {
        double latitude = 0.0;
        double longitude = 0.0;
        double initDelta = 0.01;
        double threshold = 1.0E-6;
        double dLat = initDelta;
        double dLng = initDelta;
        double mLat = source.latitude - dLat;
        double mLng = source.longitude - dLng;
        double pLat = source.latitude + dLat;
        double pLng = source.longitude + dLng;
        for (int i = 0; i < 30; ++i) {
            latitude = (mLat + pLat) / 2.0;
            longitude = (mLng + pLng) / 2.0;
            DJILatLng latLng = new DJILatLng(latitude, longitude);
            DJILatLng tmp = GpsUtils.wgs2gcj(new DJILatLng(latitude, longitude));
            dLat = tmp.latitude - source.latitude;
            dLng = tmp.longitude - source.longitude;
            if (Math.abs(dLat) < threshold && Math.abs(dLng) < threshold) {
                return latLng;
            }
            if (dLat > 0.0) {
                pLat = latitude;
            } else {
                mLat = latitude;
            }
            if (dLng > 0.0) {
                pLng = longitude;
                continue;
            }
            mLng = longitude;
        }
        return new DJILatLng(latitude, longitude);
    }

    public static double distance(double latA, double lngA, double latB, double lngB) {
        double y;
        double earthR = 6371000.0;
        double x = Math.cos(latA * Math.PI / 180.0) * Math.cos(latB * Math.PI / 180.0) * Math.cos((lngA - lngB) * Math.PI / 180.0);
        double s = x + (y = Math.sin(latA * Math.PI / 180.0) * Math.sin(latB * Math.PI / 180.0));
        if (s > 1.0) {
            s = 1.0;
        }
        if (s < -1.0) {
            s = -1.0;
        }
        double alpha = Math.acos(s);
        double distance = alpha * earthR;
        return distance;
    }

    public static float distanceBetween(DJILatLng p1, DJILatLng p2) {
        return GpsUtils.distanceBetween(p1.latitude, p1.longitude, p2.latitude, p2.longitude);
    }

    public static double distance3D(LocationCoordinate3D coordinate1, LocationCoordinate3D coordinate2) {
        float distance2D = GpsUtils.distanceBetween(coordinate1.getLatitude(), coordinate1.getLongitude(), coordinate2.getLatitude(), coordinate2.getLongitude());
        double height = Math.abs(coordinate1.getAltitude() - coordinate2.getAltitude());
        return Math.sqrt((double)(distance2D * distance2D) + height * height);
    }

    public static double[] transformGpsDMS(double value, int accuracy) {
        double[] gpsDMSValue = new double[3];
        gpsDMSValue[0] = (int)value;
        value = Math.abs(value - gpsDMSValue[0]) * 60.0;
        gpsDMSValue[1] = (int)value;
        gpsDMSValue[2] = (float)((value - (double)((int)gpsDMSValue[1])) * 60.0);
        gpsDMSValue[2] = new BigDecimal(gpsDMSValue[2]).setScale(accuracy, RoundingMode.HALF_UP).doubleValue();
        if (gpsDMSValue[2] == 60.0) {
            gpsDMSValue[1] = gpsDMSValue[1] + 1.0;
            gpsDMSValue[2] = 0.0;
        }
        if (gpsDMSValue[1] == 60.0) {
            gpsDMSValue[0] = gpsDMSValue[0] + (gpsDMSValue[0] >= 0.0 ? 1.0 : -1.0);
            gpsDMSValue[1] = 0.0;
        }
        return gpsDMSValue;
    }

    public static double[] transformGpsDM(double value, int accuracy) {
        double[] gpsDMValue = new double[2];
        gpsDMValue[0] = (int)value;
        value = Math.abs(value - gpsDMValue[0]) * 60.0;
        gpsDMValue[1] = new BigDecimal(value).setScale(accuracy, RoundingMode.HALF_UP).doubleValue();
        if (gpsDMValue[1] == 60.0) {
            gpsDMValue[0] = gpsDMValue[0] + (gpsDMValue[0] >= 0.0 ? 1.0 : -1.0);
            gpsDMValue[1] = 0.0;
        }
        return gpsDMValue;
    }

    public static double[] transformGpsDMS(double value) {
        return GpsUtils.transformGpsDMS(value, 3);
    }

    public static double getGpsValue(double degree, double minute, double second, int accuracy) {
        return new BigDecimal((double)(degree >= 0.0 ? 1 : -1) * (Math.abs(degree) + minute / 60.0 + second / 3600.0)).setScale(accuracy, 4).doubleValue();
    }

    public static double getGpsValue(double degree, double minute, double second) {
        return GpsUtils.getGpsValue(degree, minute, second, 9);
    }

    public static float distanceBetween(double latitude1, double longitude1, double latitude2, double longitude2) {
        float[] res = new float[2];
        Location.distanceBetween((double)latitude1, (double)longitude1, (double)latitude2, (double)longitude2, (float[])res);
        if (res[0] <= 0.0f) {
            res[0] = 0.0f;
        }
        return res[0];
    }

    public static boolean IsInsideChina(DJILatLng pos) {
        if (!OPEN) {
            return false;
        }
        for (int i = 0; i < region.length; ++i) {
            if (!GpsUtils.InRectangle(region[i], pos)) continue;
            for (int j = 0; j < exclude.length; ++j) {
                if (!GpsUtils.InRectangle(exclude[j], pos)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean IsInsideChina(Location2D pos) {
        if (!OPEN) {
            return false;
        }
        for (int i = 0; i < region.length; ++i) {
            if (!GpsUtils.InRectangle(region[i], pos)) continue;
            for (int j = 0; j < exclude.length; ++j) {
                if (!GpsUtils.InRectangle(exclude[j], pos)) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private static boolean InRectangle(Rectangle rect, DJILatLng pos) {
        return rect.West <= pos.longitude && rect.East >= pos.longitude && rect.North >= pos.latitude && rect.South <= pos.latitude;
    }

    private static boolean InRectangle(Rectangle rect, Location2D pos) {
        return rect.West <= pos.longitude && rect.East >= pos.longitude && rect.North >= pos.latitude && rect.South <= pos.latitude;
    }

    public static boolean isInAmerican(double lat, double lng) {
        if (lat > 25.0 && lat < 49.0 && lng > -130.0 && lng < -70.0) {
            return true;
        }
        if (lat > 60.0 && lat < 70.0 && lng > -170.0 && lng < -140.0) {
            return true;
        }
        return lat > 19.0 && lat < 23.0 && lng > -180.0 && lng < -150.0;
    }

    private static boolean inPolygon(double lat, double lon, ArrayList<ArrayList<Double>> polygonLocations) {
        if (polygonLocations.size() <= 3) {
            return false;
        }
        boolean result = false;
        int j = polygonLocations.size() - 1;
        int i = 0;
        while (i < polygonLocations.size()) {
            if (!(Math.abs(polygonLocations.get(j).get(1) - polygonLocations.get(i).get(1)) < 1.0E-6)) {
                boolean result1 = polygonLocations.get(i).get(1) > lat != polygonLocations.get(j).get(1) > lat;
                double lng = (polygonLocations.get(j).get(0) - polygonLocations.get(i).get(0)) * (lat - polygonLocations.get(j).get(1)) / (polygonLocations.get(j).get(1) - polygonLocations.get(i).get(1)) + polygonLocations.get(i).get(0);
                if (result1 && lon < lng) {
                    result = !result;
                }
            }
            j = i++;
        }
        return result;
    }

    public static boolean checkLatitude(double latitude) {
        double absLatitude = Math.abs(latitude);
        return 1.0E-6 < absLatitude && absLatitude <= 90.0;
    }

    public static boolean checkLongitude(double longitude) {
        double absLongitude = Math.abs(longitude);
        return 1.0E-6 < absLongitude && absLongitude <= 180.0;
    }

    public static float distanceBetweenNoMax(double latitue1, double longtitue1, double latitue2, double longtitue2) {
        Arrays.fill(distanceResult, 0.0f);
        Location.distanceBetween((double)latitue1, (double)longtitue1, (double)latitue2, (double)longtitue2, (float[])distanceResult);
        if (distanceResult[0] <= 0.0f) {
            GpsUtils.distanceResult[0] = 0.0f;
        }
        return distanceResult[0];
    }

    public static float getDistance(Location2D p1, Location2D p2) {
        float[] results = new float[1];
        Location.distanceBetween((double)p1.latitude, (double)p1.longitude, (double)p2.latitude, (double)p2.longitude, (float[])results);
        return results[0];
    }

    public static float[] getAllDistance(Location2D p1, Location2D p2) {
        float[] results = new float[3];
        Location.distanceBetween((double)p1.latitude, (double)p1.longitude, (double)p2.latitude, (double)p2.longitude, (float[])results);
        return results;
    }

    public static boolean outOfChina(double lat, double lon) {
        if (lat > 21.7569 && lat < 25.942 && lon > 119.3 && lon < 124.58) {
            return true;
        }
        return GpsUtils.checkPoint((int)lat, (int)lon);
    }

    private static boolean checkPoint(int lat, int lon) {
        Path path = new Path();
        path.moveTo(GpsUtils.D(48.0, 58.0, 42.64), GpsUtils.D(87.0, 5.0, 59.19));
        path.lineTo(GpsUtils.D(46.0, 43.0, 33.27), GpsUtils.D(85.0, 25.0, 26.56));
        path.lineTo(GpsUtils.D(47.0, 0.0, 18.85), GpsUtils.D(83.0, 13.0, 32.25));
        path.lineTo(GpsUtils.D(44.0, 51.0, 45.02), GpsUtils.D(79.0, 52.0, 21.83));
        path.lineTo(GpsUtils.D(42.0, 6.0, 38.75), GpsUtils.D(80.0, 16.0, 38.32));
        path.lineTo(GpsUtils.D(40.0, 26.0, 33.02), GpsUtils.D(74.0, 52.0, 43.66));
        path.lineTo(GpsUtils.D(38.0, 46.0, 42.06), GpsUtils.D(73.0, 45.0, 47.54));
        path.lineTo(GpsUtils.D(35.0, 40.0, 53.53), GpsUtils.D(77.0, 17.0, 50.18));
        path.lineTo(GpsUtils.D(35.0, 18.0, 19.61), GpsUtils.D(80.0, 25.0, 3.57));
        path.lineTo(GpsUtils.D(33.0, 47.0, 49.88), GpsUtils.D(79.0, 4.0, 29.33));
        path.lineTo(GpsUtils.D(31.0, 30.0, 12.49), GpsUtils.D(78.0, 27.0, 15.1));
        path.lineTo(GpsUtils.D(29.0, 56.0, 32.62), GpsUtils.D(81.0, 15.0, 44.46));
        path.lineTo(GpsUtils.D(27.0, 11.0, 56.65), GpsUtils.D(89.0, 1.0, 43.6));
        path.lineTo(GpsUtils.D(28.0, 12.0, 41.71), GpsUtils.D(97.0, 27.0, 43.41));
        path.lineTo(GpsUtils.D(25.0, 53.0, 39.08), GpsUtils.D(98.0, 48.0, 8.7));
        path.lineTo(GpsUtils.D(24.0, 39.0, 34.05), GpsUtils.D(97.0, 28.0, 21.2));
        path.lineTo(GpsUtils.D(23.0, 45.0, 59.97), GpsUtils.D(97.0, 39.0, 54.56));
        path.lineTo(GpsUtils.D(21.0, 6.0, 32.01), GpsUtils.D(101.0, 21.0, 31.23));
        path.lineTo(GpsUtils.D(22.0, 39.0, 1.59), GpsUtils.D(103.0, 26.0, 4.0));
        path.lineTo(GpsUtils.D(20.0, 16.0, 53.73), GpsUtils.D(107.0, 49.0, 47.06));
        path.lineTo(GpsUtils.D(15.0, 47.0, 6.87), GpsUtils.D(108.0, 54.0, 19.46));
        path.lineTo(GpsUtils.D(14.0, 53.0, 53.7), GpsUtils.D(114.0, 38.0, 35.08));
        path.lineTo(GpsUtils.D(21.0, 4.0, 46.9), GpsUtils.D(121.0, 47.0, 25.12));
        path.lineTo(GpsUtils.D(30.0, 4.0, 39.55), GpsUtils.D(125.0, 46.0, 41.78));
        path.lineTo(GpsUtils.D(39.0, 29.0, 30.38), GpsUtils.D(123.0, 11.0, 52.45));
        path.lineTo(GpsUtils.D(42.0, 46.0, 30.75), GpsUtils.D(131.0, 10.0, 38.6));
        path.lineTo(GpsUtils.D(48.0, 15.0, 27.43), GpsUtils.D(134.0, 46.0, 49.54));
        path.lineTo(GpsUtils.D(49.0, 29.0, 41.88), GpsUtils.D(127.0, 50.0, 21.5));
        path.lineTo(GpsUtils.D(53.0, 6.0, 13.32), GpsUtils.D(125.0, 9.0, 54.19));
        path.lineTo(GpsUtils.D(52.0, 52.0, 56.58), GpsUtils.D(119.0, 52.0, 42.41));
        path.lineTo(GpsUtils.D(48.0, 5.0, 29.2), GpsUtils.D(115.0, 17.0, 35.36));
        path.lineTo(GpsUtils.D(46.0, 32.0, 0.41), GpsUtils.D(119.0, 44.0, 29.7));
        path.lineTo(GpsUtils.D(44.0, 36.0, 38.94), GpsUtils.D(111.0, 41.0, 41.13));
        path.lineTo(GpsUtils.D(42.0, 13.0, 8.78), GpsUtils.D(107.0, 12.0, 24.35));
        path.lineTo(GpsUtils.D(42.0, 43.0, 53.7), GpsUtils.D(96.0, 26.0, 11.34));
        path.lineTo(GpsUtils.D(44.0, 44.0, 42.52), GpsUtils.D(93.0, 47.0, 30.02));
        path.lineTo(GpsUtils.D(45.0, 18.0, 42.86), GpsUtils.D(90.0, 47.0, 27.32));
        path.lineTo(GpsUtils.D(47.0, 45.0, 6.43), GpsUtils.D(90.0, 10.0, 4.97));
        path.close();
        Region mRegion = new Region();
        Region clip1 = new Region();
        clip1.set(1 * TIMES, 73 * TIMES, 55 * TIMES, 138 * TIMES);
        boolean flag = mRegion.setPath(path, clip1);
        boolean Result = mRegion.contains(lat, lon);
        return !Result;
    }

    private static float D(double degree, double minute, double second) {
        return (float)((degree + (minute + second / 60.0) / 60.0) * (double)TIMES);
    }

    public static boolean checkGpsNumValid(int gpsNum) {
        return gpsNum >= 8 && gpsNum < 50;
    }

    public static boolean checkGpsValid(int flycVersion, int gpsNum, int gpsLevel) {
        if (flycVersion < 6) {
            return GpsUtils.checkGpsNumValid(gpsNum);
        }
        return gpsLevel >= 3;
    }

    public static int getGpsLevel(int gpsNum) {
        int level = 0;
        level = 0 == gpsNum || gpsNum >= 50 ? 0 : (gpsNum <= 7 ? 1 : (gpsNum > 10 ? 5 : gpsNum - 6));
        return level;
    }

    public static Location convertToLocation(DJILatLng latLng) {
        Location location = new Location("DJILocationManager");
        location.setLatitude(latLng.getLatitude());
        location.setLongitude(latLng.getLongitude());
        location.setAltitude(latLng.getAltitude());
        location.setAccuracy(latLng.getAccuracy());
        location.setTime(latLng.getTime());
        return location;
    }

    public static Location getCenter(List<Location> points) {
        if (points == null || points.size() == 0) {
            Location location = new Location("Location");
            location.setLatitude(0.0);
            location.setLongitude(0.0);
            return location;
        }
        double minLat = points.get(0).getLatitude();
        double minLng = points.get(0).getLongitude();
        double maxLat = points.get(0).getLatitude();
        double maxLng = points.get(0).getLongitude();
        for (int i = 0; i != points.size(); ++i) {
            double curLat = points.get(i).getLatitude();
            double curLng = points.get(i).getLongitude();
            if (curLat > maxLat) {
                maxLat = curLat;
            }
            if (curLat < minLat) {
                minLat = curLat;
            }
            if (curLng > maxLng) {
                maxLng = curLng;
            }
            if (!(curLng < minLng)) continue;
            minLng = curLng;
        }
        return GpsUtils.convertToLocation(new DJILatLng((maxLat + minLat) / 2.0, (maxLng + minLng) / 2.0));
    }

    public static double egm96Altitude(double wgs84altitude, double latitude, double longitude) {
        return wgs84altitude - GpsUtils.getGeoidOffset(latitude, longitude);
    }

    public static double wgs84Altitude(double egm96Altitude, double latitude, double longitude) {
        return egm96Altitude + GpsUtils.getGeoidOffset(latitude, longitude);
    }

    public static double getGeoidOffset(double latitude, double longitude) {
        return Double.isNaN(latitude) || Double.isNaN(longitude) ? 0.0 : GeoidManager.getInstance().geoidhEgm96(latitude, longitude);
    }

    public static boolean isSimilarLocation(LocationCoordinate3D djiLatLng1, LocationCoordinate3D djiLatLng2) {
        return GpsUtils.isSimilarLocation(djiLatLng1.getLatitude(), djiLatLng1.getLongitude(), djiLatLng2.getLatitude(), djiLatLng2.getLongitude());
    }

    public static boolean isSimilarLocation(DJILatLng djiLatLng1, DJILatLng djiLatLng2) {
        return GpsUtils.isSimilarLocation(djiLatLng1.getLatitude(), djiLatLng1.getLongitude(), djiLatLng2.getLatitude(), djiLatLng2.getLongitude());
    }

    public static boolean isSimilarLocation(double latitude1, double longitude1, double latitude2, double longitude2) {
        return Math.abs(latitude1 - latitude2) <= 2.5E-6 && Math.abs(longitude1 - longitude2) <= 2.5E-6;
    }

    private static class Rectangle {
        public double West;
        public double North;
        public double East;
        public double South;

        public Rectangle(double latitude1, double longitude1, double latitude2, double longitude2) {
            this.West = Math.min(longitude1, longitude2);
            this.North = Math.max(latitude1, latitude2);
            this.East = Math.max(longitude1, longitude2);
            this.South = Math.min(latitude1, latitude2);
        }
    }
}

