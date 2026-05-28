/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package dji.sdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import dji.media.callback.ICallback;
import dji.sdk.keyvalue.value.camera.DateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class SDKUtil {
    private static AtomicReference<Handler> sHandler = new AtomicReference<Object>(null);
    private static AtomicReference<Handler> mediaHandler = new AtomicReference<Object>(null);
    private static HandlerThread dataThread = new HandlerThread("MediaDataHandlerThread");

    public static void runOnUIThread(Runnable runnable) {
    }

    public static void runOnUIThread(Runnable runnable, long l2) {
    }

    public static void runOnMediaThread(Runnable runnable) {
    }

    public static void runOnMediaThread(Runnable runnable, long l2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Handler getUIHandler() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Handler getMediaHandler() {
        return null;
    }

    public static String convertDateMsg(DateTime dateTime) {
        return null;
    }

    public static String fillUp(int n) {
        return null;
    }

    public static <K, V> List<K> getMapKeyList(Map<K, V> map) {
        return null;
    }

    public static void processCommonResult(int n, String string, ICallback iCallback) {
    }

    public static String getSystemProp(String string, String string2) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void setUiHandlerLooper(Looper looper) {
    }

    private static /* synthetic */ void lambda$processCommonResult$0(int n, ICallback iCallback, String string) {
    }
}

