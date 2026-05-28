/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;

public final class ChargerModuleType
extends Enum<ChargerModuleType>
implements JNIProguardKeepTag {
    public static final /* enum */ ChargerModuleType ENGINE_OIL = new ChargerModuleType(0);
    public static final /* enum */ ChargerModuleType AIR_FILTER = new ChargerModuleType(1);
    public static final /* enum */ ChargerModuleType SPARK_PLUG = new ChargerModuleType(2);
    public static final /* enum */ ChargerModuleType VALVE = new ChargerModuleType(3);
    public static final /* enum */ ChargerModuleType UNKNOWN = new ChargerModuleType(65535);
    private int value;
    private static final ChargerModuleType[] allValues;
    private static final /* synthetic */ ChargerModuleType[] $VALUES;

    public static ChargerModuleType[] values() {
        return null;
    }

    public static ChargerModuleType valueOf(String string) {
        return null;
    }

    private ChargerModuleType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChargerModuleType find(int n) {
        return null;
    }

    private static /* synthetic */ ChargerModuleType[] $values() {
        return null;
    }

    static {
        $VALUES = ChargerModuleType.$values();
        allValues = ChargerModuleType.values();
    }
}

