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

public final class NFZType
extends Enum<NFZType>
implements WireEnum {
    public static final /* enum */ NFZType None = new NFZType(0);
    public static final /* enum */ NFZType AuthZone = new NFZType(1);
    public static final /* enum */ NFZType LimitZone = new NFZType(2);
    public static final ProtoAdapter<NFZType> ADAPTER;
    private final int value;
    private static final /* synthetic */ NFZType[] $VALUES;

    public static NFZType[] values() {
        return null;
    }

    public static NFZType valueOf(String string) {
        return null;
    }

    private NFZType(int n2) {
    }

    public static NFZType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ NFZType[] $values() {
        return null;
    }

    static {
        $VALUES = NFZType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(NFZType.class);
    }
}

