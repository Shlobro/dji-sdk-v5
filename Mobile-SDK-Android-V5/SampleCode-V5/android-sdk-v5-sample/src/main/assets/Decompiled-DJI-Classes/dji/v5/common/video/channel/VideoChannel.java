/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.common.video.channel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.channel.VideoChannelState;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.interfaces.IVideoChannel;
import dji.v5.common.video.interfaces.StreamDataListener;
import dji.v5.common.video.interfaces.VideoChannelStateChangeListener;
import dji.v5.common.video.stream.StreamPriority;
import dji.v5.common.video.stream.StreamSource;
import dji.v5.common.video.stream.VideoStreamFormat;
import dji.v5.manager.datacenter.camera.CameraStreamManager;
import dji.v5.manager.datacenter.camera.StreamInfo;
import dji.v5.manager.interfaces.ICameraStreamManager;
import java.util.Set;

@Deprecated
public class VideoChannel
implements IVideoChannel,
ICameraStreamManager.ReceiveStreamListener {
    private final Set<VideoChannelStateChangeListener> mVideoChannelStateChangeListenerSet;
    private final Set<StreamDataListener> mStreamDataListenerSet;
    private final OnVideoChannelUpdateListener mOnVideoChannelUpdateListener;
    private final CameraStreamManager mCameraStreamManager;
    private final VideoChannelType mVideoChannelType;
    private StreamSource mStreamSource;
    private VideoChannelState mVideoChannelState;

    public VideoChannel(VideoChannelType videoChannelType, OnVideoChannelUpdateListener onVideoChannelUpdateListener) {
    }

    @Override
    public void resetVideoChannelState() {
    }

    @Override
    public void destroy() {
    }

    @Override
    @NonNull
    public synchronized VideoChannelType getVideoChannelType() {
        return null;
    }

    @Override
    @NonNull
    public synchronized VideoChannelState getVideoChannelStatus() {
        return null;
    }

    @Override
    public synchronized StreamSource getStreamSource() {
        return null;
    }

    @Override
    @NonNull
    public synchronized VideoStreamFormat getVideoStreamFormat() {
        return null;
    }

    @Override
    @NonNull
    public StreamPriority getStreamPriority() {
        return null;
    }

    @Override
    public synchronized void startChannel(@NonNull StreamSource streamSource, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public synchronized void closeChannel(@Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setStreamFormat(@NonNull VideoStreamFormat videoStreamFormat, int n, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void setStreamPriority(@NonNull StreamPriority streamPriority, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void resumeStreamIdFromSp() {
    }

    @Override
    public synchronized void addStreamDataListener(@Nullable StreamDataListener streamDataListener) {
    }

    @Override
    public synchronized void removeStreamDataListener(@Nullable StreamDataListener streamDataListener) {
    }

    @Override
    public synchronized void clearAllStreamDataListener() {
    }

    private synchronized void notifyVideoChannelStateChange(VideoChannelState videoChannelState) {
    }

    @Override
    public synchronized void addVideoChannelStateChangeListener(@Nullable VideoChannelStateChangeListener videoChannelStateChangeListener) {
    }

    @Override
    public synchronized void removeVideoChannelStateChangeListener(@Nullable VideoChannelStateChangeListener videoChannelStateChangeListener) {
    }

    @Override
    public synchronized void clearAllVideoChannelStateChangeListeners() {
    }

    private ComponentIndexType getCameraIndex() {
        return null;
    }

    @Override
    public void onReceiveStream(@NonNull byte[] byArray, int n, int n2, @NonNull StreamInfo streamInfo) {
    }

    private synchronized void updateStreamListener() {
    }

    @Deprecated
    public static interface OnVideoChannelUpdateListener {
        public void onVideoChannelUpdate(boolean var1, VideoChannelType var2, @Nullable StreamSource var3);
    }
}

