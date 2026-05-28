/*
 * Decompiled with CFR 0.152.
 */
package dji.media.album;

import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileListRequest;
import dji.sdk.keyvalue.value.file.FileTaskRequest;
import dji.sdk.keyvalue.value.file.FileTaskResponse;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFolder;
import java.util.List;

public class MediaBaseTask {
    private int listLeft;
    private int dataLeft;
    private ITaskResponseHolder holder;
    private FileTaskRequest request;
    private static int taskId = 0;

    public static synchronized int generateTaskId() {
        return 0;
    }

    protected void setHolder(ITaskResponseHolder iTaskResponseHolder) {
    }

    public MediaBaseTask(FileTaskRequest fileTaskRequest) {
    }

    public FileTaskRequest getRequest() {
        return null;
    }

    void invoke(int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private void logInvoke(int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private /* synthetic */ void lambda$setHolder$0(ITaskResponseHolder iTaskResponseHolder) {
    }

    public static interface ITaskResponseHolder {
        public void onListReqResponse(List<MediaFile> var1);

        public void onListReqForward(FileListRequest var1, int var2, int var3);

        public void onFolderListReqResponse(List<MediaFolder> var1);

        public void onFolderListReqForward(FileListRequest var1, int var2, int var3);

        public void onDataReqResponse(FileDataRequest var1, byte[] var2, long var3, long var5, long var7);

        public void onDataReqForward(FileDataRequest var1, int var2, int var3);

        public void onRequestTearDown(int var1, FileTaskResponse var2);
    }
}

