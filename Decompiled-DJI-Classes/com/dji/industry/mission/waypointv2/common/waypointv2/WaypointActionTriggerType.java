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

public final class WaypointActionTriggerType
extends Enum<WaypointActionTriggerType>
implements WireEnum {
    public static final /* enum */ WaypointActionTriggerType TriggerTypeUnknown = new WaypointActionTriggerType(0);
    public static final /* enum */ WaypointActionTriggerType ReachPoints = new WaypointActionTriggerType(1);
    public static final /* enum */ WaypointActionTriggerType Associate = new WaypointActionTriggerType(2);
    public static final /* enum */ WaypointActionTriggerType Trajectory = new WaypointActionTriggerType(3);
    public static final /* enum */ WaypointActionTriggerType SimpleInterval = new WaypointActionTriggerType(4);
    public static final /* enum */ WaypointActionTriggerType SimpleReachPoint = new WaypointActionTriggerType(5);
    public static final ProtoAdapter<WaypointActionTriggerType> ADAPTER;
    private final int value;
    private static final /* synthetic */ WaypointActionTriggerType[] $VALUES;

    public static WaypointActionTriggerType[] values() {
        return null;
    }

    public static WaypointActionTriggerType valueOf(String string) {
        return null;
    }

    private WaypointActionTriggerType(int n2) {
    }

    public static WaypointActionTriggerType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ WaypointActionTriggerType[] $values() {
        return null;
    }

    static {
        $VALUES = WaypointActionTriggerType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(WaypointActionTriggerType.class);
    }
}

