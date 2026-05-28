/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.djinetworkrtkhelper;

public enum DJIRTKCoordinateSystem {
    WGS84(1),
    CGCS2000(2),
    UNKNOWN(255);

    private final int value;
    private static volatile DJIRTKCoordinateSystem[] sValues;

    private DJIRTKCoordinateSystem(int n2) {
    }

    public int value() {
        return 0;
    }

    private boolean _equals(int n) {
        return false;
    }

    public static DJIRTKCoordinateSystem find(int n) {
        return null;
    }

    static {
        sValues = null;
    }
}

