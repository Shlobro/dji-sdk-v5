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

public final class CameraFocusMode
extends Enum<CameraFocusMode>
implements WireEnum {
    public static final /* enum */ CameraFocusMode CameraFocusModeUnknown = new CameraFocusMode(0);
    public static final /* enum */ CameraFocusMode CameraFocusModeManual = new CameraFocusMode(1);
    public static final /* enum */ CameraFocusMode CameraFocusModeAuto = new CameraFocusMode(2);
    public static final /* enum */ CameraFocusMode CameraFocusModeContinuous = new CameraFocusMode(3);
    public static final /* enum */ CameraFocusMode CameraFocusModePrecise = new CameraFocusMode(4);
    public static final ProtoAdapter<CameraFocusMode> ADAPTER;
    private final int value;
    private static final /* synthetic */ CameraFocusMode[] $VALUES;

    public static CameraFocusMode[] values() {
        return null;
    }

    public static CameraFocusMode valueOf(String string) {
        return null;
    }

    private CameraFocusMode(int n2) {
    }

    public static CameraFocusMode fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CameraFocusMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraFocusMode.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CameraFocusMode.class);
    }
}

