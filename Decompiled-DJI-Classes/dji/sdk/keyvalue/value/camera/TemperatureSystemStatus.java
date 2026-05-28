/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class TemperatureSystemStatus
extends Enum<TemperatureSystemStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ TemperatureSystemStatus NORMAL = new TemperatureSystemStatus(0);
    public static final /* enum */ TemperatureSystemStatus WARNING = new TemperatureSystemStatus(1);
    public static final /* enum */ TemperatureSystemStatus EXCEPTION = new TemperatureSystemStatus(2);
    public static final /* enum */ TemperatureSystemStatus SERIOUS = new TemperatureSystemStatus(3);
    public static final /* enum */ TemperatureSystemStatus UNKNOWN = new TemperatureSystemStatus(65535);
    private int value;
    private static final TemperatureSystemStatus[] allValues;
    private static final /* synthetic */ TemperatureSystemStatus[] $VALUES;

    public static TemperatureSystemStatus[] values() {
        return null;
    }

    public static TemperatureSystemStatus valueOf(String string) {
        return null;
    }

    private TemperatureSystemStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TemperatureSystemStatus find(int n) {
        return null;
    }

    private static /* synthetic */ TemperatureSystemStatus[] $values() {
        return null;
    }

    static {
        $VALUES = TemperatureSystemStatus.$values();
        allValues = TemperatureSystemStatus.values();
    }
}

