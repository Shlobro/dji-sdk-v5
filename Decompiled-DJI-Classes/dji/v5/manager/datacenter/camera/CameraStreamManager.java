/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  io.reactivex.rxjava3.disposables.Disposable
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.datacenter.camera;

import android.annotation.SuppressLint;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.value.airlink.ChannelPriority;
import dji.sdk.keyvalue.value.airlink.ChannelPriorityParam;
import dji.sdk.keyvalue.value.airlink.ChannelType;
import dji.sdk.keyvalue.value.airlink.LiveVideoSourceEntity;
import dji.sdk.keyvalue.value.airlink.ManageSourceAction;
import dji.sdk.keyvalue.value.airlink.VideoSourceEntity;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.flightassistant.VisionAssistDirection;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.sdk.keyvalue.value.remotecontroller.RCMode;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.stream.VideoStreamFormat;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.lib.codec.model.FrameInfo;
import dji.v5.manager.datacenter.camera.AircraftStreamSource;
import dji.v5.manager.datacenter.camera.StreamDecoder;
import dji.v5.manager.datacenter.camera.StreamEncoder;
import dji.v5.manager.datacenter.camera.StreamObserver;
import dji.v5.manager.datacenter.camera.view.PinPointInfo;
import dji.v5.manager.interfaces.ICameraStreamManager;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.aspectj.lang.JoinPoint;

public class CameraStreamManager
implements ICameraStreamManager {
    private static final VideoStreamFormat DEFAULT_CODEC_FORMAT;
    private static final ChannelPriority DEFAULT_SOURCE_PRIORITY;
    private static final Map<ProductType, List<VisionAssistDirection>> VISION_ASSIST_DIRECTION_RANGE_MAP;
    private static final Integer LOWEST_VIDEO_PRIORITY;
    private static final Map<ComponentIndexType, Integer> VIDEO_PRIORITY_MAP;
    private static volatile CameraStreamManager sInstance;
    private final Map<ComponentIndexType, Boolean> mExceptedVideoStreamEnableMap;
    private final Map<ComponentIndexType, Boolean> mVideoStreamEnableMap;
    private final Map<ComponentIndexType, VideoSourceEntity> mAvailableCameraSourceMap;
    private final Map<RCMode, List<LiveVideoSourceEntity>> mLiveCameraSourceMap;
    private final Map<ComponentIndexType, StreamDecoder> mStreamDecoderInfoMap;
    private final Map<ComponentIndexType, StreamEncoder> mStreamEncoderInfoMap;
    private final Map<ComponentIndexType, VideoStreamFormat> mVideoStreamFormatMap;
    private final Map<ComponentIndexType, ChannelPriority> mVideoStreamPriorityMap;
    private final Map<ComponentIndexType, StreamObserver> mStreamObserverMap;
    private final Map<ComponentIndexType, Boolean> mIsPlayingbackModeMap;
    private final Map<ComponentIndexType, AircraftStreamSource> mStreamSourceMap;
    private final Set<ICameraStreamManager.AvailableCameraUpdatedListener> mAvailableCameraUpdatedListenerSet;
    private final Set<ICameraStreamManager.VisionAssistStatusListener> mVisionAssistStatusListenerSet;
    private final Handler mMainHandler;
    private Disposable mUpdateStreamDecoderDisposable;
    private Disposable mStreamDisconnectDosposable;
    private RCMode mRCMode;
    private boolean mKeepAliveDecoding;
    private boolean mAssistantVideoEnabled;
    private VisionAssistDirection mVisionAssistDirection;
    private List<VisionAssistDirection> mVisionAssistDirectionRange;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @NonNull
    public static CameraStreamManager getInstance() {
        return null;
    }

    private CameraStreamManager() {
    }

    public synchronized void init() {
    }

    public synchronized void destroy() {
    }

    @Override
    @TrackEvent(eventName="putCameraStreamSurface", category="ManagerAnnotation")
    public synchronized void putCameraStreamSurface(@NonNull ComponentIndexType componentIndexType, @NonNull Surface surface, int n, int n2, @NonNull ICameraStreamManager.ScaleType scaleType) {
    }

    @Override
    public synchronized void removeCameraStreamSurface(@NonNull Surface surface) {
    }

    @Override
    @TrackEvent(eventName="addFrameListener", category="ManagerAnnotation")
    public synchronized void addFrameListener(@NonNull ComponentIndexType componentIndexType, @NonNull ICameraStreamManager.FrameFormat frameFormat, @NonNull ICameraStreamManager.CameraFrameListener cameraFrameListener) {
    }

    @Override
    public synchronized void removeFrameListener(@NonNull ICameraStreamManager.CameraFrameListener cameraFrameListener) {
    }

    @Override
    @TrackEvent(eventName="addReceiveStreamListener", category="ManagerAnnotation")
    public synchronized void addReceiveStreamListener(@NonNull ComponentIndexType componentIndexType, @NonNull ICameraStreamManager.ReceiveStreamListener receiveStreamListener) {
    }

    @Override
    public synchronized void removeReceiveStreamListener(@NonNull ICameraStreamManager.ReceiveStreamListener receiveStreamListener) {
    }

    @Override
    @TrackEvent(eventName="addAvailableCameraUpdatedListener", category="ManagerAnnotation")
    public synchronized void addAvailableCameraUpdatedListener(@NonNull ICameraStreamManager.AvailableCameraUpdatedListener availableCameraUpdatedListener) {
    }

    @Override
    public synchronized void removeAvailableCameraUpdatedListener(@NonNull ICameraStreamManager.AvailableCameraUpdatedListener availableCameraUpdatedListener) {
    }

    private synchronized void notifyOnCameraIndexUpdatedListener() {
    }

    private synchronized void notifyOnCameraIndexUpdatedListener(ICameraStreamManager.AvailableCameraUpdatedListener availableCameraUpdatedListener) {
    }

    private synchronized void notifyOnCameraStreamEnableUpdateListener() {
    }

    private synchronized void notifyOnCameraStreamEnableUpdateListener(ICameraStreamManager.AvailableCameraUpdatedListener availableCameraUpdatedListener) {
    }

    @Override
    public void setKeepAliveDecoding(boolean bl) {
    }

    @Override
    @NonNull
    public PinPointInfo getLiveViewLocationWithGPS(@NonNull LocationCoordinate3D locationCoordinate3D, @NonNull ComponentIndexType componentIndexType) {
        return null;
    }

    @Override
    @TrackEvent(eventName="enableVisionAssist", category="ManagerAnnotation")
    public void enableVisionAssist(@TrackElements(value="enabled") boolean bl, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="setVisionAssistViewDirection", category="ManagerAnnotation")
    public void setVisionAssistViewDirection(@TrackElements(value="direction") VisionAssistDirection visionAssistDirection, @NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addVisionAssistStatusListener(@NonNull ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    @Override
    public void removeVisionAssistStatusListener(@NonNull ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    @Override
    public void setStreamEncoderBitrate(ComponentIndexType componentIndexType, int n) {
    }

    @Override
    public int getStreamEncoderBitrate(ComponentIndexType componentIndexType) {
        return 0;
    }

    @Override
    public void setStreamPriority(ComponentIndexType componentIndexType, ChannelPriority channelPriority) {
    }

    @Override
    public ChannelPriority getStreamPriority(ComponentIndexType componentIndexType) {
        return null;
    }

    @Override
    public void enableStream(ComponentIndexType componentIndexType, boolean bl) {
    }

    @Nullable
    public synchronized VideoSourceEntity getAvailableVideoSource(ComponentIndexType componentIndexType) {
        return null;
    }

    private void notifyAssistantVideoEnabledListener(ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    private void notifyVisionAssistViewDirectionListener(ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    private void notifyVisionAssistViewDirectionRangeListener(ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    private void notifyAssistantVideoEnabledListener() {
    }

    private void notifyVisionAssistViewDirectionListener() {
    }

    private void notifyVisionAssistViewDirectionRangeListener() {
    }

    @NonNull
    public synchronized VideoStreamFormat getVideoStreamFormat(ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    public synchronized ChannelPriority getVideoStreamPriority(ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    public synchronized MediaFormat getMediaFormat(ComponentIndexType componentIndexType) {
        return null;
    }

    @Override
    @Nullable
    public synchronized FrameInfo getAircraftStreamFrameInfo(ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    public synchronized List<VideoSourceEntity> getAvailableCameraSourceList() {
        return null;
    }

    public synchronized void addFrameConsumerDataListener(ComponentIndexType componentIndexType, StreamObserver.OnFrameConsumerDataListener onFrameConsumerDataListener) {
    }

    public synchronized void removeFrameConsumerDataListener(ComponentIndexType componentIndexType) {
    }

    private synchronized void updateAllCameraStream() {
    }

    private void connectStreamSource(ComponentIndexType componentIndexType) {
    }

    private void enableStream(boolean bl) {
    }

    private void changeSourcePriority() {
    }

    @SuppressLint(value={"CheckResult"})
    private void changeSourcePriority(Map<ComponentIndexType, ChannelPriorityParam> map) {
    }

    @SuppressLint(value={"CheckResult"})
    private void changeVideoSource(List<VideoSourceEntity> list, ManageSourceAction manageSourceAction) {
    }

    @SuppressLint(value={"CheckResult"})
    private void changeSourceFormat(ComponentIndexType componentIndexType, int n, VideoStreamFormat videoStreamFormat) {
    }

    @NonNull
    private synchronized StreamDecoder getStreamDecoder(@NonNull ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    private synchronized StreamEncoder getStreamEncoder(@NonNull ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    private synchronized StreamObserver getStreamObserver(@NonNull ComponentIndexType componentIndexType) {
        return null;
    }

    @NonNull
    private List<LiveVideoSourceEntity> getLiveVideoSourceList(@Nullable RCMode rCMode) {
        return null;
    }

    @Nullable
    private LiveVideoSourceEntity getLiveVideoSource(@Nullable RCMode rCMode, @NonNull ComponentIndexType componentIndexType) {
        return null;
    }

    private ICameraStreamManager.MimeType getCodecMimeType(ComponentIndexType componentIndexType) {
        return null;
    }

    private synchronized boolean isPlayingBackMode() {
        return false;
    }

    private void listenProductTypeUpdate() {
    }

    private void listenAvailableCameraUpdate() {
    }

    private void listenAliveCameraUpdate() {
    }

    private void reNewVideoStreamEnableMap() {
    }

    private void listenRCModeUpdate() {
    }

    private void listenVisionAssistStatus() {
    }

    private void listenPlayingBack(ComponentIndexType componentIndexType) {
    }

    private void updateVisionAssistDirectionRange(ProductType productType) {
    }

    public void updateSource(VideoSourceEntity videoSourceEntity) {
    }

    private void listenCameraConnected(ComponentIndexType componentIndexType) {
    }

    private void updateStreamDecoderChannel(ComponentIndexType componentIndexType, ChannelType channelType) {
    }

    private List<LiveVideoSourceEntity> getConsumeMachineLiveVideoSourceEntityList(ProductType productType) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenCameraConnected$24(ComponentIndexType componentIndexType, Boolean bl, Boolean bl2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenPlayingBack$23(ComponentIndexType componentIndexType, Boolean bl, Boolean bl2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenVisionAssistStatus$22(VisionAssistDirection visionAssistDirection, VisionAssistDirection visionAssistDirection2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenVisionAssistStatus$21(Boolean bl, Boolean bl2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenRCModeUpdate$20(RCMode rCMode, RCMode rCMode2) {
    }

    private static /* synthetic */ Boolean lambda$reNewVideoStreamEnableMap$19(ComponentIndexType componentIndexType, Boolean bl) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenAliveCameraUpdate$18(List list, List list2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenAvailableCameraUpdate$17(List list, List list2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$listenProductTypeUpdate$16(ProductType productType, ProductType productType2) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$changeSourceFormat$15(String string2, ComponentIndexType componentIndexType, Throwable throwable) throws Throwable {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$changeSourceFormat$14(String string2, ComponentIndexType componentIndexType, VideoStreamFormat videoStreamFormat) throws Throwable {
    }

    private static /* synthetic */ void lambda$changeVideoSource$13(String string2, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$changeVideoSource$12(String string2) throws Throwable {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$changeSourcePriority$11(String string2, Map map, Throwable throwable) throws Throwable {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$changeSourcePriority$10(String string2, Map map) throws Throwable {
    }

    private static /* synthetic */ void lambda$connectStreamSource$9(Throwable throwable) throws Throwable {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$connectStreamSource$8(ComponentIndexType componentIndexType) throws Throwable {
    }

    private static /* synthetic */ void lambda$updateAllCameraStream$7(Throwable throwable) throws Throwable {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$updateAllCameraStream$6() throws Throwable {
    }

    private /* synthetic */ void lambda$notifyVisionAssistViewDirectionRangeListener$5(ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    private /* synthetic */ void lambda$notifyVisionAssistViewDirectionListener$4(ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    private /* synthetic */ void lambda$notifyAssistantVideoEnabledListener$3(ICameraStreamManager.VisionAssistStatusListener visionAssistStatusListener) {
    }

    private /* synthetic */ void lambda$notifyOnCameraStreamEnableUpdateListener$2(ICameraStreamManager.AvailableCameraUpdatedListener availableCameraUpdatedListener) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$notifyOnCameraIndexUpdatedListener$1(ICameraStreamManager.AvailableCameraUpdatedListener availableCameraUpdatedListener) {
    }

    private static /* synthetic */ int lambda$notifyOnCameraIndexUpdatedListener$0(ComponentIndexType componentIndexType, ComponentIndexType componentIndexType2) {
        return 0;
    }

    static /* synthetic */ boolean access$002(CameraStreamManager cameraStreamManager, boolean bl) {
        return false;
    }

    static /* synthetic */ VisionAssistDirection access$102(CameraStreamManager cameraStreamManager, VisionAssistDirection visionAssistDirection) {
        return null;
    }

    static {
        CameraStreamManager.ajc$preClinit();
        DEFAULT_CODEC_FORMAT = VideoStreamFormat.H265;
        DEFAULT_SOURCE_PRIORITY = ChannelPriority.UNKNOWN;
        VISION_ASSIST_DIRECTION_RANGE_MAP = new HashMap<ProductType, List<VisionAssistDirection>>();
        LOWEST_VIDEO_PRIORITY = 101;
        VIDEO_PRIORITY_MAP = new HashMap<ComponentIndexType, Integer>();
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MAVIC_3_ENTERPRISE_SERIES, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MATRICE_4_SERIES, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK, VisionAssistDirection.DOWN));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MINI_4_PRO, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MATRICE_4D_SERIES, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK, VisionAssistDirection.DOWN));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MATRICE_400, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK, VisionAssistDirection.DOWN));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MAVIC_3_ENTERPRISE_SERIES, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MATRICE_4_SERIES, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK, VisionAssistDirection.DOWN));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MATRICE_4D_SERIES, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK, VisionAssistDirection.DOWN));
        VISION_ASSIST_DIRECTION_RANGE_MAP.put(ProductType.DJI_MATRICE_400, Arrays.asList(VisionAssistDirection.AUTO, VisionAssistDirection.LEFT, VisionAssistDirection.RIGHT, VisionAssistDirection.FRONT, VisionAssistDirection.BACK, VisionAssistDirection.DOWN));
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.LEFT_OR_MAIN, 0);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.RIGHT, 1);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.UP, 2);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.INDEX_3, 4);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.UP_TYPE_C, 5);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.UP_TYPE_C_EXT_ONE, 6);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.INDEX_6, 7);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.FPV, 100);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.INDEX_8, LOWEST_VIDEO_PRIORITY);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.INDEX_9, LOWEST_VIDEO_PRIORITY);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.INDEX_10, LOWEST_VIDEO_PRIORITY);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.INDEX_11, LOWEST_VIDEO_PRIORITY);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.INDEX_12, LOWEST_VIDEO_PRIORITY);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.VISION_ASSIST, 99);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.PORT_1, 8);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.PORT_2, 9);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.PORT_3, 10);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.PORT_4, 11);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.PORT_5, 12);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.PORT_6, 13);
        VIDEO_PRIORITY_MAP.put(ComponentIndexType.PORT_7, 14);
    }

    private static /* synthetic */ void ajc$preClinit() {
    }
}

