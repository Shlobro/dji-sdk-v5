/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.manager.interfaces.ICameraStreamManager;
import dji.v5.manager.interfaces.ILiveStreamManager;
import dji.v5.manager.interfaces.IMediaManager;
import dji.v5.manager.interfaces.IVideoStreamManager;

public interface IMediaDataCenter {
    public IVideoStreamManager getVideoStreamManager();

    public IMediaManager getMediaManager();

    public ILiveStreamManager getLiveStreamManager();

    public ICameraStreamManager getCameraStreamManager();
}

