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

public final class CameraActionType
extends Enum<CameraActionType>
implements WireEnum {
    public static final /* enum */ CameraActionType CameraActionTypeUnknown = new CameraActionType(0);
    public static final /* enum */ CameraActionType ShootSinglePhoto = new CameraActionType(1);
    public static final /* enum */ CameraActionType StartRecordVideo = new CameraActionType(2);
    public static final /* enum */ CameraActionType StopRecordVideo = new CameraActionType(3);
    public static final /* enum */ CameraActionType Focus = new CameraActionType(4);
    public static final /* enum */ CameraActionType ZoomLength = new CameraActionType(5);
    public static final /* enum */ CameraActionType CustomName = new CameraActionType(6);
    public static final /* enum */ CameraActionType FocusMode = new CameraActionType(7);
    public static final /* enum */ CameraActionType StartIntervalShot = new CameraActionType(8);
    public static final /* enum */ CameraActionType StopIntervalShot = new CameraActionType(9);
    public static final ProtoAdapter<CameraActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ CameraActionType[] $VALUES;

    public static CameraActionType[] values() {
        return null;
    }

    public static CameraActionType valueOf(String string) {
        return null;
    }

    private CameraActionType(int n2) {
    }

    public static CameraActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CameraActionType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CameraActionType.class);
    }
}

