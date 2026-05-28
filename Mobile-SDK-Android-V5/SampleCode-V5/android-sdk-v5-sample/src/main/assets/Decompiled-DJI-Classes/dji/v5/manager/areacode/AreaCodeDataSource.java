/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.areacode;

public final class AreaCodeDataSource
extends Enum<AreaCodeDataSource> {
    public static final /* enum */ AreaCodeDataSource UNRELIABLE_SOURCE = new AreaCodeDataSource(0);
    public static final /* enum */ AreaCodeDataSource AIRCRAFT_GPS = new AreaCodeDataSource(1);
    public static final /* enum */ AreaCodeDataSource PHONE_GPS = new AreaCodeDataSource(2);
    public static final /* enum */ AreaCodeDataSource MCC = new AreaCodeDataSource(3);
    public static final /* enum */ AreaCodeDataSource IP = new AreaCodeDataSource(4);
    public static final /* enum */ AreaCodeDataSource LOW_ACCURACY_GPS = new AreaCodeDataSource(5);
    public static final /* enum */ AreaCodeDataSource CACHE = new AreaCodeDataSource(6);
    public static final /* enum */ AreaCodeDataSource UNKNOWN = new AreaCodeDataSource(255);
    private int value;
    private static AreaCodeDataSource[] mValues;
    private static final /* synthetic */ AreaCodeDataSource[] $VALUES;

    public static AreaCodeDataSource[] values() {
        return null;
    }

    public static AreaCodeDataSource valueOf(String string2) {
        return null;
    }

    private AreaCodeDataSource(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean compareValue(int n) {
        return false;
    }

    public static AreaCodeDataSource[] getValues() {
        return null;
    }

    public static AreaCodeDataSource find(int n) {
        return null;
    }

    private static /* synthetic */ AreaCodeDataSource[] $values() {
        return null;
    }

    static {
        $VALUES = AreaCodeDataSource.$values();
    }
}

