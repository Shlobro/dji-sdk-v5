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

public final class SpecialUnlockType
extends Enum<SpecialUnlockType>
implements WireEnum {
    public static final /* enum */ SpecialUnlockType InvalidUnlock = new SpecialUnlockType(0);
    public static final /* enum */ SpecialUnlockType CircleUnlock = new SpecialUnlockType(1);
    public static final /* enum */ SpecialUnlockType PolygonUnlock = new SpecialUnlockType(2);
    public static final ProtoAdapter<SpecialUnlockType> ADAPTER;
    private final int value;
    private static final /* synthetic */ SpecialUnlockType[] $VALUES;

    public static SpecialUnlockType[] values() {
        return null;
    }

    public static SpecialUnlockType valueOf(String string) {
        return null;
    }

    private SpecialUnlockType(int n2) {
    }

    public static SpecialUnlockType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ SpecialUnlockType[] $values() {
        return null;
    }

    static {
        $VALUES = SpecialUnlockType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(SpecialUnlockType.class);
    }
}

