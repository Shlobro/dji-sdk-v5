/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

public enum WaypointActionType {
    STAY(0),
    START_TAKE_PHOTO(1),
    START_RECORD(2),
    STOP_RECORD(3),
    ROTATE_AIRCRAFT(4),
    GIMBAL_PITCH(5),
    GIMBAL_YAW(6),
    CAMERA_ZOOM(7),
    CAMERA_FOCUS(8),
    START_TIME_INTERVAL_SHOT(4097),
    START_DISTANCE_INTERVAL_SHOT(4098),
    STOP_INTERVAL_SHOT(4099),
    PRECISE_SHOT(4100),
    CAMERA_MKDIR(4101),
    NORMAL_PRECISE_SHOT(4102),
    ORIENTED_SHOT(4103),
    PANO_SHOT(4104),
    MEGAPHONE(4105),
    SEARCHLIGHT(4107),
    PAYLOAD_BUTTON(4353),
    PAYLOAD_SWITCH_ON(4354),
    PAYLOAD_SWITCH_OFF(4355),
    PAYLOAD_SEEK_VALUE(4356),
    START_POINT_CLOUD(4357),
    PAUSE_POINT_CLOUD(4358),
    CONTINUE_POINT_CLOUD(4359),
    FINISH_POINT_CLOUD(4360);

    private int value;

    private WaypointActionType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean _equals(int b) {
        return this.value == b;
    }

    public static WaypointActionType find(int value) {
        WaypointActionType result = STAY;
        for (int i = 0; i < WaypointActionType.values().length; ++i) {
            if (!WaypointActionType.values()[i]._equals(value)) continue;
            result = WaypointActionType.values()[i];
            break;
        }
        return result;
    }

    public static boolean isImageAction(WaypointActionType type) {
        return type == START_TAKE_PHOTO || type == PRECISE_SHOT || type == NORMAL_PRECISE_SHOT || type == ORIENTED_SHOT || type == PANO_SHOT;
    }
}

