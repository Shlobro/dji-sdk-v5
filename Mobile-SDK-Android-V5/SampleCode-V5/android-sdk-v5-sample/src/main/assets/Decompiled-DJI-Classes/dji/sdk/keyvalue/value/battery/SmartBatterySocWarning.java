/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class SmartBatterySocWarning
extends Enum<SmartBatterySocWarning>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartBatterySocWarning NORMAL = new SmartBatterySocWarning(0);
    public static final /* enum */ SmartBatterySocWarning ABNORMAL_HAIGH = new SmartBatterySocWarning(1);
    public static final /* enum */ SmartBatterySocWarning JUMP_DOWN = new SmartBatterySocWarning(2);
    public static final /* enum */ SmartBatterySocWarning JUM_UP = new SmartBatterySocWarning(3);
    public static final /* enum */ SmartBatterySocWarning INVALID = new SmartBatterySocWarning(4);
    public static final /* enum */ SmartBatterySocWarning UNKNOWN = new SmartBatterySocWarning(65535);
    private int value;
    private static final SmartBatterySocWarning[] allValues;
    private static final /* synthetic */ SmartBatterySocWarning[] $VALUES;

    public static SmartBatterySocWarning[] values() {
        return null;
    }

    public static SmartBatterySocWarning valueOf(String string) {
        return null;
    }

    private SmartBatterySocWarning(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartBatterySocWarning find(int n) {
        return null;
    }

    private static /* synthetic */ SmartBatterySocWarning[] $values() {
        return null;
    }

    static {
        $VALUES = SmartBatterySocWarning.$values();
        allValues = SmartBatterySocWarning.values();
    }
}

