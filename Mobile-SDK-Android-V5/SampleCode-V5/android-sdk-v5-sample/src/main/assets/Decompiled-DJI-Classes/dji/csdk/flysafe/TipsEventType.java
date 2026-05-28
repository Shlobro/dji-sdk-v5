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

public final class TipsEventType
extends Enum<TipsEventType>
implements WireEnum {
    public static final /* enum */ TipsEventType TakeOffWithLimitHeightWithoutGPS = new TipsEventType(0);
    public static final /* enum */ TipsEventType TakeOffUnderLimitHeightArea = new TipsEventType(1);
    public static final /* enum */ TipsEventType TakeOffUnderWarningArea = new TipsEventType(2);
    public static final /* enum */ TipsEventType CollisionWithLimitArea = new TipsEventType(3);
    public static final /* enum */ TipsEventType CollisionWithAuthAreaWithoutLicense = new TipsEventType(4);
    public static final /* enum */ TipsEventType CollisionWithLimitHeightArea = new TipsEventType(5);
    public static final /* enum */ TipsEventType CollisionWithGoHomeMode = new TipsEventType(6);
    public static final /* enum */ TipsEventType CollisionWithSmartMode = new TipsEventType(7);
    public static final /* enum */ TipsEventType CollisionWithSpecialUnlockArea = new TipsEventType(8);
    public static final /* enum */ TipsEventType EnterLimitHeightAreaUnderLimitHeight = new TipsEventType(9);
    public static final /* enum */ TipsEventType CollisionWithSelfLimitHeightAreaSoonInWhiteListValidArea = new TipsEventType(10);
    public static final /* enum */ TipsEventType FlyingWithCEAreaNearby = new TipsEventType(11);
    public static final /* enum */ TipsEventType CollisionWithCEArea = new TipsEventType(12);
    public static final ProtoAdapter<TipsEventType> ADAPTER;
    private final int value;
    private static final /* synthetic */ TipsEventType[] $VALUES;

    public static TipsEventType[] values() {
        return null;
    }

    public static TipsEventType valueOf(String string) {
        return null;
    }

    private TipsEventType(int n2) {
    }

    public static TipsEventType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ TipsEventType[] $values() {
        return null;
    }

    static {
        $VALUES = TipsEventType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(TipsEventType.class);
    }
}

