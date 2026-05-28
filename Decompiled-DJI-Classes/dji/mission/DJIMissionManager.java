/*
 * Decompiled with CFR 0.152.
 */
package dji.mission;

import dji.csdk.flysafe.DJIFlysafeManager;
import dji.mission.tracking.DJITrackingManager;
import dji.mission.tracking.TrackingMissionManagerInfrastructure;
import dji.mission.waypoint.DJIWaypointV1Manager;
import java.util.HashMap;
import java.util.Map;

public final class DJIMissionManager {
    private static DJIMissionManager instance = null;
    private static Map<Long, DJITrackingManager> trackingManagerRecorder = new HashMap<Long, DJITrackingManager>();
    private static Map<Long, DJIWaypointV1Manager> waypoint1ManagerRecorder = new HashMap<Long, DJIWaypointV1Manager>();
    private static Map<Long, DJIFlysafeManager> flysafeManagerRecorder = new HashMap<Long, DJIFlysafeManager>();

    public static DJIMissionManager getInstance() {
        return null;
    }

    public TrackingMissionManagerInfrastructure getTrackingMissionManager() {
        return null;
    }

    public DJIWaypointV1Manager getWaypoint1Manager() {
        return null;
    }

    public DJIFlysafeManager getFlysafeManager() {
        return null;
    }

    public TrackingMissionManagerInfrastructure getTrackingMissionManager(int n) {
        return null;
    }

    public DJIWaypointV1Manager getWaypoint1Manager(int n) {
        return null;
    }

    public DJIFlysafeManager getFlysafeManager(int n) {
        return null;
    }

    public TrackingMissionManagerInfrastructure getTrackingMissionManager(int n, int n2) {
        return null;
    }

    public DJIWaypointV1Manager getWaypoint1Manager(int n, int n2) {
        return null;
    }

    public DJIFlysafeManager getFlysafeManager(int n, int n2) {
        return null;
    }

    private void init() {
    }

    private long getManagerKey(int n, int n2) {
        return 0L;
    }

    private /* synthetic */ void lambda$init$0(int n, boolean bl, int n2, int n3) {
    }
}

