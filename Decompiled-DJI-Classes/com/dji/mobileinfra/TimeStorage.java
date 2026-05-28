/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.support.annotation.NonNull
 *  android.support.annotation.Nullable
 */
package com.dji.mobileinfra;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dji.mobileinfra.SharedPreferenceCache;
import com.dji.mobileinfra.TimeFreeze;

public class TimeStorage {
    private static final String KEY_CACHED_DEVICE_UPTIME = "com.dji.mobileinfra.grandserializer.cached_deviced_uptime";
    private static final String KEY_CACHED_NTP_TIME = "com.dji.mobileinfra.grandserializer.cached_ntp_time";
    @NonNull
    private SharedPreferenceCache cache;
    @Nullable
    private volatile TimeFreeze stableTime;

    public TimeStorage(@NonNull SharedPreferenceCache sharedPreferenceCache) {
    }

    public void setStableTime(TimeFreeze timeFreeze) {
    }

    @Nullable
    public TimeFreeze getStableTime() {
        return null;
    }

    @Nullable
    public TimeFreeze getStableTimeFromCache() {
        return null;
    }
}

