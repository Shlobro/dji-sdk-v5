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

public final class LimitAreaSource
extends Enum<LimitAreaSource>
implements WireEnum {
    public static final /* enum */ LimitAreaSource DJISourceOne = new LimitAreaSource(0);
    public static final /* enum */ LimitAreaSource DJISourceTwo = new LimitAreaSource(1);
    public static final /* enum */ LimitAreaSource Airmap = new LimitAreaSource(2);
    public static final ProtoAdapter<LimitAreaSource> ADAPTER;
    private final int value;
    private static final /* synthetic */ LimitAreaSource[] $VALUES;

    public static LimitAreaSource[] values() {
        return null;
    }

    public static LimitAreaSource valueOf(String string) {
        return null;
    }

    private LimitAreaSource(int n2) {
    }

    public static LimitAreaSource fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ LimitAreaSource[] $values() {
        return null;
    }

    static {
        $VALUES = LimitAreaSource.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(LimitAreaSource.class);
    }
}

