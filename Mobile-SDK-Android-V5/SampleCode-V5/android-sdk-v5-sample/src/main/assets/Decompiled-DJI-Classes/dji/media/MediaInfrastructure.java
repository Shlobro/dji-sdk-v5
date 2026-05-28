/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package dji.media;

import android.graphics.Bitmap;
import dji.media.DJIMediaManager;
import dji.media.callback.ICallback;
import dji.media.callback.IGetFileCallBack;
import dji.media.callback.IPlayBackAudioDataCallback;
import dji.media.callback.IPlayBackVideoDataCallBack;
import dji.media.callback.IPlaybackStateCallback;
import dji.sdk.common.CallBack;
import dji.sdk.keyvalue.value.common.BoolMsg;
import dji.sdk.keyvalue.value.common.DoubleMsg;
import dji.sdk.keyvalue.value.common.IntMsg;
import dji.sdk.keyvalue.value.media.MediaBatchFileRequestResult;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFileDownloadRequest;
import dji.sdk.keyvalue.value.media.MediaFileListRequest;
import dji.sdk.keyvalue.value.media.MediaFileListState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class MediaInfrastructure {
    protected int productId;
    protected int cameraIndex;
    protected static final String MediaManagerKeyInfix = "-MediaManagerKey-";
    protected static Map<String, DJIMediaManager> mediaManagerRecorder = new HashMap<String, DJIMediaManager>();
    protected List<MediaFile> fileList;
    protected MediaFileListState fileListState;

    protected MediaInfrastructure(int n, int n2) {
    }

    public void listenFileListState() {
    }

    public void listenPlayBackState(IPlaybackStateCallback iPlaybackStateCallback) {
    }

    public void stopListenPlayBackState() {
    }

    public void listenPlayBackVideoData(IPlayBackVideoDataCallBack iPlayBackVideoDataCallBack) {
    }

    public void listenPlayBackAudioData(IPlayBackAudioDataCallback iPlayBackAudioDataCallback) {
    }

    public void cancelListenPlayBack() {
    }

    public void preparePlayData(int n, ICallback<BoolMsg> iCallback) {
    }

    public void playVideo(int n, ICallback<BoolMsg> iCallback) {
    }

    public void resumeVideo(int n, ICallback<BoolMsg> iCallback) {
    }

    public void pauseVideo(int n, ICallback<BoolMsg> iCallback) {
    }

    public void stopVideo(int n, ICallback<BoolMsg> iCallback) {
    }

    public void seekVideo(DoubleMsg doubleMsg, ICallback<BoolMsg> iCallback) {
    }

    private static void videoCommonOperate(int n, ICallback<BoolMsg> iCallback) {
    }

    public IntMsg buildVideoIndex(int n) {
        return null;
    }

    protected abstract void updatedFileListState();

    public abstract MediaFileListState getFileListState();

    public abstract void listenFileListState(CallBack<MediaFileListState> var1);

    public abstract void stopListenFileListState();

    public abstract List<MediaFile> getFileList();

    public abstract void getFile(MediaFileDownloadRequest var1, IGetFileCallBack var2);

    public abstract void getBitmapFile(MediaFileDownloadRequest var1, ICallback<Bitmap> var2);

    public abstract void cancelGetFileData(ICallback<String> var1);

    public abstract void refreshFileList(boolean var1, MediaFileListRequest var2, ICallback<BoolMsg> var3);

    public abstract void stopRefreshFileList(ICallback<String> var1);

    public abstract void deleteFileList(List<MediaFile> var1, ICallback<MediaBatchFileRequestResult> var2);

    public abstract void deleteAllFiles(ICallback<MediaBatchFileRequestResult> var1);

    public abstract void stopBatchStar(ICallback<MediaBatchFileRequestResult> var1);

    public abstract void stopBatchDelete(ICallback<MediaBatchFileRequestResult> var1);

    static /* synthetic */ void access$000(int n, ICallback iCallback) {
    }
}

