/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.support.annotation.NonNull
 *  android.support.annotation.Nullable
 */
package com.dji.mobileinfra;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.dji.mobileinfra.Clock;
import com.dji.mobileinfra.SharedPreferenceCache;
import java.util.Date;
import java.util.Map;

public class GrandSerializer {
    private static final String KEY_DEVICE_ID = "__DEVICE_ID__";
    private static volatile String deviceId;
    @Nullable
    private SharedPreferenceCache cache;
    @Nullable
    private Clock clock;
    @Nullable
    private Context context;
    @SuppressLint(value={"StaticFieldLeak"})
    private static volatile GrandSerializer instance;

    private native Map<String, String> nativeGetAccountCenterHeaders(String var1, String var2, String var3, String var4, String var5, String var6);

    private native Map<String, String> nativeGetWukongHeaders(String var1, String var2, String var3, String var4, String var5);

    @Deprecated
    public GrandSerializer() {
    }

    GrandSerializer(@NonNull Context context) {
    }

    public static void initialize(Context context) {
    }

    public static GrandSerializer getInstance() {
        return null;
    }

    public Map<String, String> getAccountCenterHeaders(String string, String string2, String string3) {
        return null;
    }

    public Map<String, String> getWukongHeaders(String string, String string2, String string3) {
        return null;
    }

    @Deprecated
    public Map<String, String> getAccountCenterHeaders(String string, String string2, String string3, String string4, String string5) {
        return null;
    }

    @Deprecated
    public Map<String, String> getWukongHeaders(String string, String string2, String string3, String string4) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @NonNull
    public String getDeviceId() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Deprecated
    @NonNull
    public String getDeviceId(@NonNull Context context, @NonNull SharedPreferences sharedPreferences) {
        return null;
    }

    @Deprecated
    public Map<String, String> getAccountCenterHeaders(String string, String string2, String string3, Date date, String string4, String string5) {
        return null;
    }

    @Deprecated
    public Map<String, String> getWukongHeaders(String string, Date date, String string2, String string3, String string4) {
        return null;
    }

    static {
        System.loadLibrary("hash");
    }
}

