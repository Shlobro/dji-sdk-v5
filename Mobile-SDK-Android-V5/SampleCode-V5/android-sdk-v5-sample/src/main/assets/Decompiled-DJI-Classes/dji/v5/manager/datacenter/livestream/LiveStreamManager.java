/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.datacenter.livestream;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.manager.datacenter.livestream.LiveStreamSettings;
import dji.v5.manager.datacenter.livestream.LiveStreamStatusListener;
import dji.v5.manager.datacenter.livestream.LiveVideoBitrateMode;
import dji.v5.manager.datacenter.livestream.StreamQuality;
import dji.v5.manager.interfaces.ICameraStreamManager;
import dji.v5.manager.interfaces.ILiveStreamManager;
import org.aspectj.lang.JoinPoint;

public class LiveStreamManager
implements ILiveStreamManager {
    private LiveStreamSettings mLiveStreamSettings;
    private volatile boolean mIsStreaming;
    private VideoChannelType mVideoChannelType;
    private LiveVideoBitrateMode mLiveVideoBitRateMode;
    private StreamQuality mCurStreamQuality;
    private boolean mAudioEnabled;
    private DJIAnalyticsPerformHelper analyticsPerformHelper;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;

    private LiveStreamManager() {
    }

    public static ILiveStreamManager getInstance() {
        return null;
    }

    @Override
    public void startStream(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopStream", category="ManagerAnnotation")
    public void stopStream(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public boolean isStreaming() {
        return false;
    }

    @Override
    public void setLiveStreamSettings(LiveStreamSettings liveStreamSettings) {
    }

    @Override
    public LiveStreamSettings getLiveStreamSettings() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setVideoChannelType", category="ManagerAnnotation")
    public void setVideoChannelType(@TrackElements(value="videoChannelType") VideoChannelType videoChannelType) {
    }

    @Override
    public void setCameraIndex(@NonNull ComponentIndexType componentIndexType) {
    }

    @Override
    public VideoChannelType getVideoChannelType() {
        return null;
    }

    @Override
    public ComponentIndexType getCameraIndex() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setLiveStreamQuality", category="ManagerAnnotation")
    public void setLiveStreamQuality(@TrackElements(value="quality") StreamQuality streamQuality) {
    }

    @Override
    public StreamQuality getLiveStreamQuality() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setLiveStreamScaleType", category="ManagerAnnotation")
    public void setLiveStreamScaleType(@TrackElements(value="scaleType") ICameraStreamManager.ScaleType scaleType) {
    }

    @Override
    public ICameraStreamManager.ScaleType getLiveStreamScaleType() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setLiveVideoBitrateMode", category="ManagerAnnotation")
    public void setLiveVideoBitrateMode(@TrackElements(value="bitrateMode") LiveVideoBitrateMode liveVideoBitrateMode) {
    }

    @Override
    public LiveVideoBitrateMode getLiveVideoBitrateMode() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setLiveVideoBitrate", category="ManagerAnnotation")
    public void setLiveVideoBitrate(@TrackElements(value="bitRate") int n) {
    }

    @Override
    public int getLiveVideoBitrate() {
        return 0;
    }

    @Override
    public void setLiveAudioEnabled(boolean bl) {
    }

    @Override
    public boolean isLiveAudioEnabled() {
        return false;
    }

    @Override
    public void addLiveStreamStatusListener(LiveStreamStatusListener liveStreamStatusListener) {
    }

    @Override
    public void removeLiveStreamStatusListener(LiveStreamStatusListener liveStreamStatusListener) {
    }

    private /* synthetic */ void lambda$startStream$0(CommonCallbacks.CompletionCallback completionCallback) {
    }

    /* synthetic */ LiveStreamManager(1 var1_1) {
    }

    static /* synthetic */ boolean access$202(LiveStreamManager liveStreamManager, boolean bl) {
        return false;
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$300(LiveStreamManager liveStreamManager) {
        return null;
    }

    static {
        LiveStreamManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyHolder {
        private static final LiveStreamManager INSTANCE = new LiveStreamManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ LiveStreamManager access$100() {
            return null;
        }
    }
}

