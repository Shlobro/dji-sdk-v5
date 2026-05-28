/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.support.annotation.NonNull
 */
package com.dji.mobileinfra;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;

public class SharedPreferenceCache {
    private static final String KEY_CACHED_SHARED_PREFS = "com.com.dji.mobileinfra.grandserializer.shared_preferences";
    private SharedPreferences sharedPreferences;

    public SharedPreferenceCache(@NonNull Context context) {
    }

    public void put(String string, long l2) {
    }

    public long get(String string, long l2) {
        return 0L;
    }

    public void put(String string, String string2) {
    }

    public String get(String string, String string2) {
        return null;
    }

    public boolean contains(String string) {
        return false;
    }
}

