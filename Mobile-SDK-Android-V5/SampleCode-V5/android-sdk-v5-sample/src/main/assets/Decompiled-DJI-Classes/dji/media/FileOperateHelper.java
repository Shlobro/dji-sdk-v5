/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package dji.media;

import android.graphics.Bitmap;
import dji.media.callback.ICallback;
import dji.media.callback.IGetFileCallBack;
import dji.sdk.keyvalue.value.file.FileActionResponse;
import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileListRequest;
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.file.FileTaskRequest;
import dji.sdk.keyvalue.value.media.MediaBatchFileRequestResult;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFileDownloadRequest;
import dji.sdk.keyvalue.value.media.MediaFileList;
import dji.sdk.keyvalue.value.media.MediaFileListRequest;
import dji.sdk.keyvalue.value.media.MediaFileStarTag;
import dji.sdk.keyvalue.value.media.MediaTaskRequest;
import java.io.ByteArrayOutputStream;
import java.util.List;

@Deprecated
public class FileOperateHelper {
    private static final FileLocation fileLocation = FileLocation.SD_CARD;

    @Deprecated
    static void getFileList(int n, int n2, MediaFileListRequest mediaFileListRequest, ICallback<MediaFileList> iCallback) {
    }

    @Deprecated
    public static void getFile(int n, int n2, MediaFileDownloadRequest mediaFileDownloadRequest, IGetFileCallBack iGetFileCallBack) {
    }

    @Deprecated
    public static void getBitmapFile(int n, int n2, MediaFileDownloadRequest mediaFileDownloadRequest, ICallback<Bitmap> iCallback) {
    }

    @Deprecated
    static void getByteArrayFile(int n, int n2, MediaFileDownloadRequest mediaFileDownloadRequest, ICallback<byte[]> iCallback) {
    }

    @Deprecated
    static void setStarTag(int n, int n2, List<MediaFile> list, MediaFileStarTag mediaFileStarTag, ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Deprecated
    static void stopBatchStar(int n, int n2, ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Deprecated
    static void stopBatchDelete(int n, int n2, ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Deprecated
    static void deleteFileList(int n, int n2, List<MediaFile> list, boolean bl, ICallback<MediaBatchFileRequestResult> iCallback) {
    }

    @Deprecated
    private static MediaBatchFileRequestResult fileActionResponseToMediaBatchFileRequestResult(FileActionResponse fileActionResponse) {
        return null;
    }

    @Deprecated
    static void cancelGetFileList(int n, int n2, ICallback<String> iCallback) {
    }

    @Deprecated
    public static void cancelGetFileData(int n, int n2, ICallback<String> iCallback) {
    }

    public static FileTaskRequest convertFromMediaRequest(MediaTaskRequest mediaTaskRequest) {
        return null;
    }

    private static FileListRequest convertFromMediaList(MediaFileListRequest mediaFileListRequest) {
        return null;
    }

    private static FileDataRequest convertFromMediaDownload(MediaFileDownloadRequest mediaFileDownloadRequest) {
        return null;
    }

    private static /* synthetic */ void lambda$cancelGetFileData$23(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$cancelGetFileData$22(ICallback iCallback, int n) {
    }

    private static /* synthetic */ void lambda$cancelGetFileList$21(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$cancelGetFileList$20(ICallback iCallback, int n) {
    }

    private static /* synthetic */ void lambda$deleteFileList$19(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$deleteFileList$18(ICallback iCallback, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$stopBatchDelete$17(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$stopBatchDelete$16(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$stopBatchStar$15(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$stopBatchStar$14(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$setStarTag$13(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$setStarTag$12(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getByteArrayFile$11(ICallback iCallback, ByteArrayOutputStream byteArrayOutputStream, int n, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getByteArrayFile$10(ICallback iCallback, Exception exception) {
    }

    private static /* synthetic */ void lambda$getByteArrayFile$9(ICallback iCallback, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getByteArrayFile$8(ICallback iCallback, int n) {
    }

    private static /* synthetic */ void lambda$getBitmapFile$7(ICallback iCallback, ByteArrayOutputStream byteArrayOutputStream, int n, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getBitmapFile$6(ICallback iCallback, Exception exception) {
    }

    private static /* synthetic */ void lambda$getBitmapFile$5(ICallback iCallback, Bitmap bitmap) {
    }

    private static /* synthetic */ void lambda$getBitmapFile$4(ICallback iCallback, int n) {
    }

    private static /* synthetic */ void lambda$getFile$3(IGetFileCallBack iGetFileCallBack, int n, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getFile$2(IGetFileCallBack iGetFileCallBack, int n, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getFileList$1(ICallback iCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$getFileList$0(ICallback iCallback, int n, byte[] byArray) {
    }
}

