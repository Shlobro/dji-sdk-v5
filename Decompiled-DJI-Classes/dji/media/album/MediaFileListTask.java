/*
 * Decompiled with CFR 0.152.
 */
package dji.media.album;

import dji.media.album.MediaBaseTask;
import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileListRequest;
import dji.sdk.keyvalue.value.file.FileTaskRequest;
import dji.sdk.keyvalue.value.file.FileTaskResponse;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFolder;
import java.util.List;

public class MediaFileListTask
extends MediaBaseTask
implements MediaBaseTask.ITaskResponseHolder {
    private IFileListTaskHolder holder;

    private MediaFileListTask(FileTaskRequest fileTaskRequest) {
    }

    public static MediaFileListTask create(FileListRequest fileListRequest) {
        return null;
    }

    public static MediaFileListTask create(List<FileListRequest> list) {
        return null;
    }

    public void setHolder(IFileListTaskHolder iFileListTaskHolder) {
    }

    @Override
    public void onListReqResponse(List<MediaFile> list) {
    }

    @Override
    public void onListReqForward(FileListRequest fileListRequest, int n, int n2) {
    }

    @Override
    public void onFolderListReqResponse(List<MediaFolder> list) {
    }

    @Override
    public void onFolderListReqForward(FileListRequest fileListRequest, int n, int n2) {
    }

    @Override
    public void onDataReqResponse(FileDataRequest fileDataRequest, byte[] byArray, long l2, long l3, long l4) {
    }

    @Override
    public void onDataReqForward(FileDataRequest fileDataRequest, int n, int n2) {
    }

    @Override
    public void onRequestTearDown(int n, FileTaskResponse fileTaskResponse) {
    }

    public static interface IFileListTaskHolder {
        public void taskFetchedFiles(int var1, List<MediaFile> var2);
    }
}

