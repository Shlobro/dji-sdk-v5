/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.mission;

public enum WaypointMissionGotoWaypointMode {
    GotoWaypointSafely(0),
    GotoWaypointPointToPoint(1);

    private final int value;

    private WaypointMissionGotoWaypointMode(int value) {
        this.value = value;
    }

    public static WaypointMissionGotoWaypointMode fromValue(int value) {
        switch (value) {
            case 0: {
                return GotoWaypointSafely;
            }
            case 1: {
                return GotoWaypointPointToPoint;
            }
        }
        return null;
    }

    public int getValue() {
        return this.value;
    }
}

