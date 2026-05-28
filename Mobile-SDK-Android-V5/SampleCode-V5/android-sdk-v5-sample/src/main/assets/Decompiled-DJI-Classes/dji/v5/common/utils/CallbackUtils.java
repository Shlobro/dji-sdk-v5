/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.common.utils;

import androidx.annotation.Nullable;
import dji.sdk.errorcode.DJIErrorCode;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;

public class CallbackUtils {
    public static <T> void onSuccess(CommonCallbacks.CompletionCallbackWithParam<T> completionCallbackWithParam, T t) {
    }

    public static <T> void onFailure(CommonCallbacks.CompletionCallbackWithParam<T> completionCallbackWithParam, IDJIError iDJIError) {
    }

    public static void onSuccess(CommonCallbacks.CompletionCallback completionCallback) {
    }

    public static void onFailure(CommonCallbacks.CompletionCallback completionCallback, IDJIError iDJIError) {
    }

    public static <T> void onFailure(CommonCallbacks.CompletionCallbackWithProgress<T> completionCallbackWithProgress, IDJIError iDJIError) {
    }

    public static void onResult(CommonCallbacks.CompletionCallback completionCallback, DJIErrorCode dJIErrorCode) {
    }

    public static <T> void onSuccess(CommonCallbacks.CompletionCallbackWithProgress<T> completionCallbackWithProgress) {
    }

    public static <T> void onFaiure(CommonCallbacks.CompletionCallbackWithProgress<T> completionCallbackWithProgress, IDJIError iDJIError) {
    }

    public static <T> void onProgressUpdate(CommonCallbacks.CompletionCallbackWithProgress<T> completionCallbackWithProgress, T t) {
    }

    public static <T> void onValueChange(CommonCallbacks.KeyListener<T> keyListener, @Nullable T t, @Nullable T t2) {
    }

    private CallbackUtils() {
    }
}

