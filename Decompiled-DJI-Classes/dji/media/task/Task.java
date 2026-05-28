/*
 * Decompiled with CFR 0.152.
 */
package dji.media.task;

import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileListRequest;
import dji.sdk.keyvalue.value.file.FileTaskResponse;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFileDownloadRequest;
import dji.sdk.keyvalue.value.media.MediaFileListRequest;
import dji.sdk.keyvalue.value.media.MediaTaskRequest;
import dji.sdk.keyvalue.value.media.MediaTaskResponse;
import java.util.List;

public class Task {
    private int listLeft;
    private int dataLeft;
    private ITaskResponseHolder holder;
    private MediaTaskRequest request;

    public void setHolder(ITaskResponseHolder iTaskResponseHolder) {
    }

    public static Task fromRequest(MediaFileListRequest mediaFileListRequest) {
        return null;
    }

    public static Task fromRequest(List<MediaFileDownloadRequest> list) {
        return null;
    }

    public Task(MediaTaskRequest mediaTaskRequest) {
    }

    public MediaTaskRequest getRequest() {
        return null;
    }

    void invoke(int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static MediaFileListRequest convertToMediaList(FileListRequest fileListRequest) {
        return null;
    }

    private static MediaFileDownloadRequest convertToMediaDownload(FileDataRequest fileDataRequest) {
        return null;
    }

    private static MediaTaskResponse convertToMediaResponse(FileTaskResponse fileTaskResponse) {
        return null;
    }

    private void logInvoke(int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    public static interface ITaskResponseHolder {
        public void onListReqResponse(List<MediaFile> var1);

        public void onListReqForward(MediaFileListRequest var1, int var2, int var3);

        public void onDataReqResponse(MediaFileDownloadRequest var1, byte[] var2, long var3);

        public void onDataReqForward(MediaFileDownloadRequest var1, int var2, int var3);

        public void onRequestTearDown(int var1, MediaTaskResponse var2);
    }
}

