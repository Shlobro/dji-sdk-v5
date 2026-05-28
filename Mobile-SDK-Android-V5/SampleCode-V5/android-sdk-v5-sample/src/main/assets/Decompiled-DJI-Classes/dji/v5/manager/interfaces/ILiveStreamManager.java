/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.manager.datacenter.livestream.LiveStreamSettings;
import dji.v5.manager.datacenter.livestream.LiveStreamStatusListener;
import dji.v5.manager.datacenter.livestream.LiveVideoBitrateMode;
import dji.v5.manager.datacenter.livestream.StreamQuality;
import dji.v5.manager.interfaces.ICameraStreamManager;

public interface ILiveStreamManager {
    public void startStream(CommonCallbacks.CompletionCallback var1);

    public void stopStream(CommonCallbacks.CompletionCallback var1);

    public boolean isStreaming();

    public void setLiveStreamSettings(LiveStreamSettings var1);

    public LiveStreamSettings getLiveStreamSettings();

    @Deprecated
    public void setVideoChannelType(VideoChannelType var1);

    public void setCameraIndex(@NonNull ComponentIndexType var1);

    @Deprecated
    public VideoChannelType getVideoChannelType();

    public ComponentIndexType getCameraIndex();

    public void setLiveStreamQuality(StreamQuality var1);

    public StreamQuality getLiveStreamQuality();

    public void setLiveStreamScaleType(ICameraStreamManager.ScaleType var1);

    public ICameraStreamManager.ScaleType getLiveStreamScaleType();

    public void setLiveVideoBitrateMode(LiveVideoBitrateMode var1);

    public LiveVideoBitrateMode getLiveVideoBitrateMode();

    public void setLiveVideoBitrate(int var1);

    public int getLiveVideoBitrate();

    @Deprecated
    public void setLiveAudioEnabled(boolean var1);

    @Deprecated
    public boolean isLiveAudioEnabled();

    public void addLiveStreamStatusListener(LiveStreamStatusListener var1);

    public void removeLiveStreamStatusListener(LiveStreamStatusListener var1);
}

