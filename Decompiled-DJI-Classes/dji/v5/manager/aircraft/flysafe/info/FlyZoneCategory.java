/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe.info;

public final class FlyZoneCategory
extends Enum<FlyZoneCategory> {
    public static final /* enum */ FlyZoneCategory WARNING = new FlyZoneCategory(0);
    public static final /* enum */ FlyZoneCategory AUTHORIZATION = new FlyZoneCategory(1);
    public static final /* enum */ FlyZoneCategory RESTRICTED = new FlyZoneCategory(2);
    public static final /* enum */ FlyZoneCategory ENHANCED_WARNING = new FlyZoneCategory(3);
    public static final /* enum */ FlyZoneCategory UTMISS_REGULATION = new FlyZoneCategory(7);
    public static final /* enum */ FlyZoneCategory UTMISS_LAW_ALLOW = new FlyZoneCategory(8);
    public static final /* enum */ FlyZoneCategory UNKNOWN = new FlyZoneCategory(255);
    private int data;
    private static FlyZoneCategory[] mValues;
    private static final /* synthetic */ FlyZoneCategory[] $VALUES;

    public static FlyZoneCategory[] values() {
        return null;
    }

    public static FlyZoneCategory valueOf(String string2) {
        return null;
    }

    private FlyZoneCategory(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static FlyZoneCategory[] getValues() {
        return null;
    }

    public static FlyZoneCategory find(int n) {
        return null;
    }

    private static /* synthetic */ FlyZoneCategory[] $values() {
        return null;
    }

    static {
        $VALUES = FlyZoneCategory.$values();
    }
}

