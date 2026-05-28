/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.interfaces.IVideoChannel;
import dji.v5.common.video.stream.StreamSource;
import dji.v5.manager.datacenter.video.StreamSourceListener;
import java.util.List;

@Deprecated
public interface IVideoStreamManager {
    @Nullable
    public List<StreamSource> getAvailableStreamSources();

    public void addStreamSourcesListener(StreamSourceListener var1);

    public void removeStreamSourcesListener(StreamSourceListener var1);

    public void clearAllStreamSourcesListeners();

    @Nullable
    public List<IVideoChannel> getAvailableVideoChannels();

    @Nullable
    public IVideoChannel getAvailableVideoChannel(@NonNull VideoChannelType var1);

    public void enableLTE(boolean var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void resetAllVideoChannels();

    public void init();

    public void destroy();
}

