/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.os.Handler
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  io.reactivex.rxjava3.disposables.Disposable
 */
package dji.v5.inner.live;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.channel.VideoChannelType;
import dji.v5.common.video.stream.StreamSource;
import dji.v5.manager.areacode.AreaCodeData;
import dji.v5.manager.datacenter.camera.StreamEncoder;
import dji.v5.manager.datacenter.camera.StreamInfo;
import dji.v5.manager.datacenter.livestream.LiveStreamSettings;
import dji.v5.manager.datacenter.livestream.LiveStreamStatusListener;
import dji.v5.manager.datacenter.livestream.LiveStreamType;
import dji.v5.manager.datacenter.livestream.StreamQuality;
import dji.v5.manager.datacenter.livestream.settings.AgoraSettings;
import dji.v5.manager.datacenter.livestream.settings.GB28181Settings;
import dji.v5.manager.datacenter.livestream.settings.RtmpSettings;
import dji.v5.manager.datacenter.livestream.settings.RtspSettings;
import dji.v5.manager.datacenter.video.VideoStreamManager;
import dji.v5.manager.interfaces.ICameraStreamManager;
import djimrtc.DJILiveShareChannel;
import djimrtc.DJILiveShareOptions;
import djimrtc.DJILiveShareType;
import djimrtc.MRTCEngine;
import djimrtc.config.DJIAgoraConfig;
import djimrtc.config.DJIGB28181Config;
import djimrtc.config.DJIRtmpConfig;
import djimrtc.config.DJIRtspConfig;
import djimrtc.natives.receiver.MRTCLiveStatus;
import djimrtc.natives.receiver.MRTCLiveVideoStreamInfo;
import djimrtc.natives.receiver.MRTCLog;
import djimrtc.natives.receiver.MRTCReadyEvent;
import io.reactivex.rxjava3.disposables.Disposable;

public class MRTCManager
implements ICameraStreamManager.ReceiveStreamListener,
VideoStreamManager.OnVideoChannelStateChangedListener {
    private static final int READY_STATUS_NOT_READY = 0;
    private static final int READY_STATUS_READY = 1;
    private static final int READY_STATUS_LOST_READY = 2;
    private static final int READY_STATUS_READY_AGAIN = 3;
    private MRTCEngine mRTCEngine;
    private LiveVideoParamInfoCallback liveVideoParamInfoCallback;
    private LiveStatusCallback liveStatusCallback;
    private LiveStreamStatusListener liveStreamStatusListener;
    private DJIRtmpConfig rtmpConfig;
    private DJIRtspConfig rtspConfig;
    private DJIGB28181Config gb28181Config;
    private DJIAgoraConfig agoraConfig;
    private volatile LIVE_SHARE_STATUS mCurrentLiveShareStatus;
    private DJILiveShareChannel mLiveShareChannel;
    private VideoChannelType mVideoChannelType;
    private ComponentIndexType mCameraIndex;
    private StreamQuality mStreamQuality;
    private long liveStreamStartTime;
    private int mCurrentVideoBitRate;
    private volatile boolean isMRTCStarted;
    private volatile boolean isEventReady;
    private final Handler handler;
    private MRTCLog lastMrtcLog;
    private final Disposable logDisposable;
    private boolean isNetworkAvailable;
    private int bitRate;
    private ICameraStreamManager.ScaleType mScaleType;
    private AreaCodeData areaCodeData;
    private final StreamEncoder liveEncoder;

    @SuppressLint(value={"CheckResult"})
    private MRTCManager() {
    }

    @Override
    public void onVideoChannelStateChanged(boolean bl, VideoChannelType videoChannelType, @Nullable StreamSource streamSource) {
    }

    @Override
    public void onReceiveStream(@NonNull byte[] byArray, int n, int n2, @NonNull StreamInfo streamInfo) {
    }

    public static MRTCManager getInstance() {
        return null;
    }

    public long getLiveStreamStartTime() {
        return 0L;
    }

    public void init(Context context) {
    }

    public void startLiveStream(LiveStreamSettings liveStreamSettings, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void stopLiveStream(CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void updateLiveStreamQuality(StreamQuality streamQuality) {
    }

    public void updateVideoScaleType(ICameraStreamManager.ScaleType scaleType) {
    }

    public ICameraStreamManager.ScaleType getVideoScaleType() {
        return null;
    }

    public void updateBitRate(int n) {
    }

    public int getBitRate() {
        return 0;
    }

    public void updateCameraIndex(ComponentIndexType componentIndexType) {
    }

    public void updateVideoChannelType(VideoChannelType videoChannelType) {
    }

    public boolean isStreaming() {
        return false;
    }

    public void setLiveVideoParamInfoCallback(LiveVideoParamInfoCallback liveVideoParamInfoCallback) {
    }

    public void setLiveStreamStatusListener(LiveStreamStatusListener liveStreamStatusListener) {
    }

    public void clearCallback() {
    }

    public int getCurVideoBitRate() {
        return 0;
    }

    private void registerAdvancedEvent(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void registerBaseEvent(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void registerPlayEvent() {
    }

    private void registerReadyEvent(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void registerLiveStreamInfoEvent() {
    }

    private void resetLiveStreamStatus() {
    }

    private boolean checkStreamSettings(LiveStreamSettings liveStreamSettings) {
        return false;
    }

    private boolean checkRtmpConfig(RtmpSettings rtmpSettings) {
        return false;
    }

    private boolean checkRtspConfig(RtspSettings rtspSettings) {
        return false;
    }

    private boolean checkGb28181Config(GB28181Settings gB28181Settings) {
        return false;
    }

    private boolean checkAgoraConfig(AgoraSettings agoraSettings) {
        return false;
    }

    private DJILiveShareType switchLiveStreamType(@NonNull LiveStreamType liveStreamType) {
        return null;
    }

    private DJILiveShareOptions getLiveShareOptions(@NonNull LiveStreamSettings liveStreamSettings) {
        return null;
    }

    private void mrtcLog() {
    }

    private /* synthetic */ void lambda$registerLiveStreamInfoEvent$8(MRTCLiveVideoStreamInfo mRTCLiveVideoStreamInfo) {
    }

    private /* synthetic */ void lambda$registerReadyEvent$7(CommonCallbacks.CompletionCallback completionCallback, MRTCReadyEvent mRTCReadyEvent) {
    }

    private /* synthetic */ void lambda$registerPlayEvent$6(int n) {
    }

    private /* synthetic */ void lambda$registerAdvancedEvent$5(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private /* synthetic */ void lambda$stopLiveStream$4() {
    }

    private /* synthetic */ void lambda$startLiveStream$3(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private /* synthetic */ void lambda$init$2(AreaCodeData areaCodeData, AreaCodeData areaCodeData2) {
    }

    private /* synthetic */ void lambda$init$1(boolean bl) {
    }

    private /* synthetic */ void lambda$new$0(Long l2) throws Throwable {
    }

    /* synthetic */ MRTCManager(1 var1_1) {
    }

    public static final class LIVE_SHARE_STATUS
    extends Enum<LIVE_SHARE_STATUS> {
        public static final /* enum */ LIVE_SHARE_STATUS UNLOAD = new LIVE_SHARE_STATUS();
        public static final /* enum */ LIVE_SHARE_STATUS CONNECTING = new LIVE_SHARE_STATUS();
        public static final /* enum */ LIVE_SHARE_STATUS CONNECTED = new LIVE_SHARE_STATUS();
        private static final /* synthetic */ LIVE_SHARE_STATUS[] $VALUES;

        public static LIVE_SHARE_STATUS[] values() {
            return null;
        }

        public static LIVE_SHARE_STATUS valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ LIVE_SHARE_STATUS[] $values() {
            return null;
        }

        static {
            $VALUES = LIVE_SHARE_STATUS.$values();
        }
    }

    private static class LazyHolder {
        private static final MRTCManager INSTANCE = new MRTCManager(null);

        private LazyHolder() {
        }

        static /* synthetic */ MRTCManager access$100() {
            return null;
        }
    }

    public static interface LiveVideoParamInfoCallback {
        public void onNotify(MRTCLiveVideoStreamInfo var1);
    }

    public static interface LiveStatusCallback {
        public void onNotify(MRTCLiveStatus var1);
    }
}

