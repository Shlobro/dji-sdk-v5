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

public final class RTHTipsEventType
extends Enum<RTHTipsEventType>
implements WireEnum {
    public static final /* enum */ RTHTipsEventType NearBy = new RTHTipsEventType(0);
    public static final /* enum */ RTHTipsEventType Cross = new RTHTipsEventType(1);
    public static final ProtoAdapter<RTHTipsEventType> ADAPTER;
    private final int value;
    private static final /* synthetic */ RTHTipsEventType[] $VALUES;

    public static RTHTipsEventType[] values() {
        return null;
    }

    public static RTHTipsEventType valueOf(String string) {
        return null;
    }

    private RTHTipsEventType(int n2) {
    }

    public static RTHTipsEventType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ RTHTipsEventType[] $values() {
        return null;
    }

    static {
        $VALUES = RTHTipsEventType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(RTHTipsEventType.class);
    }
}

