/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylineDroneType implements JNIProguardKeepTag
{
    Phantom4(11),
    Phantom4Pro(18),
    Phantom4Advanced(27),
    Phantom4RTK(59),
    PM430(60),
    PM320(67),
    WM260(68),
    WM630(76),
    WM265(77),
    TA101(78),
    WM2605(86),
    PM431(89),
    EA220(91),
    WA345(99),
    EA230(100),
    PM440(103),
    UNKNOWN(65535);

    private int value;
    private static final WaylineDroneType[] allValues;

    private WaylineDroneType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylineDroneType find(int value) {
        WaylineDroneType result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = WaylineDroneType.values();
    }
}

