/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk;

public final class CoordinateSystem
extends Enum<CoordinateSystem> {
    public static final /* enum */ CoordinateSystem WGS84 = new CoordinateSystem(1);
    public static final /* enum */ CoordinateSystem CGCS2000 = new CoordinateSystem(2);
    public static final /* enum */ CoordinateSystem UNKNOWN = new CoordinateSystem(255);
    private final int value;
    private static volatile CoordinateSystem[] sValues;
    private static final /* synthetic */ CoordinateSystem[] $VALUES;

    public static CoordinateSystem[] values() {
        return null;
    }

    public static CoordinateSystem valueOf(String string2) {
        return null;
    }

    private CoordinateSystem(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean _equals(int n) {
        return false;
    }

    public static CoordinateSystem find(int n) {
        return null;
    }

    private static /* synthetic */ CoordinateSystem[] $values() {
        return null;
    }

    static {
        $VALUES = CoordinateSystem.$values();
        sValues = null;
    }
}

