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

public final class ActionType
extends Enum<ActionType>
implements WireEnum {
    public static final /* enum */ ActionType STAY = new ActionType(0);
    public static final /* enum */ ActionType SHOOT_PHOTO = new ActionType(1);
    public static final /* enum */ ActionType START_RECORD = new ActionType(2);
    public static final /* enum */ ActionType STOP_RECORD = new ActionType(3);
    public static final /* enum */ ActionType ROTATE_AIRCRAFT = new ActionType(4);
    public static final /* enum */ ActionType ROTATE_GIMBAL_PITCH = new ActionType(5);
    public static final ProtoAdapter<ActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ ActionType[] $VALUES;

    public static ActionType[] values() {
        return null;
    }

    public static ActionType valueOf(String string) {
        return null;
    }

    private ActionType(int n2) {
    }

    public static ActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ ActionType[] $values() {
        return null;
    }

    static {
        $VALUES = ActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(ActionType.class);
    }
}

