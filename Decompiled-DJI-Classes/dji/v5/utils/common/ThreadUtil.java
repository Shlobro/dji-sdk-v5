/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.utils.common;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;

public abstract class ThreadUtil {
    private static final Handler sMainHandler = new Handler(Looper.getMainLooper());

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void runOnUiThread(@NonNull Runnable runnable) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static <T> T runOnUiThread(@NonNull RunnableWithReturn<T> runnableWithReturn) {
        return null;
    }

    public static void runOrPostToUiThread(@NonNull Runnable runnable) {
    }

    public static void postToUiThread(Runnable runnable) {
    }

    public static void postDelayedToUiThread(Runnable runnable, long l2) {
    }

    public static <T> CommonCallbacks.KeyListener<T> callbackOnUiThread(CommonCallbacks.KeyListener<T> keyListener) {
        return null;
    }

    public static <T> CommonCallbacks.CompletionCallbackWithParam<T> callbackOnUiThread(CommonCallbacks.CompletionCallbackWithParam<T> completionCallbackWithParam) {
        return null;
    }

    public static CommonCallbacks.CompletionCallback callbackOnUiThread(CommonCallbacks.CompletionCallback completionCallback) {
        return null;
    }

    private static boolean isOnUiThread() {
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ void lambda$runOnUiThread$1(Object[] objectArray, RunnableWithReturn runnableWithReturn) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ void lambda$runOnUiThread$0(Runnable runnable, Object[] objectArray) {
    }

    public static interface RunnableWithReturn<R> {
        public R run();
    }

    private static interface CallOnUiThread {
    }

    private static class KeyListenerOnUiThread<T>
    implements CommonCallbacks.KeyListener<T>,
    CallOnUiThread {
        final CommonCallbacks.KeyListener<T> listener;

        KeyListenerOnUiThread(CommonCallbacks.KeyListener<T> keyListener) {
        }

        @Override
        public void onValueChange(@Nullable T t, @Nullable T t2) {
        }

        private /* synthetic */ void lambda$onValueChange$0(Object object, Object object2) {
        }
    }

    private static class CompletionCallbackWithParamOnUiThread<T>
    implements CommonCallbacks.CompletionCallbackWithParam<T>,
    CallOnUiThread {
        final CommonCallbacks.CompletionCallbackWithParam<T> callback;

        CompletionCallbackWithParamOnUiThread(CommonCallbacks.CompletionCallbackWithParam<T> completionCallbackWithParam) {
        }

        @Override
        public void onSuccess(T t) {
        }

        @Override
        public void onFailure(@NonNull IDJIError iDJIError) {
        }

        private /* synthetic */ void lambda$onFailure$1(IDJIError iDJIError) {
        }

        private /* synthetic */ void lambda$onSuccess$0(Object object) {
        }
    }

    private static class CompletionCallbackOnUiThread
    implements CommonCallbacks.CompletionCallback,
    CallOnUiThread {
        final CommonCallbacks.CompletionCallback callback;

        CompletionCallbackOnUiThread(CommonCallbacks.CompletionCallback completionCallback) {
        }

        @Override
        public void onSuccess() {
        }

        @Override
        public void onFailure(@NonNull IDJIError iDJIError) {
        }

        private /* synthetic */ void lambda$onFailure$0(IDJIError iDJIError) {
        }
    }
}

