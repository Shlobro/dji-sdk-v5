/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  androidx.annotation.NonNull
 *  androidx.annotation.WorkerThread
 */
package dji.v5.manager.interfaces;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.common.video.interfaces.IVideoFrame;
import dji.v5.manager.datacenter.camera.StreamInfo;
import dji.v5.manager.datacenter.media.MediaFile;
import dji.v5.manager.datacenter.media.MediaFileListData;
import dji.v5.manager.datacenter.media.MediaFileListDataSource;
import dji.v5.manager.datacenter.media.MediaFileListState;
import dji.v5.manager.datacenter.media.MediaFileListStateListener;
import dji.v5.manager.datacenter.media.PullMediaFileListParam;
import dji.v5.manager.datacenter.media.VideoPlayStateListener;
import dji.v5.manager.interfaces.ICameraStreamManager;
import java.util.List;

public interface IMediaManager {
    public void setMediaFileDataSource(MediaFileListDataSource var1);

    public void pullMediaFileListFromCamera(@NonNull PullMediaFileListParam var1, CommonCallbacks.CompletionCallback var2);

    public void stopPullMediaFileListFromCamera();

    public MediaFileListData getMediaFileListData();

    public void deleteMediaFiles(List<MediaFile> var1, CommonCallbacks.CompletionCallback var2);

    public void addMediaFileListStateListener(MediaFileListStateListener var1);

    public void removeMediaFileListStateListener(MediaFileListStateListener var1);

    public void removeAllMediaFileListStateListener();

    public MediaFileListState getMediaFileListState();

    public void setMediaFileXMPCustomInfo(@NonNull String var1, CommonCallbacks.CompletionCallback var2);

    public void getMediaFileXMPCustomInfo(@NonNull CommonCallbacks.CompletionCallbackWithParam<String> var1);

    public void enable(CommonCallbacks.CompletionCallback var1);

    public void disable(CommonCallbacks.CompletionCallback var1);

    @Deprecated
    public void playVideo(MediaFile var1, CommonCallbacks.CompletionCallbackWithParam<IVideoFrame> var2);

    public void playVideoToSurface(MediaFile var1, Surface var2, int var3, int var4, ICameraStreamManager.ScaleType var5, MediaFrameListener var6);

    public void pauseVideo(CommonCallbacks.CompletionCallback var1);

    public void resumeVideo(CommonCallbacks.CompletionCallback var1);

    public void stopVideo(CommonCallbacks.CompletionCallback var1);

    public void seekVideo(int var1, CommonCallbacks.CompletionCallback var2);

    public void addVideoPlayStateListener(VideoPlayStateListener var1);

    public void removeVideoPlayStateListener(VideoPlayStateListener var1);

    public void removeAllVideoPlayStateListener();

    public void release();

    public static interface MediaFrameListener {
        @WorkerThread
        public void onReceiveStream(byte[] var1, int var2, int var3, @NonNull StreamInfo var4);

        public void onError(@NonNull IDJIError var1);
    }
}

