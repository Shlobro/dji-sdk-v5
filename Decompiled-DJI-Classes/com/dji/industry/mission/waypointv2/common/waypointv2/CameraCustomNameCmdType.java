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

public final class CameraCustomNameCmdType
extends Enum<CameraCustomNameCmdType>
implements WireEnum {
    public static final /* enum */ CameraCustomNameCmdType CameraCustomNameCmdTypeUnknown = new CameraCustomNameCmdType(0);
    public static final /* enum */ CameraCustomNameCmdType CustomFileName = new CameraCustomNameCmdType(1);
    public static final /* enum */ CameraCustomNameCmdType CustomDirectoryName = new CameraCustomNameCmdType(2);
    public static final ProtoAdapter<CameraCustomNameCmdType> ADAPTER;
    private final int value;
    private static final /* synthetic */ CameraCustomNameCmdType[] $VALUES;

    public static CameraCustomNameCmdType[] values() {
        return null;
    }

    public static CameraCustomNameCmdType valueOf(String string) {
        return null;
    }

    private CameraCustomNameCmdType(int n2) {
    }

    public static CameraCustomNameCmdType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CameraCustomNameCmdType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraCustomNameCmdType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CameraCustomNameCmdType.class);
    }
}

