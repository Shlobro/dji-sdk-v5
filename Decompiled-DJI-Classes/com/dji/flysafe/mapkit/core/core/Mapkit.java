/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package com.dji.flysafe.mapkit.core.core;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.HashMap;

public class Mapkit {
    private static final String TAG = Mapkit.class.getSimpleName();
    private static final String MAPBOX_TOKEN_KEY = "com.dji.mapkit.mapbox.apikey";
    private static String MAPBOX_ACCESS_TOKEN;
    private static volatile Boolean sIsInMainlandChina;
    private static volatile Boolean sIsInHongKong;
    private static volatile Boolean sIsInMacau;
    private static int sMapProvider;
    private static int sMapType;
    private static int sGeocodingProvider;
    private static final HashMap<Integer, String> providerClassName;
    private static final String CLASS_PROVIDER_AMAP = "com.dji.mapkit.amap.provider.AMapProvider";
    private static final String CLASS_PROVIDER_MAPBOX = "com.dji.mapkit.mapbox.provider.MapboxProvider";
    private static final String CLASS_PROVIDER_GOOGLE = "com.dji.mapkit.google.provider.GoogleProvider";

    public static void init(Context context) {
    }

    private Mapkit() {
    }

    public static void mapboxAccessToken(@NonNull String string) {
    }

    public static String getMapboxAccessToken() {
        return null;
    }

    public static void inMainlandChina(boolean bl) {
    }

    public static boolean isInMainlandChina() {
        return false;
    }

    public static void inHongKong(boolean bl) {
    }

    public static boolean isInHongKong() {
        return false;
    }

    public static void inMacau(boolean bl) {
    }

    public static boolean isInMacau() {
        return false;
    }

    @MapProviderConstant
    public static int getMapProvider() {
        return 0;
    }

    public static int getMapType() {
        return 0;
    }

    public static int getGeocodingProvider() {
        return 0;
    }

    public static void mapProvider(@MapProviderConstant int n) {
    }

    public static void mapType(int n) {
    }

    public static void geocodingProvider(int n) {
    }

    public static String getMapProviderClassName(@MapProviderConstant int n) {
        return null;
    }

    static {
        sMapProvider = 0;
        sMapType = 1;
        sGeocodingProvider = 0;
        providerClassName = new HashMap();
        providerClassName.put(1, CLASS_PROVIDER_GOOGLE);
        providerClassName.put(3, CLASS_PROVIDER_MAPBOX);
        providerClassName.put(2, CLASS_PROVIDER_AMAP);
    }

    public static @interface MapProviderConstant {
        public static final int INVALID_PROVIDER = 0;
        public static final int GOOGLE_MAP_PROVIDER = 1;
        public static final int AMAP_PROVIDER = 2;
        public static final int MAPBOX_MAP_PROVIDER = 3;
        public static final int HERE_MAP_PROVIDER = 4;
    }
}

