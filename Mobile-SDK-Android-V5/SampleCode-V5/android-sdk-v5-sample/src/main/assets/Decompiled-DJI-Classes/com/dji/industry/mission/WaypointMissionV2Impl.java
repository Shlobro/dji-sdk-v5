/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission;

import com.dji.industry.mission.IWaypointMissionOperator;
import com.dji.industry.mission.waypointv2.abstraction.WaypointV2Abstraction;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.waypoint3.WaylineExecutingInfoListener;
import dji.v5.manager.aircraft.waypoint3.WaypointActionListener;
import dji.v5.manager.aircraft.waypoint3.WaypointMissionExecuteStateListener;
import dji.v5.manager.aircraft.waypoint3.model.BreakPointInfo;
import java.util.List;

public class WaypointMissionV2Impl
implements IWaypointMissionOperator {
    private final WaypointV2Abstraction waypointV2Abstraction;

    @Override
    public void pushKMZFileToAircraft(String string, CommonCallbacks.CompletionCallbackWithProgress<Double> completionCallbackWithProgress) {
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
    public void destroy() {
    }
}

