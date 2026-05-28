/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.common.video.interfaces;

import androidx.annotation.NonNull;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.decoder.DecoderOutputMode;
import dji.v5.common.video.decoder.DecoderState;
import dji.v5.common.video.interfaces.DecoderStateChangeListener;
import dji.v5.common.video.interfaces.IVideoFrame;
import dji.v5.common.video.interfaces.YuvDataListener;
import dji.v5.manager.datacenter.media.MediaFile;

@Deprecated
public interface IVideoDecoder {
    public void destroy();

    public void onPause();

    public void onResume();

    public VideoChannelType getVideoChannelType();

    public void setVideoChannelType(VideoChannelType var1);

    public void setMediaFile(MediaFile var1);

    public MediaFile getMediaFile();

    @NonNull
    public DecoderOutputMode getDecoderOutputMode();

    @NonNull
    public DecoderState getDecoderStatus();

    public void queueInFrame(@NonNull IVideoFrame var1);

    public byte[] getSps();

    public byte[] getPps();

    public int getVideoWidth();

    public int getVideoHeight();

    public void addYuvDataListener(@NonNull YuvDataListener var1);

    public void removeYuvDataListener(@NonNull YuvDataListener var1);

    public void clearAllYuvDataListeners();

    public void addDecoderStateChangeListener(@NonNull DecoderStateChangeListener var1);

    public void removeDecoderStateChangeListener(@NonNull DecoderStateChangeListener var1);

    public void clearAllDecoderStateChangeListeners();

    public void initDecoderConfig(String var1);

    public void setFrameErrorStatus(boolean var1);
}

