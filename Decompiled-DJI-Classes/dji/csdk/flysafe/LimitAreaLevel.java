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

public final class LimitAreaLevel
extends Enum<LimitAreaLevel>
implements WireEnum {
    public static final /* enum */ LimitAreaLevel Warning = new LimitAreaLevel(0);
    public static final /* enum */ LimitAreaLevel CanUnlock = new LimitAreaLevel(1);
    public static final /* enum */ LimitAreaLevel NoUnlock = new LimitAreaLevel(2);
    public static final /* enum */ LimitAreaLevel SpecialWarning = new LimitAreaLevel(3);
    public static final /* enum */ LimitAreaLevel InVisible = new LimitAreaLevel(4);
    public static final /* enum */ LimitAreaLevel Recommend = new LimitAreaLevel(5);
    public static final /* enum */ LimitAreaLevel HeightRestricted = new LimitAreaLevel(6);
    public static final /* enum */ LimitAreaLevel RegulatoryRestricted = new LimitAreaLevel(7);
    public static final /* enum */ LimitAreaLevel Approved = new LimitAreaLevel(8);
    public static final ProtoAdapter<LimitAreaLevel> ADAPTER;
    private final int value;
    private static final /* synthetic */ LimitAreaLevel[] $VALUES;

    public static LimitAreaLevel[] values() {
        return null;
    }

    public static LimitAreaLevel valueOf(String string) {
        return null;
    }

    private LimitAreaLevel(int n2) {
    }

    public static LimitAreaLevel fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ LimitAreaLevel[] $values() {
        return null;
    }

    static {
        $VALUES = LimitAreaLevel.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(LimitAreaLevel.class);
    }
}

