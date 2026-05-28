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

public final class GimbalPathCycleMode
extends Enum<GimbalPathCycleMode>
implements WireEnum {
    public static final /* enum */ GimbalPathCycleMode Once = new GimbalPathCycleMode(0);
    public static final /* enum */ GimbalPathCycleMode Unlimited = new GimbalPathCycleMode(1);
    public static final ProtoAdapter<GimbalPathCycleMode> ADAPTER;
    private final int value;
    private static final /* synthetic */ GimbalPathCycleMode[] $VALUES;

    public static GimbalPathCycleMode[] values() {
        return null;
    }

    public static GimbalPathCycleMode valueOf(String string) {
        return null;
    }

    private GimbalPathCycleMode(int n2) {
    }

    public static GimbalPathCycleMode fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ GimbalPathCycleMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalPathCycleMode.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(GimbalPathCycleMode.class);
    }
}

