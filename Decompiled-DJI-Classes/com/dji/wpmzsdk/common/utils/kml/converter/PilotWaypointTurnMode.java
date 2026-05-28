/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 */
package com.dji.wpmzsdk.common.utils.kml.converter;

import kotlin.Metadata;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/converter/PilotWaypointTurnMode;", "", "(Ljava/lang/String;I)V", "COORDINATE_TURN", "POINT_STOP_STRAIGHT", "POINT_PASS_SMOOTH", "POINT_STOP_CURVATURE", "POINT_PASS_CURVATURE", "wpmzsdk_release"})
public final class PilotWaypointTurnMode
extends Enum<PilotWaypointTurnMode> {
    public static final /* enum */ PilotWaypointTurnMode COORDINATE_TURN = new PilotWaypointTurnMode();
    public static final /* enum */ PilotWaypointTurnMode POINT_STOP_STRAIGHT = new PilotWaypointTurnMode();
    public static final /* enum */ PilotWaypointTurnMode POINT_PASS_SMOOTH = new PilotWaypointTurnMode();
    public static final /* enum */ PilotWaypointTurnMode POINT_STOP_CURVATURE = new PilotWaypointTurnMode();
    public static final /* enum */ PilotWaypointTurnMode POINT_PASS_CURVATURE = new PilotWaypointTurnMode();
    private static final /* synthetic */ PilotWaypointTurnMode[] $VALUES;

    public static PilotWaypointTurnMode[] values() {
        return (PilotWaypointTurnMode[])$VALUES.clone();
    }

    public static PilotWaypointTurnMode valueOf(String value) {
        return Enum.valueOf(PilotWaypointTurnMode.class, value);
    }

    static {
        $VALUES = pilotWaypointTurnModeArray = new PilotWaypointTurnMode[]{PilotWaypointTurnMode.COORDINATE_TURN, PilotWaypointTurnMode.POINT_STOP_STRAIGHT, PilotWaypointTurnMode.POINT_PASS_SMOOTH, PilotWaypointTurnMode.POINT_STOP_CURVATURE, PilotWaypointTurnMode.POINT_PASS_CURVATURE};
    }
}

