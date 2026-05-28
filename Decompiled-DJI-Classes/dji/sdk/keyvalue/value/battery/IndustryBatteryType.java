/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class IndustryBatteryType
extends Enum<IndustryBatteryType>
implements JNIProguardKeepTag {
    public static final /* enum */ IndustryBatteryType TB60 = new IndustryBatteryType(0);
    public static final /* enum */ IndustryBatteryType TB65 = new IndustryBatteryType(1);
    public static final /* enum */ IndustryBatteryType TB100 = new IndustryBatteryType(2);
    public static final /* enum */ IndustryBatteryType TB100C = new IndustryBatteryType(3);
    public static final /* enum */ IndustryBatteryType UNKNOWN = new IndustryBatteryType(65535);
    private int value;
    private static final IndustryBatteryType[] allValues;
    private static final /* synthetic */ IndustryBatteryType[] $VALUES;

    public static IndustryBatteryType[] values() {
        return null;
    }

    public static IndustryBatteryType valueOf(String string) {
        return null;
    }

    private IndustryBatteryType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IndustryBatteryType find(int n) {
        return null;
    }

    private static /* synthetic */ IndustryBatteryType[] $values() {
        return null;
    }

    static {
        $VALUES = IndustryBatteryType.$values();
        allValues = IndustryBatteryType.values();
    }
}

