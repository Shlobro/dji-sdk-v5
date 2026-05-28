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

public class MediaFileDataTask
extends MediaBaseTask
implements MediaBaseTask.ITaskResponseHolder {
    private long expectByteSize;
    private long receiveByteSize;
    private IFileDataTaskHolder holder;

    private MediaFileDataTask(FileTaskRequest fileTaskRequest) {
    }

    public static MediaFileDataTask create(FileDataRequest fileDataRequest) {
        return null;
    }

    public static MediaFileDataTask create(List<FileDataRequest> list) {
        return null;
    }

    public void setHolder(IFileDataTaskHolder iFileDataTaskHolder) {
    }

    public long getExpectByteSize() {
        return 0L;
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

    private /* synthetic */ void lambda$setHolder$0(IFileDataTaskHolder iFileDataTaskHolder) {
    }

    public static interface IFileDataTaskHolder {
        public void taskRequestOffset(FileDataRequest var1, int var2, int var3);

        public void taskTransfer(FileDataRequest var1, byte[] var2, long var3);

        public void taskProcess(long var1, long var3);

        public void taskTearDown(int var1, FileDataRequest var2);
    }
}

