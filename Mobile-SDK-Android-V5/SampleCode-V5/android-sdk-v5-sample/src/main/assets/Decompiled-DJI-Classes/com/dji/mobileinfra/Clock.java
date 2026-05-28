/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.support.annotation.NonNull
 */
package com.dji.mobileinfra;

import android.support.annotation.NonNull;
import com.dji.mobileinfra.SharedPreferenceCache;
import com.dji.mobileinfra.TimeStorage;
import java.util.Date;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class Clock {
    @NonNull
    private TimeStorage storage;
    @NonNull
    private ExecutorService executor;
    private AtomicBoolean syncing;

    private native long nativeSyncWithNTPServer();

    public Clock(@NonNull SharedPreferenceCache sharedPreferenceCache) {
    }

    @NonNull
    public Date now() {
        return null;
    }

    public void syncIfNeeded() {
    }

    public void sync() {
    }

    static /* synthetic */ AtomicBoolean access$000(Clock clock) {
        return null;
    }

    static /* synthetic */ long access$100(Clock clock) {
        return 0L;
    }

    static /* synthetic */ TimeStorage access$200(Clock clock) {
        return null;
    }

    static {
        System.loadLibrary("ntp_client");
    }
}

