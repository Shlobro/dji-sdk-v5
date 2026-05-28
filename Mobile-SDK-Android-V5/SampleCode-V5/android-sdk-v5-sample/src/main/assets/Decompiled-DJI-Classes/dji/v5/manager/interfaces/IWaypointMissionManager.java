/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.interfaces;

import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.waypoint3.WaylineExecutingInfoListener;
import dji.v5.manager.aircraft.waypoint3.WaypointActionListener;
import dji.v5.manager.aircraft.waypoint3.WaypointMissionExecuteStateListener;
import dji.v5.manager.aircraft.waypoint3.model.BreakPointInfo;
import java.util.List;

public interface IWaypointMissionManager {
    public void pushKMZFileToAircraft(String var1, CommonCallbacks.CompletionCallbackWithProgress<Double> var2);

    public void addWaypointMissionExecuteStateListener(WaypointMissionExecuteStateListener var1);

    public void removeWaypointMissionExecuteStateListener(WaypointMissionExecuteStateListener var1);

    public void clearAllWaypointMissionExecuteStateListener();

    public void addWaylineExecutingInfoListener(WaylineExecutingInfoListener var1);

    public void removeWaylineExecutingInfoListener(WaylineExecutingInfoListener var1);

    public void clearAllWaylineExecutingInfoListener();

    public void addWaypointActionListener(WaypointActionListener var1);

    public void removeWaypointActionListener(WaypointActionListener var1);

    public void clearAllWaypointActionListener();

    public void startMission(String var1, CommonCallbacks.CompletionCallback var2);

    public List<Integer> getAvailableWaylineIDs(String var1);

    public void startMission(String var1, List<Integer> var2, CommonCallbacks.CompletionCallback var3);

    public void startMission(String var1, BreakPointInfo var2, CommonCallbacks.CompletionCallback var3);

    public void stopMission(String var1, CommonCallbacks.CompletionCallback var2);

    public void pauseMission(CommonCallbacks.CompletionCallback var1);

    public void resumeMission(CommonCallbacks.CompletionCallback var1);

    public void resumeMission(BreakPointInfo var1, CommonCallbacks.CompletionCallback var2);

    public void queryBreakPointInfoFromAircraft(String var1, CommonCallbacks.CompletionCallbackWithParam<BreakPointInfo> var2);
}

