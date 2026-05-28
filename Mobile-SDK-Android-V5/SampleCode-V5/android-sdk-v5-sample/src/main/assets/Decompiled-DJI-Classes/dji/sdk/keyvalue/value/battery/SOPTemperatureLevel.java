/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class SOPTemperatureLevel
extends Enum<SOPTemperatureLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ SOPTemperatureLevel LEVEL_0 = new SOPTemperatureLevel(0);
    public static final /* enum */ SOPTemperatureLevel LEVEL_1 = new SOPTemperatureLevel(1);
    public static final /* enum */ SOPTemperatureLevel LEVEL_2 = new SOPTemperatureLevel(2);
    public static final /* enum */ SOPTemperatureLevel UNKNOWN = new SOPTemperatureLevel(65535);
    private int value;
    private static final SOPTemperatureLevel[] allValues;
    private static final /* synthetic */ SOPTemperatureLevel[] $VALUES;

    public static SOPTemperatureLevel[] values() {
        return null;
    }

    public static SOPTemperatureLevel valueOf(String string) {
        return null;
    }

    private SOPTemperatureLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SOPTemperatureLevel find(int n) {
        return null;
    }

    private static /* synthetic */ SOPTemperatureLevel[] $values() {
        return null;
    }

    static {
        $VALUES = SOPTemperatureLevel.$values();
        allValues = SOPTemperatureLevel.values();
    }
}

