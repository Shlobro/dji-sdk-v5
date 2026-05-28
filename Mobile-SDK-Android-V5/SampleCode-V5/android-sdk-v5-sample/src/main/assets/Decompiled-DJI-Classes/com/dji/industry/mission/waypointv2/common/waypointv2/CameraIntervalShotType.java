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

public final class CameraIntervalShotType
extends Enum<CameraIntervalShotType>
implements WireEnum {
    public static final /* enum */ CameraIntervalShotType Single = new CameraIntervalShotType(0);
    public static final /* enum */ CameraIntervalShotType Multiple = new CameraIntervalShotType(1);
    public static final /* enum */ CameraIntervalShotType Timelapse = new CameraIntervalShotType(2);
    public static final /* enum */ CameraIntervalShotType Pano = new CameraIntervalShotType(3);
    public static final ProtoAdapter<CameraIntervalShotType> ADAPTER;
    private final int value;
    private static final /* synthetic */ CameraIntervalShotType[] $VALUES;

    public static CameraIntervalShotType[] values() {
        return null;
    }

    public static CameraIntervalShotType valueOf(String string) {
        return null;
    }

    private CameraIntervalShotType(int n2) {
    }

    public static CameraIntervalShotType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CameraIntervalShotType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraIntervalShotType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CameraIntervalShotType.class);
    }
}

