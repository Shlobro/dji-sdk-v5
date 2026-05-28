/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.datacenter.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.channel.VideoChannel;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.interfaces.IVideoChannel;
import dji.v5.common.video.stream.StreamSource;
import dji.v5.manager.datacenter.camera.CameraStreamManager;
import dji.v5.manager.datacenter.video.StreamSourceListener;
import dji.v5.manager.interfaces.ICameraStreamManager;
import dji.v5.manager.interfaces.IVideoStreamManager;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
public class VideoStreamManager
implements IVideoStreamManager,
VideoChannel.OnVideoChannelUpdateListener,
ICameraStreamManager.AvailableCameraUpdatedListener {
    private final CameraStreamManager mCameraStreamManager;
    private final Set<StreamSourceListener> mStreamSourceListenerSet;
    private final Set<OnVideoChannelStateChangedListener> mOnVideoChannelStateChangedListenerSet;
    private final List<IVideoChannel> mVideoChannelList;
    private ProductType mProductType;

    public static VideoStreamManager getInstance() {
        return null;
    }

    private VideoStreamManager() {
    }

    @Override
    public void init() {
    }

    @Override
    public void destroy() {
    }

    @Override
    @NonNull
    public synchronized List<StreamSource> getAvailableStreamSources() {
        return null;
    }

    @Override
    public synchronized void addStreamSourcesListener(StreamSourceListener streamSourceListener) {
    }

    @Override
    public synchronized void removeStreamSourcesListener(StreamSourceListener streamSourceListener) {
    }

    @Override
    public synchronized void clearAllStreamSourcesListeners() {
    }

    @Override
    @Nullable
    public synchronized List<IVideoChannel> getAvailableVideoChannels() {
        return null;
    }

    @Override
    @Nullable
    public synchronized IVideoChannel getAvailableVideoChannel(@NonNull VideoChannelType videoChannelType) {
        return null;
    }

    @Override
    public void enableLTE(boolean bl, @Nullable CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public synchronized void resetAllVideoChannels() {
    }

    @Override
    public synchronized void onVideoChannelUpdate(boolean bl, VideoChannelType videoChannelType, @Nullable StreamSource streamSource) {
    }

    public synchronized void addOnVideoChannelStateChangedListener(OnVideoChannelStateChangedListener onVideoChannelStateChangedListener) {
    }

    public synchronized void removeOnVideoChannelStateChangedListener(OnVideoChannelStateChangedListener onVideoChannelStateChangedListener) {
    }

    @Override
    public synchronized void onAvailableCameraUpdated(@NonNull List<ComponentIndexType> list) {
    }

    @Override
    public void onCameraStreamEnableUpdate(@NonNull Map<ComponentIndexType, Boolean> map) {
    }

    private static int getProductChannelNum(ProductType productType) {
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$init$0(ProductType productType, ProductType productType2) {
    }

    /* synthetic */ VideoStreamManager(1 var1_1) {
    }

    private static class LazyHolder {
        private static final VideoStreamManager INSTANCE = new VideoStreamManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ VideoStreamManager access$100() {
            return null;
        }
    }

    @Deprecated
    public static interface OnVideoChannelStateChangedListener {
        public void onVideoChannelStateChanged(boolean var1, VideoChannelType var2, @Nullable StreamSource var3);
    }
}

