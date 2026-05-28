/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineCheckError implements JNIProguardKeepTag
{
    NoError(0),
    FileNotExist(-1),
    FileParseError(-2),
    WaylineNumberOutOfRange(-3),
    WaylinePointNumberOutOfRange(-4),
    InvalidRCLoastBehavior(-5),
    WaypointSpeedOutOfRange(-6),
    TransitionalSpeedOutOfRange(-7),
    DampintDistOutOfRange(-8),
    InvalidTurnMode(-9),
    InvalidHeadingMode(-10),
    WaypointInvalidPos(-11),
    WaypointHeightOutOfRange(-12),
    InvalidTransitionalSpeed(-14),
    InvalidSecurityTakeOffHeight(-15),
    InvalidWaypointPointIndex(-16),
    InvalidActionType(-26),
    SetFocusTypeActionInvalidFocusType(-27),
    InvalidRegionFocusRange(-28),
    InvalidPointFocusPoint(-29),
    InvalidGimbalRange(-30),
    InvalidActionTriggerType(-32),
    InvalidMultipleTimingTimeValue(-33),
    InvalidMultipleDistacneDistanceValue(-34),
    InvalidExecuteAltitudeMode(261),
    InvalidFlyToWaylineMode(262),
    UNKNOWN(-65535);

    private int value;
    private static final WaylineCheckError[] allValues;

    private WaylineCheckError(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineCheckError find(int value) {
        WaylineCheckError result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = WaylineCheckError.values();
    }
}

