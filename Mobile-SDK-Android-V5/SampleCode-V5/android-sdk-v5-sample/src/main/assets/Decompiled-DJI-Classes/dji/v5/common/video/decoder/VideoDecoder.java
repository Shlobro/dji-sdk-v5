/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.common.video.decoder;

import android.content.Context;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.decoder.DecoderOutputMode;
import dji.v5.common.video.decoder.DecoderState;
import dji.v5.common.video.interfaces.DecoderStateChangeListener;
import dji.v5.common.video.interfaces.IVideoDecoder;
import dji.v5.common.video.interfaces.IVideoFrame;
import dji.v5.common.video.interfaces.YuvDataListener;
import dji.v5.common.video.stream.StreamSource;
import dji.v5.manager.datacenter.camera.CameraStreamManager;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.MediaManager;
import dji.v5.manager.datacenter.video.VideoStreamManager;
import dji.v5.manager.interfaces.ICameraStreamManager;
import java.util.Set;

@Deprecated
public class VideoDecoder
implements IVideoDecoder,
VideoStreamManager.OnVideoChannelStateChangedListener,
ICameraStreamManager.CameraFrameListener {
    private static final ICameraStreamManager.FrameFormat YUV_FORMAT = ICameraStreamManager.FrameFormat.YUV420_888;
    private final CameraStreamManager mCameraStreamManager;
    private final MediaManager mMediaManager;
    private final Set<YuvDataListener> mYuvDataListenerWrapperSet;
    private final Set<DecoderStateChangeListener> mDecoderStateChangeListenerSet;
    private final DecoderOutputMode mDecoderOutputMode;
    private final int mSurfaceWidth;
    private final int mSurfaceHeight;
    private VideoChannelType mChannelType;
    private DecoderState mDecoderState;
    private Surface mOutputSurface;
    private StreamSource mStreamSource;
    private ComponentIndexType mCameraIndex;

    public VideoDecoder(Context context) {
    }

    public VideoDecoder(Context context, VideoChannelType videoChannelType) {
    }

    public VideoDecoder(Context context, VideoChannelType videoChannelType, int n, int n2) {
    }

    public VideoDecoder(Context context, VideoChannelType videoChannelType, DecoderOutputMode decoderOutputMode, Object object, int n, int n2) {
    }

    public VideoDecoder(Context context, VideoChannelType videoChannelType, DecoderOutputMode decoderOutputMode, Object object, int n, int n2, boolean bl) {
    }

    @Override
    public void onResume() {
    }

    @Override
    public void onPause() {
    }

    @Override
    public void destroy() {
    }

    @Override
    public VideoChannelType getVideoChannelType() {
        return null;
    }

    @Override
    public void setVideoChannelType(VideoChannelType videoChannelType) {
    }

    @Override
    public void setMediaFile(MediaFile mediaFile) {
    }

    @Override
    public MediaFile getMediaFile() {
        return null;
    }

    @Override
    @NonNull
    public DecoderOutputMode getDecoderOutputMode() {
        return null;
    }

    @Override
    @NonNull
    public DecoderState getDecoderStatus() {
        return null;
    }

    @Override
    public void queueInFrame(@NonNull IVideoFrame iVideoFrame) {
    }

    @Override
    public byte[] getSps() {
        return null;
    }

    @Override
    public byte[] getPps() {
        return null;
    }

    @Override
    public synchronized int getVideoWidth() {
        return 0;
    }

    @Override
    public synchronized int getVideoHeight() {
        return 0;
    }

    @Override
    public void addYuvDataListener(@NonNull YuvDataListener yuvDataListener) {
    }

    @Override
    public void removeYuvDataListener(@NonNull YuvDataListener yuvDataListener) {
    }

    @Override
    public void clearAllYuvDataListeners() {
    }

    private void notifyNewDecoderState(DecoderState decoderState) {
    }

    @Override
    public void addDecoderStateChangeListener(@NonNull DecoderStateChangeListener decoderStateChangeListener) {
    }

    @Override
    public void removeDecoderStateChangeListener(@NonNull DecoderStateChangeListener decoderStateChangeListener) {
    }

    @Override
    public void clearAllDecoderStateChangeListeners() {
    }

    @Override
    public void initDecoderConfig(String string2) {
    }

    @Override
    public void setFrameErrorStatus(boolean bl) {
    }

    @Override
    public void onVideoChannelStateChanged(boolean bl, VideoChannelType videoChannelType, @Nullable StreamSource streamSource) {
    }

    private synchronized void update() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void onFrame(@NonNull byte[] byArray, int n, int n2, int n3, int n4, @NonNull ICameraStreamManager.FrameFormat frameFormat) {
    }
}

