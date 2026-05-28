/*
 * Decompiled with CFR 0.152.
 */
package dji.jni.callback;

import dji.jni.JNIProguardKeepTag;
import dji.jni.callback.ResultCodeCallback;
import dji.jni.waypointv3.Waypoint3CommonErrorCodeCallback;
import dji.jni.waypointv3.Waypoint3ErrorCodeCallback;
import dji.jni.waypointv3.Waypoint3TransferStateCallback;
import dji.jni.waypointv3.WaypointV3BreakPointInfoCallback;
import dji.jni.waypointv3.WaypointV3ExcutingActionInfoCallback;
import dji.jni.waypointv3.WaypointV3ExcutingWaylineInfoCallback;
import dji.jni.waypointv3.WaypointV3ExcutionResultInfoCallback;
import dji.jni.waypointv3.WaypointV3MissionStateCallback;
import dji.jni.waypointv3.WaypointV3PrecisePhotoTransferStateCallback;
import dji.media.album.jni.FileActionCallback;
import dji.media.album.jni.FileTaskCallback;
import dji.media.player.jni.PlaybackAudioCallback;
import dji.media.player.jni.PlaybackStateCallback;
import dji.media.player.jni.PlaybackVideoCallback;
import dji.sdk.common.BoolCallback;
import dji.sdk.common.ClientIdResultCallback;
import dji.sdk.common.DJIErrorCodeCallback;
import dji.sdk.common.GetAllClientsMapCallback;
import dji.sdk.common.GetAllTimeDeltaCacheCallback;
import dji.sdk.common.ListenerResultCallback;
import dji.sdk.common.RequireNumberCallback;
import dji.sdk.common.RetCodeCallback;
import dji.sdk.common.StringCallback;
import dji.sdk.deactivate.DeActivateResultCallback;
import dji.sdk.diagnostics.DiagnosticsUpdateCallback;
import dji.sdk.diagnostics.HMSDiagnosticsFilterCallback;
import dji.sdk.diagnostics.HMSDiagnosticsUpdateCallback;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.flight_task_replay.FlightTaskRecordActionCallback;
import dji.sdk.flight_task_replay.FlightTaskRecordFileActionCallback;
import dji.sdk.flight_task_replay.FlightTaskRecordFileInfoCallback;
import dji.sdk.flight_task_replay.FlightTaskRecordFileInfoObserver;
import dji.sdk.hmslog.HMSCodeModuleMapLoadCallback;
import dji.sdk.hmslog.HMSLogDownloadCallback;
import dji.sdk.hmslog.HMSLogDownloadStateUpadateCallback;
import dji.sdk.hmslog.HMSLogFetchListCallback;
import dji.sdk.hmslog.HMSLogUserLockCheckCallback;
import dji.sdk.hmslog.HMSLogUserLockResultCallback;
import dji.sdk.innertools.CmdWatchCallback;
import dji.sdk.innertools.MSDKKeyCallback;
import dji.sdk.keyvalue.value.activate.ActivateComponentInfoMsg;
import dji.sdk.keyvalue.value.channel.ChannelMode;
import dji.sdk.keyvalue.value.file.FileActionResponse;
import dji.sdk.keyvalue.value.file.FileTaskResponse;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecordErrorCde;
import dji.sdk.keyvalue.value.flighttaskreplay.FlightTaskRecordFileMsg;
import dji.sdk.keyvalue.value.hmslog.HMSCodeModuleMapLoadErrorCode;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadRequest;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadRequestErrorCode;
import dji.sdk.keyvalue.value.hmslog.HMSLogDownloadState;
import dji.sdk.keyvalue.value.hmslog.HMSLogLockResultInfo;
import dji.sdk.keyvalue.value.hmslog.HMSLogLockSupportedInfo;
import dji.sdk.keyvalue.value.innertool.V1PackHeader;
import dji.sdk.keyvalue.value.logexport.LogExportCompressProgress;
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectRsp;
import dji.sdk.keyvalue.value.logexport.LogExportFtpControlRsp;
import dji.sdk.keyvalue.value.media.MediaPlaybackState;
import dji.sdk.keyvalue.value.multiclientsync.MCSDataModel;
import dji.sdk.keyvalue.value.payload.MegaphoneErrorCodeMsg;
import dji.sdk.keyvalue.value.payload.MegaphoneUploadProgressMsg;
import dji.sdk.keyvalue.value.uploadfile.UploadFileCallBackStatus;
import dji.sdk.keyvalue.value.waypointv3.CurrentExcutingWaylineInfo;
import dji.sdk.keyvalue.value.waypointv3.ExecutingWaylineActionInfo;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3BreakPointInfo;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3ExcutionResultInfo;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3MissionState;
import dji.sdk.keyvalue.value.zipfile.BatchZipCallBackStatus;
import dji.sdk.keyvalue.value.zipfile.ZipCallBackStatus;
import dji.sdk.log_export.LogExportCompressProgressCallback;
import dji.sdk.log_export.LogExportFileSelectCallback;
import dji.sdk.log_export.LogExportFtpControlCallback;
import dji.sdk.log_export.RetCodeStringCallback;
import dji.sdk.mcs.ClearAllDataModelCallback;
import dji.sdk.mcs.DataChangeNotificationObserver;
import dji.sdk.mcs.GetAllDataModelsCallback;
import dji.sdk.mcs.InternalDataChangeNotificationObserver;
import dji.sdk.mcs.TimeDeltaNotificationObserver;
import dji.sdk.mop.PipelineConnectionObserver;
import dji.sdk.payload.callback.MegaphoneCancelCallback;
import dji.sdk.payload.callback.MegaphoneErrorCodeCallback;
import dji.sdk.payload.callback.MegaphoneUploadProgressCallback;
import dji.sdk.planestatuscode.jni.PlaneStatusCodeListener;
import dji.sdk.statuscode.jni.StatusCodeUpdateCallback;
import dji.sdk.uploadfile.HasTaskObserver;
import dji.sdk.uploadfile.UploadFileCallback;
import dji.sdk.wififast.PhoneConnectStateCallback;
import dji.sdk.wififast.WiFiDataLinkConnectStateCallback;
import dji.sdk.wififast.WiFiFastStateCallback;
import dji.sdk.zipfile.BatchZipFileCallback;
import dji.sdk.zipfile.ZipFileCallback;
import java.util.List;
import java.util.Map;

public class CallbackHelper
implements JNIProguardKeepTag {
    private static void callBoolCallback(BoolCallback boolCallback, boolean bl) {
    }

    private static void callStringCallback(StringCallback stringCallback, String string2) {
    }

    private static void callHasTaskObserver(HasTaskObserver hasTaskObserver, boolean bl) {
    }

    private static int callMSDKKeyCallback(MSDKKeyCallback mSDKKeyCallback, String string2, int n) {
        return 0;
    }

    private static void callRetCodeCallback(RetCodeCallback retCodeCallback, int n) {
    }

    private static void callZipFileCallback(ZipFileCallback zipFileCallback, long l2, byte[] byArray) {
    }

    private static void callCmdWatchCallback(CmdWatchCallback cmdWatchCallback, boolean bl, long l2, byte[] byArray, byte[] byArray2) {
    }

    private static void callFileTaskCallback(FileTaskCallback fileTaskCallback, int n, byte[] byArray, byte[] byArray2) {
    }

    private static void callFileActionCallback(FileActionCallback fileActionCallback, int n, byte[] byArray) {
    }

    private static void callResultCodeCallback(ResultCodeCallback resultCodeCallback, int n) {
    }

    private static void callUploadFileCallback(UploadFileCallback uploadFileCallback, long l2, byte[] byArray) {
    }

    private static void callBatchZipFileCallback(BatchZipFileCallback batchZipFileCallback, long l2, byte[] byArray) {
    }

    private static void callDJIErrorCodeCallback(DJIErrorCodeCallback dJIErrorCodeCallback, int n) {
    }

    private static void callPlaybackAudioCallback(PlaybackAudioCallback playbackAudioCallback, long l2, char c2, double d2, byte[] byArray) {
    }

    private static void callPlaybackStateCallback(PlaybackStateCallback playbackStateCallback, long l2, char c2, byte[] byArray) {
    }

    private static void callPlaybackVideoCallback(PlaybackVideoCallback playbackVideoCallback, long l2, char c2, boolean bl, double d2, byte[] byArray) {
    }

    private static void callRequireNumberCallback(RequireNumberCallback requireNumberCallback, int n) {
    }

    private static void callRetCodeStringCallback(RetCodeStringCallback retCodeStringCallback, int n, String string2) {
    }

    private static void callWiFiFastStateCallback(WiFiFastStateCallback wiFiFastStateCallback, boolean bl) {
    }

    private static void callClientIdResultCallback(ClientIdResultCallback clientIdResultCallback, int n, long l2) {
    }

    private static void callHMSLogDownloadCallback(HMSLogDownloadCallback hMSLogDownloadCallback, int n, int n2, String string2, int n3) {
    }

    private static void callListenerResultCallback(ListenerResultCallback listenerResultCallback, int n, long l2) {
    }

    private static void callHMSLogFetchListCallback(HMSLogFetchListCallback hMSLogFetchListCallback, int n, int n2, List<byte[]> list, int n3) {
    }

    private static void callMegaphoneCancelCallback(MegaphoneCancelCallback megaphoneCancelCallback, boolean bl) {
    }

    private static void callPlaneStatusCodeListener(PlaneStatusCodeListener planeStatusCodeListener, long l2, long l3) {
    }

    private static void callDeActivateResultCallback(DeActivateResultCallback deActivateResultCallback, int n, int n2, byte[] byArray) {
    }

    private static void callGetAllClientsMapCallback(GetAllClientsMapCallback getAllClientsMapCallback, Map<Long, Integer> map) {
    }

    private static void callGetAllDataModelsCallback(GetAllDataModelsCallback getAllDataModelsCallback, List<byte[]> list) {
    }

    private static void callStatusCodeUpdateCallback(StatusCodeUpdateCallback statusCodeUpdateCallback, int n, int n2, long l2) {
    }

    private static void callClearAllDataModelCallback(ClearAllDataModelCallback clearAllDataModelCallback, Map<Long, Integer> map) {
    }

    private static void callDiagnosticsUpdateCallback(DiagnosticsUpdateCallback diagnosticsUpdateCallback, int n, int n2, List<byte[]> list) {
    }

    private static void callPhoneConnectStateCallback(PhoneConnectStateCallback phoneConnectStateCallback, boolean bl) {
    }

    private static void callMegaphoneErrorCodeCallback(MegaphoneErrorCodeCallback megaphoneErrorCodeCallback, byte[] byArray) {
    }

    private static void callPipelineConnectionObserver(PipelineConnectionObserver pipelineConnectionObserver, int n, int n2, List<byte[]> list) {
    }

    private static void callWaypoint3ErrorCodeCallback(Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback, List<byte[]> list) {
    }

    private static void callHMSLogUserLockCheckCallback(HMSLogUserLockCheckCallback hMSLogUserLockCheckCallback, int n, int n2, byte[] byArray) {
    }

    private static void callLogExportFileSelectCallback(LogExportFileSelectCallback logExportFileSelectCallback, int n, int n2, byte[] byArray) {
    }

    private static void callLogExportFtpControlCallback(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, byte[] byArray) {
    }

    private static void callGetAllTimeDeltaCacheCallback(GetAllTimeDeltaCacheCallback getAllTimeDeltaCacheCallback, List<byte[]> list) {
    }

    private static void callHMSCodeModuleMapLoadCallback(HMSCodeModuleMapLoadCallback hMSCodeModuleMapLoadCallback, int n) {
    }

    private static boolean callHMSDiagnosticsFilterCallback(HMSDiagnosticsFilterCallback hMSDiagnosticsFilterCallback, int n, int n2, byte[] byArray) {
        return false;
    }

    private static void callHMSDiagnosticsUpdateCallback(HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback, int n, int n2, List<byte[]> list) {
    }

    private static void callHMSLogUserLockResultCallback(HMSLogUserLockResultCallback hMSLogUserLockResultCallback, int n, int n2, byte[] byArray) {
    }

    private static void callTimeDeltaNotificationObserver(TimeDeltaNotificationObserver timeDeltaNotificationObserver, int n, long l2, int n2) {
    }

    private static void callDataChangeNotificationObserver(DataChangeNotificationObserver dataChangeNotificationObserver, byte[] byArray, boolean bl) {
    }

    private static void callFlightTaskRecordActionCallback(FlightTaskRecordActionCallback flightTaskRecordActionCallback, long l2, int n) {
    }

    private static void callWaypoint3TransferStateCallback(Waypoint3TransferStateCallback waypoint3TransferStateCallback, double d2) {
    }

    private static void callWaypointV3MissionStateCallback(WaypointV3MissionStateCallback waypointV3MissionStateCallback, long l2, long l3, int n) {
    }

    private static void callMegaphoneUploadProgressCallback(MegaphoneUploadProgressCallback megaphoneUploadProgressCallback, byte[] byArray) {
    }

    private static void callFlightTaskRecordFileInfoCallback(FlightTaskRecordFileInfoCallback flightTaskRecordFileInfoCallback, long l2, int n, String string2, String string3, String string4) {
    }

    private static void callFlightTaskRecordFileInfoObserver(FlightTaskRecordFileInfoObserver flightTaskRecordFileInfoObserver, long l2, byte[] byArray, int n) {
    }

    private static void callWaypoint3CommonErrorCodeCallback(Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback, int n) {
    }

    private static void callWaypointV3BreakPointInfoCallback(WaypointV3BreakPointInfoCallback waypointV3BreakPointInfoCallback, long l2, long l3, byte[] byArray) {
    }

    private static void callWiFiDataLinkConnectStateCallback(WiFiDataLinkConnectStateCallback wiFiDataLinkConnectStateCallback, boolean bl) {
    }

    private static void callLogExportCompressProgressCallback(LogExportCompressProgressCallback logExportCompressProgressCallback, int n, int n2, byte[] byArray) {
    }

    private static void callFlightTaskRecordFileActionCallback(FlightTaskRecordFileActionCallback flightTaskRecordFileActionCallback, long l2, int n, String string2) {
    }

    private static void callHMSLogDownloadStateUpadateCallback(HMSLogDownloadStateUpadateCallback hMSLogDownloadStateUpadateCallback, int n, int n2, byte[] byArray, byte[] byArray2) {
    }

    private static void callWaypointV3ExcutingActionInfoCallback(WaypointV3ExcutingActionInfoCallback waypointV3ExcutingActionInfoCallback, long l2, long l3, byte[] byArray) {
    }

    private static void callWaypointV3ExcutionResultInfoCallback(WaypointV3ExcutionResultInfoCallback waypointV3ExcutionResultInfoCallback, long l2, long l3, byte[] byArray) {
    }

    private static void callWaypointV3ExcutingWaylineInfoCallback(WaypointV3ExcutingWaylineInfoCallback waypointV3ExcutingWaylineInfoCallback, long l2, long l3, byte[] byArray) {
    }

    private static void callInternalDataChangeNotificationObserver(InternalDataChangeNotificationObserver internalDataChangeNotificationObserver, byte[] byArray, boolean bl) {
    }

    private static void callWaypointV3PrecisePhotoTransferStateCallback(WaypointV3PrecisePhotoTransferStateCallback waypointV3PrecisePhotoTransferStateCallback, int n, String string2, double d2) {
    }

    private static /* synthetic */ void lambda$callWaypointV3PrecisePhotoTransferStateCallback$59(WaypointV3PrecisePhotoTransferStateCallback waypointV3PrecisePhotoTransferStateCallback, int n, String string2, double d2) {
    }

    private static /* synthetic */ void lambda$callInternalDataChangeNotificationObserver$58(InternalDataChangeNotificationObserver internalDataChangeNotificationObserver, MCSDataModel mCSDataModel, boolean bl) {
    }

    private static /* synthetic */ void lambda$callWaypointV3ExcutingWaylineInfoCallback$57(WaypointV3ExcutingWaylineInfoCallback waypointV3ExcutingWaylineInfoCallback, long l2, long l3, CurrentExcutingWaylineInfo currentExcutingWaylineInfo) {
    }

    private static /* synthetic */ void lambda$callWaypointV3ExcutionResultInfoCallback$56(WaypointV3ExcutionResultInfoCallback waypointV3ExcutionResultInfoCallback, long l2, long l3, WaypointV3ExcutionResultInfo waypointV3ExcutionResultInfo) {
    }

    private static /* synthetic */ void lambda$callWaypointV3ExcutingActionInfoCallback$55(WaypointV3ExcutingActionInfoCallback waypointV3ExcutingActionInfoCallback, long l2, long l3, ExecutingWaylineActionInfo executingWaylineActionInfo) {
    }

    private static /* synthetic */ void lambda$callHMSLogDownloadStateUpadateCallback$54(HMSLogDownloadStateUpadateCallback hMSLogDownloadStateUpadateCallback, int n, int n2, HMSLogDownloadRequest hMSLogDownloadRequest, HMSLogDownloadState hMSLogDownloadState) {
    }

    private static /* synthetic */ void lambda$callFlightTaskRecordFileActionCallback$53(FlightTaskRecordFileActionCallback flightTaskRecordFileActionCallback, long l2, FlightTaskRecordErrorCde flightTaskRecordErrorCde, String string2) {
    }

    private static /* synthetic */ void lambda$callLogExportCompressProgressCallback$52(LogExportCompressProgressCallback logExportCompressProgressCallback, int n, int n2, LogExportCompressProgress logExportCompressProgress) {
    }

    private static /* synthetic */ void lambda$callWiFiDataLinkConnectStateCallback$51(WiFiDataLinkConnectStateCallback wiFiDataLinkConnectStateCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$callWaypointV3BreakPointInfoCallback$50(WaypointV3BreakPointInfoCallback waypointV3BreakPointInfoCallback, long l2, long l3, WaypointV3BreakPointInfo waypointV3BreakPointInfo) {
    }

    private static /* synthetic */ void lambda$callWaypoint3CommonErrorCodeCallback$49(Waypoint3CommonErrorCodeCallback waypoint3CommonErrorCodeCallback, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private static /* synthetic */ void lambda$callFlightTaskRecordFileInfoObserver$48(FlightTaskRecordFileInfoObserver flightTaskRecordFileInfoObserver, long l2, FlightTaskRecordFileMsg flightTaskRecordFileMsg, FlightTaskRecordErrorCde flightTaskRecordErrorCde) {
    }

    private static /* synthetic */ void lambda$callFlightTaskRecordFileInfoCallback$47(FlightTaskRecordFileInfoCallback flightTaskRecordFileInfoCallback, long l2, FlightTaskRecordErrorCde flightTaskRecordErrorCde, String string2, String string3, String string4) {
    }

    private static /* synthetic */ void lambda$callMegaphoneUploadProgressCallback$46(MegaphoneUploadProgressCallback megaphoneUploadProgressCallback, MegaphoneUploadProgressMsg megaphoneUploadProgressMsg) {
    }

    private static /* synthetic */ void lambda$callWaypointV3MissionStateCallback$45(WaypointV3MissionStateCallback waypointV3MissionStateCallback, long l2, long l3, WaypointV3MissionState waypointV3MissionState) {
    }

    private static /* synthetic */ void lambda$callWaypoint3TransferStateCallback$44(Waypoint3TransferStateCallback waypoint3TransferStateCallback, double d2) {
    }

    private static /* synthetic */ void lambda$callFlightTaskRecordActionCallback$43(FlightTaskRecordActionCallback flightTaskRecordActionCallback, long l2, FlightTaskRecordErrorCde flightTaskRecordErrorCde) {
    }

    private static /* synthetic */ void lambda$callDataChangeNotificationObserver$42(DataChangeNotificationObserver dataChangeNotificationObserver, MCSDataModel mCSDataModel, boolean bl) {
    }

    private static /* synthetic */ void lambda$callTimeDeltaNotificationObserver$41(TimeDeltaNotificationObserver timeDeltaNotificationObserver, ChannelMode channelMode, long l2, int n) {
    }

    private static /* synthetic */ void lambda$callHMSLogUserLockResultCallback$40(HMSLogUserLockResultCallback hMSLogUserLockResultCallback, int n, int n2, HMSLogLockResultInfo hMSLogLockResultInfo) {
    }

    private static /* synthetic */ void lambda$callHMSDiagnosticsUpdateCallback$39(HMSDiagnosticsUpdateCallback hMSDiagnosticsUpdateCallback, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$callHMSCodeModuleMapLoadCallback$38(HMSCodeModuleMapLoadCallback hMSCodeModuleMapLoadCallback, HMSCodeModuleMapLoadErrorCode hMSCodeModuleMapLoadErrorCode) {
    }

    private static /* synthetic */ void lambda$callGetAllTimeDeltaCacheCallback$37(GetAllTimeDeltaCacheCallback getAllTimeDeltaCacheCallback, List list) {
    }

    private static /* synthetic */ void lambda$callLogExportFtpControlCallback$36(LogExportFtpControlCallback logExportFtpControlCallback, int n, int n2, LogExportFtpControlRsp logExportFtpControlRsp) {
    }

    private static /* synthetic */ void lambda$callLogExportFileSelectCallback$35(LogExportFileSelectCallback logExportFileSelectCallback, int n, int n2, LogExportFileSelectRsp logExportFileSelectRsp) {
    }

    private static /* synthetic */ void lambda$callHMSLogUserLockCheckCallback$34(HMSLogUserLockCheckCallback hMSLogUserLockCheckCallback, int n, int n2, HMSLogLockSupportedInfo hMSLogLockSupportedInfo) {
    }

    private static /* synthetic */ void lambda$callWaypoint3ErrorCodeCallback$33(Waypoint3ErrorCodeCallback waypoint3ErrorCodeCallback, List list) {
    }

    private static /* synthetic */ void lambda$callPipelineConnectionObserver$32(PipelineConnectionObserver pipelineConnectionObserver, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$callMegaphoneErrorCodeCallback$31(MegaphoneErrorCodeCallback megaphoneErrorCodeCallback, MegaphoneErrorCodeMsg megaphoneErrorCodeMsg) {
    }

    private static /* synthetic */ void lambda$callPhoneConnectStateCallback$30(PhoneConnectStateCallback phoneConnectStateCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$callDiagnosticsUpdateCallback$29(DiagnosticsUpdateCallback diagnosticsUpdateCallback, int n, int n2, List list) {
    }

    private static /* synthetic */ void lambda$callClearAllDataModelCallback$28(ClearAllDataModelCallback clearAllDataModelCallback, Map map) {
    }

    private static /* synthetic */ void lambda$callStatusCodeUpdateCallback$27(StatusCodeUpdateCallback statusCodeUpdateCallback, int n, int n2, long l2) {
    }

    private static /* synthetic */ void lambda$callGetAllDataModelsCallback$26(GetAllDataModelsCallback getAllDataModelsCallback, List list) {
    }

    private static /* synthetic */ void lambda$callGetAllClientsMapCallback$25(GetAllClientsMapCallback getAllClientsMapCallback, Map map) {
    }

    private static /* synthetic */ void lambda$callDeActivateResultCallback$24(DeActivateResultCallback deActivateResultCallback, int n, int n2, ActivateComponentInfoMsg activateComponentInfoMsg) {
    }

    private static /* synthetic */ void lambda$callPlaneStatusCodeListener$23(PlaneStatusCodeListener planeStatusCodeListener, long l2, long l3) {
    }

    private static /* synthetic */ void lambda$callMegaphoneCancelCallback$22(MegaphoneCancelCallback megaphoneCancelCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$callHMSLogFetchListCallback$21(HMSLogFetchListCallback hMSLogFetchListCallback, int n, int n2, List list, HMSLogDownloadRequestErrorCode hMSLogDownloadRequestErrorCode) {
    }

    private static /* synthetic */ void lambda$callListenerResultCallback$20(ListenerResultCallback listenerResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$callHMSLogDownloadCallback$19(HMSLogDownloadCallback hMSLogDownloadCallback, int n, int n2, String string2, HMSLogDownloadRequestErrorCode hMSLogDownloadRequestErrorCode) {
    }

    private static /* synthetic */ void lambda$callClientIdResultCallback$18(ClientIdResultCallback clientIdResultCallback, int n, long l2) {
    }

    private static /* synthetic */ void lambda$callWiFiFastStateCallback$17(WiFiFastStateCallback wiFiFastStateCallback, boolean bl) {
    }

    private static /* synthetic */ void lambda$callRetCodeStringCallback$16(RetCodeStringCallback retCodeStringCallback, int n, String string2) {
    }

    private static /* synthetic */ void lambda$callRequireNumberCallback$15(RequireNumberCallback requireNumberCallback, int n) {
    }

    private static /* synthetic */ void lambda$callPlaybackVideoCallback$14(PlaybackVideoCallback playbackVideoCallback, long l2, char c2, boolean bl, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$callPlaybackStateCallback$13(PlaybackStateCallback playbackStateCallback, long l2, char c2, MediaPlaybackState mediaPlaybackState) {
    }

    private static /* synthetic */ void lambda$callPlaybackAudioCallback$12(PlaybackAudioCallback playbackAudioCallback, long l2, char c2, double d2, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$callDJIErrorCodeCallback$11(DJIErrorCodeCallback dJIErrorCodeCallback, DJIErrorCode dJIErrorCode) {
    }

    private static /* synthetic */ void lambda$callBatchZipFileCallback$10(BatchZipFileCallback batchZipFileCallback, long l2, BatchZipCallBackStatus batchZipCallBackStatus) {
    }

    private static /* synthetic */ void lambda$callUploadFileCallback$9(UploadFileCallback uploadFileCallback, long l2, UploadFileCallBackStatus uploadFileCallBackStatus) {
    }

    private static /* synthetic */ void lambda$callResultCodeCallback$8(ResultCodeCallback resultCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$callFileActionCallback$7(FileActionCallback fileActionCallback, int n, FileActionResponse fileActionResponse) {
    }

    private static /* synthetic */ void lambda$callFileTaskCallback$6(FileTaskCallback fileTaskCallback, int n, FileTaskResponse fileTaskResponse, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$callCmdWatchCallback$5(CmdWatchCallback cmdWatchCallback, boolean bl, long l2, V1PackHeader v1PackHeader, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$callZipFileCallback$4(ZipFileCallback zipFileCallback, long l2, ZipCallBackStatus zipCallBackStatus) {
    }

    private static /* synthetic */ void lambda$callRetCodeCallback$3(RetCodeCallback retCodeCallback, int n) {
    }

    private static /* synthetic */ void lambda$callHasTaskObserver$2(HasTaskObserver hasTaskObserver, boolean bl) {
    }

    private static /* synthetic */ void lambda$callStringCallback$1(StringCallback stringCallback, String string2) {
    }

    private static /* synthetic */ void lambda$callBoolCallback$0(BoolCallback boolCallback, boolean bl) {
    }
}

