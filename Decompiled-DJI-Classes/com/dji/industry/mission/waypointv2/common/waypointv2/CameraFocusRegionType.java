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

public final class CameraFocusRegionType
extends Enum<CameraFocusRegionType>
implements WireEnum {
    public static final /* enum */ CameraFocusRegionType CameraFocusRegionTypeUnknown = new CameraFocusRegionType(0);
    public static final /* enum */ CameraFocusRegionType CameraFocusRegionTypePoint = new CameraFocusRegionType(1);
    public static final /* enum */ CameraFocusRegionType CameraFocusRegionTypeRectangle = new CameraFocusRegionType(2);
    public static final ProtoAdapter<CameraFocusRegionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ CameraFocusRegionType[] $VALUES;

    public static CameraFocusRegionType[] values() {
        return null;
    }

    public static CameraFocusRegionType valueOf(String string) {
        return null;
    }

    private CameraFocusRegionType(int n2) {
    }

    public static CameraFocusRegionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CameraFocusRegionType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraFocusRegionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CameraFocusRegionType.class);
    }
}

