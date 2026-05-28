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

public final class AppUnlockSpaceDataStatus
extends Enum<AppUnlockSpaceDataStatus>
implements WireEnum {
    public static final /* enum */ AppUnlockSpaceDataStatus Inactivate = new AppUnlockSpaceDataStatus(0);
    public static final /* enum */ AppUnlockSpaceDataStatus Valid = new AppUnlockSpaceDataStatus(1);
    public static final /* enum */ AppUnlockSpaceDataStatus Expired = new AppUnlockSpaceDataStatus(2);
    public static final ProtoAdapter<AppUnlockSpaceDataStatus> ADAPTER;
    private final int value;
    private static final /* synthetic */ AppUnlockSpaceDataStatus[] $VALUES;

    public static AppUnlockSpaceDataStatus[] values() {
        return null;
    }

    public static AppUnlockSpaceDataStatus valueOf(String string) {
        return null;
    }

    private AppUnlockSpaceDataStatus(int n2) {
    }

    public static AppUnlockSpaceDataStatus fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ AppUnlockSpaceDataStatus[] $values() {
        return null;
    }

    static {
        $VALUES = AppUnlockSpaceDataStatus.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(AppUnlockSpaceDataStatus.class);
    }
}

