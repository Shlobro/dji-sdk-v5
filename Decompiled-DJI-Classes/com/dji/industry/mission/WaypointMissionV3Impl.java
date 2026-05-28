/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.reactivex.rxjava3.disposables.Disposable
 */
package com.dji.industry.mission;

import com.dji.industry.mission.IWaypointMissionOperator;
import dji.sdk.keyvalue.value.flightcontroller.FCRemoteControllerSwitchMode;
import dji.sdk.keyvalue.value.waypointv3.CurrentExcutingWaylineInfo;
import dji.sdk.keyvalue.value.waypointv3.ExecutingWaylineActionInfo;
import dji.sdk.keyvalue.value.waypointv3.MissionInfo;
import dji.sdk.keyvalue.value.waypointv3.PrecisePhotoFileFileInfo;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCode;
import dji.sdk.keyvalue.value.waypointv3.Waypoint3ErrorCodeMsg;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3BreakPointInfo;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3ExcutionResultInfo;
import dji.sdk.keyvalue.value.waypointv3.WaypointV3MissionState;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.aircraft.waypoint3.WaylineExecutingInfoListener;
import dji.v5.manager.aircraft.waypoint3.WaypointActionListener;
import dji.v5.manager.aircraft.waypoint3.WaypointMissionExecuteStateListener;
import dji.v5.manager.aircraft.waypoint3.model.BreakPointInfo;
import dji.v5.manager.aircraft.waypoint3.model.WaylineExecutingInfo;
import dji.v5.manager.aircraft.waypoint3.model.WaypointMissionExecuteState;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.List;

public class WaypointMissionV3Impl
implements IWaypointMissionOperator {
    private static final int PRODUCT_ID = 0;
    private static final int DEVICE_ID = 0;
    private static final String WAYPOINT_SAMPLE_FILE_CACHE_DIR = "waypoint/cache/";
    private static final String KMZ_FILE_TAG = ".kmz";
    private String currentMissionName;
    public static final String CURRENT_WP_NAME = "currentwaypointname";
    private Disposable mDisposable;
    private static final int DELAY_ADD_LISTENER_TIME = 1000;
    private boolean hasPrecisePhoto;
    List<PrecisePhotoFileFileInfo> precisePhotoFileFileInfoList;
    private FCRemoteControllerSwitchMode curRCSwitchFlightMode;
    private final List<WaypointMissionExecuteStateListener> waypointExecuteStateListeners;
    private final List<WaylineExecutingInfoListener> waylineExecuteStateListeners;
    private final List<WaypointActionListener> waypointActionListeners;
    private WaypointMissionExecuteState missionExecuteState;
    private WaylineExecutingInfo waylineExecutingInfo;
    private ExecutingWaylineActionInfo waylineActionInfo;
    private long missionExecuteStateHandler;
    private long missionWaylineInfoHandler;
    private long missionWaypoinActionInfoHandler;

    private void init() {
    }

    private void observeConnectState() {
    }

    private void addWaypointStatusListener() {
    }

    private void removeWaypointStatusListener() {
    }

    @Override
    public void pushKMZFileToAircraft(String string, CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    @Override
    public void startMission(String string, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startMission(String string, List<Integer> list, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startMission(String string, BreakPointInfo breakPointInfo, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void stopMission(String string, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void pauseMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void resumeMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void resumeMission(BreakPointInfo breakPointInfo, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void queryBreakPointInfoFromAircraft(String string, CommonCallbacks.CompletionCallbackWithParam<BreakPointInfo> completionCallbackWithParam) {
    }

    @Override
    public void addWaypointMissionExecuteStateListener(WaypointMissionExecuteStateListener waypointMissionExecuteStateListener) {
    }

    @Override
    public void removeWaypointMissionExecuteStateListener(WaypointMissionExecuteStateListener waypointMissionExecuteStateListener) {
    }

    @Override
    public void clearAllWaypointMissionExecuteStateListener() {
    }

    @Override
    public void addWaylineExecutingInfoListener(WaylineExecutingInfoListener waylineExecutingInfoListener) {
    }

    @Override
    public void removeWaylineExecutingInfoListener(WaylineExecutingInfoListener waylineExecutingInfoListener) {
    }

    @Override
    public void clearAllWaylineExecutingInfoListener() {
    }

    @Override
    public void addWaypointActionListener(WaypointActionListener waypointActionListener) {
    }

    @Override
    public void removeWaypointActionListener(WaypointActionListener waypointActionListener) {
    }

    @Override
    public void clearAllWaypointActionListener() {
    }

    private void missionTrackCallback(boolean bl, boolean bl2, List<Waypoint3ErrorCodeMsg> list, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private void recordMissionStateSuccess(EventType eventType) {
    }

    private void recordMissionStateSuccessFailure(EventType eventType, IDJIError iDJIError) {
    }

    private void callBack(EventType eventType, List<Waypoint3ErrorCodeMsg> list, CommonCallbacks.CompletionCallback completionCallback) {
    }

    private boolean errorFilter(Waypoint3ErrorCode waypoint3ErrorCode) {
        return false;
    }

    private void createMissionCacheDir() {
    }

    private String generateUUID(String string) {
        return null;
    }

    private MissionInfo getMissionInfo(List<Integer> list) {
        return null;
    }

    private void notifyMissionExecuteState(WaypointMissionExecuteState waypointMissionExecuteState) {
    }

    private void notifyWaylineExecutingInfo(WaylineExecutingInfo waylineExecutingInfo) {
    }

    private void notifyWaylineExecutingInterruptReason(IDJIError iDJIError) {
    }

    private void notifyWaypointActionState(ExecutingWaylineActionInfo executingWaylineActionInfo) {
    }

    private void notifyWaypointActionStateFinish(int n, int n2, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private void uploadMission(String string, CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    private void uploadPreciseImage(List<PrecisePhotoFileFileInfo> list, CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    @Override
    public void destroy() {
    }

    private static /* synthetic */ void lambda$uploadPreciseImage$27(List list, CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, int n, String string, double d2) {
    }

    private static /* synthetic */ void lambda$uploadPreciseImage$26(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private static /* synthetic */ void lambda$uploadMission$25(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, double d2) {
    }

    private static /* synthetic */ void lambda$uploadMission$24(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private static /* synthetic */ void lambda$uploadMission$23(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, double d2) {
    }

    private /* synthetic */ void lambda$uploadMission$22(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private /* synthetic */ void lambda$notifyWaypointActionState$21(ExecutingWaylineActionInfo executingWaylineActionInfo, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private /* synthetic */ void lambda$notifyWaypointActionState$20(ExecutingWaylineActionInfo executingWaylineActionInfo, long l2, long l3, WaypointV3ExcutionResultInfo waypointV3ExcutionResultInfo) {
    }

    private /* synthetic */ void lambda$notifyMissionExecuteState$19(Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private /* synthetic */ void lambda$notifyMissionExecuteState$18(long l2, long l3, WaypointV3BreakPointInfo waypointV3BreakPointInfo) {
    }

    private static /* synthetic */ void lambda$queryBreakPointInfoFromAircraft$17(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, Waypoint3ErrorCode waypoint3ErrorCode) {
    }

    private static /* synthetic */ void lambda$queryBreakPointInfoFromAircraft$16(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, long l2, long l3, WaypointV3BreakPointInfo waypointV3BreakPointInfo) {
    }

    private /* synthetic */ void lambda$resumeMission$15(CommonCallbacks.CompletionCallback completionCallback, List list) {
    }

    private /* synthetic */ void lambda$resumeMission$14(CommonCallbacks.CompletionCallback completionCallback, List list) {
    }

    private /* synthetic */ void lambda$pauseMission$13(CommonCallbacks.CompletionCallback completionCallback, List list) {
    }

    private /* synthetic */ void lambda$stopMission$12(CommonCallbacks.CompletionCallback completionCallback, List list) {
    }

    private /* synthetic */ void lambda$startMission$11(CommonCallbacks.CompletionCallback completionCallback, List list) {
    }

    private /* synthetic */ void lambda$startMission$10(CommonCallbacks.CompletionCallback completionCallback, List list) {
    }

    private /* synthetic */ void lambda$startMission$9(CommonCallbacks.CompletionCallback completionCallback, List list) {
    }

    private static /* synthetic */ void lambda$pushKMZFileToAircraft$8(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, Throwable throwable) throws Throwable {
    }

    private /* synthetic */ void lambda$pushKMZFileToAircraft$7(CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress, String string) throws Throwable {
    }

    private /* synthetic */ String lambda$pushKMZFileToAircraft$6(String string) throws Exception {
        return null;
    }

    private /* synthetic */ void lambda$addWaypointStatusListener$5() {
    }

    private /* synthetic */ void lambda$addWaypointStatusListener$4(long l2, long l3, ExecutingWaylineActionInfo executingWaylineActionInfo) {
    }

    private /* synthetic */ void lambda$addWaypointStatusListener$3(long l2, long l3, CurrentExcutingWaylineInfo currentExcutingWaylineInfo) {
    }

    private /* synthetic */ void lambda$addWaypointStatusListener$2(long l2, long l3, WaypointV3MissionState waypointV3MissionState) {
    }

    private /* synthetic */ void lambda$observeConnectState$1(FCRemoteControllerSwitchMode fCRemoteControllerSwitchMode, FCRemoteControllerSwitchMode fCRemoteControllerSwitchMode2) {
    }

    private /* synthetic */ void lambda$observeConnectState$0(Boolean bl, Boolean bl2) {
    }

    static /* synthetic */ boolean access$000(WaypointMissionV3Impl waypointMissionV3Impl) {
        return false;
    }

    static /* synthetic */ void access$100(WaypointMissionV3Impl waypointMissionV3Impl, String string, CommonCallbacks.CompletionCallbackWithProgress completionCallbackWithProgress) {
    }

    private static final class EventType
    extends Enum<EventType> {
        public static final /* enum */ EventType STOP = new EventType();
        public static final /* enum */ EventType PAUSE = new EventType();
        public static final /* enum */ EventType RESUME = new EventType();
        public static final /* enum */ EventType RESUMEWITHBREAK = new EventType();
        public static final /* enum */ EventType UNKNOW = new EventType();
        private static final /* synthetic */ EventType[] $VALUES;

        public static EventType[] values() {
            return null;
        }

        public static EventType valueOf(String string) {
            return null;
        }

        private static /* synthetic */ EventType[] $values() {
            return null;
        }

        static {
            $VALUES = EventType.$values();
        }
    }
}

