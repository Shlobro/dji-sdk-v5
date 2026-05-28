/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml.converter;

import com.dji.wpmzsdk.common.utils.kml.converter.PilotWaypointTurnMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointV2MissionTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=2, xi=48, d1={"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u00a8\u0006\u0004"}, d2={"convert", "Lcom/dji/wpmzsdk/common/utils/kml/converter/PilotWaypointTurnMode;", "v2FlightPathMode", "Lcom/dji/wpmzsdk/common/utils/kml/mission/WaypointV2MissionTypes$WaypointV2FlightPathMode;", "wpmzsdk_release"})
public final class PilotWaypointTurnModeKt {
    @NotNull
    public static final PilotWaypointTurnMode convert(@NotNull WaypointV2MissionTypes.WaypointV2FlightPathMode v2FlightPathMode) {
        PilotWaypointTurnMode pilotWaypointTurnMode;
        Intrinsics.checkNotNullParameter((Object)((Object)v2FlightPathMode), (String)"v2FlightPathMode");
        switch (WhenMappings.$EnumSwitchMapping$0[v2FlightPathMode.ordinal()]) {
            case 1: {
                pilotWaypointTurnMode = PilotWaypointTurnMode.COORDINATE_TURN;
                break;
            }
            case 2: {
                pilotWaypointTurnMode = PilotWaypointTurnMode.POINT_STOP_STRAIGHT;
                break;
            }
            case 3: {
                pilotWaypointTurnMode = PilotWaypointTurnMode.POINT_STOP_CURVATURE;
                break;
            }
            case 4: {
                pilotWaypointTurnMode = PilotWaypointTurnMode.POINT_PASS_CURVATURE;
                break;
            }
            default: {
                pilotWaypointTurnMode = PilotWaypointTurnMode.POINT_STOP_STRAIGHT;
            }
        }
        return pilotWaypointTurnMode;
    }

    @Metadata(mv={1, 6, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[WaypointV2MissionTypes.WaypointV2FlightPathMode.values().length];
            nArray[WaypointV2MissionTypes.WaypointV2FlightPathMode.COORDINATE_TURN.ordinal()] = 1;
            nArray[WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_STRAIGHT_LINE_AND_STOP.ordinal()] = 2;
            nArray[WaypointV2MissionTypes.WaypointV2FlightPathMode.GOTO_POINT_CURVE_AND_STOP.ordinal()] = 3;
            nArray[WaypointV2MissionTypes.WaypointV2FlightPathMode.CURVATURE_CONTINUOUS_PASSED.ordinal()] = 4;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

