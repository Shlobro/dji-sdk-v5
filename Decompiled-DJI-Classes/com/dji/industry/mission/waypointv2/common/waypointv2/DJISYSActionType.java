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

public final class DJISYSActionType
extends Enum<DJISYSActionType>
implements WireEnum {
    public static final /* enum */ DJISYSActionType SYSActionTypeUnknown = new DJISYSActionType(0);
    public static final /* enum */ DJISYSActionType RecordPointCloud = new DJISYSActionType(1);
    public static final ProtoAdapter<DJISYSActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ DJISYSActionType[] $VALUES;

    public static DJISYSActionType[] values() {
        return null;
    }

    public static DJISYSActionType valueOf(String string) {
        return null;
    }

    private DJISYSActionType(int n2) {
    }

    public static DJISYSActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ DJISYSActionType[] $values() {
        return null;
    }

    static {
        $VALUES = DJISYSActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(DJISYSActionType.class);
    }
}

