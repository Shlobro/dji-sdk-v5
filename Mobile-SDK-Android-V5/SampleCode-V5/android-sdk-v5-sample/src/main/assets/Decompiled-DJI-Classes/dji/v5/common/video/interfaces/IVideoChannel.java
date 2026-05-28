/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.common.video.interfaces;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.channel.VideoChannelState;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.interfaces.StreamDataListener;
import dji.v5.common.video.interfaces.VideoChannelStateChangeListener;
import dji.v5.common.video.stream.StreamPriority;
import dji.v5.common.video.stream.StreamSource;
import dji.v5.common.video.stream.VideoStreamFormat;

@Deprecated
public interface IVideoChannel {
    public void resetVideoChannelState();

    public void destroy();

    @NonNull
    public VideoChannelType getVideoChannelType();

    @NonNull
    public VideoChannelState getVideoChannelStatus();

    public StreamSource getStreamSource();

    @NonNull
    public VideoStreamFormat getVideoStreamFormat();

    @NonNull
    public StreamPriority getStreamPriority();

    public void startChannel(@NonNull StreamSource var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void closeChannel(@Nullable CommonCallbacks.CompletionCallback var1);

    public void setStreamFormat(@NonNull VideoStreamFormat var1, int var2, @Nullable CommonCallbacks.CompletionCallback var3);

    public void setStreamPriority(@NonNull StreamPriority var1, @Nullable CommonCallbacks.CompletionCallback var2);

    public void resumeStreamIdFromSp();

    public void addStreamDataListener(@Nullable StreamDataListener var1);

    public void removeStreamDataListener(@Nullable StreamDataListener var1);

    public void clearAllStreamDataListener();

    public void addVideoChannelStateChangeListener(@Nullable VideoChannelStateChangeListener var1);

    public void removeVideoChannelStateChangeListener(@Nullable VideoChannelStateChangeListener var1);

    public void clearAllVideoChannelStateChangeListeners();
}

