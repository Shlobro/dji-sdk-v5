/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.WireEnum
 */
package dji.csdk.flysafe;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.WireEnum;

public final class CERestrictionType
extends Enum<CERestrictionType>
implements WireEnum {
    public static final /* enum */ CERestrictionType NoRestriction = new CERestrictionType(0);
    public static final /* enum */ CERestrictionType Conditional = new CERestrictionType(1);
    public static final /* enum */ CERestrictionType ReqAuthorisation = new CERestrictionType(2);
    public static final /* enum */ CERestrictionType Prohibited = new CERestrictionType(3);
    public static final ProtoAdapter<CERestrictionType> ADAPTER;
    private final int value;
    private static final /* synthetic */ CERestrictionType[] $VALUES;

    public static CERestrictionType[] values() {
        return null;
    }

    public static CERestrictionType valueOf(String string) {
        return null;
    }

    private CERestrictionType(int n2) {
    }

    public static CERestrictionType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ CERestrictionType[] $values() {
        return null;
    }

    static {
        $VALUES = CERestrictionType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(CERestrictionType.class);
    }
}

