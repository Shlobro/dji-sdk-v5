/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  androidx.annotation.NonNull
 */
package dji.v5.utils.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.annotation.NonNull;
import dji.v5.utils.common.LogUtils;
import java.util.List;

public class ScreenStatusUtil {
    private static final String TAG = LogUtils.getTag(ScreenStatusUtil.class);
    private final BroadcastReceiver mScreenStatusReceiver;
    private boolean isScreenOn;
    private final List<ScreenStatusListener> listeners;

    private ScreenStatusUtil() {
    }

    public static ScreenStatusUtil getInstance() {
        return null;
    }

    public void init() {
    }

    public void destroy() {
    }

    public void addListener(ScreenStatusListener screenStatusListener) {
    }

    public void removeListener(ScreenStatusListener screenStatusListener) {
    }

    public void removeAllListener() {
    }

    private void notifyListener() {
    }

    public void registerScreenStatus(@NonNull Context context) {
    }

    public void unregisterScreenStatus(@NonNull Context context) {
    }

    static /* synthetic */ boolean access$002(ScreenStatusUtil screenStatusUtil, boolean bl) {
        return false;
    }

    static /* synthetic */ void access$100(ScreenStatusUtil screenStatusUtil) {
    }

    /* synthetic */ ScreenStatusUtil(1 var1_1) {
    }

    private static class LazyHolder {
        private static final ScreenStatusUtil INSTANCE = new ScreenStatusUtil(null);

        private LazyHolder() {
        }

        static /* synthetic */ ScreenStatusUtil access$300() {
            return null;
        }
    }

    public static interface ScreenStatusListener {
        public void onStatusChange(boolean var1);
    }
}

