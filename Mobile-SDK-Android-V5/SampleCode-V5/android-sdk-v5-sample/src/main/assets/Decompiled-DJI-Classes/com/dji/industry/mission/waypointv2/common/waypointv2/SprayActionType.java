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

public final class SprayActionType
extends Enum<SprayActionType>
implements WireEnum {
    public static final /* enum */ SprayActionType SprayActionTypeUnknown = new SprayActionType(0);
    public static final /* enum */ SprayActionType AutoSpray = new SprayActionType(1);
    public static final ProtoAdapter<SprayActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ SprayActionType[] $VALUES;

    public static SprayActionType[] values() {
        return null;
    }

    public static SprayActionType valueOf(String string) {
        return null;
    }

    private SprayActionType(int n2) {
    }

    public static SprayActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ SprayActionType[] $values() {
        return null;
    }

    static {
        $VALUES = SprayActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(SprayActionType.class);
    }
}

