/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.aspectj.lang.JoinPoint$StaticPart
 */
package dji.v5.manager.aircraft.waypoint3;

import com.dji.industry.mission.IWaypointMissionOperator;
import dji.sdk.keyvalue.value.product.ProductType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.inner.analytics.annotation.TrackElements;
import dji.v5.inner.analytics.annotation.TrackEvent;
import dji.v5.manager.aircraft.waypoint3.WaylineExecutingInfoListener;
import dji.v5.manager.aircraft.waypoint3.WaypointActionListener;
import dji.v5.manager.aircraft.waypoint3.WaypointMissionExecuteStateListener;
import dji.v5.manager.aircraft.waypoint3.model.BreakPointInfo;
import dji.v5.manager.interfaces.IWaypointMissionManager;
import java.util.List;
import org.aspectj.lang.JoinPoint;

public class WaypointMissionManager
implements IWaypointMissionManager {
    public static final String LATEST_WAYPOINT_FILE_PATH = "missionFilePath";
    private ProductType productType;
    private IWaypointMissionOperator waypointMissionOperator;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;

    private WaypointMissionManager() {
    }

    public void init() {
    }

    public static WaypointMissionManager getInstance() {
        return null;
    }

    @Override
    public void pushKMZFileToAircraft(String string2, CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
    }

    @Override
    @TrackEvent(eventName="startMission", category="ManagerAnnotation")
    public void startMission(String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="startMission", category="ManagerAnnotation")
    public void startMission(String string2, List<Integer> list, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void startMission(String string2, BreakPointInfo breakPointInfo, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="stopMission", category="ManagerAnnotation")
    public void stopMission(@TrackElements(value="missionFileName") String string2, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="pauseMission", category="ManagerAnnotation")
    public void pauseMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="resumeMission", category="ManagerAnnotation")
    public void resumeMission(CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    @TrackEvent(eventName="resumeMission", category="ManagerAnnotation")
    public void resumeMission(@TrackElements(value="pointInfo") BreakPointInfo breakPointInfo, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public void queryBreakPointInfoFromAircraft(String string2, CommonCallbacks.CompletionCallbackWithParam<BreakPointInfo> completionCallbackWithParam) {
    }

    @Override
    public List<Integer> getAvailableWaylineIDs(String string2) {
        return null;
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

    private void observeProductType() {
    }

    public void destroy() {
    }

    private /* synthetic */ void lambda$observeProductType$0(ProductType productType, ProductType productType2) {
    }

    /* synthetic */ WaypointMissionManager(1 var1_1) {
    }

    static {
        WaypointMissionManager.ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
    }

    private static class LazyLoader {
        private static final WaypointMissionManager INSTANCE = new WaypointMissionManager(null);

        private LazyLoader() {
        }

        static /* synthetic */ WaypointMissionManager access$100() {
            return null;
        }
    }
}

