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

public final class IntervalType
extends Enum<IntervalType>
implements WireEnum {
    public static final /* enum */ IntervalType IntervalTypeUnknown = new IntervalType(0);
    public static final /* enum */ IntervalType IntervalTypeTime = new IntervalType(1);
    public static final /* enum */ IntervalType IntervalTypeDistance = new IntervalType(2);
    public static final ProtoAdapter<IntervalType> ADAPTER;
    private final int value;
    private static final /* synthetic */ IntervalType[] $VALUES;

    public static IntervalType[] values() {
        return null;
    }

    public static IntervalType valueOf(String string) {
        return null;
    }

    private IntervalType(int n2) {
    }

    public static IntervalType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ IntervalType[] $values() {
        return null;
    }

    static {
        $VALUES = IntervalType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(IntervalType.class);
    }
}

