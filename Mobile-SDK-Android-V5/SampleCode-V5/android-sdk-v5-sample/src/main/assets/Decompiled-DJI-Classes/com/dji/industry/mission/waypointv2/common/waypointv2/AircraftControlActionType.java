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

public final class AircraftControlActionType
extends Enum<AircraftControlActionType>
implements WireEnum {
    public static final /* enum */ AircraftControlActionType AircraftControlActionTypeUnknown = new AircraftControlActionType(0);
    public static final /* enum */ AircraftControlActionType RotateYaw = new AircraftControlActionType(1);
    public static final /* enum */ AircraftControlActionType StartStopFly = new AircraftControlActionType(2);
    public static final /* enum */ AircraftControlActionType FlightCalibration = new AircraftControlActionType(3);
    public static final ProtoAdapter<AircraftControlActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ AircraftControlActionType[] $VALUES;

    public static AircraftControlActionType[] values() {
        return null;
    }

    public static AircraftControlActionType valueOf(String string) {
        return null;
    }

    private AircraftControlActionType(int n2) {
    }

    public static AircraftControlActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ AircraftControlActionType[] $values() {
        return null;
    }

    static {
        $VALUES = AircraftControlActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(AircraftControlActionType.class);
    }
}

