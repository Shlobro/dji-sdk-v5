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

public final class AssociateType
extends Enum<AssociateType>
implements WireEnum {
    public static final /* enum */ AssociateType AssociateTypeUnknown = new AssociateType(0);
    public static final /* enum */ AssociateType ExecuteSynchronousAssoiate = new AssociateType(1);
    public static final /* enum */ AssociateType ExecuteAfterAssoiate = new AssociateType(2);
    public static final ProtoAdapter<AssociateType> ADAPTER;
    private final int value;
    private static final /* synthetic */ AssociateType[] $VALUES;

    public static AssociateType[] values() {
        return null;
    }

    public static AssociateType valueOf(String string) {
        return null;
    }

    private AssociateType(int n2) {
    }

    public static AssociateType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ AssociateType[] $values() {
        return null;
    }

    static {
        $VALUES = AssociateType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(AssociateType.class);
    }
}

