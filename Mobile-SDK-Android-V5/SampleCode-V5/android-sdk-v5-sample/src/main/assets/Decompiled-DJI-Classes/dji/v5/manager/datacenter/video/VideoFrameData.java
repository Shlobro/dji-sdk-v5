/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.video;

import androidx.annotation.NonNull;
import dji.v5.common.video.interfaces.IVideoFrame;
import dji.v5.manager.datacenter.camera.StreamInfo;

@Deprecated
public class VideoFrameData
implements IVideoFrame {
    private final StreamInfo mStreamInfo;
    private byte[] mVideoData;

    public VideoFrameData(byte[] byArray, int n, int n2, @NonNull StreamInfo streamInfo, boolean bl) {
    }

    @Override
    public byte[] getData() {
        return null;
    }

    @Override
    public int getWidth() {
        return 0;
    }

    @Override
    public int getHeight() {
        return 0;
    }

    @Override
    public int getFps() {
        return 0;
    }

    @Override
    public long getSeqNumber() {
        return 0L;
    }

    @Override
    public boolean isIFrame() {
        return false;
    }

    @Override
    public long getPTS() {
        return 0L;
    }

    @Override
    public byte[] getSps() {
        return null;
    }

    @Override
    public byte[] getPps() {
        return null;
    }
}

