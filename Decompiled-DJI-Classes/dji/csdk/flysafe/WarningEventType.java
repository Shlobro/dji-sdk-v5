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

public final class WarningEventType
extends Enum<WarningEventType>
implements WireEnum {
    public static final /* enum */ WarningEventType TakeOffFailedUnderLimitArea = new WarningEventType(0);
    public static final /* enum */ WarningEventType TakeOffFailedUnderLimitAreaWithoutGPS = new WarningEventType(1);
    public static final /* enum */ WarningEventType TakeOffFailedWithWhiteList = new WarningEventType(2);
    public static final /* enum */ WarningEventType TakeOffFailedUnderAuthAreaWithoutGPSAndLicense = new WarningEventType(3);
    public static final /* enum */ WarningEventType TakeOffFailedUnderAuthAreaWithoutLicense = new WarningEventType(4);
    public static final /* enum */ WarningEventType TakeOffFailedUnderAuthArea = new WarningEventType(5);
    public static final /* enum */ WarningEventType TakeOffUnderSpecialWarningArea = new WarningEventType(6);
    public static final /* enum */ WarningEventType TakeOffWithLimitAreaNearby = new WarningEventType(7);
    public static final /* enum */ WarningEventType TakeOffWithLimitHeightAreaNearby = new WarningEventType(8);
    public static final /* enum */ WarningEventType TakeOffWithAuthAreaNearbyWithoutLicense = new WarningEventType(9);
    public static final /* enum */ WarningEventType TakeOffWithAuthAreaNearby = new WarningEventType(10);
    public static final /* enum */ WarningEventType TakeOffWithFlySafeAreaNearby = new WarningEventType(11);
    public static final /* enum */ WarningEventType CollisionWithAuthArea = new WarningEventType(12);
    public static final /* enum */ WarningEventType TakeOffFailedUnderLimitAreaWithGPSOnce = new WarningEventType(13);
    public static final /* enum */ WarningEventType HaveOneHourWillApplyTFRs = new WarningEventType(14);
    public static final /* enum */ WarningEventType TakeOffWithCEAreaNearby = new WarningEventType(15);
    public static final /* enum */ WarningEventType TakeOffInCEArea = new WarningEventType(16);
    public static final ProtoAdapter<WarningEventType> ADAPTER;
    private final int value;
    private static final /* synthetic */ WarningEventType[] $VALUES;

    public static WarningEventType[] values() {
        return null;
    }

    public static WarningEventType valueOf(String string) {
        return null;
    }

    private WarningEventType(int n2) {
    }

    public static WarningEventType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ WarningEventType[] $values() {
        return null;
    }

    static {
        $VALUES = WarningEventType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(WarningEventType.class);
    }
}

