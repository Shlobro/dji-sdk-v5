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

public final class LimitAreaShape
extends Enum<LimitAreaShape>
implements WireEnum {
    public static final /* enum */ LimitAreaShape Circle = new LimitAreaShape(0);
    public static final /* enum */ LimitAreaShape Polygon = new LimitAreaShape(1);
    public static final /* enum */ LimitAreaShape Virtual = new LimitAreaShape(12);
    public static final ProtoAdapter<LimitAreaShape> ADAPTER;
    private final int value;
    private static final /* synthetic */ LimitAreaShape[] $VALUES;

    public static LimitAreaShape[] values() {
        return null;
    }

    public static LimitAreaShape valueOf(String string) {
        return null;
    }

    private LimitAreaShape(int n2) {
    }

    public static LimitAreaShape fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ LimitAreaShape[] $values() {
        return null;
    }

    static {
        $VALUES = LimitAreaShape.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(LimitAreaShape.class);
    }
}

