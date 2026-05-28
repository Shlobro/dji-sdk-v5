/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package dji.media;

import android.graphics.Bitmap;
import dji.media.MediaInfrastructure;
import dji.media.callback.ICallback;
import dji.media.callback.IGetFileCallBack;
import dji.sdk.common.CallBack;
import dji.sdk.keyvalue.value.common.BoolMsg;
import dji.sdk.keyvalue.value.media.MediaBatchFileRequestResult;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFileDownloadRequest;
import dji.sdk.keyvalue.value.media.MediaFileListRequest;
import dji.sdk.keyvalue.value.media.MediaFileListState;
import dji.sdk.keyvalue.value.media.MediaFileStarTag;
import java.util.List;

public class DJIMediaManager
extends MediaInfrastructure {
    private CallBack<MediaFileListState> fileListStateCallBack;

    private DJIMediaManager(int n, int n2) {
    }

    public static DJIMediaManager getMediaManager(int n, int n2) {
        return null;
    }

    @Override
    public MediaFileListState getFileListState() {
        return null;
    }

    @Override
    public void listenFileListState(CallBack<MediaFileListState> callBack) {
    }

    @Override
    protected void updatedFileListState() {
    }

    @Override
    public void stopListenFileListState() {
    }

    @Override
    public List<MediaFile> getFileList() {
        return null;
    }

    @Override
    public void getFile(MediaFileDownloadRequest mediaFileDownloadRequest, IGetFileCallBack iGetFileCallBack) {
    }

    @Override
    public void getBitmapFile(MediaFileDownloadRequest mediaFileDownloadRequest, ICallback<Bitmap> iCallback) {
    }

    @Override
    public void cancelGetFileData(ICallback<String> iCallback) {
    }

    @Override
    public void refreshFileList(boolean bl, MediaFileListRequest mediaFileListRequest, ICallback<BoolMsg> iCallback) {
    }

    @Override
    public void stopRefreshFileList(ICallback<String> iCallback) {
    }

    @Override
    @Deprecated
    public void deleteFileList(List<MediaFile> list, ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Override
    @Deprecated
    public void deleteAllFiles(ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Deprecated
    public void setStarTagForFileList(List<MediaFile> list, MediaFileStarTag mediaFileStarTag, ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Override
    @Deprecated
    public void stopBatchStar(ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Override
    @Deprecated
    public void stopBatchDelete(ICallback<MediaBatchFileRequestResult> iCallback) {
    }
}

