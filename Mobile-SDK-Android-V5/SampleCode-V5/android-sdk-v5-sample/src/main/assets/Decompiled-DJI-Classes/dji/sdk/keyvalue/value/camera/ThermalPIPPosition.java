/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ThermalPIPPosition
extends Enum<ThermalPIPPosition>
implements JNIProguardKeepTag {
    public static final /* enum */ ThermalPIPPosition CENTER = new ThermalPIPPosition(0);
    public static final /* enum */ ThermalPIPPosition RIGHT_BOTTOM = new ThermalPIPPosition(1);
    public static final /* enum */ ThermalPIPPosition RIGHT_CENTER = new ThermalPIPPosition(2);
    public static final /* enum */ ThermalPIPPosition RIGHT_TOP = new ThermalPIPPosition(3);
    public static final /* enum */ ThermalPIPPosition CENTER_BOTTOM = new ThermalPIPPosition(4);
    public static final /* enum */ ThermalPIPPosition CENTER_TOP = new ThermalPIPPosition(5);
    public static final /* enum */ ThermalPIPPosition LEFT_BOTTOM = new ThermalPIPPosition(6);
    public static final /* enum */ ThermalPIPPosition LEFT_CENTER = new ThermalPIPPosition(7);
    public static final /* enum */ ThermalPIPPosition LEFT_TOP = new ThermalPIPPosition(8);
    public static final /* enum */ ThermalPIPPosition SIDE_BY_SIDE = new ThermalPIPPosition(9);
    public static final /* enum */ ThermalPIPPosition LINK_UP = new ThermalPIPPosition(10);
    public static final /* enum */ ThermalPIPPosition UNKNOWN = new ThermalPIPPosition(65535);
    private int value;
    private static final ThermalPIPPosition[] allValues;
    private static final /* synthetic */ ThermalPIPPosition[] $VALUES;

    public static ThermalPIPPosition[] values() {
        return null;
    }

    public static ThermalPIPPosition valueOf(String string) {
        return null;
    }

    private ThermalPIPPosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ThermalPIPPosition find(int n) {
        return null;
    }

    private static /* synthetic */ ThermalPIPPosition[] $values() {
        return null;
    }

    static {
        $VALUES = ThermalPIPPosition.$values();
        allValues = ThermalPIPPosition.values();
    }
}

