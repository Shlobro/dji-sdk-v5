/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.WireEnum
 */
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public final class WaypointActionActuatorType
extends Enum<WaypointActionActuatorType>
implements WireEnum {
    public static final /* enum */ WaypointActionActuatorType ActuatorTypUnknown = new WaypointActionActuatorType(0);
    public static final /* enum */ WaypointActionActuatorType Camera = new WaypointActionActuatorType(1);
    public static final /* enum */ WaypointActionActuatorType Gimbal = new WaypointActionActuatorType(2);
    public static final /* enum */ WaypointActionActuatorType Spray = new WaypointActionActuatorType(3);
    public static final /* enum */ WaypointActionActuatorType AircraftControl = new WaypointActionActuatorType(4);
    public static final /* enum */ WaypointActionActuatorType PayloadControl = new WaypointActionActuatorType(5);
    public static final /* enum */ WaypointActionActuatorType Navigation = new WaypointActionActuatorType(6);
    public static final /* enum */ WaypointActionActuatorType DJISYS = new WaypointActionActuatorType(7);
    public static final ProtoAdapter<WaypointActionActuatorType> ADAPTER;
    private final int value;
    private static final /* synthetic */ WaypointActionActuatorType[] $VALUES;

    public static WaypointActionActuatorType[] values() {
        return null;
    }

    public static WaypointActionActuatorType valueOf(String string) {
        return null;
    }

    private WaypointActionActuatorType(int n2) {
    }

    public static WaypointActionActuatorType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ WaypointActionActuatorType[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointActionActuatorType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(WaypointActionActuatorType.class);
    }
}

