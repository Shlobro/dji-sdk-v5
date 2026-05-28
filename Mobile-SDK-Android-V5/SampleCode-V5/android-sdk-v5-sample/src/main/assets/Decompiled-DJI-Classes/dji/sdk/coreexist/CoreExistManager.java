/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.HandlerThread
 */
package dji.sdk.coreexist;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import dji.jni.JNIProguardKeepTag;
import dji.sdk.coreexist.CoreExistReceiver;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.value.remotecontroller.RemoteControllerType;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class CoreExistManager
implements JNIProguardKeepTag {
    public static final String ACTION = "dji.msdkAndPilot.coreExit.action";
    public static final String DATA_KEY = "MSDK_Pilot_KEY";
    public static final int TIMER_INTERVAL = 500;
    private final AtomicBoolean mIsInit;
    private Intent intent;
    private boolean lastAppInForeground;
    private CoreExistReceiver coreExistReceiver;
    private WeakReference<Context> contextWeakReference;
    private Handler broadCastHandler;
    private DJIKey<RemoteControllerType> keyRemoteControllerType;
    HandlerThread coreExist;
    public static final String TAG = "CoreExistManager";

    public static CoreExistManager getInstance() {
        return null;
    }

    public void init(Context context) {
    }

    public void destroy() {
    }

    public void setNeedTryConnect(boolean bl) {
    }

    private void initTimer(Context context) {
    }

    private void initIntent(Context context) {
    }

    private void registerReceive(Context context) {
    }

    public void checkAndSendCoreExitBroadCast(Context context) {
    }

    private CoreExistManager() {
    }

    private /* synthetic */ void lambda$init$0(Context context, DJIKey dJIKey, RemoteControllerType remoteControllerType, RemoteControllerType remoteControllerType2) {
    }

    static /* synthetic */ Handler access$100(CoreExistManager coreExistManager) {
        return null;
    }

    /* synthetic */ CoreExistManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final CoreExistManager INSTANCE = new CoreExistManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ CoreExistManager access$000() {
            return null;
        }
    }
}

