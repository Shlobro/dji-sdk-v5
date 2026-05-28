/*
 * Decompiled with CFR 0.152.
 */
package dji.file;

import dji.file.callback.IDeleteCommonFileCallback;
import dji.file.callback.IFetchCommonFileCallback;
import dji.file.callback.IFileDataTransferCallback;
import dji.media.callback.ICallback;
import dji.media.callback.IGetFileCallBack;
import dji.sdk.common.CallBack;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.file.CommonFile;
import dji.sdk.keyvalue.value.file.FileActionResponse;
import dji.sdk.keyvalue.value.file.FileDataRequest;
import dji.sdk.keyvalue.value.file.FileLocation;
import dji.sdk.keyvalue.value.file.StreamFileDataRequest;
import dji.sdk.keyvalue.value.file.StreamFileInfo;
import dji.sdk.keyvalue.value.media.MediaFile;
import dji.sdk.keyvalue.value.media.MediaFileStarTag;
import dji.sdk.keyvalue.value.media.MediaFileTag;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class DJIFileManager {
    private static final String FileManagerKeyInfix = "-DJIFileManager-";
    private static Map<String, DJIFileManager> fileManagerRecorder = new HashMap<String, DJIFileManager>();
    private int productId;
    private int deviceId;
    private ComponentIndexType devicePosition;

    private DJIFileManager(int n, int n2, ComponentIndexType componentIndexType) {
    }

    public static DJIFileManager getInstance(int n, int n2, ComponentIndexType componentIndexType) {
        return null;
    }

    public static DJIFileManager getInstance(ComponentIndexType componentIndexType) {
        return null;
    }

    public static DJIFileManager getInstance() {
        return null;
    }

    private void init() {
    }

    public void fetchLogFileList(IFetchCommonFileCallback iFetchCommonFileCallback) {
    }

    @Deprecated
    public void fetchLogFileList(int n, int n2, IFetchCommonFileCallback iFetchCommonFileCallback) {
    }

    public void downloadLogFile(int n, IFileDataTransferCallback iFileDataTransferCallback) {
    }

    @Deprecated
    public void downloadLogFile(int n, int n2, int n3, IFileDataTransferCallback iFileDataTransferCallback) {
    }

    public void deleteLogFiles(List<CommonFile> list, IDeleteCommonFileCallback iDeleteCommonFileCallback) {
    }

    @Deprecated
    public void deleteLogFiles(int n, int n2, List<CommonFile> list, IDeleteCommonFileCallback iDeleteCommonFileCallback) {
    }

    public void stopDownloadLogFile(int n, CallBack<Integer> callBack) {
    }

    @Deprecated
    public void stopDownloadLogFile(int n, int n2, int n3, CallBack<Integer> callBack) {
    }

    public void stopFetchLogFileList(CallBack<Integer> callBack) {
    }

    @Deprecated
    public void stopFetchLogFileList(int n, int n2, CallBack<Integer> callBack) {
    }

    public void deleteMediaFiles(List<MediaFile> list, ICallback<FileActionResponse> iCallback) {
    }

    public void deleteMediaFiles(List<MediaFile> list, FileLocation fileLocation, ICallback<FileActionResponse> iCallback) {
    }

    public void deleteAllMediaFiles(RetCodeCallback retCodeCallback) {
    }

    public void deleteAllMediaFiles(FileLocation fileLocation, RetCodeCallback retCodeCallback) {
    }

    public void tagMediaFiles(List<MediaFile> list, MediaFileTag mediaFileTag, ICallback<FileActionResponse> iCallback) {
    }

    public void tagMediaFiles(List<MediaFile> list, MediaFileTag mediaFileTag, FileLocation fileLocation, ICallback<FileActionResponse> iCallback) {
    }

    public void stopTagMediaFiles(RetCodeCallback retCodeCallback) {
    }

    public void stopTagMediaFiles(FileLocation fileLocation, RetCodeCallback retCodeCallback) {
    }

    public void starMediaFiles(List<MediaFile> list, MediaFileStarTag mediaFileStarTag, ICallback<FileActionResponse> iCallback) {
    }

    public void starMediaFiles(List<MediaFile> list, MediaFileStarTag mediaFileStarTag, FileLocation fileLocation, ICallback<FileActionResponse> iCallback) {
    }

    public void stopStarMediaFiles(RetCodeCallback retCodeCallback) {
    }

    public void stopStarMediaFiles(FileLocation fileLocation, RetCodeCallback retCodeCallback) {
    }

    public void stopDeleteMediaFiles(RetCodeCallback retCodeCallback) {
    }

    public void stopDeleteMediaFiles(FileLocation fileLocation, RetCodeCallback retCodeCallback) {
    }

    @Deprecated
    public void downloadFile(FileDataRequest fileDataRequest, IGetFileCallBack iGetFileCallBack) {
    }

    @Deprecated
    public void downloadStreamFile(StreamFileDataRequest streamFileDataRequest, CallBack<StreamFileInfo> callBack, IGetFileCallBack iGetFileCallBack) {
    }

    @Deprecated
    public void cancelDownload(CallBack<Integer> callBack) {
    }

    private static /* synthetic */ void lambda$cancelDownload$22(CallBack callBack, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadStreamFile$21(IGetFileCallBack iGetFileCallBack, int n, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadStreamFile$20(IGetFileCallBack iGetFileCallBack, int n, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadStreamFile$19(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadStreamFile$18(CallBack callBack, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadFile$17(IGetFileCallBack iGetFileCallBack, int n, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadFile$16(int n, IGetFileCallBack iGetFileCallBack, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$deleteAllMediaFiles$15(RetCodeCallback retCodeCallback, int n, FileActionResponse fileActionResponse) {
    }

    private static /* synthetic */ void lambda$deleteAllMediaFiles$14(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$deleteAllMediaFiles$13(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$deleteMediaFiles$12(ICallback iCallback, int n, FileActionResponse fileActionResponse) {
    }

    private static /* synthetic */ void lambda$deleteMediaFiles$11(ICallback iCallback, int n, FileActionResponse fileActionResponse) {
    }

    private static /* synthetic */ void lambda$deleteMediaFiles$10(int n, ICallback iCallback, FileActionResponse fileActionResponse) {
    }

    private static /* synthetic */ void lambda$stopFetchLogFileList$9(CallBack callBack, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$stopFetchLogFileList$8(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$stopDownloadLogFile$7(CallBack callBack, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$stopDownloadLogFile$6(CallBack callBack, int n) {
    }

    private static /* synthetic */ void lambda$deleteLogFiles$5(IDeleteCommonFileCallback iDeleteCommonFileCallback, int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$deleteLogFiles$4(int n, IDeleteCommonFileCallback iDeleteCommonFileCallback, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$downloadLogFile$3(IFileDataTransferCallback iFileDataTransferCallback, int n, byte[] byArray, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$downloadLogFile$2(byte[] byArray, IFileDataTransferCallback iFileDataTransferCallback, int n, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$fetchLogFileList$1(IFetchCommonFileCallback iFetchCommonFileCallback, int n, byte[] byArray, byte[] byArray2) {
    }

    private static /* synthetic */ void lambda$fetchLogFileList$0(byte[] byArray, IFetchCommonFileCallback iFetchCommonFileCallback, int n) {
    }
}

