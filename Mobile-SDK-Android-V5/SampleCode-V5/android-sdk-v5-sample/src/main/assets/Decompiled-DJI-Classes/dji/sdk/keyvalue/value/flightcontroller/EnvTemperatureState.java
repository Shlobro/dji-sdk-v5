/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class EnvTemperatureState
extends Enum<EnvTemperatureState>
implements JNIProguardKeepTag {
    public static final /* enum */ EnvTemperatureState NORMAL = new EnvTemperatureState(0);
    public static final /* enum */ EnvTemperatureState HIGH = new EnvTemperatureState(1);
    public static final /* enum */ EnvTemperatureState LOW = new EnvTemperatureState(2);
    public static final /* enum */ EnvTemperatureState UNKNOWN = new EnvTemperatureState(65535);
    private int value;
    private static final EnvTemperatureState[] allValues;
    private static final /* synthetic */ EnvTemperatureState[] $VALUES;

    public static EnvTemperatureState[] values() {
        return null;
    }

    public static EnvTemperatureState valueOf(String string) {
        return null;
    }

    private EnvTemperatureState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EnvTemperatureState find(int n) {
        return null;
    }

    private static /* synthetic */ EnvTemperatureState[] $values() {
        return null;
    }

    static {
        $VALUES = EnvTemperatureState.$values();
        allValues = EnvTemperatureState.values();
    }
}

