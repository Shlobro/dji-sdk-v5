/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.camera;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.lib.codec.opengl.GLFrameDispatcher;
import dji.v5.lib.codec.opengl.GLFrameFormat;
import dji.v5.manager.interfaces.ICameraStreamManager;

public class CameraFrameListenerWrapper
implements GLFrameDispatcher.OnFrameListener {
    private final ICameraStreamManager.CameraFrameListener mCameraFrameListener;

    public CameraFrameListenerWrapper(@NonNull ICameraStreamManager.CameraFrameListener cameraFrameListener) {
    }

    @Override
    public void onFrame(@NonNull byte[] byArray, int n, int n2, int n3, int n4, @GLFrameFormat int n5) {
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }
}

