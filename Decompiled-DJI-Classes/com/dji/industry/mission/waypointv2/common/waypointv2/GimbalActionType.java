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

public final class GimbalActionType
extends Enum<GimbalActionType>
implements WireEnum {
    public static final /* enum */ GimbalActionType GimbalActionTypeUnknown = new GimbalActionType(0);
    public static final /* enum */ GimbalActionType RotateGimbal = new GimbalActionType(1);
    public static final /* enum */ GimbalActionType AircraftControlGimbal = new GimbalActionType(2);
    public static final /* enum */ GimbalActionType StartPathShooting = new GimbalActionType(3);
    public static final /* enum */ GimbalActionType StopPathShooting = new GimbalActionType(4);
    public static final ProtoAdapter<GimbalActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ GimbalActionType[] $VALUES;

    public static GimbalActionType[] values() {
        return null;
    }

    public static GimbalActionType valueOf(String string) {
        return null;
    }

    private GimbalActionType(int n2) {
    }

    public static GimbalActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ GimbalActionType[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(GimbalActionType.class);
    }
}

