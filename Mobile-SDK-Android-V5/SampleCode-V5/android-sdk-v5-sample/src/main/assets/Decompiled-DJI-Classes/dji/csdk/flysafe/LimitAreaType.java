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

public final class LimitAreaType
extends Enum<LimitAreaType>
implements WireEnum {
    public static final /* enum */ LimitAreaType DJIAirport = new LimitAreaType(0);
    public static final /* enum */ LimitAreaType DJISpecialZone = new LimitAreaType(1);
    public static final /* enum */ LimitAreaType MilitaryZone = new LimitAreaType(2);
    public static final /* enum */ LimitAreaType CriticalAirport = new LimitAreaType(10);
    public static final /* enum */ LimitAreaType AirMapCommercialAirport = new LimitAreaType(11);
    public static final /* enum */ LimitAreaType PrivateCommercialAirport = new LimitAreaType(12);
    public static final /* enum */ LimitAreaType RecreationalAirport = new LimitAreaType(13);
    public static final /* enum */ LimitAreaType PrivateRecreationalAirport = new LimitAreaType(14);
    public static final /* enum */ LimitAreaType ClassB = new LimitAreaType(15);
    public static final /* enum */ LimitAreaType ClassC = new LimitAreaType(16);
    public static final /* enum */ LimitAreaType ClassD = new LimitAreaType(17);
    public static final /* enum */ LimitAreaType ClassE = new LimitAreaType(18);
    public static final /* enum */ LimitAreaType Heliports = new LimitAreaType(19);
    public static final /* enum */ LimitAreaType NationalPark = new LimitAreaType(20);
    public static final /* enum */ LimitAreaType NOAA = new LimitAreaType(21);
    public static final /* enum */ LimitAreaType Parcel = new LimitAreaType(22);
    public static final /* enum */ LimitAreaType PowerPlant = new LimitAreaType(23);
    public static final /* enum */ LimitAreaType Prison = new LimitAreaType(24);
    public static final /* enum */ LimitAreaType School = new LimitAreaType(25);
    public static final /* enum */ LimitAreaType Stadium = new LimitAreaType(26);
    public static final /* enum */ LimitAreaType ProhibitedSpecial = new LimitAreaType(27);
    public static final /* enum */ LimitAreaType RestrictedSpecial = new LimitAreaType(28);
    public static final /* enum */ LimitAreaType TFR = new LimitAreaType(29);
    public static final /* enum */ LimitAreaType NuclearPowerPlant = new LimitAreaType(30);
    public static final /* enum */ LimitAreaType UnpavedAirports = new LimitAreaType(31);
    public static final /* enum */ LimitAreaType DJISpecialZoneNew = new LimitAreaType(32);
    public static final /* enum */ LimitAreaType MilitaryZoneNew = new LimitAreaType(33);
    public static final /* enum */ LimitAreaType HeliportsNew = new LimitAreaType(34);
    public static final /* enum */ LimitAreaType SeaplaneBase = new LimitAreaType(35);
    public static final /* enum */ LimitAreaType TFR2 = new LimitAreaType(36);
    public static final /* enum */ LimitAreaType TFR3 = new LimitAreaType(37);
    public static final /* enum */ LimitAreaType ApprovedForSmallUAV = new LimitAreaType(38);
    public static final /* enum */ LimitAreaType ApprovedForLightUAV = new LimitAreaType(39);
    public static final /* enum */ LimitAreaType RegulatoryRestrictedForSmallUAV = new LimitAreaType(40);
    public static final /* enum */ LimitAreaType RegulatoryRestrictedForLightUAV = new LimitAreaType(41);
    public static final /* enum */ LimitAreaType CeArea = new LimitAreaType(42);
    public static final ProtoAdapter<LimitAreaType> ADAPTER;
    private final int value;
    private static final /* synthetic */ LimitAreaType[] $VALUES;

    public static LimitAreaType[] values() {
        return null;
    }

    public static LimitAreaType valueOf(String string) {
        return null;
    }

    private LimitAreaType(int n2) {
    }

    public static LimitAreaType fromValue(int n) {
        return null;
    }

    public int getValue() {
        return 0;
    }

    private static /* synthetic */ LimitAreaType[] $values() {
        return null;
    }

    static {
        $VALUES = LimitAreaType.$values();
        ADAPTER = ProtoAdapter.newEnumAdapter(LimitAreaType.class);
    }
}

