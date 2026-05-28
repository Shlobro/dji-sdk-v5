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

public final class PayloadControlActionType
extends Enum<PayloadControlActionType>
implements WireEnum {
    public static final /* enum */ PayloadControlActionType PayloadControlActionTypeUnknown = new PayloadControlActionType(0);
    public static final /* enum */ PayloadControlActionType Operating = new PayloadControlActionType(1);
    public static final ProtoAdapter<PayloadControlActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ PayloadControlActionType[] $VALUES;

    public static PayloadControlActionType[] values() {
        return null;
    }

    public static PayloadControlActionType valueOf(String string) {
        return null;
    }

    private PayloadControlActionType(int n2) {
    }

    public static PayloadControlActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ PayloadControlActionType[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadControlActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(PayloadControlActionType.class);
    }
}

