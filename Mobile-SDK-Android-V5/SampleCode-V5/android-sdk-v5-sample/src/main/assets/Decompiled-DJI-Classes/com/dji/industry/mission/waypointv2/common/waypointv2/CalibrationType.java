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

public final class CalibrationType
extends Enum<CalibrationType>
implements WireEnum {
    public static final /* enum */ CalibrationType SpeedUpAndSlowDown = new CalibrationType(0);
    public static final ProtoAdapter<CalibrationType> ADAPTER;
    private final int value;
    private static final /* synthetic */ CalibrationType[] $VALUES;

    public static CalibrationType[] values() {
        return null;
    }

    public static CalibrationType valueOf(String string) {
        return null;
    }

    private CalibrationType(int n2) {
    }

    public static CalibrationType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CalibrationType[] $values() {
        return null;
    }

    static {
        $VALUES = CalibrationType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CalibrationType.class);
    }
}

