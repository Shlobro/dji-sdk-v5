/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.common.callback;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.error.IDJIError;

public class CommonCallbacks {
    static final Handler sUIHandler = new Handler(Looper.getMainLooper());

    public static interface KeyListener<T> {
        public void onValueChange(@Nullable T var1, @Nullable T var2);
    }

    public static interface CompletionCallbackWithProgressAndTwoParam<X, Y> {
        public void onProgressUpdate(int var1);

        public void onSuccess(X var1, Y var2);

        public void onFailure(@NonNull IDJIError var1);
    }

    public static interface CompletionCallbackWithTwoParam<X, Y> {
        public void onSuccess(X var1, Y var2);

        public void onFailure(@NonNull IDJIError var1);
    }

    public static interface CompletionCallbackWithProgressAndParam<T> {
        public void onProgressUpdate(int var1);

        public void onSuccess(T var1);

        public void onFailure(@NonNull IDJIError var1);
    }

    public static interface CompletionCallbackWithParam<T> {
        public void onSuccess(T var1);

        public void onFailure(@NonNull IDJIError var1);
    }

    public static interface CompletionByteStreamCallback {
        public void onProgressUpdate(int var1);

        public void onReceive(byte[] var1, long var2, long var4);

        public void onSuccess();

        public void onFailure(@NonNull IDJIError var1);
    }

    public static interface CompletionCallbackWithProgress<T> {
        public void onProgressUpdate(T var1);

        public void onSuccess();

        public void onFailure(@NonNull IDJIError var1);
    }

    public static interface CompletionCallback {
        public void onSuccess();

        public void onFailure(@NonNull IDJIError var1);
    }
}

