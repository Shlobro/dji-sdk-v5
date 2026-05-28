/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter;

import dji.v5.manager.interfaces.ICameraStreamManager;
import dji.v5.manager.interfaces.ILiveStreamManager;
import dji.v5.manager.interfaces.IMediaDataCenter;
import dji.v5.manager.interfaces.IMediaManager;
import dji.v5.manager.interfaces.IVideoStreamManager;

public class MediaDataCenter
implements IMediaDataCenter {
    private MediaDataCenter() {
    }

    public static IMediaDataCenter getInstance() {
        return null;
    }

    @Override
    public IVideoStreamManager getVideoStreamManager() {
        return null;
    }

    @Override
    public IMediaManager getMediaManager() {
        return null;
    }

    @Override
    public ILiveStreamManager getLiveStreamManager() {
        return null;
    }

    @Override
    public ICameraStreamManager getCameraStreamManager() {
        return null;
    }

    /* synthetic */ MediaDataCenter(1 var1_1) {
    }

    private static class LazyHolder {
        private static final IMediaDataCenter INSTANCE = new MediaDataCenter(null);

        private LazyHolder() {
        }

        static /* synthetic */ IMediaDataCenter access$100() {
            return null;
        }
    }
}

