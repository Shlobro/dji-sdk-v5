/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class BatterySelfCheckState
extends Enum<BatterySelfCheckState>
implements JNIProguardKeepTag {
    public static final /* enum */ BatterySelfCheckState NORMAL = new BatterySelfCheckState(0);
    public static final /* enum */ BatterySelfCheckState NTC_ABNORMAL = new BatterySelfCheckState(1);
    public static final /* enum */ BatterySelfCheckState MOS_ABNORMAL = new BatterySelfCheckState(2);
    public static final /* enum */ BatterySelfCheckState R_ABNORMAL = new BatterySelfCheckState(3);
    public static final /* enum */ BatterySelfCheckState CELL_DAMAGE = new BatterySelfCheckState(4);
    public static final /* enum */ BatterySelfCheckState CAL_EXP = new BatterySelfCheckState(5);
    public static final /* enum */ BatterySelfCheckState GAUGEPARM_EXP = new BatterySelfCheckState(6);
    public static final /* enum */ BatterySelfCheckState RES = new BatterySelfCheckState(7);
    public static final /* enum */ BatterySelfCheckState UNKNOWN = new BatterySelfCheckState(255);
    private int value;
    private static final BatterySelfCheckState[] allValues;
    private static final /* synthetic */ BatterySelfCheckState[] $VALUES;

    public static BatterySelfCheckState[] values() {
        return null;
    }

    public static BatterySelfCheckState valueOf(String string) {
        return null;
    }

    private BatterySelfCheckState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatterySelfCheckState find(int n) {
        return null;
    }

    private static /* synthetic */ BatterySelfCheckState[] $values() {
        return null;
    }

    static {
        $VALUES = BatterySelfCheckState.$values();
        allValues = BatterySelfCheckState.values();
    }
}

