/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.datacenter.media;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.file.DJIFileManager;
import dji.media.album.MediaFileListTask;
import dji.media.album.MediaTaskManager;
import dji.media.player.MediaPlayer;
import dji.sdk.keyvalue.value.airlink.LiveVideoSourceEntity;
import dji.sdk.keyvalue.value.camera.CameraMode;
import dji.sdk.keyvalue.value.camera.GeneratedMediaFileInfo;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.file.FileListRequestFilter;
import dji.sdk.keyvalue.value.file.FileListRequestOrderType;
import dji.sdk.keyvalue.value.file.FileListRequestSizeOrderType;
import dji.sdk.keyvalue.value.media.MediaPlaybackState;
import dji.sdk.keyvalue.value.remotecontroller.RCMode;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.video.interfaces.IVideoFrame;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.inner.analytics.helper.DJIAnalyticsPerformHelper;
import dji.v5.lib.codec.model.FrameInfo;
import dji.v5.lib.codec.opengl.GLFrameDispatcher;
import dji.v5.manager.datacenter.camera.StreamDecoder;
import dji.v5.manager.datacenter.camera.StreamObserver;
import dji.v5.manager.datacenter.media.FileListStateMachine;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.manager.datacenter.media.MediaFileListDataSource;
import dji.v5.manager.datacenter.media.MediaFileListState;
import dji.v5.manager.datacenter.media.MediaFileListStateListener;
import dji.v5.manager.datacenter.media.PullMediaFileListParam;
import dji.v5.manager.datacenter.media.VideoPlayStateListener;
import dji.v5.manager.datacenter.media.VideoPlayStatus;
import dji.v5.manager.interfaces.ICameraStreamManager;
import dji.v5.manager.interfaces.IMediaManager;
import dji.v5.utils.common.LogPath;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class MediaManager
implements IMediaManager {
    private boolean isFetching;
    private FileListRequestOrderType orderType;
    private FileListRequestSizeOrderType sizeOrder;
    private final List<FileListRequestFilter> filters;
    private CameraMode mPreCameraMode;
    private MediaFileListDataSource dataSource;
    private final List<MediaFileListStateListener> mediaFileListStateListeners;
    private final List<VideoPlayStateListener> videoPlayStateListeners;
    private final DJIAnalyticsPerformHelper analyticsPerformHelper;
    private static final List<FileListRequestFilter> PHOTO_FILTER_PM320;
    private static final List<FileListRequestFilter> VIDEO_FILTER_PM320;
    private static final List<FileListRequestFilter> PHOTO_FILTER;
    private static final List<FileListRequestFilter> VIDEO_FILTER;
    private VideoPlayStatus lastVideoPlayStatus;
    private PullMediaFileListParam mediaFileListParam;
    private MediaTaskManager mediaTaskManager;
    private DJIFileManager fileManager;
    private MediaPlayer mediaPlayer;
    private List<LiveVideoSourceEntity> playbackSourceList;
    private List<LiveVideoSourceEntity> videoSourceList;
    private FileListStateMachine mSDCardFileListStateFSM;
    private FileListStateMachine mInternalStorageFileListStateFSM;
    private List<MediaFile> data;
    private MediaFileListData mediaFileListData;
    private MediaFileListTask mediaFileListTask;
    protected List<dji.sdk.keyvalue.value.media.MediaFile> mOriginMediaList;
    private final int FETCH_NEWLY_DELAY_TIME = 500;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_6;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_7;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_8;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_9;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_10;

    private MediaManager() {
    }

    public void init() {
    }

    public void destroy() {
    }

    private void openAnyChannel() {
    }

    private void broadcastFileState(MediaFileListState mediaFileListState) {
    }

    public static MediaManager getInstance() {
        return null;
    }

    protected MediaTaskManager getMediaTaskManager() {
        return null;
    }

    @Override
    @TrackEvent(eventName="setMediaFileDataSource", category="ManagerAnnotation")
    public void setMediaFileDataSource(@TrackElements(value="source") @NonNull MediaFileListDataSource mediaFileListDataSource) {
    }

    @Override
    @TrackEvent(eventName="pullMediaFileListFromCamera", category="ManagerAnnotation")
    public void pullMediaFileListFromCamera(@NonNull PullMediaFileListParam pullMediaFileListParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopPullMediaFileListFromCamera", category="ManagerAnnotation")
    public void stopPullMediaFileListFromCamera() {
    }

    @Override
    @TrackEvent(eventName="getMediaFileListData", category="ManagerAnnotation")
    public MediaFileListData getMediaFileListData() {
        return null;
    }

    @Override
    @TrackEvent(eventName="deleteMediaFiles", category="ManagerAnnotation")
    public void deleteMediaFiles(List<MediaFile> list, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void generateDeleteFiles(List<dji.sdk.keyvalue.value.media.MediaFile> list, MediaFile mediaFile) {
    }

    private void transitTo(MediaFileListState mediaFileListState) {
    }

    @Override
    public void addMediaFileListStateListener(MediaFileListStateListener mediaFileListStateListener) {
    }

    @Override
    public void removeMediaFileListStateListener(MediaFileListStateListener mediaFileListStateListener) {
    }

    @Override
    public void removeAllMediaFileListStateListener() {
    }

    @Override
    public MediaFileListState getMediaFileListState() {
        return null;
    }

    @Override
    public void setMediaFileXMPCustomInfo(@NonNull String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void getMediaFileXMPCustomInfo(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> completionCallbackWithParam) {
    }

    @Override
    public void enable(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void enterPlayBack(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void enterPlayBackMode(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="disable", category="ManagerAnnotation")
    public void disable(@NonNull CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public synchronized void playVideo(MediaFile mediaFile, CommonCallbacks.CompletionCallbackWithParam<IVideoFrame> completionCallbackWithParam) {
    }

    @Override
    public synchronized void playVideoToSurface(MediaFile mediaFile, Surface surface, int n, int n2, ICameraStreamManager.ScaleType scaleType, IMediaManager.MediaFrameListener mediaFrameListener) {
    }

    @Override
    @TrackEvent(eventName="pauseVideo", category="ManagerAnnotation")
    public void pauseVideo(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="resumeVideo", category="ManagerAnnotation")
    public void resumeVideo(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopVideo", category="ManagerAnnotation")
    public void stopVideo(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="seekVideo", category="ManagerAnnotation")
    public void seekVideo(int n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void addVideoPlayStateListener(@NonNull VideoPlayStateListener videoPlayStateListener) {
    }

    @Override
    public void removeVideoPlayStateListener(@NonNull VideoPlayStateListener videoPlayStateListener) {
    }

    @Override
    public void removeAllVideoPlayStateListener() {
    }

    @Override
    @TrackEvent(eventName="release", category="ManagerAnnotation")
    public void release() {
    }

    private void videoOperateCallback(int n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void refreshData(PullMediaFileListParam pullMediaFileListParam, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private List<FileListRequestFilter> getFilters(PullMediaFileListParam pullMediaFileListParam) {
        return null;
    }

    private List<FileListRequestFilter> getPhotoFilter() {
        return null;
    }

    private List<FileListRequestFilter> getVideoFilter() {
        return null;
    }

    private List<Integer> getNewlyDataIndexList(List<dji.sdk.keyvalue.value.media.MediaFile> list) {
        return null;
    }

    private List<Integer> getCurDataIndexList() {
        return null;
    }

    private List<MediaFile> getDeletedMediaFileList(List<Integer> list, List<Integer> list2) {
        return null;
    }

    private synchronized void initMediaFileList(List<dji.sdk.keyvalue.value.media.MediaFile> list, PullMediaFileListParam pullMediaFileListParam) {
    }

    private void removeExtraData(List<MediaFile> list, int n) {
    }

    private MediaFile generateMediaFile(dji.sdk.keyvalue.value.media.MediaFile mediaFile) {
        return null;
    }

    private void observeKey() {
    }

    private void updateMediaFileList() {
    }

    private void updateList(int n, List<dji.sdk.keyvalue.value.media.MediaFile> list) {
    }

    private int getFirstIndex() {
        return 0;
    }

    private void observeVideoState(Surface surface) {
    }

    void backupChannelInfo(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void resumeVideChannel(CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void tryReNewExclusiveTaskAuthOwner() {
    }

    private void setExclusiveTaskAuthOwner(ComponentIndexType componentIndexType, RCMode rCMode, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private RCMode getRcMode() {
        return null;
    }

    private String generateFileName(dji.sdk.keyvalue.value.media.MediaFile mediaFile) {
        return null;
    }

    private int getKeyFrameLinkId() {
        return 0;
    }

    private boolean isPageGroupFetchSupported() {
        return false;
    }

    @Deprecated
    public synchronized void putMediaOutputSurface(@Nullable Surface surface, int n, int n2, ICameraStreamManager.ScaleType scaleType) {
    }

    @Deprecated
    public synchronized void removeMediaOutputSurface(@Nullable Surface surface) {
    }

    private /* synthetic */ void lambda$observeVideoState$17(Surface surface, long l2, char c2, MediaPlaybackState mediaPlaybackState) {
    }

    private static /* synthetic */ int lambda$updateList$16(dji.sdk.keyvalue.value.media.MediaFile mediaFile, dji.sdk.keyvalue.value.media.MediaFile mediaFile2) {
        return 0;
    }

    private /* synthetic */ void lambda$updateMediaFileList$15() {
    }

    private /* synthetic */ void lambda$observeKey$14(List list, List list2) {
    }

    private /* synthetic */ void lambda$observeKey$13(List list, List list2) {
    }

    private /* synthetic */ void lambda$observeKey$12(GeneratedMediaFileInfo generatedMediaFileInfo, GeneratedMediaFileInfo generatedMediaFileInfo2) {
    }

    private /* synthetic */ void lambda$observeKey$11(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observeKey$10(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observeKey$9(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$observeKey$8(Boolean bl, Boolean bl2) {
    }

    private /* synthetic */ void lambda$refreshData$7(PullMediaFileListParam pullMediaFileListParam, CommonCallbacks.CompletionCallback completionCallback, int n, List list) {
    }

    private /* synthetic */ void lambda$seekVideo$6(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private /* synthetic */ void lambda$stopVideo$5(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private /* synthetic */ void lambda$resumeVideo$4(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private /* synthetic */ void lambda$pauseVideo$3(CommonCallbacks.CompletionCallback completionCallback, int n) {
    }

    private /* synthetic */ void lambda$playVideoToSurface$2(MediaFile mediaFile, StreamDecoder streamDecoder, IMediaManager.MediaFrameListener mediaFrameListener, StreamObserver streamObserver, Surface surface, int n, int n2, ICameraStreamManager.ScaleType scaleType, int n3) {
    }

    private /* synthetic */ void lambda$playVideoToSurface$1(Surface surface, int n, int n2, ICameraStreamManager.ScaleType scaleType, IMediaManager.MediaFrameListener mediaFrameListener, int n3) {
    }

    private static /* synthetic */ void lambda$playVideoToSurface$0(IMediaManager.MediaFrameListener mediaFrameListener, FrameInfo frameInfo, byte[] byArray) {
    }

    /* synthetic */ MediaManager(1 var1_1) {
    }

    static /* synthetic */ MediaFileListData access$200(MediaManager mediaManager) {
        return null;
    }

    static /* synthetic */ void access$300(MediaManager mediaManager, MediaFileListState mediaFileListState) {
    }

    static /* synthetic */ DJIAnalyticsPerformHelper access$400(MediaManager mediaManager) {
        return null;
    }

    static /* synthetic */ void access$500(MediaManager mediaManager, CommonCallbacks.CompletionCallback completionCallback) {
    }

    static /* synthetic */ MediaFileListDataSource access$600(MediaManager mediaManager) {
        return null;
    }

    static /* synthetic */ void access$700(MediaManager mediaManager, ComponentIndexType componentIndexType, RCMode rCMode, CommonCallbacks.CompletionCallback completionCallback) {
    }

    static /* synthetic */ MediaPlayer access$800(MediaManager mediaManager) {
        return null;
    }

    static {
        MediaManager.ajc$preClinit();
        PHOTO_FILTER_PM320 = Collections.singletonList(FileListRequestFilter.ALL_PHOTO);
        VIDEO_FILTER_PM320 = Collections.singletonList(FileListRequestFilter.ALL_VIDEO);
        PHOTO_FILTER = Arrays.asList(FileListRequestFilter.PHOTO_NORMAL, FileListRequestFilter.PHOTO_HDR, FileListRequestFilter.PHOTO_AEB, FileListRequestFilter.PHOTO_BURST, FileListRequestFilter.PHOTO_INTERVAL, FileListRequestFilter.PHOTO_PANO);
        VIDEO_FILTER = Arrays.asList(FileListRequestFilter.VIDEO_NORMAL, FileListRequestFilter.VIDEO_SLOWMOTION, FileListRequestFilter.VIDEO_TIMELAPSE, FileListRequestFilter.VIDEO_HYPERLAPSE, FileListRequestFilter.VIDEO_HDR, FileListRequestFilter.VIDEO_LOOP);
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyLoader {
        private static final MediaManager INSTANCE = new MediaManager(null);

        private LazyLoader() {
        }

        static /* synthetic */ MediaManager access$100() {
            return null;
        }
    }

    private static class StreamHandlerHolder {
        private static final StreamObserver sObserver = new StreamObserver(LogPath.PLAY_BACK.value(), new StreamDecoder(LogPath.PLAY_BACK.value(), ICameraStreamManager.MimeType.H265), 200L);

        private StreamHandlerHolder() {
        }

        public static StreamObserver getObserver() {
            return null;
        }

        public static StreamDecoder getDecoder() {
            return null;
        }

        public static GLFrameDispatcher getFrameDispatcher() {
            return null;
        }
    }
}

