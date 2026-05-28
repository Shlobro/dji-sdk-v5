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

public final class NavigationActionType
extends Enum<NavigationActionType>
implements WireEnum {
    public static final /* enum */ NavigationActionType NavigationActionUnknown = new NavigationActionType(0);
    public static final /* enum */ NavigationActionType NavigationActionAccurateShootPhoto = new NavigationActionType(1);
    public static final ProtoAdapter<NavigationActionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ NavigationActionType[] $VALUES;

    public static NavigationActionType[] values() {
        return null;
    }

    public static NavigationActionType valueOf(String string) {
        return null;
    }

    private NavigationActionType(int n2) {
    }

    public static NavigationActionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ NavigationActionType[] $values() {
        return null;
    }

    static {
        $VALUES = NavigationActionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(NavigationActionType.class);
    }
}

