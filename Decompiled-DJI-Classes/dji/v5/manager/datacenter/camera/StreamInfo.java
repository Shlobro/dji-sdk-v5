/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.camera;

import androidx.annotation.NonNull;
import dji.v5.manager.interfaces.ICameraStreamManager;

public class StreamInfo {
    private ICameraStreamManager.MimeType mimeType;
    private int width;
    private int height;
    private int frameRate;
    private boolean isKeyFrame;
    private long presentationTimeMs;

    public ICameraStreamManager.MimeType getMimeType() {
        return null;
    }

    public void setMimeType(ICameraStreamManager.MimeType mimeType) {
    }

    public int getWidth() {
        return 0;
    }

    public void setWidth(int n) {
    }

    public int getHeight() {
        return 0;
    }

    public void setHeight(int n) {
    }

    public int getFrameRate() {
        return 0;
    }

    public void setFrameRate(int n) {
    }

    public boolean isKeyFrame() {
        return false;
    }

    public void setKeyFrame(boolean bl) {
    }

    public long getPresentationTimeMs() {
        return 0L;
    }

    public void setPresentationTimeMs(long l2) {
    }

    @NonNull
    public String toString() {
        return null;
    }
}

