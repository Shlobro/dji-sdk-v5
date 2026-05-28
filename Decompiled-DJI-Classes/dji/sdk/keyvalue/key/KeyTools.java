/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package dji.sdk.keyvalue.key;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.sdk.keyvalue.value.common.CameraLensType;
import dji.sdk.keyvalue.value.common.ComponentIndexType;

@Keep
public class KeyTools {
    @NonNull
    public static <T> DJIKey<T> createKey(DJIKeyInfo<T> dJIKeyInfo, int n, int n2, int n3, int n4) {
        return null;
    }

    @NonNull
    public static <T> DJIKey<T> createKey(DJIKeyInfo<T> dJIKeyInfo) {
        return null;
    }

    @NonNull
    public static <T> DJIKey<T> createKey(DJIKeyInfo<T> dJIKeyInfo, int n) {
        return null;
    }

    @NonNull
    public static <T> DJIKey<T> createKey(DJIKeyInfo<T> dJIKeyInfo, @NonNull ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    private static <T> DJIKey<T> createLensKey(DJIKeyInfo<T> dJIKeyInfo, int n, int n2) {
        return null;
    }

    @NonNull
    private static <T> DJIKey<T> createLensKey(DJIKeyInfo<T> dJIKeyInfo, @NonNull ComponentIndexType componentIndexType, @NonNull CameraLensType cameraLensType) {
        return null;
    }

    @NonNull
    public static <T, R> DJIKey.ActionKey<T, R> createKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo, int n, int n2, int n3, int n4) {
        return null;
    }

    @NonNull
    public static <T, R> DJIKey.ActionKey<T, R> createKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo) {
        return null;
    }

    @NonNull
    public static <T, R> DJIKey.ActionKey<T, R> createKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo, int n) {
        return null;
    }

    public static <T, R> DJIKey.ActionKey<T, R> createKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo, ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    private static <T, R> DJIKey.ActionKey<T, R> createLensKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo, int n, int n2) {
        return null;
    }

    @NonNull
    private static <T, R> DJIKey.ActionKey<T, R> createLensKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo, ComponentIndexType componentIndexType, CameraLensType cameraLensType) {
        return null;
    }

    @NonNull
    public static <T> DJIKey<T> createCameraKey(DJIKeyInfo<T> dJIKeyInfo, ComponentIndexType componentIndexType, CameraLensType cameraLensType) {
        return null;
    }

    @NonNull
    public static <T, R> DJIKey.ActionKey<T, R> createCameraKey(DJIActionKeyInfo<T, R> dJIActionKeyInfo, ComponentIndexType componentIndexType, CameraLensType cameraLensType) {
        return null;
    }

    private KeyTools() {
    }
}

